package com.wenc.commdomain.dto.mat;

public class TbProductDescribeRequstDto {

    private long idx;
    private String tenantId;
    private String itemId;
    private String policyDescribe;
    private String maintainDescribe;
    private String costDescribe;
    private String otherDescribe;
    private String memoDescribe;
    private Integer state;

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getPolicyDescribe() {
        return policyDescribe;
    }

    public void setPolicyDescribe(String policyDescribe) {
        this.policyDescribe = policyDescribe;
    }

    public String getMaintainDescribe() {
        return maintainDescribe;
    }

    public void setMaintainDescribe(String maintainDescribe) {
        this.maintainDescribe = maintainDescribe;
    }

    public String getCostDescribe() {
        return costDescribe;
    }

    public void setCostDescribe(String costDescribe) {
        this.costDescribe = costDescribe;
    }

    public String getOtherDescribe() {
        return otherDescribe;
    }

    public void setOtherDescribe(String otherDescribe) {
        this.otherDescribe = otherDescribe;
    }

    public String getMemoDescribe() {
        return memoDescribe;
    }

    public void setMemoDescribe(String memoDescribe) {
        this.memoDescribe = memoDescribe;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
