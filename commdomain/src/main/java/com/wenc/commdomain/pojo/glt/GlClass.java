package com.wenc.commdomain.pojo.glt;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gl_class")
public class GlClass {
    private long idx;
    private String tenantId;
    private String classCode;
    private String parentCode;
    private Integer classLevel;
    private String classDescr;
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
    @Column(name = "class_level", nullable = true)
    public Integer getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(Integer classLevel) {
        this.classLevel = classLevel;
    }

    @Basic
    @Column(name = "class_descr", nullable = true, length = 100)
    public String getClassDescr() {
        return classDescr;
    }

    public void setClassDescr(String classDescr) {
        this.classDescr = classDescr;
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
        GlClass glClass = (GlClass) o;
        return idx == glClass.idx &&
                Objects.equals(tenantId, glClass.tenantId) &&
                Objects.equals(classCode, glClass.classCode) &&
                Objects.equals(parentCode, glClass.parentCode) &&
                Objects.equals(classLevel, glClass.classLevel) &&
                Objects.equals(classDescr, glClass.classDescr) &&
                Objects.equals(codeType, glClass.codeType) &&
                Objects.equals(state, glClass.state) &&
                Objects.equals(createUser, glClass.createUser) &&
                Objects.equals(createTime, glClass.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, classCode, parentCode, classLevel, classDescr, codeType, state, createUser, createTime);
    }
}
