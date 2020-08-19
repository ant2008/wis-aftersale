package com.wenc.commdomain.pojo.core;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_func_d")
public class VbFuncD {
    private long idx;
    private String tenantId;
    private String funcNo;
    private String userRight;
    private String descr;
    private String userPost;
    private String userName;
    private Integer actr;
    private String funcId;
    private Integer state;
    private String flag;
    private String createUser;
    private Timestamp createTime;
    private String funcDescr;

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
    @Column(name = "tenant_id", nullable = true, length = 50)
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
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
    @Column(name = "user_right", nullable = true, length = 10)
    public String getUserRight() {
        return userRight;
    }

    public void setUserRight(String userRight) {
        this.userRight = userRight;
    }

    @Basic
    @Column(name = "descr", nullable = true, length = 20)
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Basic
    @Column(name = "user_post", nullable = true, length = 10)
    public String getUserPost() {
        return userPost;
    }

    public void setUserPost(String userPost) {
        this.userPost = userPost;
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
    @Column(name = "actr", nullable = true)
    public Integer getActr() {
        return actr;
    }

    public void setActr(Integer actr) {
        this.actr = actr;
    }

    @Basic
    @Column(name = "func_id", nullable = true, length = 20)
    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
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
    @Column(name = "func_descr", nullable = true, length = 50)
    public String getFuncDescr() {
        return funcDescr;
    }

    public void setFuncDescr(String funcDescr) {
        this.funcDescr = funcDescr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbFuncD vbFuncD = (VbFuncD) o;
        return Objects.equals(idx, vbFuncD.idx) &&
                Objects.equals(tenantId, vbFuncD.tenantId) &&
                Objects.equals(funcNo, vbFuncD.funcNo) &&
                Objects.equals(userRight, vbFuncD.userRight) &&
                Objects.equals(descr, vbFuncD.descr) &&
                Objects.equals(userPost, vbFuncD.userPost) &&
                Objects.equals(userName, vbFuncD.userName) &&
                Objects.equals(actr, vbFuncD.actr) &&
                Objects.equals(funcId, vbFuncD.funcId) &&
                Objects.equals(state, vbFuncD.state) &&
                Objects.equals(flag, vbFuncD.flag) &&
                Objects.equals(createUser, vbFuncD.createUser) &&
                Objects.equals(createTime, vbFuncD.createTime) &&
                Objects.equals(funcDescr, vbFuncD.funcDescr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, funcNo, userRight, descr, userPost, userName, actr, funcId, state, flag, createUser, createTime, funcDescr);
    }
}
