package com.wiser.wx.pay.dto;

public class WxPrePaymentRetDTO {

    private String returnCode;

    private String returnMsg;

    private String prepayId;

    private String outTradNo;

    private String resultCode;

    private String errCode;

    private String errCodeDes;

    private String tradeType;

    private String codeUrl;


    private String nonceStr;

    private String paySign;

    private String signType;

    private String wxTimeStamp;



    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getWxTimeStamp() {
        return wxTimeStamp;
    }

    public void setWxTimeStamp(String wxTimeStamp) {
        this.wxTimeStamp = wxTimeStamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getOutTradNo() {
        return outTradNo;
    }

    public void setOutTradNo(String outTradNo) {
        this.outTradNo = outTradNo;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrCodeDes() {
        return errCodeDes;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }
}
