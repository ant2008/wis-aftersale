package com.wenc.front.controller.rpt;

import com.wenc.commdomain.pojo.report.VbProductSaleM;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品月汇总销售
 */
@RestController
@RequestMapping("MPrdSaleMonth")
public class MPrdSaleMonthController extends AbstractBaseSingleController<VbProductSaleM,VbProductSaleM> {
    public MPrdSaleMonthController() {
        super();
    }
}
