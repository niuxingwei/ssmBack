package com.ssm.dao;



import com.ssm.controller.RegisterData;
import com.ssm.pojo.Login;
import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {
    List<User> getAllUser();

    void insertUser(RegisterData register);

    List<Login> selectUser(@Param("account") String account);

}

