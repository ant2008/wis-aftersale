package com.wiser.wx.pay.service.impl;

import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.github.binarywang.wxpay.bean.request.WxPayOrderQueryRequest;
import com.github.binarywang.wxpay.bean.request.WxPayQueryCommentRequest;
import com.github.binarywang.wxpay.bean.request.WxPayRefundRequest;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.bean.result.BaseWxPayResult;
import com.github.binarywang.wxpay.bean.result.WxPayOrderQueryResult;
import com.github.binarywang.wxpay.bean.result.WxPayRefundResult;
import com.github.binarywang.wxpay.bean.result.WxPayUnifiedOrderResult;
import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.constant.WxPayConstants;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.service.impl.WxPayServiceImpl;
import com.wenc.core.exception.ServiceException;
import com.wenc.core.util.LogHelper;
import com.wiser.wx.pay.config.WxPayProperties;
import com.wiser.wx.pay.dto.*;
import com.wiser.wx.pay.request.WxPayCallRequest;
import com.wiser.wx.pay.service.WxPaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;

/**
 * 微信支付service
 *
 * @author w.li
 * @date 2020-01-03
 *
 * @since 1.0
 */
@Service
public class WxPaymentServiceImpl implements WxPaymentService {

    private Logger LOG = LoggerFactory.getLogger(WxPaymentServiceImpl.class);


    private static String WX_PAY_NOTIFY_URL = "";

    private static  String WX_PAY_JSAPI = "JSAPI";

    private static String WX_PAY_NATIVE="NATIVE";

    private static String WX_PAY_APP="APP";

    private static String WX_SUCCESS = "SUCCESS";



    @Autowired
    private WxPayProperties wxPayProperties;

    @Autowired
    private WxPayService wxPayService;

    @Override
    public WxPayProperties getPayProperties() {
        return wxPayProperties;
    }

    @Override
    public String getSandBoxKey() throws Exception {

        WxPayService wxPayService = null;

        try{
            //使用spring模式.屏蔽
//            wxPayService = createWxPayService();

            return wxPayService.getSandboxSignKey();

        }catch (Exception ex)
        {
            throw new ServiceException(ex.getMessage());
        }


    }

    /**
     * 创建原生微信service.
     *
     * @return
     * @throws Exception
     */
    @Override
    public WxPayService createWxPayService() throws Exception {

        WxPayConfig wxPayConfig = null;

        WxPayService  wxPayService = null;

        try{

            wxPayConfig = new WxPayConfig();

            wxPayConfig.setAppId(wxPayProperties.getAppId());
            wxPayConfig.setMchId(wxPayProperties.getMchId());
            wxPayConfig.setMchKey(wxPayProperties.getMchKey());
            if(!StrUtil.isBlank(wxPayProperties.getSubAppId())) {
                wxPayConfig.setSubAppId(wxPayProperties.getSubAppId());
            }

            if(!StrUtil.isBlank(wxPayProperties.getSubMchId()))
            {
                wxPayConfig.setSubMchId(wxPayProperties.getSubMchId());
            }

            if(!StrUtil.isBlank(wxPayProperties.getKeyPath())) {
                wxPayConfig.setKeyPath(wxPayProperties.getKeyPath());
            }


            wxPayConfig.setSignType(WxPayConstants.SignType.MD5);

            //启动沙箱
            wxPayConfig.setUseSandboxEnv(false);

            wxPayService = new WxPayServiceImpl();

            wxPayService.setConfig(wxPayConfig);


        }catch (Exception ex)
        {
            throw new ServiceException(ex.getMessage());
        }

        return wxPayService;
    }

