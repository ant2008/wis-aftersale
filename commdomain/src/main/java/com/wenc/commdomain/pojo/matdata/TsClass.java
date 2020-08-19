package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ts_class")
public class TsClass {
    private long idx;
    private String tenantId;
    private String classCode;
    private String parentCode;
    private Integer levels;
    private String descr;
    private String codeType;
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
    @Column(name = "class_code", nullable = true, length = 20)
    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
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
    @Column(name = "levels", nullable = true)
    public Integer getLevels() {
        return levels;
    }

    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    @Basic
    @Column(name = "descr", nullable = true, length = 100)
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Basic
    @Column(name = "code_type", nullable = true, length = 20)
    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
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
        TsClass tsClass = (TsClass) o;
        return idx == tsClass.idx &&
                Objects.equals(tenantId, tsClass.tenantId) &&
                Objects.equals(classCode, tsClass.classCode) &&
                Objects.equals(parentCode, tsClass.parentCode) &&
                Objects.equals(levels, tsClass.levels) &&
                Objects.equals(descr, tsClass.descr) &&
                Objects.equals(codeType, tsClass.codeType) &&
                Objects.equals(state, tsClass.state) &&
                Objects.equals(createUser, tsClass.createUser) &&
                Objects.equals(createTime, tsClass.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, classCode, parentCode, levels, descr, codeType, state, createUser, createTime);
    }
}
