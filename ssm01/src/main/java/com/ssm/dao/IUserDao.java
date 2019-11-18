package com.ssm.dao;


import com.ssm.controller.RegisterData;
import com.ssm.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {
    List<User> getAllUser();

    void insertUser(RegisterData register);

}