    /**
     * 微信预支付
     *
     * @param wxPrePaymentDTO
     * @return
     * @throws Exception
     */
    @Override
    public WxPrePaymentRetDTO wxPrePay(WxPrePaymentDTO wxPrePaymentDTO) throws Exception {


        WxPayUnifiedOrderRequest wxPayUnifiedOrderRequest= null;

        WxPayCallRequest wxPayCallRequest = null;


        int payFee = 0;

        WxPayUnifiedOrderResult wxPayResult = null;


        WxPrePaymentRetDTO prePaymentRetDTO = null;


        try{

            if(ObjectUtil.isNull(wxPrePaymentDTO))
            {
                throw new ServiceException("提交参数对象不允许为空!");
            }

            if(wxPrePaymentDTO.getOderAmt() == null || wxPrePaymentDTO.getOderAmt().doubleValue() <= 0 )
            {
                throw new ServiceException("提交订单金额不允许为空或者小于0!");
            }

            //转化为分
            payFee =  wxPrePaymentDTO.getOderAmt().multiply(BigDecimal.valueOf(100)).intValueExact();

            //临时屏蔽
            //wxPayService = createWxPayService();

            //暂时统一支付名目为预约支付费用。


            //组建提交参数。
            wxPayUnifiedOrderRequest = WxPayUnifiedOrderRequest
                    .newBuilder()
                    .body(wxPrePaymentDTO.getItemName())
                    .detail(wxPrePaymentDTO.getItemDetail())
                    .outTradeNo(wxPrePaymentDTO.getBillNo())
                    .totalFee(payFee)
                    .spbillCreateIp("127.0.0.1")
                    .notifyUrl(wxPrePaymentDTO.getNotifyUrl())
                    .tradeType(WX_PAY_JSAPI)
                    .openid(wxPrePaymentDTO.getOpenId())
                    .build();
//NetUtil.getLocalhost().getHostAddress()



            wxPayResult =  wxPayService.unifiedOrder(wxPayUnifiedOrderRequest);

          if(wxPayResult == null)
          {
              throw new ServiceException("微信支付返回异常!");
          }

          if(wxPayResult.getPrepayId() == null || wxPayResult.getPrepayId().trim().equals(""))
          {

              LogHelper.debug(LOG,"微信支付错误,错误原因:{}",wxPayResult.getErrCodeDes());
              throw new ServiceException("微信支付异常:"+wxPayResult.getErrCodeDes());
          }

          //组成返回对象。
          prePaymentRetDTO = new WxPrePaymentRetDTO();

          prePaymentRetDTO.setTradeType(wxPayResult.getTradeType());
          prePaymentRetDTO.setCodeUrl(wxPayResult.getCodeURL());
          prePaymentRetDTO.setPrepayId(wxPayResult.getPrepayId());
          prePaymentRetDTO.setOutTradNo(wxPrePaymentDTO.getBillNo());
          prePaymentRetDTO.setErrCode(wxPayResult.getErrCode());
          prePaymentRetDTO.setResultCode(wxPayResult.getResultCode());
          prePaymentRetDTO.setReturnCode(wxPayResult.getReturnCode());
          prePaymentRetDTO.setErrCodeDes(wxPayResult.getErrCodeDes());
          prePaymentRetDTO.setReturnMsg(wxPayResult.getReturnMsg());

          //返回原来的签名机制。

          wxPayCallRequest = new WxPayCallRequest();

          wxPayCallRequest.buildPageAge(wxPayResult.getPrepayId());
          wxPayCallRequest.checkAndSign(wxPayService.getConfig());


          prePaymentRetDTO.setNonceStr(wxPayCallRequest.getNonceStr());
          prePaymentRetDTO.setPaySign(wxPayCallRequest.getPaySign());
          prePaymentRetDTO.setWxTimeStamp(wxPayCallRequest.getWxTimeStamp());
          prePaymentRetDTO.setSignType(wxPayCallRequest.getSignType());





        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }


        return prePaymentRetDTO;

    }

    /**
     * 微信订单查询
     *
     * @param wxPaymentQueryDTO
     * @return
     * @throws Exception todo:待完成逻辑。
     */
    @Override
    public WxPaymentQueryRetDTO wxPayQuery(WxPaymentQueryDTO wxPaymentQueryDTO) throws Exception {

        WxPayOrderQueryRequest wxPayOrderQueryRequest = null;
        WxPayOrderQueryResult  wxResult = null;

        WxPaymentQueryRetDTO wxPayRetDTO = null;




        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        try
        {
            if(wxPaymentQueryDTO == null)
            {
                throw new ServiceException("提交参数不允许为空!");
            }

            if(StrUtil.isBlank(wxPaymentQueryDTO.getTransactionId()))
            {
                throw new ServiceException("微信支付订单号不允许为空!");
            }

            //由于前端获取不到微信流水号,使用预约订单进行查询。

            wxPayOrderQueryRequest =
                    WxPayOrderQueryRequest
                    .newBuilder()
                    .outTradeNo(wxPaymentQueryDTO.getTransactionId())
                    .build();


            if(wxPayOrderQueryRequest == null)
            {
                throw new ServiceException("组建查询参数异常!");
            }


            //wxPayService = createWxPayService();

            wxResult =  wxPayService.queryOrder(wxPayOrderQueryRequest);

           if(wxResult == null || wxResult.getTradeState() == null)
           {
               throw new ServiceException("查询微信支付异常!");
           }

           if(wxResult.getTradeState() != null &&
                   !wxResult.getTradeState().equals(WX_SUCCESS))
           {
               LogHelper.debug(LOG,"微信查询返回异常，错误原因为:{}",wxResult.getErrCodeDes());

               throw new ServiceException("微信查询返回异常:"+wxResult.getTradeState());
           }

           if(wxResult.getTransactionId() == null || wxResult.getTransactionId().trim().equals(""))
           {
               throw new ServiceException("微信查询返回异常!"+wxResult.getErrCodeDes());
           }

           //组成返回对象
            wxPayRetDTO = new WxPaymentQueryRetDTO();

           wxPayRetDTO.setBankType(wxResult.getBankType());
           wxPayRetDTO.setCashFee(BigDecimal.valueOf(Double.parseDouble(String.valueOf(wxResult.getCashFee()))));
           wxPayRetDTO.setDeviceInfo(wxResult.getDeviceInfo());
           wxPayRetDTO.setErrCodeDes(wxResult.getErrCodeDes());
           wxPayRetDTO.setErrCode(wxResult.getErrCode());
           wxPayRetDTO.setIfSubscribe(wxResult.getIsSubscribe());
           wxPayRetDTO.setOpenId(wxResult.getOpenid());
           wxPayRetDTO.setOutTradeNo(wxResult.getOutTradeNo());
           wxPayRetDTO.setResultCode(wxResult.getResultCode());
           wxPayRetDTO.setReturnCode(wxResult.getReturnCode());
           wxPayRetDTO.setReturnMsg(wxResult.getReturnMsg());

//           if(!StrUtil.isBlank(wxResult.getTimeEnd()))
//           {
//               wxPayRetDTO.setTimeEnd(simpleDateFormat.parse(
//                       wxResult.getTimeEnd()));
//           }

           wxPayRetDTO.setTotalFee(BigDecimal.valueOf(Double.parseDouble(String.valueOf(wxResult.getTotalFee()))));
           wxPayRetDTO.setTradeState(wxResult.getTradeState());
           wxPayRetDTO.setTradeStateDesc(wxResult.getTradeStateDesc());
           wxPayRetDTO.setTradeType(wxResult.getTradeType());
           wxPayRetDTO.setTransactionId(wxResult.getTransactionId());



        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }

        return wxPayRetDTO;

    }

