package com.nf.service.Impl;

import com.nf.entity.FOrder;
import com.nf.service.FOrderService;
import com.nf.dao.FOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FOrderImpl implements FOrderService {
    @Autowired
    FOrderDao  fOrderDao;

    public List<FOrder> selectFOrder() {
        return fOrderDao.selectFOrder();
    }

    public int insertFOrder(FOrder fOrder) {
        return fOrderDao.insertFOrder(fOrder);
    }

    public int deleteFOrder(int oid) {
        return fOrderDao.deleteFOrder(oid);
    }

    public int updateFOrder(FOrder fOrder) {
        return fOrderDao.updateFOrder(fOrder);
    }
}
