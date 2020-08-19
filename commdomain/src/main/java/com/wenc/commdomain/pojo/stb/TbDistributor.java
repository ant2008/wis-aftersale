package com.wenc.commdomain.pojo.stb;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_distributor")
public class TbDistributor {
    private long idx;
    private String tenantId;
    private String distributorId;
    private String distributorName;
    private String distributorTelno;
    private String inviteTenantId;
    private String inviteUserId;
    private String inviteCode;
    private String inviteTelno;
    private String distributorAddress;
    private String distributorEmail;
    private Integer state;
    private String doState;
    private String flag;
    private String createUser;
    private Timestamp createTime;
    private String supplyTenantId;

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
    @Column(name = "distributor_id", nullable = true, length = 30)
    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    @Basic
    @Column(name = "distributor_name", nullable = true, length = 50)
    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    @Basic
    @Column(name = "distributor_telno", nullable = true, length = 30)
    public String getDistributorTelno() {
        return distributorTelno;
    }

    public void setDistributorTelno(String distributorTelno) {
        this.distributorTelno = distributorTelno;
    }

    @Basic
    @Column(name = "invite_tenant_id", nullable = true, length = 50)
    public String getInviteTenantId() {
        return inviteTenantId;
    }

    public void setInviteTenantId(String inviteTenantId) {
        this.inviteTenantId = inviteTenantId;
    }

    @Basic
    @Column(name = "invite_user_id", nullable = true, length = 30)
    public String getInviteUserId() {
        return inviteUserId;
    }

    public void setInviteUserId(String inviteUserId) {
        this.inviteUserId = inviteUserId;
    }

    @Basic
    @Column(name = "invite_code", nullable = true, length = 20)
    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    @Basic
    @Column(name = "invite_telno", nullable = true, length = 30)
    public String getInviteTelno() {
        return inviteTelno;
    }

    public void setInviteTelno(String inviteTelno) {
        this.inviteTelno = inviteTelno;
    }

    @Basic
    @Column(name = "distributor_address", nullable = true, length = 300)
    public String getDistributorAddress() {
        return distributorAddress;
    }

    public void setDistributorAddress(String distributorAddress) {
        this.distributorAddress = distributorAddress;
    }

    @Basic
    @Column(name = "distributor_email", nullable = true, length = 200)
    public String getDistributorEmail() {
        return distributorEmail;
    }

    public void setDistributorEmail(String distributorEmail) {
        this.distributorEmail = distributorEmail;
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
    @Column(name = "do_state", nullable = true, length = 20)
    public String getDoState() {
        return doState;
    }

    public void setDoState(String doState) {
        this.doState = doState;
    }

    @Basic
    @Column(name = "flag", nullable = true, length = 20)
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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
        TbDistributor that = (TbDistributor) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(distributorId, that.distributorId) &&
                Objects.equals(distributorName, that.distributorName) &&
                Objects.equals(distributorTelno, that.distributorTelno) &&
                Objects.equals(inviteTenantId, that.inviteTenantId) &&
                Objects.equals(inviteUserId, that.inviteUserId) &&
                Objects.equals(inviteCode, that.inviteCode) &&
                Objects.equals(inviteTelno, that.inviteTelno) &&
                Objects.equals(distributorAddress, that.distributorAddress) &&
                Objects.equals(distributorEmail, that.distributorEmail) &&
                Objects.equals(state, that.state) &&
                Objects.equals(doState, that.doState) &&
                Objects.equals(flag, that.flag) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, distributorId, distributorName, distributorTelno, inviteTenantId, inviteUserId, inviteCode, inviteTelno, distributorAddress, distributorEmail, state, doState, flag, createUser, createTime);
    }

    @Basic
    @Column(name = "supply_tenant_id", nullable = true, length = 50)
    public String getSupplyTenantId() {
        return supplyTenantId;
    }

    public void setSupplyTenantId(String supplyTenantId) {
        this.supplyTenantId = supplyTenantId;
    }
}
