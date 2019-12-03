package com.ssm.pojo;


public class User {
    // 用户ID
    private int ID;
    // 姓名
    private String Account;
    // 用户密码
    private String Pwd;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }


}
