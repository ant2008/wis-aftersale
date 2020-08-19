package com.wenc.commdomain.pojo.core;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ss_func_d", schema = "public", catalog = "wiser_aftersale")
public class SsFuncD {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SsFuncD ssFuncD = (SsFuncD) o;
        return idx == ssFuncD.idx &&
                Objects.equals(tenantId, ssFuncD.tenantId) &&
                Objects.equals(funcNo, ssFuncD.funcNo) &&
                Objects.equals(userRight, ssFuncD.userRight) &&
                Objects.equals(descr, ssFuncD.descr) &&
                Objects.equals(userPost, ssFuncD.userPost) &&
                Objects.equals(userName, ssFuncD.userName) &&
                Objects.equals(actr, ssFuncD.actr) &&
                Objects.equals(funcId, ssFuncD.funcId) &&
                Objects.equals(state, ssFuncD.state) &&
                Objects.equals(flag, ssFuncD.flag) &&
                Objects.equals(createUser, ssFuncD.createUser) &&
                Objects.equals(createTime, ssFuncD.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, funcNo, userRight, descr, userPost, userName, actr, funcId, state, flag, createUser, createTime);
    }
}
