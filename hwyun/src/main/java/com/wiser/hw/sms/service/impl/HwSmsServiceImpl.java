package com.wiser.hw.sms.service.impl;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.StrUtil;
import com.wiser.hw.sms.config.HwSmsConfig;
import com.wiser.hw.sms.service.HwSmsService;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class HwSmsServiceImpl implements HwSmsService {


    private Logger LOG = LoggerFactory.getLogger(HwSmsServiceImpl.class);


    //华为发送短信后缀

    private static final String SMS_URL_AFTERFIX="/sms/batchSendSms/v1";

    private static final String SMS_URL_DIFFSMS_AFTERFIX="/sms/batchSendDiffSms/v1";


    //无需修改,用于格式化鉴权头域,给"X-WSSE"参数赋值
    private static final String WSSE_HEADER_FORMAT = "UsernameToken Username=\"%s\",PasswordDigest=\"%s\",Nonce=\"%s\",Created=\"%s\"";
    //无需修改,用于格式化鉴权头域,给"Authorization"参数赋值
    private static final String AUTH_HEADER_VALUE = "WSSE realm=\"SDP\",profile=\"UsernameToken\",type=\"Appkey\"";


    //开放模板类型供调用。
    public static final String TEMPLATE_VERIFYCODE="01";

    public static final String TEMPLATE_ACCOUNT_ACTIVE="02";

    public static final String TEMPLATE_ACCOUNT_REGJECT="03";

    public static final String TEMPLATE_ACCOUNT_CERTIFY_PASS="04";

    public static final String TEMPLATE_RESERVATE_SUCCESS="05";

    public static final String TEMPLATE_SALESMAN_ACTIVE="06";

    public static final String TEMPLATE_ADJUST_RESERVATE="07";


    @Autowired
    private HwSmsConfig hwSmsConfig;


    /**
     * 发送测试短信。
     *
     * @param aPhoneNo
     * @param aCode
     * @throws Exception
     */
    @Override
    public void sendHwTestSms(String aPhoneNo, String aCode) throws Exception {

        //APP接入地址+接口访问URI
        String url = null;
        //APP_Key
        String appKey = null;
        ////APP_Secret
        String appSecret = null;
        //国内短信签名通道号或国际/港澳台短信通道号
        String sender = null;
        //模板ID
        String templateId = null;

        String smsSign = "";

        String smsParamTemplate = "[\"{}\"]";
        String smsParam = null;

        String responseStr = "";


        try
        {

            //必填
            url = hwSmsConfig.getSendUrl();
            appKey = hwSmsConfig.getAppKey();
            appSecret = hwSmsConfig.getAppSecret();
            sender = hwSmsConfig.getSenderPassNo();
            templateId = hwSmsConfig.getTestTemplateId();
            smsSign = hwSmsConfig.getHwSmsSign();


            /**
             * 选填,使用无变量模板时请赋空值 String templateParas = "";
             * 单变量模板示例:模板内容为"您的验证码是${NUM_6}"时,templateParas可填写为"[\"369751\"]"
             * 双变量模板示例:模板内容为"您有${NUM_2}件快递请到${TXT_20}领取"时,templateParas可填写为"[\"3\",\"人民公园正门\"]"
             * ${DATE}${TIME}变量不允许取值为空,${TXT_20}变量可以使用英文空格或点号替代空值,${NUM_6}变量可以使用0替代空值
             * 查看更多模板和变量规范:产品介绍>模板和变量规范
             */

            smsParam = StrUtil.format(smsParamTemplate,aCode);

            if(StrUtil.isBlank(smsParam))
            {
                throw new Exception("短信参数不允许为空!");
            }

            //请求Body,不携带签名名称时,signature请填null
            String body = buildRequestBody(
                    sender,
                    aPhoneNo,
                    templateId,
                    smsParam,
                    "",
                    smsSign);
            if (null == body || body.isEmpty()) {
                System.out.println("body is null.");
                return;
            }


            if(LOG.isDebugEnabled())
            {
                LOG.debug("Sms Body is: {}",body);
            }

            responseStr = sendSms(body);

            if(responseStr != null)
            {
                Console.log("Sms response is :{}",responseStr);
            }else
            {
                Console.log("Sms response is null");
            }


        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    }

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
    @Override
    public String buildRequestBody(String sender, String receiver, String templateId, String templateParas,
                                   String statusCallbackUrl, String signature) throws Exception {
        try{

            if (null == sender || null == receiver || null == templateId || sender.isEmpty() || receiver.isEmpty()
                    || templateId.isEmpty()) {
                System.out.println("buildRequestBody(): sender, receiver or templateId is null.");
                return null;
            }
            List<NameValuePair> keyValues = new ArrayList<NameValuePair>();

            keyValues.add(new BasicNameValuePair("from", sender));
            keyValues.add(new BasicNameValuePair("to", receiver));
            keyValues.add(new BasicNameValuePair("templateId", templateId));
            if (null != templateParas && !templateParas.isEmpty()) {
                keyValues.add(new BasicNameValuePair("templateParas", templateParas));
            }
            if (null != statusCallbackUrl && !statusCallbackUrl.isEmpty()) {
                keyValues.add(new BasicNameValuePair("statusCallback", statusCallbackUrl));
            }
            if (null != signature && !signature.isEmpty()) {
                keyValues.add(new BasicNameValuePair("signature", signature));
            }

            return URLEncodedUtils.format(keyValues, Charset.forName("UTF-8"));


        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * 华为原生方法构建WsHead
     *
     * @param appKey
     * @param appSecret
     * @return
     * @throws Exception
     */
    @Override
    public String buildWsseHeader(String appKey, String appSecret) throws Exception {
        try
        {

            if (null == appKey || null == appSecret || appKey.isEmpty() || appSecret.isEmpty()) {
                System.out.println("buildWsseHeader(): appKey or appSecret is null.");
                return null;
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            String time = sdf.format(new Date()); //Created
            String nonce = UUID.randomUUID().toString().replace("-", ""); //Nonce

            byte[] passwordDigest = DigestUtils.sha256(nonce + time + appSecret);
            String hexDigest = Hex.encodeHexString(passwordDigest);

            //如果JDK版本是1.8,请加载原生Base64类,并使用如下代码
            String passwordDigestBase64Str = Base64.getEncoder().encodeToString(hexDigest.getBytes()); //PasswordDigest
            //如果JDK版本低于1.8,请加载三方库提供Base64类,并使用如下代码
            //String passwordDigestBase64Str = Base64.encodeBase64String(hexDigest.getBytes(Charset.forName("utf-8"))); //PasswordDigest
            //若passwordDigestBase64Str中包含换行符,请执行如下代码进行修正
            //passwordDigestBase64Str = passwordDigestBase64Str.replaceAll("[\\s*\t\n\r]", "");

            return String.format(WSSE_HEADER_FORMAT, appKey, passwordDigestBase64Str, nonce, time);

        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * 封装华为原生发送信息接口
     *
     * @param smsBody
     * @return
     */
    @Override
    public String sendSms(String smsBody) throws Exception {
        CloseableHttpClient client = null;

        HttpResponse response = null;

        String wsseHeader = null;

        try
        {

            //请求Headers中的X-WSSE参数值
            wsseHeader = buildWsseHeader(hwSmsConfig.getAppKey(), hwSmsConfig.getAppSecret());
            if (null == wsseHeader || wsseHeader.isEmpty()) {
                Console.log("wsse header is null.");
                return null;
            }

            //如果JDK版本低于1.8,可使用如下代码
            //为防止因HTTPS证书认证失败造成API调用失败,需要先忽略证书信任问题
            //CloseableHttpClient client = HttpClients.custom()
            //        .setSSLContext(new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
            //            @Override
            //            public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
            //                return true;
            //            }
            //        }).build()).setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE).build();

            //如果JDK版本是1.8,可使用如下代码
            //为防止因HTTPS证书认证失败造成API调用失败,需要先忽略证书信任问题
            client = HttpClients.custom()
                    .setSSLContext(new SSLContextBuilder().loadTrustMaterial(null,
                            (x509CertChain, authType) -> true).build())
                    .setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)
                    .build();

            response = client.execute(RequestBuilder.create("POST")//请求方法POST
                    .setUri(hwSmsConfig.getSendUrl()+SMS_URL_AFTERFIX)
                    .addHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")
                    .addHeader(HttpHeaders.AUTHORIZATION, AUTH_HEADER_VALUE)
                    .addHeader("X-WSSE", wsseHeader)
                    .setEntity(new StringEntity(smsBody)).build());


            if(response != null) {

                //打印信息。
                if (LOG.isDebugEnabled()) {
                    //打印响应头域信息
                    LOG.debug(" Send sms response: {},detail entity is: {}",
                            response.toString(),
                            response.getEntity());

                }

                return response.toString();

            }else
            {
                Console.log("Send sms reponse is null");
                return null;
            }


        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }

    }

    /**
     * 华为发送短信的通用封装函数。
     *<p>此方法用于发送验证码类</p>
     * @param aTemplateId
     * @param aPhoneNo
     * @param aSmsParam
     * @throws Exception
     */
    @Override
    public void sendHwSms(String aTemplateId, String aPhoneNo, String aSmsParam) throws Exception {

        //APP接入地址+接口访问URI
        String url = null;
        //APP_Key
        String appKey = null;
        ////APP_Secret
        String appSecret = null;
        //国内短信签名通道号或国际/港澳台短信通道号
        String sender = null;
        //模板ID
        String templateId = null;

        String smsSign = "";

        String smsParamTemplate = "[\"{}\"]";
        String smsParam = null;

        String responseStr = "";


        try
        {

            //必填
            url = hwSmsConfig.getSendUrl();
            appKey = hwSmsConfig.getAppKey();
            appSecret = hwSmsConfig.getAppSecret();
            sender = hwSmsConfig.getVerifySenderPassNo();
            smsSign = hwSmsConfig.getHwSmsSign();


            if(StrUtil.isBlank(aTemplateId))
            {
                throw new Exception("短信模板ID不允许为空!");
            }

            if(aTemplateId.trim().equals(TEMPLATE_VERIFYCODE))
            {
                templateId = hwSmsConfig.getRegisterValid();
            }else
            {
                throw new Exception("传入模板ID不合法!");
            }

            /**
             * 选填,使用无变量模板时请赋空值 String templateParas = "";
             * 单变量模板示例:模板内容为"您的验证码是${NUM_6}"时,templateParas可填写为"[\"369751\"]"
             * 双变量模板示例:模板内容为"您有${NUM_2}件快递请到${TXT_20}领取"时,templateParas可填写为"[\"3\",\"人民公园正门\"]"
             * ${DATE}${TIME}变量不允许取值为空,${TXT_20}变量可以使用英文空格或点号替代空值,${NUM_6}变量可以使用0替代空值
             * 查看更多模板和变量规范:产品介绍>模板和变量规范
             */

            smsParam = StrUtil.format(smsParamTemplate,aSmsParam);

            if(StrUtil.isBlank(smsParam))
            {
                throw new Exception("短信参数不允许为空!");
            }

            //请求Body,不携带签名名称时,signature请填null
            String body = buildRequestBody(
                    sender,
                    aPhoneNo,
                    templateId,
                    smsParam,
                    "",
                    smsSign);
            if (null == body || body.isEmpty()) {
                System.out.println("body is null.");
                return;
            }


            if(LOG.isDebugEnabled())
            {
                LOG.debug("Sms Body is: {}",body);
            }

            responseStr = sendSms(body);

            if(responseStr != null)
            {
                Console.log("Sms response is :{}",responseStr);
            }else
            {
                Console.log("Sms response is null");
            }


        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }

    }

    /**
     * 华为发送短信的通用封装函数。
     *
     * @param aTemplateId
     * @param aPhoneNo
     * @param aSmsParams
     * @throws Exception
     */
    @Override
    public void sendHwSms(String aTemplateId, String aPhoneNo, String... aSmsParams) throws Exception {



        //APP接入地址+接口访问URI
        String url = null;
        //APP_Key
        String appKey = null;
        ////APP_Secret
        String appSecret = null;
        //国内短信签名通道号或国际/港澳台短信通道号
        String sender = null;
        //模板ID
        String templateId = null;

        String smsSign = "";

        //"[\"{}\"]";
        String smsParamTemplate = null;


        String smsParamTemplate_Left="[";

        String smsParamTemplate_Right="]";

        String smsParamTemplate_Middle="\"{}\"";

        String smsParam = null;

        String responseStr = "";

        String tmpPhone="";

        String tmpSenderNo = "";


        try
        {

            //必填
            url = hwSmsConfig.getSendUrl();
            appKey = hwSmsConfig.getAppKey();
            appSecret = hwSmsConfig.getAppSecret();
            sender = hwSmsConfig.getSenderPassNo();
            smsSign = hwSmsConfig.getHwSmsSign();


            if(StrUtil.isBlank(aTemplateId))
            {
                throw new Exception("短信模板ID不允许为空!");
            }

            //根据可变参数多少组建参数模板。
            if(aSmsParams == null || aSmsParams.length <= 0)
            {
                throw new Exception("短信参数不允许为空!");
            }


            smsParamTemplate = smsParamTemplate_Left;
            for (int i = 0; i < aSmsParams.length; i++) {

                if(i != aSmsParams.length - 1)
                {
                    smsParamTemplate = smsParamTemplate.trim() + smsParamTemplate_Middle.trim() + ",";

                }else {
                    smsParamTemplate = smsParamTemplate.trim() + smsParamTemplate_Middle.trim();
                }
            }
            smsParamTemplate = smsParamTemplate + smsParamTemplate_Right;


            //获取不同的templateId;
            switch(aTemplateId){
                case TEMPLATE_ACCOUNT_ACTIVE:
                    templateId = hwSmsConfig.getRegisterAccountActive();
                    break;
                case TEMPLATE_ACCOUNT_REGJECT:
                    templateId = hwSmsConfig.getRegisterAccountReject();
                    break;
                case TEMPLATE_ACCOUNT_CERTIFY_PASS:
                    templateId = hwSmsConfig.getCertifyApplicationPass();
                    break;
                case TEMPLATE_RESERVATE_SUCCESS:
                    templateId = hwSmsConfig.getReservateSuccess();
                    break;
                case TEMPLATE_SALESMAN_ACTIVE:
                    templateId = hwSmsConfig.getSalesmanActive();
                    break;
                case TEMPLATE_ADJUST_RESERVATE:
                    templateId = hwSmsConfig.getAdjustReservate();
                    break;
                default:
                    throw new Exception("传入模板ID不合法!");
            }




            /**
             * 选填,使用无变量模板时请赋空值 String templateParas = "";
             * 单变量模板示例:模板内容为"您的验证码是${NUM_6}"时,templateParas可填写为"[\"369751\"]"
             * 双变量模板示例:模板内容为"您有${NUM_2}件快递请到${TXT_20}领取"时,templateParas可填写为"[\"3\",\"人民公园正门\"]"
             * ${DATE}${TIME}变量不允许取值为空,${TXT_20}变量可以使用英文空格或点号替代空值,${NUM_6}变量可以使用0替代空值
             * 查看更多模板和变量规范:产品介绍>模板和变量规范
             */

            smsParam = StrUtil.format(smsParamTemplate,aSmsParams);

            if(StrUtil.isBlank(smsParam))
            {
                throw new Exception("短信参数不允许为空!");
            }

            Console.log("发送字符串:{}",smsParam);


            tmpPhone = aPhoneNo;
            tmpSenderNo=sender;

            //请求Body,不携带签名名称时,signature请填null
            String body = buildRequestBody(
                    tmpSenderNo,
                    tmpPhone,
                    templateId,
                    smsParam,
                    "",
                    smsSign);
            if (null == body || body.isEmpty()) {
                System.out.println("body is null.");
                return;
            }


            if(LOG.isDebugEnabled())
            {
                LOG.debug("Send Sms Params:{}",smsParam);
                LOG.debug("Sms Body is: {}",body);
            }

            responseStr = sendSms(body);

            if(responseStr != null)
            {
                Console.log("Sms response is :{}",responseStr);
            }else
            {
                Console.log("Sms response is null");
            }


        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }

    }
}
