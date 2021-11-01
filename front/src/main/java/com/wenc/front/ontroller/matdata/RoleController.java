package com.wenc.front.controller.matdata;

import com.wenc.commdomain.pojo.core.SsRole;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.SearchConModel;
import com.wenc.core.util.SearchConBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 角色权限
 *
 * @author b.v
 */
@RequestMapping("MRole")
@RestController
public class RoleController extends AbstractBaseSingleController<SsRole, SsRole> {
    public RoleController() {
        super();
    }



}
