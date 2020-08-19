package com.wenc.commdomain.pojo.stb;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_synset")
public class TbSynset {
    private long idx;
    private String tenantId;
    private String synType;
    private String synId;
    private String synNo;
    private String synDescr;
    private Timestamp synMinDate;
    private Timestamp synMaxDate;
    private Integer state;
    private String synMinNo;
    private String synMaxNo;

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
    @Column(name = "syn_type", nullable = true, length = 20)
    public String getSynType() {
        return synType;
    }

    public void setSynType(String synType) {
        this.synType = synType;
    }

    @Basic
    @Column(name = "syn_id", nullable = true, length = 20)
    public String getSynId() {
        return synId;
    }

    public void setSynId(String synId) {
        this.synId = synId;
    }

    @Basic
    @Column(name = "syn_no", nullable = true, length = 20)
    public String getSynNo() {
        return synNo;
    }

    public void setSynNo(String synNo) {
        this.synNo = synNo;
    }

    @Basic
    @Column(name = "syn_descr", nullable = true, length = 100)
    public String getSynDescr() {
        return synDescr;
    }

    public void setSynDescr(String synDescr) {
        this.synDescr = synDescr;
    }

    @Basic
    @Column(name = "syn_min_date", nullable = true)
    public Timestamp getSynMinDate() {
        return synMinDate;
    }

    public void setSynMinDate(Timestamp synMinDate) {
        this.synMinDate = synMinDate;
    }

    @Basic
    @Column(name = "syn_max_date", nullable = true)
    public Timestamp getSynMaxDate() {
        return synMaxDate;
    }

    public void setSynMaxDate(Timestamp synMaxDate) {
        this.synMaxDate = synMaxDate;
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
    @Column(name = "syn_min_no", nullable = true, length = 20)
    public String getSynMinNo() {
        return synMinNo;
    }

    public void setSynMinNo(String synMinNo) {
        this.synMinNo = synMinNo;
    }

    @Basic
    @Column(name = "syn_max_no", nullable = true, length = 20)
    public String getSynMaxNo() {
        return synMaxNo;
    }

    public void setSynMaxNo(String synMaxNo) {
        this.synMaxNo = synMaxNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbSynset tbSynset = (TbSynset) o;
        return idx == tbSynset.idx &&
                Objects.equals(tenantId, tbSynset.tenantId) &&
                Objects.equals(synType, tbSynset.synType) &&
                Objects.equals(synId, tbSynset.synId) &&
                Objects.equals(synNo, tbSynset.synNo) &&
                Objects.equals(synDescr, tbSynset.synDescr) &&
                Objects.equals(synMinDate, tbSynset.synMinDate) &&
                Objects.equals(synMaxDate, tbSynset.synMaxDate) &&
                Objects.equals(state, tbSynset.state) &&
                Objects.equals(synMinNo, tbSynset.synMinNo) &&
                Objects.equals(synMaxNo, tbSynset.synMaxNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, synType, synId, synNo, synDescr, synMinDate, synMaxDate, state, synMinNo, synMaxNo);
    }
}
