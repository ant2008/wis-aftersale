package com.wenc.commdomain.vo.sys;

import java.sql.Timestamp;

public class AccountApplicationVO {
    private String applyUserName;
    private String applyUserMobileNo;
    private Timestamp applyDate;
    private String applyType;
    private String applyCompanyName;
    private String applyCompanyDescribe;
    private String operatorId;
    private Timestamp passDate;
    private String rejectCode;
    private String resultDescribe;
    private int state;

    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
    }

    public String getApplyUserMobileNo() {
        return applyUserMobileNo;
    }

    public void setApplyUserMobileNo(String applyUserMobileNo) {
        this.applyUserMobileNo = applyUserMobileNo;
    }

    public Timestamp getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Timestamp applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public String getApplyCompanyName() {
        return applyCompanyName;
    }

    public void setApplyCompanyName(String applyCompanyName) {
        this.applyCompanyName = applyCompanyName;
    }

    public String getApplyCompanyDescribe() {
        return applyCompanyDescribe;
    }

    public void setApplyCompanyDescribe(String applyCompanyDescribe) {
        this.applyCompanyDescribe = applyCompanyDescribe;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public Timestamp getPassDate() {
        return passDate;
    }

    public void setPassDate(Timestamp passDate) {
        this.passDate = passDate;
    }

    public String getRejectCode() {
        return rejectCode;
    }

    public void setRejectCode(String rejectCode) {
        this.rejectCode = rejectCode;
    }

    public String getResultDescribe() {
        return resultDescribe;
    }

    public void setResultDescribe(String resultDescribe) {
        this.resultDescribe = resultDescribe;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
