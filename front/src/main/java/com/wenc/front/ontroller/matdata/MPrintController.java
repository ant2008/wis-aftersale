package com.wenc.front.controller.matdata;

import com.wenc.commdomain.pojo.matdata.TsPrint;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 打印设置
 */
@RequestMapping("MPrint")
@RestController
public class MPrintController extends AbstractBaseSingleController<TsPrint,TsPrint> {
    public MPrintController() {
        super();
    }
}
