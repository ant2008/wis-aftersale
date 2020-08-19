package com.wenc.commdomain.pojo.report;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_shop_daily_sale")
public class VbShopDailySale {
    private long idx;
    private String tenantId;
    private Timestamp statDate;
    private String shopId;
    private BigDecimal saleQty;
    private BigDecimal purAmt;
    private BigDecimal dueAmt;
    private BigDecimal realAmt;
    private BigDecimal shoppeAmt;
    private Integer customerFlow;
    private String createUser;
    private Timestamp createTime;
    private String orgName;

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
    @Column(name = "sale_qty", nullable = true, precision = 3)
    public BigDecimal getSaleQty() {
        return saleQty;
    }

    public void setSaleQty(BigDecimal saleQty) {
        this.saleQty = saleQty;
    }

    @Basic
    @Column(name = "pur_amt", nullable = true, precision = 6)
    public BigDecimal getPurAmt() {
        return purAmt;
    }

    public void setPurAmt(BigDecimal purAmt) {
        this.purAmt = purAmt;
    }

    @Basic
    @Column(name = "due_amt", nullable = true, precision = 6)
    public BigDecimal getDueAmt() {
        return dueAmt;
    }

    public void setDueAmt(BigDecimal dueAmt) {
        this.dueAmt = dueAmt;
    }

    @Basic
    @Column(name = "real_amt", nullable = true, precision = 6)
    public BigDecimal getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(BigDecimal realAmt) {
        this.realAmt = realAmt;
    }

    @Basic
    @Column(name = "shoppe_amt", nullable = true, precision = 6)
    public BigDecimal getShoppeAmt() {
        return shoppeAmt;
    }

    public void setShoppeAmt(BigDecimal shoppeAmt) {
        this.shoppeAmt = shoppeAmt;
    }

    @Basic
    @Column(name = "customer_flow", nullable = true)
    public Integer getCustomerFlow() {
        return customerFlow;
    }

    public void setCustomerFlow(Integer customerFlow) {
        this.customerFlow = customerFlow;
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
    @Column(name = "create_time", nullable = false)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbShopDailySale that = (VbShopDailySale) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(statDate, that.statDate) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(saleQty, that.saleQty) &&
                Objects.equals(purAmt, that.purAmt) &&
                Objects.equals(dueAmt, that.dueAmt) &&
                Objects.equals(realAmt, that.realAmt) &&
                Objects.equals(shoppeAmt, that.shoppeAmt) &&
                Objects.equals(customerFlow, that.customerFlow) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(orgName, that.orgName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, statDate, shopId, saleQty, purAmt, dueAmt, realAmt, shoppeAmt, customerFlow, createUser, createTime, orgName);
    }
}
