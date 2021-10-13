package com.wenc.front.controller.bsys;

import com.wenc.commdomain.pojo.core.SsTenant;
import com.wenc.commdomain.pojo.sys.TsPos;
import com.wenc.commonservice.sys.service.TenantService;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * POS机设置界面
 */
@RequestMapping("MPos")
@RestController
public class PosController extends AbstractBaseSingleController<TsPos,TsPos> {

    @Autowired
    protected TenantService tenantService;

    public PosController() {
        super();
    }

    @Override
    public void InitCreate(TsPos aModel) throws Exception {

        try
        {
            tenantService.verifyTenantPos(getLoginTenantId());

        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    }
}
