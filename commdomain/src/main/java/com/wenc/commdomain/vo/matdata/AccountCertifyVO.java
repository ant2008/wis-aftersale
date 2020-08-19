package com.wenc.commdomain.vo.matdata;

import java.sql.Timestamp;

public class AccountCertifyVO {
    private Timestamp applyDate;
    private String userId;
    private String certifyType;
    private String companyName;
    private String companyAddress;
    private String businessLicenceNo;
    private String businessLicencePic;
    private String companyLegalName;
    private String companyLegalIdcard;
    private String idcardPicFront;
    private String idcardPicBack;
    private String companyLegalMobileno;
    private String certifyState;
    private Timestamp certifyDate;
    private Integer certifyCount;
    private String rejectCode;
    private String rejectDescribe;

    public Timestamp getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Timestamp applyDate) {
        this.applyDate = applyDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCertifyType() {
        return certifyType;
    }

    public void setCertifyType(String certifyType) {
        this.certifyType = certifyType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getBusinessLicenceNo() {
        return businessLicenceNo;
    }

    public void setBusinessLicenceNo(String businessLicenceNo) {
        this.businessLicenceNo = businessLicenceNo;
    }

    public String getBusinessLicencePic() {
        return businessLicencePic;
    }

    public void setBusinessLicencePic(String businessLicencePic) {
        this.businessLicencePic = businessLicencePic;
    }

    public String getCompanyLegalName() {
        return companyLegalName;
    }

    public void setCompanyLegalName(String companyLegalName) {
        this.companyLegalName = companyLegalName;
    }

    public String getCompanyLegalIdcard() {
        return companyLegalIdcard;
    }

    public void setCompanyLegalIdcard(String companyLegalIdcard) {
        this.companyLegalIdcard = companyLegalIdcard;
    }

    public String getIdcardPicFront() {
        return idcardPicFront;
    }

    public void setIdcardPicFront(String idcardPicFront) {
        this.idcardPicFront = idcardPicFront;
    }

    public String getIdcardPicBack() {
        return idcardPicBack;
    }

    public void setIdcardPicBack(String idcardPicBack) {
        this.idcardPicBack = idcardPicBack;
    }

    public String getCompanyLegalMobileno() {
        return companyLegalMobileno;
    }

    public void setCompanyLegalMobileno(String companyLegalMobileno) {
        this.companyLegalMobileno = companyLegalMobileno;
    }

    public String getCertifyState() {
        return certifyState;
    }

    public void setCertifyState(String certifyState) {
        this.certifyState = certifyState;
    }

    public Timestamp getCertifyDate() {
        return certifyDate;
    }

    public void setCertifyDate(Timestamp certifyDate) {
        this.certifyDate = certifyDate;
    }

    public Integer getCertifyCount() {
        return certifyCount;
    }

    public void setCertifyCount(Integer certifyCount) {
        this.certifyCount = certifyCount;
    }

    public String getRejectCode() {
        return rejectCode;
    }

    public void setRejectCode(String rejectCode) {
        this.rejectCode = rejectCode;
    }

    public String getRejectDescribe() {
        return rejectDescribe;
    }

    public void setRejectDescribe(String rejectDescribe) {
        this.rejectDescribe = rejectDescribe;
    }
}
