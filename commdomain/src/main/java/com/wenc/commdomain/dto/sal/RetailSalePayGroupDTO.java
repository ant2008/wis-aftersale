package com.wenc.commdomain.dto.sal;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.math.BigDecimal;

public class RetailSalePayGroupDTO {

    private String payCode;
    private String payCodeDescr;
    private BigDecimal payAmount;
    private BigDecimal payRate;
    private BigDecimal realAmount;

    public RetailSalePayGroupDTO(String payCode, String payCodeDescr, BigDecimal payAmount, BigDecimal payRate,
                                 BigDecimal realAmount) {
        this.payCode = payCode;
        this.payCodeDescr = payCodeDescr;
        this.payAmount = payAmount;
        this.payRate = payRate;
        this.realAmount = realAmount;
    }

    public RetailSalePayGroupDTO(String payCode, String payCodeDescr, BigDecimal payAmount,
                                 BigDecimal realAmount) {
        this.payCode = payCode;
        this.payCodeDescr = payCodeDescr;
        this.payAmount = payAmount;
        this.realAmount = realAmount;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public String getPayCodeDescr() {
        return payCodeDescr;
    }

    public void setPayCodeDescr(String payCodeDescr) {
        this.payCodeDescr = payCodeDescr;
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
}
