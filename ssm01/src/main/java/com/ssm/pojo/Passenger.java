package com.ssm.pojo;

/**
 * @ClassName Passenger
 * @Description 存放关于列车乘客信息的数据库实体存储
 * @Author 牛兴炜
 * @Date 2019/12/2 11:16
 * @Version 1.0
 */
public class Passenger {
    public String UName;

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getIDcard() {
        return IDcard;
    }

    public void setIDcard(String IDcard) {
        this.IDcard = IDcard;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String Sex;
    public String IDcard;
    public String Phone;

}
