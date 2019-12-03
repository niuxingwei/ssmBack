package com.ssm.service;

import com.ssm.controller.RegisterData;
import com.ssm.dao.IUserDao;
import com.ssm.pojo.Login;
import com.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;
    public List<User> getUser() {
        return userDao.getAllUser();
    }

    @Override
    public void insertUser(RegisterData register) {
        System.out.println("开始插入数据");
        userDao.insertUser(register);
        System.out.println("插入数据结束");
    }

    @Override
    public List<Login> selectLoginUser(String account) {
        System.out.println(account);
        return userDao.selectUser(account);
    }


}
