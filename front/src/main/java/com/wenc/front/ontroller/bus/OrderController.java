package com.wenc.front.controller.bus;


import com.wenc.commdomain.pojo.bus.TbOrderD;
import com.wenc.commdomain.pojo.bus.TbOrderH;
import com.wenc.commdomain.vo.bus.VbOrderD;
import com.wenc.commdomain.vo.bus.VbOrderH;
import com.wenc.core.annotation.BaseMasterDetailControllerAnnotation;
import com.wenc.core.controller.AbstractBaseMasterDetailController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("MOrder")
public class OrderController extends AbstractBaseMasterDetailController<TbOrderH, TbOrderD, VbOrderH, VbOrderD> {

    @BaseMasterDetailControllerAnnotation(
            serialCode = "2302",
            keyColName = "orderNo"
    )
    public OrderController() {
        super();
    }


}
