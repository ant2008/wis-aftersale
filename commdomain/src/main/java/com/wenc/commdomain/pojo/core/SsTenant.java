package com.wenc.commdomain.pojo.core;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ss_tenant")
public class SsTenant {
    private long idx;
    private String tenantId;
    private String tenantName;
    private String tenantType;
    private Integer state;
    private Timestamp startDate;
    private Timestamp endDate;
    private String createUser;
    private Timestamp createTime;
    private String tenantDb;
    private Integer userNum;
    private Integer orgNum;
    private Integer posNum;
    private String tenantUserName;
    private String tenantUserMobile;
    private String ifRecommendDistrib;
    private String tenantUserEmail;

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
    @Column(name = "tenant_name", nullable = true, length = 100)
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    @Basic
    @Column(name = "tenant_type", nullable = true, length = 20)
    public String getTenantType() {
        return tenantType;
    }

    public void setTenantType(String tenantType) {
        this.tenantType = tenantType;
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
    @Column(name = "start_date", nullable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "end_date", nullable = true)
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 10)
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
    @Column(name = "tenant_db", nullable = true, length = 50)
    public String getTenantDb() {
        return tenantDb;
    }

    public void setTenantDb(String tenantDb) {
        this.tenantDb = tenantDb;
    }

    @Basic
    @Column(name = "user_num", nullable = true)
    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    @Basic
    @Column(name = "org_num", nullable = true)
    public Integer getOrgNum() {
        return orgNum;
    }

    public void setOrgNum(Integer orgNum) {
        this.orgNum = orgNum;
    }

    @Basic
    @Column(name = "pos_num", nullable = true)
    public Integer getPosNum() {
        return posNum;
    }

    public void setPosNum(Integer posNum) {
        this.posNum = posNum;
    }

    @Basic
    @Column(name = "tenant_user_name", nullable = true, length = 20)
    public String getTenantUserName() {
        return tenantUserName;
    }

    public void setTenantUserName(String tenantUserName) {
        this.tenantUserName = tenantUserName;
    }

    @Basic
    @Column(name = "tenant_user_mobile", nullable = true, length = 20)
    public String getTenantUserMobile() {
        return tenantUserMobile;
    }

    public void setTenantUserMobile(String tenantUserMobile) {
        this.tenantUserMobile = tenantUserMobile;
    }

    @Basic
    @Column(name = "if_recommend_distrib", nullable = true, length = 20)
    public String getIfRecommendDistrib() {
        return ifRecommendDistrib;
    }

    public void setIfRecommendDistrib(String ifRecommendDistrib) {
        this.ifRecommendDistrib = ifRecommendDistrib;
    }

    @Basic
    @Column(name = "tenant_user_email", nullable = true, length = 20)
    public String getTenantUserEmail() {
        return tenantUserEmail;
    }

    public void setTenantUserEmail(String tenantUserEmail) {
        this.tenantUserEmail = tenantUserEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SsTenant ssTenant = (SsTenant) o;
        return idx == ssTenant.idx &&
                Objects.equals(tenantId, ssTenant.tenantId) &&
                Objects.equals(tenantName, ssTenant.tenantName) &&
                Objects.equals(tenantType, ssTenant.tenantType) &&
                Objects.equals(state, ssTenant.state) &&
                Objects.equals(startDate, ssTenant.startDate) &&
                Objects.equals(endDate, ssTenant.endDate) &&
                Objects.equals(createUser, ssTenant.createUser) &&
                Objects.equals(createTime, ssTenant.createTime) &&
                Objects.equals(tenantDb, ssTenant.tenantDb) &&
                Objects.equals(userNum, ssTenant.userNum) &&
                Objects.equals(orgNum, ssTenant.orgNum) &&
                Objects.equals(posNum, ssTenant.posNum) &&
                Objects.equals(tenantUserName, ssTenant.tenantUserName) &&
                Objects.equals(tenantUserMobile, ssTenant.tenantUserMobile) &&
                Objects.equals(ifRecommendDistrib, ssTenant.ifRecommendDistrib) &&
                Objects.equals(tenantUserEmail, ssTenant.tenantUserEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, tenantName, tenantType, state, startDate, endDate, createUser, createTime, tenantDb, userNum, orgNum, posNum, tenantUserName, tenantUserMobile, ifRecommendDistrib, tenantUserEmail);
    }
}
