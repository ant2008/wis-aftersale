package com.wenc.front.controller.matdata;

import com.wenc.commdomain.pojo.matdata.TbScheduleSite;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 排程地点
 */
@RequestMapping("ScheduleSite")
@RestController
public class ScheduleSiteController extends AbstractBaseSingleController<TbScheduleSite,TbScheduleSite> {
    public ScheduleSiteController() {
        super();
    }
}
