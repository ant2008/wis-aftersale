package com.wenc.front.controller.bsys;

import com.wenc.commdomain.pojo.matdata.TsOrgcode;
import com.wenc.commonservice.matdata.service.OrgService;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 组织机构设置
 */
@RequestMapping("MOrgcode")
@RestController
public class OrgcodeController extends AbstractBaseSingleController<TsOrgcode,TsOrgcode> {

    @Autowired
    private OrgService orgService;


    private static String HQ_ATTRIBUTE = "0";

    public OrgcodeController() {
        super();
    }


    /**
     * 不允许客户端修改或者增加总部属性
     * @param session
     * @param request
     * @param aModel
     * @throws Exception
     */
    @Override
    public void beforeCreate(HttpSession session, HttpServletRequest request, TsOrgcode aModel) throws Exception {
       try {

           if (aModel.getOrgAtrrib() != null && aModel.getOrgAtrrib().trim().equals(HQ_ATTRIBUTE)) {
               throw new Exception("不允许增加或修改[总部]属性公司代码!");
           }
       }catch (Exception ex)
       {
           throw new Exception(ex.getMessage());
       }
    }


    @Override
    public void beforeEdit(HttpSession session, HttpServletRequest request, TsOrgcode aModel) throws Exception {

        if (aModel.getOrgAtrrib() != null && aModel.getOrgAtrrib().trim().equals(HQ_ATTRIBUTE)) {
            throw new Exception("不允许增加或修改[总部]属性公司代码!");
        }

    }


    /**
     * 由于默认的总部已经被系统添加，因此手工操作的添加机构，后续父节点都为总部底下所设置机构。
     *
     * @param aModel
     * @throws Exception
     */
    @Override
    public void InitCreate(TsOrgcode aModel) throws Exception {

        TsOrgcode defaOrgCode = null;

        try{

            defaOrgCode = orgService.getDefaOrg(getLoginTenantId());

            if(defaOrgCode != null)
            {
                aModel.setParentCode(defaOrgCode.getOrgCode());
            }

        }catch (Exception ex)
        {

        }


    }
}
