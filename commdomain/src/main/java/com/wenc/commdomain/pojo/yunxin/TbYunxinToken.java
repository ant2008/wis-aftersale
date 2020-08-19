package com.wenc.commdomain.pojo.yunxin;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_yunxin_token")
public class TbYunxinToken {
    private long idx;
    private String tenantId;
    private String userId;
    private String userName;
    private String yunxinUserId;
    private String yunxinUserName;
    private String yunxinToken;
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
    @Column(name = "user_name", nullable = true, length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "yunxin_user_id", nullable = true, length = 30)
    public String getYunxinUserId() {
        return yunxinUserId;
    }

    public void setYunxinUserId(String yunxinUserId) {
        this.yunxinUserId = yunxinUserId;
    }

    @Basic
    @Column(name = "yunxin_user_name", nullable = true, length = 30)
    public String getYunxinUserName() {
        return yunxinUserName;
    }

    public void setYunxinUserName(String yunxinUserName) {
        this.yunxinUserName = yunxinUserName;
    }

    @Basic
    @Column(name = "yunxin_token", nullable = true, length = 100)
    public String getYunxinToken() {
        return yunxinToken;
    }

    public void setYunxinToken(String yunxinToken) {
        this.yunxinToken = yunxinToken;
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
        TbYunxinToken that = (TbYunxinToken) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(yunxinUserId, that.yunxinUserId) &&
                Objects.equals(yunxinUserName, that.yunxinUserName) &&
                Objects.equals(yunxinToken, that.yunxinToken) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, userId, userName, yunxinUserId, yunxinUserName, yunxinToken, state, createUser, createTime);
    }
}
