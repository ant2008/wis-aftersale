package com.wenc.commdomain.dto.sal;

import java.math.BigDecimal;

public class RetailSalePayDTO {

    private String payTypeCode;
    private BigDecimal payTypeAmt;
    private String mappingCode;

    public String getPayTypeCode() {
        return payTypeCode;
    }

    public void setPayTypeCode(String payTypeCode) {
        this.payTypeCode = payTypeCode;
    }

    public BigDecimal getPayTypeAmt() {
        return payTypeAmt;
    }

    public void setPayTypeAmt(BigDecimal payTypeAmt) {
        this.payTypeAmt = payTypeAmt;
    }

    public String getMappingCode() {
        return mappingCode;
    }

    public void setMappingCode(String mappingCode) {
        this.mappingCode = mappingCode;
    }
}
