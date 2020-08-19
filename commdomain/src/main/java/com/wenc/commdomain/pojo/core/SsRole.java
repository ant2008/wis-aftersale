package com.wenc.commdomain.pojo.core;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ss_role")
public class SsRole {
    private long idx;
    private String tenantId;
    private String roleId;
    private String roleName;
    private String roleType;
    private String descr;
    private Integer state;
    private String flag;
    private String createUser;
    private Timestamp createTime;
    private String roleScope;

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
    @Column(name = "role_id", nullable = true, length = 20)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "role_name", nullable = true, length = 50)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "role_type", nullable = true, length = 20)
    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    @Basic
    @Column(name = "descr", nullable = true, length = 100)
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
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

    @Basic
    @Column(name = "role_scope", nullable = true, length = 20)
    public String getRoleScope() {
        return roleScope;
    }

    public void setRoleScope(String roleScope) {
        this.roleScope = roleScope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SsRole ssRole = (SsRole) o;
        return idx == ssRole.idx &&
                Objects.equals(tenantId, ssRole.tenantId) &&
                Objects.equals(roleId, ssRole.roleId) &&
                Objects.equals(roleName, ssRole.roleName) &&
                Objects.equals(roleType, ssRole.roleType) &&
                Objects.equals(descr, ssRole.descr) &&
                Objects.equals(state, ssRole.state) &&
                Objects.equals(flag, ssRole.flag) &&
                Objects.equals(createUser, ssRole.createUser) &&
                Objects.equals(createTime, ssRole.createTime) &&
                Objects.equals(roleScope, ssRole.roleScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, roleId, roleName, roleType, descr, state, flag, createUser, createTime, roleScope);
    }
}
