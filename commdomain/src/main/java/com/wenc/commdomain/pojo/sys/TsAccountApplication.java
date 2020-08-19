package com.wenc.commdomain.pojo.sys;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ts_account_application")
public class TsAccountApplication {
    private long idx;
    private String tenantId;
    private String applyUserName;
    private String applyUserMobileNo;
    private Timestamp applyDate;
    private String applyType;
    private String applyCompanyName;
    private String applyCompanyDescribe;
    private String operatorId;
    private String operatorDescribe;
    private Timestamp passDate;
    private String applyState;
    private String resultDescribe;
    private String applyMemo;
    private String rejectCode;
    private Integer state;
    private String createUser;
    private Timestamp createTime;
    private String applyArea;
    private String applyIp;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
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
    @Column(name = "apply_user_name", nullable = true, length = 20)
    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
    }

    @Basic
    @Column(name = "apply_user_mobile_no", nullable = true, length = 20)
    public String getApplyUserMobileNo() {
        return applyUserMobileNo;
    }

    public void setApplyUserMobileNo(String applyUserMobileNo) {
        this.applyUserMobileNo = applyUserMobileNo;
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
    @Column(name = "apply_type", nullable = true, length = 20)
    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    @Basic
    @Column(name = "apply_company_name", nullable = true, length = 20)
    public String getApplyCompanyName() {
        return applyCompanyName;
    }

    public void setApplyCompanyName(String applyCompanyName) {
        this.applyCompanyName = applyCompanyName;
    }

    @Basic
    @Column(name = "apply_company_describe", nullable = true, length = 200)
    public String getApplyCompanyDescribe() {
        return applyCompanyDescribe;
    }

    public void setApplyCompanyDescribe(String applyCompanyDescribe) {
        this.applyCompanyDescribe = applyCompanyDescribe;
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
    @Column(name = "operator_describe", nullable = true, length = 100)
    public String getOperatorDescribe() {
        return operatorDescribe;
    }

    public void setOperatorDescribe(String operatorDescribe) {
        this.operatorDescribe = operatorDescribe;
    }

    @Basic
    @Column(name = "pass_date", nullable = true)
    public Timestamp getPassDate() {
        return passDate;
    }

    public void setPassDate(Timestamp passDate) {
        this.passDate = passDate;
    }

    @Basic
    @Column(name = "apply_state", nullable = true, length = 20)
    public String getApplyState() {
        return applyState;
    }

    public void setApplyState(String applyState) {
        this.applyState = applyState;
    }

    @Basic
    @Column(name = "result_describe", nullable = true, length = 100)
    public String getResultDescribe() {
        return resultDescribe;
    }

    public void setResultDescribe(String resultDescribe) {
        this.resultDescribe = resultDescribe;
    }

    @Basic
    @Column(name = "apply_memo", nullable = true, length = 50)
    public String getApplyMemo() {
        return applyMemo;
    }

    public void setApplyMemo(String applyMemo) {
        this.applyMemo = applyMemo;
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
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    @Basic
    @Column(name = "apply_area", nullable = true, length = 200)
    public String getApplyArea() {
        return applyArea;
    }

    public void setApplyArea(String applyArea) {
        this.applyArea = applyArea;
    }

    @Basic
    @Column(name = "apply_ip", nullable = true, length = 100)
    public String getApplyIp() {
        return applyIp;
    }

    public void setApplyIp(String applyIp) {
        this.applyIp = applyIp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TsAccountApplication that = (TsAccountApplication) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(applyUserName, that.applyUserName) &&
                Objects.equals(applyUserMobileNo, that.applyUserMobileNo) &&
                Objects.equals(applyDate, that.applyDate) &&
                Objects.equals(applyType, that.applyType) &&
                Objects.equals(applyCompanyName, that.applyCompanyName) &&
                Objects.equals(applyCompanyDescribe, that.applyCompanyDescribe) &&
                Objects.equals(operatorId, that.operatorId) &&
                Objects.equals(operatorDescribe, that.operatorDescribe) &&
                Objects.equals(passDate, that.passDate) &&
                Objects.equals(applyState, that.applyState) &&
                Objects.equals(resultDescribe, that.resultDescribe) &&
                Objects.equals(applyMemo, that.applyMemo) &&
                Objects.equals(rejectCode, that.rejectCode) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(applyArea, that.applyArea) &&
                Objects.equals(applyIp, that.applyIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, applyUserName, applyUserMobileNo, applyDate, applyType, applyCompanyName,
                applyCompanyDescribe, operatorId, operatorDescribe, passDate, applyState, resultDescribe, applyMemo, rejectCode, state, createUser, createTime, applyArea, applyIp);
    }
}
