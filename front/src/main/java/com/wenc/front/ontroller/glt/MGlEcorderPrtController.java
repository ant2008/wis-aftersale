package com.wenc.front.controller.glt;

import com.wenc.commdomain.pojo.stb.TbEcorderH;
import com.wenc.commdomain.pojo.stb.VbPltecorderH;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.SearchConModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 平台发货界面
 */
@RestController
@RequestMapping("MGlEcorderPrt")
public class MGlEcorderPrtController extends AbstractBaseSingleController<TbEcorderH, VbPltecorderH> {
    public MGlEcorderPrtController() {
        super();
    }

    @Override
    public String processPageQuery(String aSearchClassName, String aHqlStr, List<SearchConModel> searchConModels) {

        String hqlStr = "";

        hqlStr = aHqlStr;

        //没有Where
        if(hqlStr.trim().toUpperCase().indexOf("WHERE") <=0){

            hqlStr = hqlStr + " Where  idx > 0 and doState = '5' and authzTenantId = '"+ getLoginTenantId()+"' ";
        }else
        {
            hqlStr = hqlStr + " and  doState = '5' and authzTenantId = '" + getLoginTenantId() + "' ";
        }

        return hqlStr;
    }

}