    /**
     * 微信退款申请
     *
     * @param wxPayRefundDTO
     * @return
     * @throws Exception
     */
    @Override
    public WxPayRefundRetDTO wxPayRefund(WxPayRefundDTO wxPayRefundDTO) throws Exception {

        WxPayRefundRequest wxPayRefundRequest = null;

        WxPayRefundResult wxPayRefundResult = null;

        WxPayRefundRetDTO wxPayRefundRetDTO = null;

        try
        {

            if(ObjectUtil.isNull(wxPayRefundDTO))
            {
                throw new ServiceException("退款信息为空!");
            }


         wxPayRefundRequest =
                 WxPayRefundRequest
                    .newBuilder()
                    .transactionId(wxPayRefundDTO.getTransactionId())
                    .outRefundNo(wxPayRefundDTO.getBillNo())
                    .refundFee(wxPayRefundDTO.getOderAmt().multiply(BigDecimal.valueOf(100)).intValueExact())
                    .totalFee(wxPayRefundDTO.getPaymentAmt().multiply(BigDecimal.valueOf(100)).intValueExact())
                    .build();


           wxPayRefundResult =  wxPayService.refund(wxPayRefundRequest);

           if(wxPayRefundResult == null)
           {
               throw new com.wenc.core.exception.ServiceException("调用微信返回对象为空!");
           }

           if(wxPayRefundResult.getRefundId() == null || "".equals(wxPayRefundResult.getRefundId().trim()))
           {
               throw new ServiceException("调用微信退款返回退款单ID位空!");
           }


           wxPayRefundRetDTO = new WxPayRefundRetDTO();


            wxPayRefundRetDTO.setOutRefundNo(wxPayRefundResult.getOutRefundNo());
            wxPayRefundRetDTO.setOutTradeNo(wxPayRefundResult.getOutTradeNo());
            wxPayRefundRetDTO.setRefundFee(
                    BigDecimal.valueOf(wxPayRefundResult.getRefundFee()).divide(BigDecimal.valueOf(100),3, RoundingMode.HALF_UP));
            wxPayRefundRetDTO.setRefundId(wxPayRefundResult.getRefundId());
            wxPayRefundRetDTO.setResultCode(wxPayRefundResult.getResultCode());
            wxPayRefundRetDTO.setReturnMsg(wxPayRefundResult.getReturnMsg());
            wxPayRefundRetDTO.setTransactionId(wxPayRefundResult.getTransactionId());

            if(wxPayRefundResult.getCashFee() != null)
            {
                wxPayRefundRetDTO.setCashFee(
                        BigDecimal.valueOf(wxPayRefundResult.getCashFee())
                .divide(BigDecimal.valueOf(100),3,RoundingMode.HALF_UP));
            }else {
                wxPayRefundRetDTO.setCashFee(BigDecimal.ZERO);
            }

            wxPayRefundRetDTO.setErrCode(wxPayRefundResult.getErrCode());
            wxPayRefundRetDTO.setErrCodeDes(wxPayRefundResult.getErrCodeDes());
            if(wxPayRefundResult.getTotalFee() != null)
            {
                wxPayRefundRetDTO.setCashFee(
                        BigDecimal.valueOf(wxPayRefundResult.getTotalFee())
                                .divide(BigDecimal.valueOf(100),3,RoundingMode.HALF_UP));
            }else {
                wxPayRefundRetDTO.setTotalFee(BigDecimal.ZERO);
            }



            return wxPayRefundRetDTO;

        }catch (Exception ex)
        {
            throw new ServiceException(ex.getMessage());
        }

    }

}
