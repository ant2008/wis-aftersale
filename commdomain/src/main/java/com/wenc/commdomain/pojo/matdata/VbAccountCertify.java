package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_account_certify")
public class VbAccountCertify {
    private long idx;
    private String tenantId;
    private String applyTenantId;
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
    private String operatorId;
    private String certifyState;
    private Timestamp certifyDate;
    private Integer certifyCount;
    private String rejectCode;
    private String rejectDescribe;
    private String createUser;
    private Timestamp createTime;

    @Id
    @Basic
    @Column(name = "idx", nullable = false)
    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    @Basic
    @Column(name = "tenant_id", nullable = true, length = 50)
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "apply_tenant_id", nullable = true, length = 50)
    public String getApplyTenantId() {
        return applyTenantId;
    }

    public void setApplyTenantId(String applyTenantId) {
        this.applyTenantId = applyTenantId;
    }

    @Basic
    @Column(name = "apply_date", nullable = true)
    public Timestamp getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Timestamp applyDate) {
        this.applyDate = applyDate;
    }

    @Basic
    @Column(name = "user_id", nullable = true, length = 20)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "certify_type", nullable = true, length = 20)
    public String getCertifyType() {
        return certifyType;
    }

    public void setCertifyType(String certifyType) {
        this.certifyType = certifyType;
    }

    @Basic
    @Column(name = "company_name", nullable = true, length = 30)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "company_address", nullable = true, length = 300)
    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Basic
    @Column(name = "business_licence_no", nullable = true, length = 20)
    public String getBusinessLicenceNo() {
        return businessLicenceNo;
    }

    public void setBusinessLicenceNo(String businessLicenceNo) {
        this.businessLicenceNo = businessLicenceNo;
    }

    @Basic
    @Column(name = "business_licence_pic", nullable = true, length = 300)
    public String getBusinessLicencePic() {
        return businessLicencePic;
    }

    public void setBusinessLicencePic(String businessLicencePic) {
        this.businessLicencePic = businessLicencePic;
    }

    @Basic
    @Column(name = "company_legal_name", nullable = true, length = 20)
    public String getCompanyLegalName() {
        return companyLegalName;
    }

    public void setCompanyLegalName(String companyLegalName) {
        this.companyLegalName = companyLegalName;
    }

    @Basic
    @Column(name = "company_legal_idcard", nullable = true, length = 100)
    public String getCompanyLegalIdcard() {
        return companyLegalIdcard;
    }

    public void setCompanyLegalIdcard(String companyLegalIdcard) {
        this.companyLegalIdcard = companyLegalIdcard;
    }

    @Basic
    @Column(name = "idcard_pic_front", nullable = true, length = 300)
    public String getIdcardPicFront() {
        return idcardPicFront;
    }

    public void setIdcardPicFront(String idcardPicFront) {
        this.idcardPicFront = idcardPicFront;
    }

    @Basic
    @Column(name = "idcard_pic_back", nullable = true, length = 300)
    public String getIdcardPicBack() {
        return idcardPicBack;
    }

    public void setIdcardPicBack(String idcardPicBack) {
        this.idcardPicBack = idcardPicBack;
    }

    @Basic
    @Column(name = "company_legal_mobileno", nullable = true, length = 20)
    public String getCompanyLegalMobileno() {
        return companyLegalMobileno;
    }

    public void setCompanyLegalMobileno(String companyLegalMobileno) {
        this.companyLegalMobileno = companyLegalMobileno;
    }

    @Basic
    @Column(name = "operator_id", nullable = true, length = 20)
    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    @Basic
    @Column(name = "certify_state", nullable = true, length = 20)
    public String getCertifyState() {
        return certifyState;
    }

    public void setCertifyState(String certifyState) {
        this.certifyState = certifyState;
    }

    @Basic
    @Column(name = "certify_date", nullable = true)
    public Timestamp getCertifyDate() {
        return certifyDate;
    }

    public void setCertifyDate(Timestamp certifyDate) {
        this.certifyDate = certifyDate;
    }

    @Basic
    @Column(name = "certify_count", nullable = true)
    public Integer getCertifyCount() {
        return certifyCount;
    }

    public void setCertifyCount(Integer certifyCount) {
        this.certifyCount = certifyCount;
    }

    @Basic
    @Column(name = "reject_code", nullable = true, length = 20)
    public String getRejectCode() {
        return rejectCode;
    }

    public void setRejectCode(String rejectCode) {
        this.rejectCode = rejectCode;
    }

    @Basic
    @Column(name = "reject_describe", nullable = true, length = 200)
    public String getRejectDescribe() {
        return rejectDescribe;
    }

    public void setRejectDescribe(String rejectDescribe) {
        this.rejectDescribe = rejectDescribe;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 20)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbAccountCertify that = (VbAccountCertify) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(applyTenantId, that.applyTenantId) &&
                Objects.equals(applyDate, that.applyDate) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(certifyType, that.certifyType) &&
                Objects.equals(companyName, that.companyName) &&
                Objects.equals(companyAddress, that.companyAddress) &&
                Objects.equals(businessLicenceNo, that.businessLicenceNo) &&
                Objects.equals(businessLicencePic, that.businessLicencePic) &&
                Objects.equals(companyLegalName, that.companyLegalName) &&
                Objects.equals(companyLegalIdcard, that.companyLegalIdcard) &&
                Objects.equals(idcardPicFront, that.idcardPicFront) &&
                Objects.equals(idcardPicBack, that.idcardPicBack) &&
                Objects.equals(companyLegalMobileno, that.companyLegalMobileno) &&
                Objects.equals(operatorId, that.operatorId) &&
                Objects.equals(certifyState, that.certifyState) &&
                Objects.equals(certifyDate, that.certifyDate) &&
                Objects.equals(certifyCount, that.certifyCount) &&
                Objects.equals(rejectCode, that.rejectCode) &&
                Objects.equals(rejectDescribe, that.rejectDescribe) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, applyTenantId, applyDate, userId, certifyType, companyName, companyAddress
                , businessLicenceNo, businessLicencePic, companyLegalName, companyLegalIdcard, idcardPicFront,
                idcardPicBack, companyLegalMobileno, operatorId, certifyState, certifyDate, certifyCount, rejectCode, rejectDescribe, createUser, createTime);
    }
}
