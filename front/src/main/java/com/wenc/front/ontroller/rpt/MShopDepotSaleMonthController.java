package com.wenc.front.controller.rpt;

import com.wenc.commdomain.pojo.report.VbShopDepotSaleM;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 库区销售月报表
 */
@RequestMapping("MShopDepotSaleMonth")
@RestController
public class MShopDepotSaleMonthController extends AbstractBaseSingleController<VbShopDepotSaleM,VbShopDepotSaleM> {
    public MShopDepotSaleMonthController() {
        super();
    }
}
