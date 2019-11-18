package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class UserController {

    @Autowired
    private IUserService userService;


    // 登陆界面数据交互
    @RequestMapping("/login")
    @ResponseBody
    public List<User> userInfor() {
        //        测试与数数据库交互是否成功
        System.out.println("全栈系统已连接");
        System.out.println(userService.getUser().size());
        return userService.getUser();
    }

    //    注册界面数据交互
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public String getData(@RequestBody RegisterData register) {
        //         测试数据传递是否成功
        try {
            userService.insertUser(register);
            return "scuuess";
        } catch (Exception e) {
            System.err.println("用户名已存在");
            return "fail";
        }
    }
}
