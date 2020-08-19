package com.wenc.commdomain.pojo.core;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "v_role_funcd")
public class VRoleFuncd {
    private long idx;
    private String userId;
    private String funcNo;
    private String roleRight;
    private String tenantId;

    @Id
    @Basic
    @Column(name = "idx", nullable = true)
    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
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
    @Column(name = "func_no", nullable = true, length = 20)
    public String getFuncNo() {
        return funcNo;
    }

    public void setFuncNo(String funcNo) {
        this.funcNo = funcNo;
    }

    @Basic
    @Column(name = "role_right", nullable = true, length = 10)
    public String getRoleRight() {
        return roleRight;
    }

    public void setRoleRight(String roleRight) {
        this.roleRight = roleRight;
    }

    @Basic
    @Column(name = "tenant_id", nullable = true, length = 50)
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VRoleFuncd that = (VRoleFuncd) o;
        return Objects.equals(idx, that.idx) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(funcNo, that.funcNo) &&
                Objects.equals(roleRight, that.roleRight) &&
                Objects.equals(tenantId, that.tenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, userId, funcNo, roleRight, tenantId);
    }
}
