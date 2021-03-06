package com.wenc.commdomain.pojo.glt;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gl_express")
public class GlExpress {
    private long idx;
    private String tenantId;
    private String scopeFlag;
    private String expressId;
    private String expressName;
    private String operatorUser;
    private String operatorTelno;
    private String operatorMobileno;
    private String expressNotes;
    private Integer state;
    private String createUser;
    private Timestamp createTime;
    private String eclgCode;

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
    @Column(name = "scope_flag", nullable = true, length = 20)
    public String getScopeFlag() {
        return scopeFlag;
    }

    public void setScopeFlag(String scopeFlag) {
        this.scopeFlag = scopeFlag;
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
    @Column(name = "express_name", nullable = true, length = 45)
    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    @Basic
    @Column(name = "operator_user", nullable = true, length = 20)
    public String getOperatorUser() {
        return operatorUser;
    }

    public void setOperatorUser(String operatorUser) {
        this.operatorUser = operatorUser;
    }

    @Basic
    @Column(name = "operator_telno", nullable = true, length = 20)
    public String getOperatorTelno() {
        return operatorTelno;
    }

    public void setOperatorTelno(String operatorTelno) {
        this.operatorTelno = operatorTelno;
    }

    @Basic
    @Column(name = "operator_mobileno", nullable = true, length = 20)
    public String getOperatorMobileno() {
        return operatorMobileno;
    }

    public void setOperatorMobileno(String operatorMobileno) {
        this.operatorMobileno = operatorMobileno;
    }

    @Basic
    @Column(name = "express_notes", nullable = true, length = 20)
    public String getExpressNotes() {
        return expressNotes;
    }

    public void setExpressNotes(String expressNotes) {
        this.expressNotes = expressNotes;
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
    @Column(name = "create_user", nullable = true, length = 8)
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
    @Column(name = "eclg_code", nullable = true, length = 30)
    public String getEclgCode() {
        return eclgCode;
    }

    public void setEclgCode(String eclgCode) {
        this.eclgCode = eclgCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlExpress glExpress = (GlExpress) o;
        return idx == glExpress.idx &&
                Objects.equals(tenantId, glExpress.tenantId) &&
                Objects.equals(scopeFlag, glExpress.scopeFlag) &&
                Objects.equals(expressId, glExpress.expressId) &&
                Objects.equals(expressName, glExpress.expressName) &&
                Objects.equals(operatorUser, glExpress.operatorUser) &&
                Objects.equals(operatorTelno, glExpress.operatorTelno) &&
                Objects.equals(operatorMobileno, glExpress.operatorMobileno) &&
                Objects.equals(expressNotes, glExpress.expressNotes) &&
                Objects.equals(state, glExpress.state) &&
                Objects.equals(createUser, glExpress.createUser) &&
                Objects.equals(createTime, glExpress.createTime) &&
                Objects.equals(eclgCode, glExpress.eclgCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, scopeFlag, expressId, expressName, operatorUser, operatorTelno, operatorMobileno, expressNotes, state, createUser, createTime, eclgCode);
    }
}
