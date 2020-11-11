package com.wiser.aliyun.sms;

import java.util.Date;

public interface AliyunSmsService {

    /**
     * 发送验证码
     * @param aCode
     * @throws Exception
     */
    void sendVerifyCode(String aPhoneNo,String aCode) throws  Exception;


    /**
     * 发送激活通知
     *
     * @param aUserName
     * @param aUserId
     * @param aInitPwd
     * @throws Exception
     */
    void sendActiveMsg(String aPhoneNo,String aUserName,String aUserId,String aInitPwd) throws Exception;


    /**
     * 发送申请退回通知
     *
     * @param aPhoneNo
     * @param aUserName
     * @param aRejectDescribe
     * @throws Exception
     */
    void sendAccApplyReject(String aPhoneNo,String aUserName,String aRejectDescribe) throws Exception;


    /**
     * 发送资质审核通过通知。
     *
     * @param aPhoneNo
     * @param aUserName
     * @param aChkResult
     * @throws Exception
     */
    void sendAccCertify(String aPhoneNo,String aUserName,String aChkResult) throws Exception;


    /**
     * 发送预留验证短信。
     *
     * @param aPhoneNo
     * @param aCustomerName
     * @param aItemName
     * @param aWiteOffCode
     * @param aItemDate
     * @param aSupplyName
     * @param aItemAddress
     * @throws Exception
     */
    void sendReservateCode(String aPhoneNo,
                           String aCustomerName,
                           String aItemName,
                           String aWiteOffCode,
                           Date aItemDate,
                           String aSupplyName,
                           String aItemAddress) throws Exception;


    /**
     * 发送业务员账户激活通知。
     *
     * @param aPhoneNo
     * @param aUserName
     * @param aPcUserId
     * @param aMaUserId
     * @param aUserPwd
     * @throws Exception
     */
    void  sendActiveSalesmanAccount(String aPhoneNo,
                                    String aUserName,
                                    String aPcUserId,
                                    String aMaUserId,
                                    String aUserPwd) throws Exception;



}
