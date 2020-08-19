package com.wenc.commdomain.vo.shop;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_retailsale_sum_h")
public class VbRetailsaleSumH {
    private long idx;
    private String tenantId;
    private String retailsaleSumNo;
    private String shopId;
    private String posNo;
    private String salesmanId;
    private String salesmanName;
    private String beginNo;
    private String endNo;
    private Timestamp beginTime;
    private Timestamp endTime;
    private BigDecimal realsumAmt;
    private BigDecimal salesumAmt;
    private String orgName;
    private String posDescr;

    @Id
    @Basic
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
    @Column(name = "retailsale_sum_no", nullable = true, length = 30)
    public String getRetailsaleSumNo() {
        return retailsaleSumNo;
    }

    public void setRetailsaleSumNo(String retailsaleSumNo) {
        this.retailsaleSumNo = retailsaleSumNo;
    }

    @Basic
    @Column(name = "shop_id", nullable = true, length = 20)
    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "pos_no", nullable = true, length = 20)
    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    @Basic
    @Column(name = "salesman_id", nullable = true, length = 20)
    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId;
    }

    @Basic
    @Column(name = "salesman_name", nullable = true, length = 20)
    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    @Basic
    @Column(name = "begin_no", nullable = true, length = 40)
    public String getBeginNo() {
        return beginNo;
    }

    public void setBeginNo(String beginNo) {
        this.beginNo = beginNo;
    }

    @Basic
    @Column(name = "end_no", nullable = true, length = 40)
    public String getEndNo() {
        return endNo;
    }

    public void setEndNo(String endNo) {
        this.endNo = endNo;
    }

    @Basic
    @Column(name = "begin_time", nullable = true)
    public Timestamp getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }

    @Basic
    @Column(name = "end_time", nullable = true)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "realsum_amt", nullable = true, precision = 6)
    public BigDecimal getRealsumAmt() {
        return realsumAmt;
    }

    public void setRealsumAmt(BigDecimal realsumAmt) {
        this.realsumAmt = realsumAmt;
    }

    @Basic
    @Column(name = "salesum_amt", nullable = true, precision = 6)
    public BigDecimal getSalesumAmt() {
        return salesumAmt;
    }

    public void setSalesumAmt(BigDecimal salesumAmt) {
        this.salesumAmt = salesumAmt;
    }

    @Basic
    @Column(name = "org_name", nullable = true, length = 100)
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Basic
    @Column(name = "pos_descr", nullable = true, length = 40)
    public String getPosDescr() {
        return posDescr;
    }

    public void setPosDescr(String posDescr) {
        this.posDescr = posDescr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbRetailsaleSumH that = (VbRetailsaleSumH) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(retailsaleSumNo, that.retailsaleSumNo) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(posNo, that.posNo) &&
                Objects.equals(salesmanId, that.salesmanId) &&
                Objects.equals(salesmanName, that.salesmanName) &&
                Objects.equals(beginNo, that.beginNo) &&
                Objects.equals(endNo, that.endNo) &&
                Objects.equals(beginTime, that.beginTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(realsumAmt, that.realsumAmt) &&
                Objects.equals(salesumAmt, that.salesumAmt) &&
                Objects.equals(orgName, that.orgName) &&
                Objects.equals(posDescr, that.posDescr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, retailsaleSumNo, shopId, posNo, salesmanId, salesmanName, beginNo, endNo, beginTime, endTime, realsumAmt, salesumAmt, orgName, posDescr);
    }
}
