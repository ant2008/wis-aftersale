package com.wenc.commdomain.vo.sys;

import com.wenc.commdomain.pojo.sys.TsPayType;


public class PayTypeVo {

    private long idx;
    private String paytypeCode;
    private String paytypeDescr;
    private String paytypeKind;
    private String paytypeCurrency;
    private Integer rowTocol;
    private String mappingType;

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public String getPaytypeCode() {
        return paytypeCode;
    }

    public void setPaytypeCode(String paytypeCode) {
        this.paytypeCode = paytypeCode;
    }

    public String getPaytypeDescr() {
        return paytypeDescr;
    }

    public void setPaytypeDescr(String paytypeDescr) {
        this.paytypeDescr = paytypeDescr;
    }

    public String getPaytypeKind() {
        return paytypeKind;
    }

    public void setPaytypeKind(String paytypeKind) {
        this.paytypeKind = paytypeKind;
    }

    public String getPaytypeCurrency() {
        return paytypeCurrency;
    }

    public void setPaytypeCurrency(String paytypeCurrency) {
        this.paytypeCurrency = paytypeCurrency;
    }

    public Integer getRowTocol() {
        return rowTocol;
    }

    public void setRowTocol(Integer rowTocol) {
        this.rowTocol = rowTocol;
    }

    public String getMappingType() {
        return mappingType;
    }

    public void setMappingType(String mappingType) {
        this.mappingType = mappingType;
    }
}
