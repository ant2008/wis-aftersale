package com.wenc.commdomain.vo.shop;

public class RetailSalePrtVO {

    private String prtTitle;
    private String prtFooter;
    private String prtMemo;
    private String prtDriverModel;
    private String prtAddress;
    private String prtTelno;
    private String allowPrt;


    public String getAllowPrt() {
        return allowPrt;
    }

    public void setAllowPrt(String allowPrt) {
        this.allowPrt = allowPrt;
    }

    public String getPrtAddress() {
        return prtAddress;
    }

    public void setPrtAddress(String prtAddress) {
        this.prtAddress = prtAddress;
    }

    public String getPrtTelno() {
        return prtTelno;
    }

    public void setPrtTelno(String prtTelno) {
        this.prtTelno = prtTelno;
    }

    public String getPrtTitle() {
        return prtTitle;
    }

    public void setPrtTitle(String prtTitle) {
        this.prtTitle = prtTitle;
    }

    public String getPrtFooter() {
        return prtFooter;
    }

    public void setPrtFooter(String prtFooter) {
        this.prtFooter = prtFooter;
    }

    public String getPrtMemo() {
        return prtMemo;
    }

    public void setPrtMemo(String prtMemo) {
        this.prtMemo = prtMemo;
    }

    public String getPrtDriverModel() {
        return prtDriverModel;
    }

    public void setPrtDriverModel(String prtDriverModel) {
        this.prtDriverModel = prtDriverModel;
    }
}
