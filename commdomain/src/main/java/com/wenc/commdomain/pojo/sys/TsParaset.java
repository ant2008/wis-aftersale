package com.wenc.commdomain.pojo.sys;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ts_paraset")
public class TsParaset {
    private long idx;
    private String tenantId;
    private String paraCode;
    private String parentCode;
    private String paraName;
    private String paraDefa;
    private String paraType;
    private String memo;
    private Integer state;
    private String flag;
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
    @Column(name = "para_code", nullable = true, length = 20)
    public String getParaCode() {
        return paraCode;
    }

    public void setParaCode(String paraCode) {
        this.paraCode = paraCode;
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
    @Column(name = "para_name", nullable = true, length = 50)
    public String getParaName() {
        return paraName;
    }

    public void setParaName(String paraName) {
        this.paraName = paraName;
    }

    @Basic
    @Column(name = "para_defa", nullable = true, length = 50)
    public String getParaDefa() {
        return paraDefa;
    }

    public void setParaDefa(String paraDefa) {
        this.paraDefa = paraDefa;
    }

    @Basic
    @Column(name = "para_type", nullable = true, length = 20)
    public String getParaType() {
        return paraType;
    }

    public void setParaType(String paraType) {
        this.paraType = paraType;
    }

    @Basic
    @Column(name = "memo", nullable = true, length = 20)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TsParaset tsParaset = (TsParaset) o;
        return idx == tsParaset.idx &&
                Objects.equals(tenantId, tsParaset.tenantId) &&
                Objects.equals(paraCode, tsParaset.paraCode) &&
                Objects.equals(parentCode, tsParaset.parentCode) &&
                Objects.equals(paraName, tsParaset.paraName) &&
                Objects.equals(paraDefa, tsParaset.paraDefa) &&
                Objects.equals(paraType, tsParaset.paraType) &&
                Objects.equals(memo, tsParaset.memo) &&
                Objects.equals(state, tsParaset.state) &&
                Objects.equals(flag, tsParaset.flag) &&
                Objects.equals(createUser, tsParaset.createUser) &&
                Objects.equals(createTime, tsParaset.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, paraCode, parentCode, paraName, paraDefa, paraType, memo, state, flag, createUser, createTime);
    }
}
