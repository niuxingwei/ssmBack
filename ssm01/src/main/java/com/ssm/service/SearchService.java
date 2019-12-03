package com.ssm.service;

import com.ssm.pojo.*;

import java.util.List;

public interface SearchService {
    // 根据用户传递的参数搜索列车信息
    List<train> selectTrain(String SStation, String EStation);

    // 根据用户传递的参数搜索车票信息
    List<ticket> selectTicket(String SStation, String EStation);

    // 根据用户传递的参数搜索车站信息
    List<station> selectStation(String SStation);

    // 根据用户传递的参数搜索用户信息
    List<Passenger> selectPassenger(String SStation, String EStation);

}
