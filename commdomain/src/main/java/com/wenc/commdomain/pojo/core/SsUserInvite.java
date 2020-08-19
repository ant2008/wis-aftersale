package com.wenc.commdomain.pojo.core;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ss_user_invite")
public class SsUserInvite {
    private long idx;
    private String tenantId;
    private String inviteType;
    private String userId;
    private String inviteUser;
    private String inviteCode;
    private String inviteTelno;
    private Integer state;
    private Integer ifAccept;
    private Timestamp inviteDate;
    private Timestamp acceptDate;
    private String createUser;
    private Timestamp createTime;

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
    @Column(name = "invite_type", nullable = true, length = 20)
    public String getInviteType() {
        return inviteType;
    }

    public void setInviteType(String inviteType) {
        this.inviteType = inviteType;
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
    @Column(name = "invite_user", nullable = true, length = 20)
    public String getInviteUser() {
        return inviteUser;
    }

    public void setInviteUser(String inviteUser) {
        this.inviteUser = inviteUser;
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
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "if_accept", nullable = true)
    public Integer getIfAccept() {
        return ifAccept;
    }

    public void setIfAccept(Integer ifAccept) {
        this.ifAccept = ifAccept;
    }

    @Basic
    @Column(name = "invite_date", nullable = true)
    public Timestamp getInviteDate() {
        return inviteDate;
    }

    public void setInviteDate(Timestamp inviteDate) {
        this.inviteDate = inviteDate;
    }

    @Basic
    @Column(name = "accept_date", nullable = true)
    public Timestamp getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Timestamp acceptDate) {
        this.acceptDate = acceptDate;
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
        SsUserInvite that = (SsUserInvite) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(inviteType, that.inviteType) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(inviteUser, that.inviteUser) &&
                Objects.equals(inviteCode, that.inviteCode) &&
                Objects.equals(inviteTelno, that.inviteTelno) &&
                Objects.equals(state, that.state) &&
                Objects.equals(ifAccept, that.ifAccept) &&
                Objects.equals(inviteDate, that.inviteDate) &&
                Objects.equals(acceptDate, that.acceptDate) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, inviteType, userId, inviteUser, inviteCode, inviteTelno, state, ifAccept, inviteDate, acceptDate, createUser, createTime);
    }
}
