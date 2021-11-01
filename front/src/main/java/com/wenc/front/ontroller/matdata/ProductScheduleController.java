package com.wenc.front.controller.matdata;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wenc.commdomain.pojo.matdata.TbProductSchedule;
import com.wenc.commdomain.pojo.matdata.VbProductSchedule;
import com.wenc.commdomain.vo.matdata.VbProduct;
import com.wenc.commonservice.matdata.service.ProductScheduleService;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.BaseRetModel;
import com.wenc.core.util.GsonHelper;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * 排班商品排班controller
 *
 * @author c.c
 * @date 2019-12-25
 * @see 1.0
 */
@RequestMapping("ProductSchedule")
@RestController
public class ProductScheduleController extends AbstractBaseSingleController<TbProductSchedule, VbProductSchedule> {


    @Autowired
    private ProductScheduleService productScheduleService;

    public ProductScheduleController() {
        super();
    }


    /**
     * 保存和修改排班信息。
     *
     * todo:待测试
     * @param session
     * @param request
     * @param response
     * @param aJsonStr
     * @return
     */
    @ApiOperation("保存和修改排班信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "aJsonStr",value = "保存JSON",required = true,paramType = "JSON",dataType = "String")
    })
    @RequestMapping("SaveProductSchedule")
    public BaseRetModel<TbProductSchedule>  saveProductSchedule(HttpSession session,
                                                        HttpServletRequest request,
                                                        HttpServletResponse response,
                                                        @RequestParam String aJsonStr)
    {
        BaseRetModel<TbProductSchedule> retModel = new BaseRetModel<>();

        TbProductSchedule tbProductSchedule = null;

        VbProductSchedule saveProductSchedule = null;

        Gson gson = GsonHelper.getGsonAll();

        try
        {

            if(aJsonStr == null || aJsonStr.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_201);
                retModel.setMsg("保存信息不允许为空!");
                return  retModel;
            }

            saveProductSchedule = gson.fromJson(aJsonStr,new TypeToken<VbProductSchedule>(){}.getType());

            if(saveProductSchedule == null)
            {
                retModel.setCode(BaseConstant.ERR_CODE_202);
                retModel.setMsg("转化保存对象错误!");
                return retModel;
            }


            if(saveProductSchedule.getState() == null)
            {
                saveProductSchedule.setState(1);
            }


            tbProductSchedule =
                    productScheduleService.saveProductSchedule(getLoginTenantId(),
                    getLoginUserId(),
                    saveProductSchedule.getItemId(),
                    saveProductSchedule.getScheduleType(),
                    saveProductSchedule.getRangeType(),
                    new Date(saveProductSchedule.getScheduleDate().getTime()),
                    saveProductSchedule.getScheduleNum(),
                    saveProductSchedule.getUsedNum(),
                    saveProductSchedule.getItemPrice(),
                    saveProductSchedule.getItemPrice2(),
                    saveProductSchedule.getState(),
                    saveProductSchedule.getScheduleSiteId());


            retModel.setData(tbProductSchedule);


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
