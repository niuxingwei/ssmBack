package com.ssm.service;

import com.ssm.dao.SearchDao;
import com.ssm.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SearchServiceImpl
 * @Description 查询服务接口的实现层
 * @Author 牛兴炜
 * @Date 2019/12/2 17:26
 * @Version 1.0
 */
@Service
// 注解一定不能丢
public class SearchServiceImpl implements SearchService {

    @Autowired
    // 参数注入,根据自己的需要调入不同的Dao层
    // 说明： 由于根据前端传递的始发站、终到站的参数 故以下函数的接口全部只有两个参数
    private SearchDao searchDao;

    @Override
    public List<train> selectTrain(String SStation, String EStation) {
        // 参数测试
        // System.out.println("列车查询 始发站参数为： "+SStation);
        // 列车service 调用Dao层  后续的是 Controller层调用Service层
        return searchDao.selectTrain(SStation, EStation);
    }

    @Override
    public List<ticket> selectTicket(String SStation, String EStation) {
        // 车票service 调用Dao层  后续的是 Controller层调用Service层
        return searchDao.selectTicket(SStation, EStation);
    }

    @Override
    public List<station> selectStation(String SStation) {
        // 车站service 调用Dao层  后续的是 Controller层调用Service层
        System.out.println("车站查询" + SStation);
        return searchDao.selectStation(SStation);
    }

    @Override
    public List<Passenger> selectPassenger(String SStation, String EStation) {
        // 用户service 调用Dao层  后续的是 Controller层调用Service层
        System.out.println("用户信息查询传递参数" + SStation);
        return searchDao.selectPassenger(SStation, EStation);
    }

}
