package com.wenc.front.controller.glt;

import cn.hutool.core.util.StrUtil;
import com.wenc.commdomain.pojo.glt.GlPaymentAccount;
import com.wenc.commonservice.glt.service.GlPaymentAccountService;
import com.wenc.commonservice.glt.service.impl.GlPaymentAccountServiceImpl;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.exception.ControllException;
import com.wenc.core.model.BaseRetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 全局支付台账controller
 * @author w.li
 * @date 2020-1-7
 * @since 1.0
 */
@RequestMapping("GlPaymentAcc")
@RestController
public class GlPaymentAccountController extends AbstractBaseSingleController<GlPaymentAccount, GlPaymentAccount> {




    @Autowired
    private GlPaymentAccountService glPaymentAccountService;


    public GlPaymentAccountController() {
        super();
    }


    /**
     * 微信退款
     * @param session
     * @param request
     * @param response
     * @param aIdx
     * @return
     */
    @RequestMapping("WxRefund")
    public BaseRetModel<GlPaymentAccount> wxRefund(HttpSession session,
                                                   HttpServletRequest request,
                                                   HttpServletResponse response,
                                                   @RequestParam String aIdx)
    {
        BaseRetModel<GlPaymentAccount> retModel = new BaseRetModel<>();


        GlPaymentAccount glPaymentAccount= null;

        GlPaymentAccount refundPaymentAccount = null;

        try
        {

            if(aIdx == null || "".equals(aIdx.trim()))
            {
                return retModel.err(BaseConstant.ERR_CODE_201,"索引号不允许为空!");
            }

            glPaymentAccount = glPaymentAccountService.getPaymentAccount(Long.valueOf(aIdx));

            if(glPaymentAccount == null)
            {
                return retModel.err(BaseConstant.ERR_CODE_202,"获取台账信息错误!");
            }

            if(StrUtil.isBlank(glPaymentAccount.getPaymentDirection()))
            {
                return  retModel.err(BaseConstant.ERR_CODE_203,"无法获取支付方向");
            }

            if(StrUtil.isBlank(glPaymentAccount.getPaymentType()))
            {
                return retModel.err(BaseConstant.ERR_CODE_204,"无法获取支付类型!");
            }

            if(!glPaymentAccount.getPaymentDirection().trim().equals(GlPaymentAccountServiceImpl.PAY_DIRECTION_SALE))
            {
                return retModel.err(BaseConstant.ERR_CODE_205,"此单据["+glPaymentAccount.getPaymentBillNo()+"]非支付单据！");
            }

            if(glPaymentAccount.getPaymentBillType().trim().equals(GlPaymentAccountServiceImpl.PAY_TYPE_ZFB))
            {
                return retModel.err(BaseConstant.ERR_CODE_206,"支付方式为微信，不允许通过微信进行退款操作!");
            }




            refundPaymentAccount = glPaymentAccountService.wxRefund(getLoginTenantId(),getLoginUserId(),glPaymentAccount);


            if(refundPaymentAccount == null)
            {
                throw new ControllException("返回退货台账信息错误!");
            }


            retModel.setData(refundPaymentAccount);

        }catch (Exception ex)
        {
            return retModel.err(BaseConstant.ERROR,ex.getMessage());
        }

        return retModel.ok(BaseConstant.SUCESS,BaseConstant.SUCCESS_MSG);

    }


}
