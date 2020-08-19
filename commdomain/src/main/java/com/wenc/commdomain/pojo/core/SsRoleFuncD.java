package com.wenc.commdomain.pojo.core;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ss_role_func_d")
public class SsRoleFuncD {
    private long idx;
    private String tenantId;
    private String roleId;
    private String funcNo;
    private String roleRight;
    private String descr;
    private String userPost;
    private Integer actr;
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
    @Column(name = "role_id", nullable = true, length = 20)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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
    @Column(name = "descr", nullable = true, length = 50)
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Basic
    @Column(name = "user_post", nullable = true, length = 20)
    public String getUserPost() {
        return userPost;
    }

    public void setUserPost(String userPost) {
        this.userPost = userPost;
    }

    @Basic
    @Column(name = "actr", nullable = true)
    public Integer getActr() {
        return actr;
    }

    public void setActr(Integer actr) {
        this.actr = actr;
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
        SsRoleFuncD that = (SsRoleFuncD) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(funcNo, that.funcNo) &&
                Objects.equals(roleRight, that.roleRight) &&
                Objects.equals(descr, that.descr) &&
                Objects.equals(userPost, that.userPost) &&
                Objects.equals(actr, that.actr) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, roleId, funcNo, roleRight, descr, userPost, actr, state, createUser, createTime);
    }
}
