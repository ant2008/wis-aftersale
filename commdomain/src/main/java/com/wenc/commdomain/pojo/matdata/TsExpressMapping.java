package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ts_express_mapping")
public class TsExpressMapping {
    private long idx;
    private String tenantId;
    private String mappType;
    private String lgstId;
    private String lgstName;
    private String expressId;
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
    @Column(name = "mapp_type", nullable = true, length = 20)
    public String getMappType() {
        return mappType;
    }

    public void setMappType(String mappType) {
        this.mappType = mappType;
    }

    @Basic
    @Column(name = "lgst_id", nullable = true, length = 30)
    public String getLgstId() {
        return lgstId;
    }

    public void setLgstId(String lgstId) {
        this.lgstId = lgstId;
    }

    @Basic
    @Column(name = "lgst_name", nullable = true, length = 30)
    public String getLgstName() {
        return lgstName;
    }

    public void setLgstName(String lgstName) {
        this.lgstName = lgstName;
    }

    @Basic
    @Column(name = "express_id", nullable = true, length = 30)
    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId;
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
        TsExpressMapping that = (TsExpressMapping) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(mappType, that.mappType) &&
                Objects.equals(lgstId, that.lgstId) &&
                Objects.equals(lgstName, that.lgstName) &&
                Objects.equals(expressId, that.expressId) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, mappType, lgstId, lgstName, expressId, createUser, createTime);
    }
}
