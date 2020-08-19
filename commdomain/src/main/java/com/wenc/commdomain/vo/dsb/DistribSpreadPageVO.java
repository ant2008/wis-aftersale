package com.wenc.commdomain.vo.dsb;

/**
 * 推广详情页
 */
public class DistribSpreadPageVO {

    //推广KEY
    private String spreadKey;


    //供应商信息
    private DistribSpreadSupplyVO  supplyInfo;


    //商品信息
    private DistribSpreadVO spreadProductInfo;

    //额外信息
    private DistribSpreadExtraVO  spreadExtraInfo;

    //联系运维信息
    private DistribSpreadContactVO  spreadContactInfo;


    public String getSpreadKey() {
        return spreadKey;
    }

    public void setSpreadKey(String spreadKey) {
        this.spreadKey = spreadKey;
    }

    public DistribSpreadSupplyVO getSupplyInfo() {
        return supplyInfo;
    }

    public void setSupplyInfo(DistribSpreadSupplyVO supplyInfo) {
        this.supplyInfo = supplyInfo;
    }

    public DistribSpreadVO getSpreadProductInfo() {
        return spreadProductInfo;
    }

    public void setSpreadProductInfo(DistribSpreadVO spreadProductInfo) {
        this.spreadProductInfo = spreadProductInfo;
    }

    public DistribSpreadExtraVO getSpreadExtraInfo() {
        return spreadExtraInfo;
    }

    public void setSpreadExtraInfo(DistribSpreadExtraVO spreadExtraInfo) {
        this.spreadExtraInfo = spreadExtraInfo;
    }

    public DistribSpreadContactVO getSpreadContactInfo() {
        return spreadContactInfo;
    }

    public void setSpreadContactInfo(DistribSpreadContactVO spreadContactInfo) {
        this.spreadContactInfo = spreadContactInfo;
    }
}
