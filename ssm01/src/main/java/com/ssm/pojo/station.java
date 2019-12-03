package com.ssm.pojo;

/**
 * @ClassName station
 * @Description 存放关于车站“station"查询的相关数据库实体信息
 * @Author 牛兴炜
 * @Date 2019/12/2 11:13
 * @Version 1.0
 */
public class station {
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String ID;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String City;
    public String Province;

}
