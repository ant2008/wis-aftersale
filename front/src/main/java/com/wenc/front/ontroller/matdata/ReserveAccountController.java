package com.wenc.front.controller.matdata;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wenc.commdomain.pojo.bus.TbReservationAccount;
import com.wenc.commdomain.pojo.bus.VbReservationAccount;
import com.wenc.commdomain.pojo.matdata.TbProductSchedule;
import com.wenc.commdomain.pojo.matdata.VbProductSchedule;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.BaseRetModel;
import com.wenc.core.util.GsonHelper;

import com.wiser.hw.sms.service.HwSmsService;
import com.wiser.hw.sms.service.impl.HwSmsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 预留台账管理
 * //todo:需完善更改并发短信的逻辑。
 */
@RequestMapping("ReserveAccount")
@RestController
public class ReserveAccountController extends AbstractBaseSingleController<TbReservationAccount, VbReservationAccount> {

//    @Autowired
//    private ReservationAccountService reservationAccountService;

    @Autowired
    private HwSmsService hwSmsService;


    public ReserveAccountController() {
        super();
    }


    /**
     * 保存调整预约信息。
     *
     * @param session
     * @param request
     * @param response
     * @param aJsonStr
     * @return
     */
//    @RequestMapping("SaveReserveAccount")
//    public BaseRetModel<VbReservationAccount> saveReserveAccount(HttpSession session,
//                                                               HttpServletRequest request,
//                                                               HttpServletResponse response,
//                                                               @RequestParam String aJsonStr)
//    {
//        BaseRetModel<VbReservationAccount> retModel = new BaseRetModel<>();
//
//        VbReservationAccount reservationAccountRequest = null;
//
//        Gson gson = GsonHelper.getGsonAll();
//
//        VbReservationAccount retReservationAccount = null;
//
//        String tmpDateStr = "";
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//
//        String tempItemName = "";
//
//        try
//        {
//
//            if(aJsonStr == null || aJsonStr.trim().equals(""))
//            {
//                retModel.setCode(BaseConstant.ERR_CODE_201);
//                retModel.setMsg("保存信息不允许为空!");
//                return  retModel;
//            }
//
//            reservationAccountRequest = gson.fromJson(aJsonStr,new TypeToken<VbReservationAccount>(){}.getType());
//
//            if(reservationAccountRequest == null)
//            {
//                retModel.setCode(BaseConstant.ERR_CODE_202);
//                retModel.setMsg("转化保存对象错误!");
//                return retModel;
//            }
//
//            retReservationAccount = reservationAccountService.adjustReservateAccountInfo(getLoginTenantId(),
//                    reservationAccountRequest.getIdx(),
//                    reservationAccountRequest.getReservationDate(),
//                    reservationAccountRequest.getScheduleIdx(),
//                    reservationAccountRequest.getScheduleType(),
//                    reservationAccountRequest.getScheduleRangeType(),
//                    reservationAccountRequest.getScheduleSiteId());
//
//
//
//            if(retReservationAccount == null)
//            {
//                return retModel.err(BaseConstant.ERR_CODE_206,"保存台账信息为空!");
//            }
//
//
//            //发送重新调整后的信息给用户。
//            if(retReservationAccount.getReservationMobileNo() != null &&
//            !"".equals(retReservationAccount.getReservationMobileNo().trim()))
//            {
//
//                tmpDateStr = simpleDateFormat.format(retReservationAccount.getReservationDate());
//
//
//                if(retReservationAccount.getScheduleRangeType() == null ||
//                        retReservationAccount.getScheduleRangeType().trim().equals(""))
//                {
//                    tempItemName = retReservationAccount.getItemName();
//                }else if(retReservationAccount.getScheduleRangeType().trim().equals("0"))
//                {
//                    tempItemName = retReservationAccount.getItemName()+"-上午";
//                }else
//                {
//                    tempItemName = retReservationAccount.getItemName()+"-下午";
//                }
//
//                hwSmsService.sendHwSms(HwSmsServiceImpl.TEMPLATE_ADJUST_RESERVATE,
//                        retReservationAccount.getReservationMobileNo(),
//                        retReservationAccount.getReservationUserName(),
//                        tempItemName,
//                        retReservationAccount.getWriteoffCode(),
//                        tmpDateStr,
//                        retReservationAccount.getVendorName(),
//                        retReservationAccount.getScheduleSiteName());
//
//            }
//
//
//            retModel.setData(reservationAccountRequest);
//
//
//        }catch (Exception ex)
//        {
//            retModel.setCode(BaseConstant.ERROR);
//            retModel.setMsg(ex.getMessage());
//            return retModel;
//        }
//
//        retModel.setCode(BaseConstant.SUCESS);
//        retModel.setMsg(BaseConstant.SUCCESS_MSG);
//        return retModel;
//
//    }

}
