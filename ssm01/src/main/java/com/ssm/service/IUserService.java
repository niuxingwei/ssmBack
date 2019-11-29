package com.ssm.service;


import com.ssm.controller.RegisterData;
import com.ssm.pojo.Login;
import com.ssm.pojo.User;


import java.util.List;

public interface IUserService {

     List<User> getUser();

     void insertUser(RegisterData register);

     List<Login> selectLoginUser(String account);


}
