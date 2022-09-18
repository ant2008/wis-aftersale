package com.wenc.front.controller.rpt;

import com.wenc.commdomain.pojo.report.VbShopDepotSaleM;
import com.wenc.commdomain.pojo.report.VbShopSaleM;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 月汇总店销售报表
 */
@RestController
@RequestMapping("MShopSaleMonth")
public class MShopSaleMonthController extends AbstractBaseSingleController<VbShopSaleM,VbShopSaleM> {
    public MShopSaleMonthController() {
        super();
    }
}
