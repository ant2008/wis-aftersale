package com.wenc.front.controller.glt;

import com.wenc.commdomain.pojo.glt.GlProduct;
import com.wenc.commdomain.pojo.matdata.TbProduct;
import com.wenc.commdomain.vo.matdata.ParasetVo;
import com.wenc.commonservice.glt.service.GlProductService;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.BaseRetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("MGlprd")
public class MGlprdController extends AbstractBaseSingleController<GlProduct,GlProduct> {

    @Autowired
    protected GlProductService glProductService;

    public MGlprdController() {
        super();
    }

    @Override
    public void beforeEdit(HttpSession session, HttpServletRequest request, GlProduct aModel) throws Exception {
        aModel.setDepartCode("01");
    }

    /**
     * 激活全网
     * @param session
     * @param request
     * @param response
     * @param aItemId
     * @return
     */
    @RequestMapping(value = "ActiveWholeScope",method = RequestMethod.POST)
    public BaseRetModel<GlProduct> activeWholeScope(HttpSession session,
                                                            HttpServletRequest request,
                                                            HttpServletResponse response,
                                                            @RequestParam String  aItemId)
    {
        BaseRetModel<GlProduct> retModel = new BaseRetModel<>();

        GlProduct glProduct = null;

        try
        {
            glProduct = glProductService.getGlProduct(getLoginTenantId(),aItemId);

            if(glProduct == null)
            {
                retModel.setCode(BaseConstant.ERR_CODE_201);
                retModel.setMsg("无法获取商品信息!");
                return retModel;
            }

           glProduct =  glProductService.activeGlProduct(getLoginTenantId(),aItemId,1,"1");

           retModel.setData(glProduct);

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
