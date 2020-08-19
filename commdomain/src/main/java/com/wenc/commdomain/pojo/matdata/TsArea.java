package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ts_area")
public class TsArea {
    private long idx;
    private String tenantId;
    private String areaCode;
    private String parentCode;
    private String areaDescr;
    private Integer levels;
    private String memo;
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
    @Column(name = "area_code", nullable = true, length = 50)
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @Basic
    @Column(name = "parent_code", nullable = true, length = 50)
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Basic
    @Column(name = "area_descr", nullable = true, length = 200)
    public String getAreaDescr() {
        return areaDescr;
    }

    public void setAreaDescr(String areaDescr) {
        this.areaDescr = areaDescr;
    }

    @Basic
    @Column(name = "levels", nullable = true)
    public Integer getLevels() {
        return levels;
    }

    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    @Basic
    @Column(name = "memo", nullable = true, length = 100)
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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
        TsArea tsArea = (TsArea) o;
        return idx == tsArea.idx &&
                Objects.equals(tenantId, tsArea.tenantId) &&
                Objects.equals(areaCode, tsArea.areaCode) &&
                Objects.equals(parentCode, tsArea.parentCode) &&
                Objects.equals(areaDescr, tsArea.areaDescr) &&
                Objects.equals(levels, tsArea.levels) &&
                Objects.equals(memo, tsArea.memo) &&
                Objects.equals(state, tsArea.state) &&
                Objects.equals(createUser, tsArea.createUser) &&
                Objects.equals(createTime, tsArea.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, areaCode, parentCode, areaDescr, levels, memo, state, createUser, createTime);
    }
}
