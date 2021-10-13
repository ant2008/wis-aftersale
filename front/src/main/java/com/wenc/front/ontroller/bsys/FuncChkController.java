package com.wenc.front.controller.bsys;

import com.wenc.commdomain.pojo.core.SsFuncD;
import com.wenc.commdomain.pojo.core.VbFuncD;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 审核设置
 */
@RequestMapping("MFuncChk")
@RestController
public class FuncChkController extends AbstractBaseSingleController<SsFuncD, VbFuncD> {
    public FuncChkController() {
        super();
    }
}
