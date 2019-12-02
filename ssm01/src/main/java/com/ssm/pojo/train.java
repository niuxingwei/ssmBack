package com.ssm.pojo;

/**
 * @ClassName train
 * @Description 存放列车信息查询的数据库实体信息
 * @Author 牛兴炜
 * @Date 2019/12/2 11:15
 * @Version 1.0
 */
public class train {
    public String SStation;

    public String getSStation() {
        return SStation;
    }

    public void setSStation(String SStation) {
        this.SStation = SStation;
    }

    public String getEStation() {
        return EStation;
    }

    public void setEStation(String EStation) {
        this.EStation = EStation;
    }

    public String getTrainNUmber() {
        return TrainNUmber;
    }

    public void setTrainNUmber(String trainNUmber) {
        TrainNUmber = trainNUmber;
    }

    public String getSTime() {
        return STime;
    }

    public void setSTime(String STime) {
        this.STime = STime;
    }

    public String getETime() {
        return ETime;
    }

    public void setETime(String ETime) {
        this.ETime = ETime;
    }

    public String EStation;
    public String TrainNUmber;
    public String STime;
    public String ETime;

}
