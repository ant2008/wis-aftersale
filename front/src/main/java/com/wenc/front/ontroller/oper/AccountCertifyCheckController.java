package com.wenc.front.ontroller.oper;

import com.wenc.commdomain.pojo.matdata.TbAccountCertify;
import com.wenc.commdomain.pojo.matdata.VbAccountCertify;
import com.wenc.commdomain.vo.matdata.AccountCertifyVO;
import com.wenc.commonservice.matdata.service.AccountCertifyService;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.BaseRetModel;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import net.bytebuddy.description.NamedElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 资质审核
 */
@RestController
@RequestMapping("MAcccertChk")
public class AccountCertifyCheckController extends AbstractBaseSingleController<VbAccountCertify,VbAccountCertify> {

    @Autowired
    private AccountCertifyService accountCertifyService;




    public AccountCertifyCheckController() {
        super();
    }


    /**
     * 否决认证
     *
     * @param session
     * @param request
     * @param response
     * @param aIdx
     * @param aRejectCode
     * @param aRejectDescribe
     * @return
     */
    @ApiOperation(value = "RejectCertify",notes = "否决资质认证")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "aIdx",required = true,value = "行记录号"),
            @ApiImplicitParam(name = "aRejectCode",required = true,value = "否决代码"),
            @ApiImplicitParam(name = "aRejectDescribe",required = true,value = "否决描述")
    })
    @RequestMapping(value = "RejectCertify", method = RequestMethod.POST)
    public BaseRetModel<AccountCertifyVO> rejectCertify(HttpSession session,
                                                           HttpServletRequest request,
                                                           HttpServletResponse response,
                                                           @RequestParam String aIdx,
                                                           @RequestParam String aRejectCode,
                                                           @RequestParam String aRejectDescribe
                                                           )
    {
        BaseRetModel<AccountCertifyVO> retModel = new BaseRetModel<>();
        AccountCertifyVO accountCertifyVO = null;

        try
        {
            if(aIdx == null || aIdx.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_201);
                retModel.setMsg("无法获取行记录");
                return retModel;
            }

            if(aRejectCode == null || aRejectCode.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_202);
                retModel.setMsg("否决代码不允许为空");
                return retModel;
            }

            if(aRejectDescribe == null || aRejectDescribe.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_203);
                retModel.setMsg("否决原因不允许为空");
                return retModel;
            }

          accountCertifyVO =
                  accountCertifyService.rejectAccountCertifyState(
                          getLoginTenantId(),
                          "",
                          Long.valueOf(aIdx),
                    "2",
                          getLoginUserId(),
                          aRejectCode,
                          aRejectDescribe);

            retModel.setData(accountCertifyVO);

        }catch (Exception ex)
        {

            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }

        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;
    }


    /**
     * 通过资质
     *
     * @param session
     * @param request
     * @param response
     * @param aIdx
     * @return
     */
    @ApiOperation(value = "PassCertify",notes = "否决资质认证")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "aIdx",required = true,value = "行记录号")
    })
    @RequestMapping(value = "PassCertify", method = RequestMethod.POST)
    public BaseRetModel<AccountCertifyVO> passCertify(HttpSession session,
                                                        HttpServletRequest request,
                                                        HttpServletResponse response,
                                                        @RequestParam String aIdx
    )
    {
        BaseRetModel<AccountCertifyVO> retModel = new BaseRetModel<>();
        AccountCertifyVO accountCertifyVO = null;

        try
        {
            if(aIdx == null || aIdx.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_201);
                retModel.setMsg("无法获取行记录");
                return retModel;
            }


            accountCertifyVO =
                    accountCertifyService.passAccountCertifyState(
                            getLoginTenantId(),
                            "",
                            Long.valueOf(aIdx),
                            "1",
                            getLoginUserId());






            retModel.setData(accountCertifyVO);

        }catch (Exception ex)
        {

            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }

        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;
    }

}
