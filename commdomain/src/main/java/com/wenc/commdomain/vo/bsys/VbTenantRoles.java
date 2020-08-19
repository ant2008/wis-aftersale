package com.wenc.commdomain.vo.bsys;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_tenant_roles")
public class VbTenantRoles {
    private long idx;
    private String tenantId;
    private String roleId;
    private Integer state;
    private String createUser;
    private Timestamp createTime;
    private String tenantName;
    private String tenantType;
    private String roleName;
    private String roleType;
    private String roleScope;

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
    @Column(name = "role_id", nullable = true, length = 30)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbTenantRoles that = (VbTenantRoles) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(tenantName, that.tenantName) &&
                Objects.equals(tenantType, that.tenantType) &&
                Objects.equals(roleName, that.roleName) &&
                Objects.equals(roleType, that.roleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, roleId, state, createUser, createTime, tenantName, tenantType, roleName, roleType);
    }

    @Basic
    @Column(name = "role_scope", nullable = true, length = 20)
    public String getRoleScope() {
        return roleScope;
    }

    public void setRoleScope(String roleScope) {
        this.roleScope = roleScope;
    }
}
