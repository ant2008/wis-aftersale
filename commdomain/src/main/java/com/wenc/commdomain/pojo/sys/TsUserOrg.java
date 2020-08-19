package com.wenc.commdomain.pojo.sys;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ts_user_org")
public class TsUserOrg {
    private long idx;
    private String tenantId;
    private String userId;
    private String orgId;
    private Integer state;
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
    @Column(name = "user_id", nullable = true, length = 20)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "org_id", nullable = true, length = 20)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TsUserOrg tsUserOrg = (TsUserOrg) o;
        return idx == tsUserOrg.idx &&
                Objects.equals(tenantId, tsUserOrg.tenantId) &&
                Objects.equals(userId, tsUserOrg.userId) &&
                Objects.equals(orgId, tsUserOrg.orgId) &&
                Objects.equals(state, tsUserOrg.state) &&
                Objects.equals(createUser, tsUserOrg.createUser) &&
                Objects.equals(createTime, tsUserOrg.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, userId, orgId, state, createUser, createTime);
    }
}
