package com.wenc.commdomain.pojo.core;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ss_code")
public class SsCode {
    private long idx;
    private String sysCode;
    private String parentCode;
    private String descr;
    private Integer levels;
    private String memo;
    private Integer state;
    private String flag;
    private String createUser;
    private Timestamp createTime;
    private Timestamp lastmodify;

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
    @Column(name = "sys_code", nullable = true, length = 20)
    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    @Basic
    @Column(name = "parent_code", nullable = true, length = 20)
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
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
    @Column(name = "lastmodify", nullable = true)
    public Timestamp getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Timestamp lastmodify) {
        this.lastmodify = lastmodify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SsCode ssCode = (SsCode) o;
        return idx == ssCode.idx &&
                Objects.equals(sysCode, ssCode.sysCode) &&
                Objects.equals(parentCode, ssCode.parentCode) &&
                Objects.equals(descr, ssCode.descr) &&
                Objects.equals(levels, ssCode.levels) &&
                Objects.equals(memo, ssCode.memo) &&
                Objects.equals(state, ssCode.state) &&
                Objects.equals(flag, ssCode.flag) &&
                Objects.equals(createUser, ssCode.createUser) &&
                Objects.equals(createTime, ssCode.createTime) &&
                Objects.equals(lastmodify, ssCode.lastmodify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, sysCode, parentCode, descr, levels, memo, state, flag, createUser, createTime, lastmodify);
    }
}
