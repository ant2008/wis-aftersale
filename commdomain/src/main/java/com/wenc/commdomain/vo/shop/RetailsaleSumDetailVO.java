package com.wenc.commdomain.vo.shop;

import java.math.BigDecimal;

public class RetailsaleSumDetailVO {

    private String payType;
    private String payTypeName;
    private BigDecimal realsumAmt;
    private BigDecimal paysumAmt;

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName;
    }

    public BigDecimal getRealsumAmt() {
        return realsumAmt;
    }

    public void setRealsumAmt(BigDecimal realsumAmt) {
        this.realsumAmt = realsumAmt;
    }

    public BigDecimal getPaysumAmt() {
        return paysumAmt;
    }

    public void setPaysumAmt(BigDecimal paysumAmt) {
        this.paysumAmt = paysumAmt;
    }
}
