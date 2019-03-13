package com.nf.ui;

import com.nf.entity.FOrder;
import com.nf.service.FOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/fOrder")
public class FOrderController {

    @Autowired
    FOrderService fOrderService;

    /**
     * 查询全部
     * */
    @RequestMapping(path = "/selectFOrder",method = RequestMethod.GET)
    @ResponseBody
    public List<FOrder> selectFOrder(){
        return fOrderService.selectFOrder();
    }

    /**
     * 添加
     * */
    @RequestMapping(path = "/insertFOrder",method = RequestMethod.GET)
    @ResponseBody
    public int insertFOrder(FOrder fOrder){
        return fOrderService.insertFOrder(fOrder);
    }

    /**
     * 删除
     * */
    @RequestMapping(path = "/deleteFOrder",method = RequestMethod.GET)
    @ResponseBody
    public int deleteFOrder(int oid){
        return fOrderService.deleteFOrder(oid);
    }

    /**
     * 修改
     * */
    @RequestMapping(path = "/updateFOrder",method = RequestMethod.GET)
    @ResponseBody
    public int updateFOrder(FOrder fOrder){
        return fOrderService.updateFOrder(fOrder);
    }
}
