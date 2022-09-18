package com.wenc.front.controller.rpt;

import cn.hutool.core.date.DateUtil;
import com.wenc.commdomain.pojo.report.VbShopDailySale;
import com.wenc.commonservice.report.service.ReportService;
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
import java.util.Date;

@RestController
@RequestMapping("MShopsale")
public class MShopsaleController extends AbstractBaseSingleController<VbShopDailySale,VbShopDailySale> {

    @Autowired
    private ReportService reportService;


    public MShopsaleController() {
        super();
    }


    /**
     * 统计当前租户数据。
     *
     * @param session
     * @param request
     * @param response
     * @param aStatDate
     * @return
     */
    @RequestMapping(value = "StateShopSale",method = RequestMethod.POST)
    public BaseRetModel<String> stateShopSale(HttpSession session,
                                                 HttpServletRequest request,
                                                 HttpServletResponse response,
                                                 @RequestParam String aStatDate)
    {
        BaseRetModel<String> retModel = new BaseRetModel<>();

        Date statDate = null;

        try
        {
            if(aStatDate.trim().equals(""))
            {
                retModel.setMsg("统计日期不允许为空!");
                retModel.setCode(BaseConstant.ERR_CODE_201);
                return retModel;
            }

            statDate = DateUtil.parse(aStatDate,"yyyy-MM-dd");



            reportService.statShopDailySale(statDate,getLoginTenantId(),getLoginUserId());

        }catch (Exception ex)
        {
            retModel.setMsg(ex.getMessage());
            retModel.setCode(BaseConstant.ERROR);
            return retModel;
        }

        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;

    }
}
