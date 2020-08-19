package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ts_express_tpl")
public class TsExpressTpl {
    private long idx;
    private String tenantId;
    private String expressId;
    private String expressTplId;
    private String expressTplName;
    private Integer expressTplDefa;
    private String expressTplFunc;
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
    @Column(name = "express_id", nullable = true, length = 20)
    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId;
    }

    @Basic
    @Column(name = "express_tpl_id", nullable = true, length = 30)
    public String getExpressTplId() {
        return expressTplId;
    }

    public void setExpressTplId(String expressTplId) {
        this.expressTplId = expressTplId;
    }

    @Basic
    @Column(name = "express_tpl_name", nullable = true, length = 50)
    public String getExpressTplName() {
        return expressTplName;
    }

    public void setExpressTplName(String expressTplName) {
        this.expressTplName = expressTplName;
    }

    @Basic
    @Column(name = "express_tpl_defa", nullable = true)
    public Integer getExpressTplDefa() {
        return expressTplDefa;
    }

    public void setExpressTplDefa(Integer expressTplDefa) {
        this.expressTplDefa = expressTplDefa;
    }

    @Basic
    @Column(name = "express_tpl_func", nullable = true, length = 30)
    public String getExpressTplFunc() {
        return expressTplFunc;
    }

    public void setExpressTplFunc(String expressTplFunc) {
        this.expressTplFunc = expressTplFunc;
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
        TsExpressTpl that = (TsExpressTpl) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(expressId, that.expressId) &&
                Objects.equals(expressTplId, that.expressTplId) &&
                Objects.equals(expressTplName, that.expressTplName) &&
                Objects.equals(expressTplDefa, that.expressTplDefa) &&
                Objects.equals(expressTplFunc, that.expressTplFunc) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, expressId, expressTplId, expressTplName, expressTplDefa, expressTplFunc, state, createUser, createTime);
    }
}
