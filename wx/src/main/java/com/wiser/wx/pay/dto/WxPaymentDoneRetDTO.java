package com.wiser.wx.pay.dto;

public class WxPaymentDoneRetDTO {

    private String transactionId;

    private String openId;

    private String outTradeNo;

    private Long   glPaymentIdx;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Long getGlPaymentIdx() {
        return glPaymentIdx;
    }

    public void setGlPaymentIdx(Long glPaymentIdx) {
        this.glPaymentIdx = glPaymentIdx;
    }
}
