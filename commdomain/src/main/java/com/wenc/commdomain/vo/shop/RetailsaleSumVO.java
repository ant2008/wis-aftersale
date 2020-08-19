package com.wenc.commdomain.vo.shop;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

public class RetailsaleSumVO {

    private long idx;
    private String tenantId;
    private String retailsaleSumNo;
    private String shopId;
    private String posNo;
    private String salesmanId;
    private String salesmanName;
    private String beginNo;
    private String endNo;
    private Timestamp beginTime;
    private Timestamp endTime;
    private BigDecimal realsumAmt;
    private BigDecimal salesumAmt;
    private String orgName;
    private String posDescr;

    List<RetailsaleSumDetailVO> retailsaleSumDetailVOS;

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

    public String getRetailsaleSumNo() {
        return retailsaleSumNo;
    }

    public void setRetailsaleSumNo(String retailsaleSumNo) {
        this.retailsaleSumNo = retailsaleSumNo;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public String getBeginNo() {
        return beginNo;
    }

    public void setBeginNo(String beginNo) {
        this.beginNo = beginNo;
    }

    public String getEndNo() {
        return endNo;
    }

    public void setEndNo(String endNo) {
        this.endNo = endNo;
    }

    public Timestamp getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getRealsumAmt() {
        return realsumAmt;
    }

    public void setRealsumAmt(BigDecimal realsumAmt) {
        this.realsumAmt = realsumAmt;
    }

    public BigDecimal getSalesumAmt() {
        return salesumAmt;
    }

    public void setSalesumAmt(BigDecimal salesumAmt) {
        this.salesumAmt = salesumAmt;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getPosDescr() {
        return posDescr;
    }

    public void setPosDescr(String posDescr) {
        this.posDescr = posDescr;
    }

    public List<RetailsaleSumDetailVO> getRetailsaleSumDetailVOS() {
        return retailsaleSumDetailVOS;
    }

    public void setRetailsaleSumDetailVOS(List<RetailsaleSumDetailVO> retailsaleSumDetailVOS) {
        this.retailsaleSumDetailVOS = retailsaleSumDetailVOS;
    }
}
