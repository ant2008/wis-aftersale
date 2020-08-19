package com.wenc.commdomain.vo.dsb;

public class DistribSpreadExtraVO {

    //优惠二维码url
    private String spreadQrcodeUrl;

    //预约挂号URL
    private String itemScheduleUrl;


    public String getSpreadQrcodeUrl() {
        return spreadQrcodeUrl;
    }

    public void setSpreadQrcodeUrl(String spreadQrcodeUrl) {
        this.spreadQrcodeUrl = spreadQrcodeUrl;
    }

    public String getItemScheduleUrl() {
        return itemScheduleUrl;
    }

    public void setItemScheduleUrl(String itemScheduleUrl) {
        this.itemScheduleUrl = itemScheduleUrl;
    }
}
