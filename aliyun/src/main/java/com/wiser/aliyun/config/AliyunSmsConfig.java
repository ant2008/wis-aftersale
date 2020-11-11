package com.wiser.aliyun.config;




import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource(value = {"classpath:aliyunsms.properties"},ignoreResourceNotFound = false,encoding = "UTF-8")
public class AliyunSmsConfig {

    @Value("${accessKeyId}")
    private String accessKeyId;

    @Value("${accessSecret}")
    private String accessSecret;

    @Value("${verifyCodeTemplate}")
    private String verifyCodeTemplate;

    @Value("${smsSign}")
    private String smsSign;

    @Value("${activeAccountTemplate}")
    private String activeAccountTemplate;

    //申请退回短信模板
    @Value("${accApplyRejectTemplate}")
    private String accApplyRejectTemplate;


    @Value("${accountCertifyTemplate}")
    private String accountCertifyTemplate;

    //预约订单通知
    @Value("${reservateCodeTemplate}")
    private String reservateCodeTemplate;

    //业务激活通知模板
    @Value("${salesmanAccountTemplate}")
    private String activeSalesManAccTemplate;


    public String getActiveSalesManAccTemplate() {
        return activeSalesManAccTemplate;
    }

    public void setActiveSalesManAccTemplate(String activeSalesManAccTemplate) {
        this.activeSalesManAccTemplate = activeSalesManAccTemplate;
    }

    public String getReservateCodeTemplate() {
        return reservateCodeTemplate;
    }

    public void setReservateCodeTemplate(String reservateCodeTemplate) {
        this.reservateCodeTemplate = reservateCodeTemplate;
    }

    public String getAccountCertifyTemplate() {
        return accountCertifyTemplate;
    }

    public void setAccountCertifyTemplate(String accountCertifyTemplate) {
        this.accountCertifyTemplate = accountCertifyTemplate;
    }

    public String getAccApplyRejectTemplate() {
        return accApplyRejectTemplate;
    }

    public void setAccApplyRejectTemplate(String accApplyRejectTemplate) {
        this.accApplyRejectTemplate = accApplyRejectTemplate;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessSecret() {
        return accessSecret;
    }

    public void setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
    }

    public String getVerifyCodeTemplate() {
        return verifyCodeTemplate;
    }

    public void setVerifyCodeTemplate(String verifyCodeTemplate) {
        this.verifyCodeTemplate = verifyCodeTemplate;
    }

    public String getSmsSign() {
        return smsSign;
    }

    public void setSmsSign(String smsSign) {
        this.smsSign = smsSign;
    }

    public String getActiveAccountTemplate() {
        return activeAccountTemplate;
    }

    public void setActiveAccountTemplate(String activeAccountTemplate) {
        this.activeAccountTemplate = activeAccountTemplate;
    }
}
