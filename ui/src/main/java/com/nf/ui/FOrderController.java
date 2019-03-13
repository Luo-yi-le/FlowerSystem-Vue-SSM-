package com.nf.ui;

import com.nf.entity.FOrder;
import com.nf.entity.R;
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
}
