package com.wiser.hw.sms.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:hw-sms-config.properties"},ignoreResourceNotFound = false,encoding = "UTF-8")
public class HwSmsConfig {


    @Value("${hwSmsAppKey}")
    private String appKey;

    @Value("${hwSmsAppSecret}")
    private String appSecret;

    @Value("${hwSmsSenderPassNo}")
    private String senderPassNo;

    @Value("${hwSmsSign}")
    private String hwSmsSign;

    @Value("${testTemplateId}")
    private String testTemplateId;

    @Value("${hwSmsSendUrl}")
    private String sendUrl;



    @Value("${hwTemplateId-registerValid}")
    //系统注册校验
    private String registerValid;


    @Value("${hwTemplateId-registerAccountActive}")
    //注册账号激活通知
    private String registerAccountActive;

    @Value("${hwTemplateId-registerAccountReject}")
    //注册账号不激活通知
    private String registerAccountReject;


    @Value("${hwTemplateId-certifyApplicationPass}")
    //资质申请通过通知
    private String certifyApplicationPass;


    @Value("${hwTemplateId-reservateSuccess}")
    //预约短信成功通知
    private String reservateSuccess;

    @Value("${hwTemplateId-salesmanActive}")
    //业务员开通通知
    private String salesmanActive;

    @Value("${hwSmsVerifySenderPassNo}")
    private String verifySenderPassNo;

    @Value("${hwTemplateId-adjustReservate}")
    private String adjustReservate;


    public String getAdjustReservate() {
        return adjustReservate;
    }

    public void setAdjustReservate(String adjustReservate) {
        this.adjustReservate = adjustReservate;
    }

    public String getRegisterValid() {
        return registerValid;
    }


    public String getVerifySenderPassNo() {
        return verifySenderPassNo;
    }

    public void setVerifySenderPassNo(String verifySenderPassNo) {
        this.verifySenderPassNo = verifySenderPassNo;
    }

    public void setRegisterValid(String registerValid) {
        this.registerValid = registerValid;
    }

    public String getRegisterAccountActive() {
        return registerAccountActive;
    }

    public void setRegisterAccountActive(String registerAccountActive) {
        this.registerAccountActive = registerAccountActive;
    }

    public String getRegisterAccountReject() {
        return registerAccountReject;
    }

    public void setRegisterAccountReject(String registerAccountReject) {
        this.registerAccountReject = registerAccountReject;
    }

    public String getCertifyApplicationPass() {
        return certifyApplicationPass;
    }

    public void setCertifyApplicationPass(String certifyApplicationPass) {
        this.certifyApplicationPass = certifyApplicationPass;
    }

    public String getReservateSuccess() {
        return reservateSuccess;
    }

    public void setReservateSuccess(String reservateSuccess) {
        this.reservateSuccess = reservateSuccess;
    }

    public String getSalesmanActive() {
        return salesmanActive;
    }

    public void setSalesmanActive(String salesmanActive) {
        this.salesmanActive = salesmanActive;
    }

    public String getSendUrl() {
        return sendUrl;
    }

    public void setSendUrl(String sendUrl) {
        this.sendUrl = sendUrl;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getSenderPassNo() {
        return senderPassNo;
    }

    public void setSenderPassNo(String senderPassNo) {
        this.senderPassNo = senderPassNo;
    }

    public String getHwSmsSign() {
        return hwSmsSign;
    }

    public void setHwSmsSign(String hwSmsSign) {
        this.hwSmsSign = hwSmsSign;
    }

    public String getTestTemplateId() {
        return testTemplateId;
    }

    public void setTestTemplateId(String testTemplateId) {
        this.testTemplateId = testTemplateId;
    }
}
