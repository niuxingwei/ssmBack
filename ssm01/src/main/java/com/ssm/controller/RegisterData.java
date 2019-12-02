package com.ssm.controller;

/**
 * @ClassName RegisterData
 * @Description 根据用户输入法人信息进行注册
 * @Author 牛兴炜  创建的实体类用来接受前端传递的参数
 * @Date 2019/10/23 23:26
 * @Version 1.0
 */
public class RegisterData {
    // 注册界面

    //   用户名
    //以下是Set 和 Get方法
    public String UserName;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCheckPass() {
        return checkPass;
    }

    public void setCheckPass(String checkPass) {
        this.checkPass = checkPass;
    }

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    public String getIDcard() {
        return IDcard;
    }

    public void setIDcard(String IDcard) {
        this.IDcard = IDcard;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    //    用户密码
    public String pass;
    //    确认密码
    public String checkPass;
    //    姓名
    public String UName;
    //    用户ID（身份证号、港澳台居民证等）
    public String IDcard;
    //    用户邮箱
    public String Email;
    //    用户手机号
    public String Phone;



}


