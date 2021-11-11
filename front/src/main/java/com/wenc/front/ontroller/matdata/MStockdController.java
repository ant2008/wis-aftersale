package com.wenc.front.controller.matdata;

import com.wenc.commdomain.pojo.sys.TbStockD;
import com.wenc.commdomain.vo.matdata.VbStockD;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 库存明细controller
 *
 * @author li.w
 */
@RequestMapping("MStockd")
@RestController
public class MStockdController extends AbstractBaseSingleController<TbStockD, VbStockD> {
    public MStockdController() {
        super();
    }




}
