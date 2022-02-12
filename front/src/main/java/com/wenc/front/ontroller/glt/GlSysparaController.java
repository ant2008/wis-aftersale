package com.wenc.front.controller.glt;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wenc.commdomain.dto.dsb.DistribPerformanceDTO;
import com.wenc.commdomain.pojo.glt.GlSyspara;
import com.wenc.commonservice.glt.dao.GlSysparaRepository;
import com.wenc.commonservice.glt.service.GlSysparaService;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.BaseRetModel;
import com.wenc.core.util.GsonHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 全局参数设置。
 *
 * @author w.li
 * @date 2020-1-3
 * @since 1.0
 *
 */
@RequestMapping("GlSyspara")
@RestController
public class GlSysparaController extends AbstractBaseSingleController<GlSyspara,GlSyspara> {

    @Autowired
    private GlSysparaService glSysparaService;


    public GlSysparaController() {
        super();
    }

    /**
     * 同步租户参数
     *
     * @param session
     * @param request
     * @param response
     * @param aJsonStr
     * @return
     */
    @RequestMapping("TenantSyspara")
    public BaseRetModel<GlSyspara> synTenantPara(HttpSession session,
                                                 HttpServletRequest request,
                                                 HttpServletResponse response,
                                                 @RequestParam String aJsonStr)
    {
        BaseRetModel<GlSyspara> retModel = new BaseRetModel<>();

        Gson gson = GsonHelper.getGsonAll();

        GlSyspara glSyspara = null;

        try
        {

            if(aJsonStr == null || aJsonStr.trim().equals(""))
            {
                 return retModel.err(BaseConstant.ERR_CODE_201,"提交信息为空!");
            }

            glSyspara = gson.fromJson(aJsonStr,new TypeToken<GlSyspara>(){}.getType());

            if(glSyspara == null)
            {
                return retModel.err(BaseConstant.ERR_CODE_202,"转化全局参数错误");
            }

            //同步所有租户
            glSysparaService.synTenantSyspara(getLoginTenantId(),getLoginUserId(),glSyspara);

            retModel.setData(glSyspara);

        }catch (Exception ex)
        {
            return retModel.err(BaseConstant.ERROR,ex.getMessage());
        }

        return retModel.ok(BaseConstant.SUCESS,BaseConstant.SUCCESS_MSG);

    }
}
