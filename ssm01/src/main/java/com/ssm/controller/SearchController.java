package com.ssm.controller;

import com.ssm.pojo.train;
import com.ssm.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName SearchController
 * @Description 接受前端传递的参数进行条件查询，始发站、终点站、时间
 * @Author 牛兴炜
 * @Date 2019/12/2 10:59
 * @Version 1.0
 */
@Controller
@RequestMapping("/home")
public class SearchController {
    @Autowired
    private SearchService searchService;
    private String SStation;
    private String EStation;


    @RequestMapping("/homeSearch")
    @ResponseBody
    public List<train> selectTrain(@RequestBody SearchCityData searchCityData) {
        System.out.println("前端传递事件" + searchCityData.getSelectedTime());
        // 定义模糊查询
        List<train> list;
        // 参数传递
        this.SStation = searchCityData.getSStation();
        this.EStation = searchCityData.getEStation();
        list = searchService.selectTrain('%' + searchCityData.getSStation() + '%', '%' + searchCityData.getEStation() + '%');
//        return searchService.selectTrain('%' + searchCityData.getSStation() + '%', '%' + searchCityData.getEStation() + '%');
        return list;
    }

    @RequestMapping("/searchType")
    @ResponseBody
    // 根据前台不同的传递参数，选择不同的调用接口
    public List selectType(@RequestBody Options options) {
        // 进行异常捕获
//        try {
        System.out.println("测试传递参数" + options.getSearchtype());
        if (options.getSearchtype().equals("searchTrain")) {
            return searchService.selectTrain('%' + this.SStation + '%', '%' + this.EStation + '%');
        } else if (options.getSearchtype().equals("searchStation")) {
            // 模糊字段的截取，用于查找车站所在的省份
            System.out.println(this.SStation.substring(0, 2));
            return searchService.selectStation('%' + this.SStation.substring(0, 2) + '%');
        } else if (options.getSearchtype().equals("searchTicket")) {
            return searchService.selectTicket('%' + this.SStation + '%', '%' + this.EStation + '%');
        } else if (options.getSearchtype().equals("searchPassenger")) {
            System.out.println("searchPassenger" + this.SStation);
            return searchService.selectPassenger('%' + this.SStation + '%', '%' + this.EStation + '%');
        } else {
            return null;
        }

////        } catch (Exception e) {
//            System.err.println("服务错误，请检查！");
//            return null;
////        }

    }

}
