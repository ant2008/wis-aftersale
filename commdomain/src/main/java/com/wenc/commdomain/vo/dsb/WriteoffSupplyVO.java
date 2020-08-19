package com.wenc.commdomain.vo.dsb;

/**
 * 核销内容商信息。
 */
public class WriteoffSupplyVO {

    private String supplyId;

    private String supplyTenantId;

    private String supplyName;

    private String supplyAddress;

    public String getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(String supplyId) {
        this.supplyId = supplyId;
    }

    public String getSupplyTenantId() {
        return supplyTenantId;
    }

    public void setSupplyTenantId(String supplyTenantId) {
        this.supplyTenantId = supplyTenantId;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public String getSupplyAddress() {
        return supplyAddress;
    }

    public void setSupplyAddress(String supplyAddress) {
        this.supplyAddress = supplyAddress;
    }
}
