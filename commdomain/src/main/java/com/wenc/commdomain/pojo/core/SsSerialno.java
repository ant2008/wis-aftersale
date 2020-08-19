package com.wenc.commdomain.pojo.core;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ss_serialno")
public class SsSerialno {
    private long idx;
    private String tenantId;
    private String serialCode;
    private String serialDescr;
    private Integer serialNo;
    private String preStr;
    private Timestamp currDate;
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
    @Column(name = "serial_code", nullable = true, length = 20)
    public String getSerialCode() {
        return serialCode;
    }

    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode;
    }

    @Basic
    @Column(name = "serial_descr", nullable = true, length = 50)
    public String getSerialDescr() {
        return serialDescr;
    }

    public void setSerialDescr(String serialDescr) {
        this.serialDescr = serialDescr;
    }

    @Basic
    @Column(name = "serial_no", nullable = true)
    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    @Basic
    @Column(name = "pre_str", nullable = true, length = 20)
    public String getPreStr() {
        return preStr;
    }

    public void setPreStr(String preStr) {
        this.preStr = preStr;
    }

    @Basic
    @Column(name = "curr_date", nullable = true)
    public Timestamp getCurrDate() {
        return currDate;
    }

    public void setCurrDate(Timestamp currDate) {
        this.currDate = currDate;
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
        SsSerialno that = (SsSerialno) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(serialCode, that.serialCode) &&
                Objects.equals(serialDescr, that.serialDescr) &&
                Objects.equals(serialNo, that.serialNo) &&
                Objects.equals(preStr, that.preStr) &&
                Objects.equals(currDate, that.currDate) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, serialCode, serialDescr, serialNo, preStr, currDate, state, createUser, createTime);
    }
}
