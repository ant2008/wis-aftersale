package com.wenc.commdomain.vo.dsb;

import java.util.List;

public class DefaComposeSpreadPageVO {

    private String classCode;

    private String classDescr;

    private String spreadKey;

    public String getSpreadKey() {
        return spreadKey;
    }

    public void setSpreadKey(String spreadKey) {
        this.spreadKey = spreadKey;
    }

    private DistribSpreadVO  distribSpreadVO;

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassDescr() {
        return classDescr;
    }

    public void setClassDescr(String classDescr) {
        this.classDescr = classDescr;
    }

    public DistribSpreadVO getDistribSpreadVO() {
        return distribSpreadVO;
    }

    public void setDistribSpreadVO(DistribSpreadVO distribSpreadVO) {
        this.distribSpreadVO = distribSpreadVO;
    }
}
