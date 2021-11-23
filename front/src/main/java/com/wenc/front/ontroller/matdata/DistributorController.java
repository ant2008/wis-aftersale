package com.wenc.front.controller.matdata;

import com.wenc.commdomain.pojo.stb.TbDistributor;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("MDistributor")
public class DistributorController extends AbstractBaseSingleController<TbDistributor,TbDistributor> {
    public DistributorController() {
        super();
    }
}
