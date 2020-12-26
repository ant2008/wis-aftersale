package com.wiser.hw.sms.service;

import java.util.Date;

/**
 * 华为短信发送
 *
 * @author w.li
 * @date 2020-1-9
 *
 * @since 1.0
 */
public interface HwSmsService {

    /**
     * 发送测试短信。
     *
     * @param aPhoneNo
     * @param aCode
     * @throws Exception
     */
    void sendHwTestSms(String aPhoneNo,String aCode) throws Exception;


    /**
     * 华为原生方法构建发送体
     *
     * @param sender
     * @param receiver
     * @param templateId
     * @param templateParas
     * @param statusCallbackUrl
     * @param signature
     * @return
     * @throws Exception
     */
    String buildRequestBody(String sender, String receiver, String templateId, String templateParas,
                            String statusCallbackUrl, String signature) throws Exception;


    /**
     * 华为原生方法构建WsHead
     * @param appKey
     * @param appSecret
     * @return
     * @throws Exception
     */
    String buildWsseHeader(String appKey, String appSecret) throws Exception;


    /**
     * 封装华为原生发送信息接口
     * @return
     */
    String sendSms(String smsBody) throws Exception;


    /**
     * 华为发送短信的通用封装函数。
     *
     * @param aTemplateId
     * @param aPhoneNo
     * @param aSmsParam
     * @throws Exception
     */
    void sendHwSms(String aTemplateId,String aPhoneNo,String aSmsParam) throws Exception;


    /**
     * 华为发送短信的通用封装函数。
     *
     * @param aTemplateId
     * @param aPhoneNo
     * @param aSmsParams
     * @throws Exception
     */
    void sendHwSms(String aTemplateId,String aPhoneNo,String ...aSmsParams) throws Exception;



}
