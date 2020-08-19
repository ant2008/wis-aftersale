package com.wenc.commdomain.pojo.stb;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_estore_authorize")
public class TbEstoreAuthorize {
    private long idx;
    private String tenantId;
    private String storeId;
    private String auzstoreType;
    private String auzstoreId;
    private String auzstoreUserid;
    private String auzstoreUsername;
    private String auzstorePwd;
    private Integer auzstoreState;
    private String auzstoreUrl;
    private Integer state;
    private String flag;
    private Timestamp createTime;
    private String createUser;
    private String auzstoreCode;
    private String auzstoreRefreshToken;

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
    @Column(name = "store_id", nullable = true, length = 30)
    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "auzstore_type", nullable = true, length = 20)
    public String getAuzstoreType() {
        return auzstoreType;
    }

    public void setAuzstoreType(String auzstoreType) {
        this.auzstoreType = auzstoreType;
    }

    @Basic
    @Column(name = "auzstore_id", nullable = true, length = 50)
    public String getAuzstoreId() {
        return auzstoreId;
    }

    public void setAuzstoreId(String auzstoreId) {
        this.auzstoreId = auzstoreId;
    }

    @Basic
    @Column(name = "auzstore_userid", nullable = true, length = 30)
    public String getAuzstoreUserid() {
        return auzstoreUserid;
    }

    public void setAuzstoreUserid(String auzstoreUserid) {
        this.auzstoreUserid = auzstoreUserid;
    }

    @Basic
    @Column(name = "auzstore_username", nullable = true, length = 50)
    public String getAuzstoreUsername() {
        return auzstoreUsername;
    }

    public void setAuzstoreUsername(String auzstoreUsername) {
        this.auzstoreUsername = auzstoreUsername;
    }

    @Basic
    @Column(name = "auzstore_pwd", nullable = true, length = 100)
    public String getAuzstorePwd() {
        return auzstorePwd;
    }

    public void setAuzstorePwd(String auzstorePwd) {
        this.auzstorePwd = auzstorePwd;
    }

    @Basic
    @Column(name = "auzstore_state", nullable = true)
    public Integer getAuzstoreState() {
        return auzstoreState;
    }

    public void setAuzstoreState(Integer auzstoreState) {
        this.auzstoreState = auzstoreState;
    }

    @Basic
    @Column(name = "auzstore_url", nullable = true, length = 200)
    public String getAuzstoreUrl() {
        return auzstoreUrl;
    }

    public void setAuzstoreUrl(String auzstoreUrl) {
        this.auzstoreUrl = auzstoreUrl;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbEstoreAuthorize that = (TbEstoreAuthorize) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(storeId, that.storeId) &&
                Objects.equals(auzstoreType, that.auzstoreType) &&
                Objects.equals(auzstoreId, that.auzstoreId) &&
                Objects.equals(auzstoreUserid, that.auzstoreUserid) &&
                Objects.equals(auzstoreUsername, that.auzstoreUsername) &&
                Objects.equals(auzstorePwd, that.auzstorePwd) &&
                Objects.equals(auzstoreState, that.auzstoreState) &&
                Objects.equals(auzstoreUrl, that.auzstoreUrl) &&
                Objects.equals(state, that.state) &&
                Objects.equals(flag, that.flag) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, storeId, auzstoreType, auzstoreId, auzstoreUserid, auzstoreUsername, auzstorePwd, auzstoreState, auzstoreUrl, state, flag, createTime, createUser);
    }

    @Basic
    @Column(name = "auzstore_code", nullable = true, length = 100)
    public String getAuzstoreCode() {
        return auzstoreCode;
    }

    public void setAuzstoreCode(String auzstoreCode) {
        this.auzstoreCode = auzstoreCode;
    }

    @Basic
    @Column(name = "auzstore_refresh_token", nullable = true, length = 100)
    public String getAuzstoreRefreshToken() {
        return auzstoreRefreshToken;
    }

    public void setAuzstoreRefreshToken(String auzstoreRefreshToken) {
        this.auzstoreRefreshToken = auzstoreRefreshToken;
    }
}
