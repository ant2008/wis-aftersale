package com.wenc.front.controller.shop;

import com.wenc.commdomain.pojo.shop.TbRetailsaleSumH;
import com.wenc.commdomain.vo.shop.RetailsaleSumVO;
import com.wenc.commdomain.vo.shop.VbRetailsaleSumH;
import com.wenc.commonservice.shop.service.RetailsaleSumService;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.BaseRetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 销售日结查询
 */
@RequestMapping("MRetsalsum")
@RestController
public class RetailsaleSumController extends AbstractBaseSingleController<TbRetailsaleSumH, VbRetailsaleSumH> {

    @Autowired
    protected RetailsaleSumService retailsaleSumService;

    public RetailsaleSumController() {
        super();
    }


    /**
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("GetSaleSumDetail")
    public BaseRetModel<RetailsaleSumVO> statSaleSum(HttpSession session,
                                                     HttpServletRequest request,
                                                     HttpServletResponse response,
                                                     @RequestParam String aSaleNo)
    {
        BaseRetModel<RetailsaleSumVO> retModel = new BaseRetModel<>();

        RetailsaleSumVO retailsaleSumVO = null;

        try{

          if(aSaleNo.trim().equals(""))
          {
              retModel.setCode(BaseConstant.ERR_CODE_201);
              retModel.setMsg("单据号不允许为空!");
              return retModel;
          }

          retailsaleSumVO = retailsaleSumService.getRetailSaleSumDetail(getLoginTenantId(),aSaleNo);
          retModel.setData(retailsaleSumVO);
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
