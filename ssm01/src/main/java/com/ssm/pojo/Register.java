package com.ssm.pojo;

public class Register {
    //   用户名
    private String UserName;
    //    用户密码
    private String pass;
    //    确认密码
    private String checkPass;
    //    姓名
    private String Name;
    //    用户ID（身份证号、港澳台居民证等）
    private String ID;
    //    用户邮箱
    private String Email;
    //    用户手机号
    private String Phone;

    //以下是Set 和 Get方法
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

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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
}
