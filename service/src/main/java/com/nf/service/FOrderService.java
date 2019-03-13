package com.nf.service;

import com.nf.entity.FOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FOrderService {

    List<FOrder> selectFOrder();
    int insertFOrder(FOrder fOrder);
    int deleteFOrder(@Param("oid") int oid);
    int updateFOrder(FOrder fOrder);
}
