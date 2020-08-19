package com.wenc.commdomain.vo.bus;

import java.math.BigDecimal;

public class RetailSaleDetailPayVO {

    private long idx;
    private String saleNo;
    private String payType;
    private String payCode;
    private BigDecimal payAmount;
    private BigDecimal payRate;
    private BigDecimal realAmount;
    private Integer rowTocol;

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getPayRate() {
        return payRate;
    }

    public void setPayRate(BigDecimal payRate) {
        this.payRate = payRate;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getRowTocol() {
        return rowTocol;
    }

    public void setRowTocol(Integer rowTocol) {
        this.rowTocol = rowTocol;
    }
}
