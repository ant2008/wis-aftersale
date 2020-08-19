package com.wenc.commdomain.pojo.glt;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gl_payment")
public class GlPayment {
    private long idx;
    private String tenantId;
    private String payType;
    private String payCode;
    private String payDescr;
    private String mappingCode;
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
    @Column(name = "pay_type", nullable = true, length = 20)
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Basic
    @Column(name = "pay_code", nullable = true, length = 20)
    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    @Basic
    @Column(name = "pay_descr", nullable = true, length = 30)
    public String getPayDescr() {
        return payDescr;
    }

    public void setPayDescr(String payDescr) {
        this.payDescr = payDescr;
    }

    @Basic
    @Column(name = "mapping_code", nullable = true, length = 50)
    public String getMappingCode() {
        return mappingCode;
    }

    public void setMappingCode(String mappingCode) {
        this.mappingCode = mappingCode;
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
        GlPayment glPayment = (GlPayment) o;
        return idx == glPayment.idx &&
                Objects.equals(tenantId, glPayment.tenantId) &&
                Objects.equals(payType, glPayment.payType) &&
                Objects.equals(payCode, glPayment.payCode) &&
                Objects.equals(payDescr, glPayment.payDescr) &&
                Objects.equals(mappingCode, glPayment.mappingCode) &&
                Objects.equals(state, glPayment.state) &&
                Objects.equals(createUser, glPayment.createUser) &&
                Objects.equals(createTime, glPayment.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, payType, payCode, payDescr, mappingCode, state, createUser, createTime);
    }
}
