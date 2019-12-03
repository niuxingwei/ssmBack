package com.ssm.controller;

import java.util.Date;

/**
 * @ClassName SearchCityData
 * @Description TODO
 * @Author 15281
 * @Date 2019/12/2 11:05
 * @Version 1.0
 */
public class SearchCityData {
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

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }


    public String EStation;
    public String radio;

    public String getSelectedTime() {
        return selectedTime;
    }

    public void setSelectedTime(String selectedTime) {
        this.selectedTime = selectedTime;
    }

    public String selectedTime;

}
