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
    public String startCity;

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public Date getSelectedTime() {
        return selectedTime;
    }

    public void setSelectedTime(Date selectedTime) {
        this.selectedTime = selectedTime;
    }

    public String endCity;
    public String radio;
    public Date selectedTime;

}
