package com.wenc.commdomain.vo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_user")
public class VbUser {
    private long idx;
    private String userId;
    private String userName;
    private String userPass;
    private String userPost;
    private Integer maxCount;
    private String userAuth;
    private Integer curCount;
    private Integer state;
    private Timestamp createTime;
    private String createUser;
    private String userSubno;
    private String mobileno;
    private Timestamp lastmodify;
    private String tenantId;
    private String tenantName;
    private String ifMasterUser;

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
    @Column(name = "user_id", nullable = true, length = 20)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
    @Column(name = "user_pass", nullable = true, length = 100)
    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
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
    @Column(name = "max_count", nullable = true)
    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    @Basic
    @Column(name = "user_auth", nullable = true, length = 20)
    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }

    @Basic
    @Column(name = "cur_count", nullable = true)
    public Integer getCurCount() {
        return curCount;
    }

    public void setCurCount(Integer curCount) {
        this.curCount = curCount;
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
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
    @Column(name = "user_subno", nullable = true, length = 20)
    public String getUserSubno() {
        return userSubno;
    }

    public void setUserSubno(String userSubno) {
        this.userSubno = userSubno;
    }

    @Basic
    @Column(name = "mobileno", nullable = true, length = 20)
    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    @Basic
    @Column(name = "lastmodify", nullable = false)
    public Timestamp getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Timestamp lastmodify) {
        this.lastmodify = lastmodify;
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
    @Column(name = "tenant_name", nullable = true, length = 100)
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbUser vbUser = (VbUser) o;
        return idx == vbUser.idx &&
                Objects.equals(userId, vbUser.userId) &&
                Objects.equals(userName, vbUser.userName) &&
                Objects.equals(userPass, vbUser.userPass) &&
                Objects.equals(userPost, vbUser.userPost) &&
                Objects.equals(maxCount, vbUser.maxCount) &&
                Objects.equals(userAuth, vbUser.userAuth) &&
                Objects.equals(curCount, vbUser.curCount) &&
                Objects.equals(state, vbUser.state) &&
                Objects.equals(createTime, vbUser.createTime) &&
                Objects.equals(createUser, vbUser.createUser) &&
                Objects.equals(userSubno, vbUser.userSubno) &&
                Objects.equals(mobileno, vbUser.mobileno) &&
                Objects.equals(lastmodify, vbUser.lastmodify) &&
                Objects.equals(tenantId, vbUser.tenantId) &&
                Objects.equals(tenantName, vbUser.tenantName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, userId, userName, userPass, userPost, maxCount, userAuth, curCount, state, createTime, createUser, userSubno, mobileno, lastmodify, tenantId, tenantName);
    }

    @Basic
    @Column(name = "if_master_user", nullable = true, length = 20)
    public String getIfMasterUser() {
        return ifMasterUser;
    }

    public void setIfMasterUser(String ifMasterUser) {
        this.ifMasterUser = ifMasterUser;
    }
}
