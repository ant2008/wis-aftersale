package com.wiser.wx.pay.service;

import com.github.binarywang.wxpay.service.WxPayService;
import com.wiser.wx.pay.config.WxPayProperties;
import com.wiser.wx.pay.dto.*;

/**
 * 微信支付service
 *
 * @author w.li
 * @date 2020-01-03
 *
 * @since 1.0
 */
public interface WxPaymentService {


    WxPayProperties  getPayProperties();


    String getSandBoxKey() throws Exception;


    /**
     * 创建原生微信service.
     *
     * @return
     * @throws Exception
     */
    WxPayService createWxPayService() throws Exception;


    /**
     * 微信预支付
     *
     * @param wxPrePaymentDTO
     * @return
     * @throws Exception
     *
     * todo:待完成逻辑
     */
    WxPrePaymentRetDTO wxPrePay(WxPrePaymentDTO wxPrePaymentDTO) throws Exception;


    /**
     * 微信订单查询
     * @param wxPaymentQueryDTO
     * @return
     * @throws Exception
     *
     * todo:待完成逻辑。
     */
    WxPaymentQueryRetDTO wxPayQuery(WxPaymentQueryDTO wxPaymentQueryDTO) throws Exception;


    /**
     * 微信退款申请
     *
     * @param wxPayRefundDTO
     * @return
     * @throws Exception
     */
    WxPayRefundRetDTO   wxPayRefund(WxPayRefundDTO wxPayRefundDTO) throws Exception;







}
