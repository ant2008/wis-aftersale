package com.wenc.commdomain.pojo.report;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_paytype_daily_sale")
public class VbPaytypeDailySale {
    private long idx;
    private String tenantId;
    private Timestamp statDate;
    private String shopId;
    private String posNo;
    private String salemanId;
    private String payCode;
    private BigDecimal dueAmount;
    private BigDecimal realAmount;
    private String createUser;
    private Timestamp createTime;
    private String orgName;
    private String payDescr;

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
    @Column(name = "stat_date", nullable = true)
    public Timestamp getStatDate() {
        return statDate;
    }

    public void setStatDate(Timestamp statDate) {
        this.statDate = statDate;
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
    @Column(name = "saleman_id", nullable = true, length = 8)
    public String getSalemanId() {
        return salemanId;
    }

    public void setSalemanId(String salemanId) {
        this.salemanId = salemanId;
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
    @Column(name = "due_amount", nullable = true, precision = 6)
    public BigDecimal getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(BigDecimal dueAmount) {
        this.dueAmount = dueAmount;
    }

    @Basic
    @Column(name = "real_amount", nullable = true, precision = 6)
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
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
    @Column(name = "org_name", nullable = true, length = 100)
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Basic
    @Column(name = "pay_descr", nullable = true, length = 30)
    public String getPayDescr() {
        return payDescr;
    }

    public void setPayDescr(String payDescr) {
        this.payDescr = payDescr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbPaytypeDailySale that = (VbPaytypeDailySale) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(statDate, that.statDate) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(posNo, that.posNo) &&
                Objects.equals(salemanId, that.salemanId) &&
                Objects.equals(payCode, that.payCode) &&
                Objects.equals(dueAmount, that.dueAmount) &&
                Objects.equals(realAmount, that.realAmount) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(orgName, that.orgName) &&
                Objects.equals(payDescr, that.payDescr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, statDate, shopId, posNo, salemanId, payCode, dueAmount, realAmount, createUser, createTime, orgName, payDescr);
    }
}
