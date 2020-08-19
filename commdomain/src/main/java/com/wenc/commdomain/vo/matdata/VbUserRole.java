package com.wenc.commdomain.vo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_user_role")
public class VbUserRole {
    private long idx;
    private String tenantId;
    private String userId;
    private String roleId;
    private Integer state;
    private String createUser;
    private Timestamp creatTime;
    private String roleName;
    private String roleType;
    private String userName;
    private String userSubno;

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
    @Column(name = "user_id", nullable = true, length = 20)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
    @Column(name = "creat_time", nullable = true)
    public Timestamp getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Timestamp creatTime) {
        this.creatTime = creatTime;
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
    @Column(name = "user_name", nullable = true, length = 50)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_subno", nullable = true, length = 20)
    public String getUserSubno() {
        return userSubno;
    }

    public void setUserSubno(String userSubno) {
        this.userSubno = userSubno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbUserRole that = (VbUserRole) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(creatTime, that.creatTime) &&
                Objects.equals(roleName, that.roleName) &&
                Objects.equals(roleType, that.roleType) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userSubno, that.userSubno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, userId, roleId, state, createUser, creatTime, roleName, roleType, userName, userSubno);
    }
}
