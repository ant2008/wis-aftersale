package com.wenc.commdomain.pojo.sys;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ts_pos")
public class TsPos {
    private long idx;
    private String tenantId;
    private String orgId;
    private String posNo;
    private String posDescr;
    private String flag;
    private Integer state;

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
    @Column(name = "org_id", nullable = true, length = 15)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "pos_no", nullable = true, length = 12)
    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    @Basic
    @Column(name = "pos_descr", nullable = true, length = 40)
    public String getPosDescr() {
        return posDescr;
    }

    public void setPosDescr(String posDescr) {
        this.posDescr = posDescr;
    }

    @Basic
    @Column(name = "flag", nullable = true, length = 3)
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TsPos tsPos = (TsPos) o;
        return idx == tsPos.idx &&
                Objects.equals(tenantId, tsPos.tenantId) &&
                Objects.equals(orgId, tsPos.orgId) &&
                Objects.equals(posNo, tsPos.posNo) &&
                Objects.equals(posDescr, tsPos.posDescr) &&
                Objects.equals(flag, tsPos.flag) &&
                Objects.equals(state, tsPos.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, orgId, posNo, posDescr, flag, state);
    }
}
