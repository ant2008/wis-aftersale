package com.wenc.commdomain.pojo.sys;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ts_pay_type")
public class TsPayType {
    private long idx;
    private String tenantId;
    private String paytypeCode;
    private String paytypeDescr;
    private String paytypeKind;
    private String paytypeCurrency;
    private Integer rowTocol;
    private String mappingType;
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
    @Column(name = "paytype_code", nullable = true, length = 20)
    public String getPaytypeCode() {
        return paytypeCode;
    }

    public void setPaytypeCode(String paytypeCode) {
        this.paytypeCode = paytypeCode;
    }

    @Basic
    @Column(name = "paytype_descr", nullable = true, length = 30)
    public String getPaytypeDescr() {
        return paytypeDescr;
    }

    public void setPaytypeDescr(String paytypeDescr) {
        this.paytypeDescr = paytypeDescr;
    }

    @Basic
    @Column(name = "paytype_kind", nullable = true, length = 10)
    public String getPaytypeKind() {
        return paytypeKind;
    }

    public void setPaytypeKind(String paytypeKind) {
        this.paytypeKind = paytypeKind;
    }

    @Basic
    @Column(name = "paytype_currency", nullable = true, length = 10)
    public String getPaytypeCurrency() {
        return paytypeCurrency;
    }

    public void setPaytypeCurrency(String paytypeCurrency) {
        this.paytypeCurrency = paytypeCurrency;
    }

    @Basic
    @Column(name = "row_tocol", nullable = true)
    public Integer getRowTocol() {
        return rowTocol;
    }

    public void setRowTocol(Integer rowTocol) {
        this.rowTocol = rowTocol;
    }

    @Basic
    @Column(name = "mapping_type", nullable = true, length = 20)
    public String getMappingType() {
        return mappingType;
    }

    public void setMappingType(String mappingType) {
        this.mappingType = mappingType;
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
        TsPayType tsPayType = (TsPayType) o;
        return idx == tsPayType.idx &&
                Objects.equals(tenantId, tsPayType.tenantId) &&
                Objects.equals(paytypeCode, tsPayType.paytypeCode) &&
                Objects.equals(paytypeDescr, tsPayType.paytypeDescr) &&
                Objects.equals(paytypeKind, tsPayType.paytypeKind) &&
                Objects.equals(paytypeCurrency, tsPayType.paytypeCurrency) &&
                Objects.equals(rowTocol, tsPayType.rowTocol) &&
                Objects.equals(mappingType, tsPayType.mappingType) &&
                Objects.equals(state, tsPayType.state) &&
                Objects.equals(createUser, tsPayType.createUser) &&
                Objects.equals(createTime, tsPayType.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, paytypeCode, paytypeDescr, paytypeKind, paytypeCurrency, rowTocol, mappingType, state, createUser, createTime);
    }
}
