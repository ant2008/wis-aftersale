package com.wenc.front.controller.bil;

import com.wenc.commdomain.pojo.bil.VbSaleQuy;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 销售单查询
 */
@RequestMapping("MSalequy")
@RestController
public class MSalequyController extends AbstractBaseSingleController<VbSaleQuy,VbSaleQuy> {
    public MSalequyController() {
        super();
    }
}
