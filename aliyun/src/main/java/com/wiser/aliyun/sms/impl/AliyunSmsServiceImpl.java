package com.wiser.aliyun.sms.impl;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;
import com.wiser.aliyun.config.AliyunSmsConfig;
import com.wiser.aliyun.sms.AliyunSmsService;
import com.wiser.aliyun.sms.DTO.*;
import me.chanjar.weixin.common.util.json.GsonHelper;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AliyunSmsServiceImpl implements AliyunSmsService {


    private Logger LOG = LoggerFactory.getLogger(AliyunSmsServiceImpl.class);

    private static String  AliyunDomain = "dysmsapi.aliyuncs.com";

    private static String  SendAction = "SendSms";

    @Autowired
    private AliyunSmsConfig aliyunSmsConfig;

    /**
     * 发送验证码
     *
     * @param aCode
     * @throws Exception
     */
    @Override
    public void sendVerifyCode(String aPhoneNo,String aCode) throws Exception {

        DefaultProfile profile = null;
        IAcsClient client = null;

        CommonRequest request = null;

        CommonResponse  response =  null;


        VerifyCodeDTO verifyCodeDTO = null;

        Gson gson = new Gson();


        String requestJson = "";

        try{

            profile =  DefaultProfile.getProfile("default", aliyunSmsConfig.getAccessKeyId(), aliyunSmsConfig.getAccessSecret());

            client =  new DefaultAcsClient(profile);

            request =  new CommonRequest();


            //request.setProtocol(ProtocolType.HTTPS);
            request.setMethod(MethodType.POST);
            request.setDomain(AliyunDomain);
            //request.setVersion("2017-05-25");
            request.setAction(SendAction);
            request.setVersion("2017-05-25");


            request.putQueryParameter("PhoneNumbers", aPhoneNo);
            request.putQueryParameter("SignName", aliyunSmsConfig.getSmsSign());
            request.putQueryParameter("TemplateCode", aliyunSmsConfig.getVerifyCodeTemplate());



            //组建提交对象。
            verifyCodeDTO = new VerifyCodeDTO();

            verifyCodeDTO.setCode(aCode);


            requestJson = gson.toJson(verifyCodeDTO);


            request.putQueryParameter("TemplateParam",requestJson);


            response = client.getCommonResponse(request);

            LOG.debug("send verify code return {}",response.getData());

            System.out.println(response.getData());



           }catch (Exception ex)
           {
               throw new Exception(ex.getMessage());
           }

    }

    /**
     * 发送激活通知
     *
     * @param aUserName
     * @param aUserId
     * @param aInitPwd
     * @throws Exception
     */
    @Override
    public void sendActiveMsg(String aPhoneNo,String aUserName,String aUserId,String aInitPwd) throws Exception {


        DefaultProfile profile = null;
        IAcsClient client = null;

        CommonRequest request = null;

        CommonResponse  response =  null;


        ActiveAccountDTO activeAccountDTO = null;


        String requestJson = "";

        Gson gson = new Gson();

        try{

            profile =  DefaultProfile.getProfile("default", aliyunSmsConfig.getAccessKeyId(), aliyunSmsConfig.getAccessSecret());

            client =  new DefaultAcsClient(profile);

            request =  new CommonRequest();


            //request.setProtocol(ProtocolType.HTTPS);
            request.setMethod(MethodType.POST);
            request.setDomain(AliyunDomain);
            request.setVersion("2017-05-25");
            request.setAction(SendAction);


            request.putQueryParameter("PhoneNumbers", aPhoneNo);
            request.putQueryParameter("SignName", aliyunSmsConfig.getSmsSign());
            request.putQueryParameter("TemplateCode", aliyunSmsConfig.getActiveAccountTemplate());


            //组建提交参数。
            activeAccountDTO = new ActiveAccountDTO();


            activeAccountDTO.setUserId(aUserId);
            activeAccountDTO.setUserName(aUserName);
            activeAccountDTO.setUserPwd(aInitPwd);

            requestJson = gson.toJson(activeAccountDTO);


            request.putQueryParameter("TemplateParam",requestJson);


            response = client.getCommonResponse(request);

            LOG.debug("send verify code return {}",response.getData());

            System.out.println(response.getData());



        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }

    }

    /**
     * 发送申请退回通知
     *
     * @param aPhoneNo
     * @param aUserName
     * @param aRejectDescribe
     * @throws Exception
     */
    @Override
    public void sendAccApplyReject(String aPhoneNo, String aUserName, String aRejectDescribe) throws Exception {

        DefaultProfile profile = null;
        IAcsClient client = null;

        CommonRequest request = null;

        CommonResponse  response =  null;


        AccApplyRejectDTO accApplyRejectDTO = null;


        String requestJson = "";

        Gson gson = new Gson();

        try{

            profile =  DefaultProfile.getProfile("default", aliyunSmsConfig.getAccessKeyId(), aliyunSmsConfig.getAccessSecret());

            client =  new DefaultAcsClient(profile);

            request =  new CommonRequest();


            //request.setProtocol(ProtocolType.HTTPS);
            request.setMethod(MethodType.POST);
            request.setDomain(AliyunDomain);
            request.setVersion("2017-05-25");
            request.setAction(SendAction);


            request.putQueryParameter("PhoneNumbers", aPhoneNo);
            request.putQueryParameter("SignName", aliyunSmsConfig.getSmsSign());
            request.putQueryParameter("TemplateCode", aliyunSmsConfig.getAccApplyRejectTemplate());


            //组建提交参数。
            accApplyRejectDTO = new AccApplyRejectDTO();


            accApplyRejectDTO.setApplyName(aUserName);
            accApplyRejectDTO.setRejectDescribe(aRejectDescribe);

            requestJson = gson.toJson(accApplyRejectDTO);


            request.putQueryParameter("TemplateParam",requestJson);


            response = client.getCommonResponse(request);

            LOG.debug("send Account Reject SMS return {}",response.getData());

            System.out.println(response.getData());



        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }

    }

    /**
     * 发送资质审核通过通知。
     *
     * @param aPhoneNo
     * @param aUserName
     * @param aChkResult
     * @throws Exception
     */
    @Override
    public void sendAccCertify(String aPhoneNo, String aUserName, String aChkResult) throws Exception {

        DefaultProfile profile = null;
        IAcsClient client = null;

        CommonRequest request = null;

        CommonResponse  response =  null;


        AccountCertifyDTO accountCertifyDTO = null;


        String requestJson = "";

        Gson gson = new Gson();

        try{

            profile =  DefaultProfile.getProfile("default", aliyunSmsConfig.getAccessKeyId(), aliyunSmsConfig.getAccessSecret());

            client =  new DefaultAcsClient(profile);

            request =  new CommonRequest();


            //request.setProtocol(ProtocolType.HTTPS);
            request.setMethod(MethodType.POST);
            request.setDomain(AliyunDomain);
            request.setVersion("2017-05-25");
            request.setAction(SendAction);


            request.putQueryParameter("PhoneNumbers", aPhoneNo);
            request.putQueryParameter("SignName", aliyunSmsConfig.getSmsSign());
            request.putQueryParameter("TemplateCode", aliyunSmsConfig.getAccountCertifyTemplate());


            //组建提交参数。
            accountCertifyDTO = new AccountCertifyDTO();


            accountCertifyDTO.setName(aUserName);
            accountCertifyDTO.setChkresult(aChkResult);

            requestJson = gson.toJson(accountCertifyDTO);


            request.putQueryParameter("TemplateParam",requestJson);


            response = client.getCommonResponse(request);

            LOG.debug("send Account Reject SMS return {}",response.getData());

            System.out.println(response.getData());



        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    }

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
    @Override
    public void sendReservateCode(String aPhoneNo, String aCustomerName, String aItemName, String aWiteOffCode,
                                  Date aItemDate, String aSupplyName, String aItemAddress) throws Exception {

        DefaultProfile profile = null;
        IAcsClient client = null;

        CommonRequest request = null;

        CommonResponse  response =  null;


        ReservateCodeDTO reservateCodeDTO = null;


        String requestJson = "";

        Gson gson = new Gson();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try{

            profile =  DefaultProfile.getProfile("default", aliyunSmsConfig.getAccessKeyId(), aliyunSmsConfig.getAccessSecret());

            client =  new DefaultAcsClient(profile);

            request =  new CommonRequest();


            //request.setProtocol(ProtocolType.HTTPS);
            request.setMethod(MethodType.POST);
            request.setDomain(AliyunDomain);
            request.setVersion("2017-05-25");
            request.setAction(SendAction);


            request.putQueryParameter("PhoneNumbers", aPhoneNo);
            request.putQueryParameter("SignName", aliyunSmsConfig.getSmsSign());
            request.putQueryParameter("TemplateCode", aliyunSmsConfig.getReservateCodeTemplate());


            //组建提交参数。
            reservateCodeDTO = new ReservateCodeDTO();


            reservateCodeDTO.setCustomerName(aCustomerName);
            reservateCodeDTO.setItemName(aItemName);
            reservateCodeDTO.setSupplyName(aSupplyName);
            reservateCodeDTO.setItemAddress(aItemAddress);
            reservateCodeDTO.setItemDate(simpleDateFormat.format(aItemDate));
            reservateCodeDTO.setWriteoffCode(aWiteOffCode);

            requestJson = gson.toJson(reservateCodeDTO);


            request.putQueryParameter("TemplateParam",requestJson);


            response = client.getCommonResponse(request);

            LOG.debug("send Reservation Code SMS return {}",response.getData());

            System.out.println(response.getData());


        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }


    }

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
    @Override
    public void sendActiveSalesmanAccount(String aPhoneNo, String aUserName, String aPcUserId, String aMaUserId,
                                          String aUserPwd) throws Exception {

        DefaultProfile profile = null;
        IAcsClient client = null;

        CommonRequest request = null;

        CommonResponse  response =  null;


        ActiveSalesmanAccDTO activeSalesmanAccDTO =null;

        String requestJson = "";

        Gson gson = new Gson();


        try
        {
            profile =  DefaultProfile.getProfile("default", aliyunSmsConfig.getAccessKeyId(), aliyunSmsConfig.getAccessSecret());

            client =  new DefaultAcsClient(profile);

            request =  new CommonRequest();


            //request.setProtocol(ProtocolType.HTTPS);
            request.setMethod(MethodType.POST);
            request.setDomain(AliyunDomain);
            request.setVersion("2017-05-25");
            request.setAction(SendAction);


            request.putQueryParameter("PhoneNumbers", aPhoneNo);
            request.putQueryParameter("SignName", aliyunSmsConfig.getSmsSign());
            request.putQueryParameter("TemplateCode", aliyunSmsConfig.getActiveSalesManAccTemplate());


            //组建提交参数。
            activeSalesmanAccDTO = new ActiveSalesmanAccDTO();


            activeSalesmanAccDTO.setUserName(aUserName);
            activeSalesmanAccDTO.setPcUserId(aPcUserId);
            activeSalesmanAccDTO.setMaUserId(aMaUserId);
            activeSalesmanAccDTO.setUserPwd(aUserPwd);

            requestJson = gson.toJson(activeSalesmanAccDTO);


            request.putQueryParameter("TemplateParam",requestJson);


            response = client.getCommonResponse(request);

            LOG.debug("send Salesman Active  Account SMS return: {}",response.getData());





        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }


    }
}
