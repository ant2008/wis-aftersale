package com.wenc.front.controller.sal;

import com.wenc.commdomain.pojo.matdata.TsShopAssistant;
import com.wenc.commdomain.vo.matdata.VbShopAssistant;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("MAssist")
public class ShopAssistController extends AbstractBaseSingleController<TsShopAssistant, VbShopAssistant> {
    public ShopAssistController() {
        super();
    }
}
