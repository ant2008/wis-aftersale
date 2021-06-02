package com.wenc.front.controller.bil;

import com.wenc.commdomain.pojo.bil.VbReceiveQuy;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 入库单查询
 */
@RestController
@RequestMapping("MRecquy")
public class MRecquyController extends AbstractBaseSingleController<VbReceiveQuy,VbReceiveQuy> {
    public MRecquyController() {
        super();
    }
}
