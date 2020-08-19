package com.wenc.commdomain.pojo.stb;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_estore_token")
public class TbEstoreToken {
    private long idx;
    private String tenantId;
    private String tokenType;
    private String estoreId;
    private String tokenValue;
    private Timestamp tokenExpireDate;
    private Integer state;
    private Timestamp createTime;
    private String createUser;
    private String refreshTokenValue;

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
    @Column(name = "token_type", nullable = true, length = 20)
    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    @Basic
    @Column(name = "estore_id", nullable = true, length = 30)
    public String getEstoreId() {
        return estoreId;
    }

    public void setEstoreId(String estoreId) {
        this.estoreId = estoreId;
    }

    @Basic
    @Column(name = "token_value", nullable = true, length = 500)
    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    @Basic
    @Column(name = "token_expire_date", nullable = true)
    public Timestamp getTokenExpireDate() {
        return tokenExpireDate;
    }

    public void setTokenExpireDate(Timestamp tokenExpireDate) {
        this.tokenExpireDate = tokenExpireDate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbEstoreToken that = (TbEstoreToken) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(tokenType, that.tokenType) &&
                Objects.equals(estoreId, that.estoreId) &&
                Objects.equals(tokenValue, that.tokenValue) &&
                Objects.equals(tokenExpireDate, that.tokenExpireDate) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, tokenType, estoreId, tokenValue, tokenExpireDate, state, createTime, createUser);
    }

    @Basic
    @Column(name = "refresh_token_value", nullable = true, length = 500)
    public String getRefreshTokenValue() {
        return refreshTokenValue;
    }

    public void setRefreshTokenValue(String refreshTokenValue) {
        this.refreshTokenValue = refreshTokenValue;
    }
}
