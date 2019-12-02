package com.ssm.pojo;

/**
 * @ClassName ticket
 * @Description 存放关于车票“ticket”查询的相关信息
 * @Author 牛兴炜
 * @Date 2019/12/2 11:14
 * @Version 1.0
 */
public class ticket {
    public String UName;

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getBTime() {
        return BTime;
    }

    public void setBTime(String BTime) {
        this.BTime = BTime;
    }

    public String getATIME() {
        return ATIME;
    }

    public void setATIME(String ATIME) {
        this.ATIME = ATIME;
    }

    public String getTrainNUmber() {
        return TrainNUmber;
    }

    public void setTrainNUmber(String trainNUmber) {
        TrainNUmber = trainNUmber;
    }

    public String getBStation() {
        return BStation;
    }

    public void setBStation(String BStation) {
        this.BStation = BStation;
    }

    public String getAStation() {
        return AStation;
    }

    public void setAStation(String AStation) {
        this.AStation = AStation;
    }

    public int Price;
    public String BTime;
    public String ATIME;
    public String TrainNUmber;
    public String BStation;
    public String AStation;


}
