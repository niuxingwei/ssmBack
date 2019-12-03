package com.ssm.dao;

import com.ssm.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// 返回的参数全部以搜索的参数为准
public interface SearchDao {
    // 返回的类别为List集合
    // @param为传递参数
    List<train> selectTrain(@Param("SStation") String SStation, @Param("EStation") String EStation);

    List<ticket> selectTicket(@Param("SStation") String SStation, @Param("EStation") String EStation);

    List<station> selectStation(@Param("SStation") String SStation);

    List<Passenger> selectPassenger(@Param("SStation") String SStation, @Param("EStation") String EStation);

}
