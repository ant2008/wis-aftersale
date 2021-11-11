package com.wenc.front.controller.matdata;

import com.wenc.commdomain.pojo.sys.TbStockH;
import com.wenc.commdomain.vo.matdata.VbStockH;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 库存汇总controller.
 * @author li.w
 */
@RequestMapping("MStockh")
@RestController
public class MStockhController extends AbstractBaseSingleController<TbStockH, VbStockH> {

    public MStockhController() {
        super();
    }
}
