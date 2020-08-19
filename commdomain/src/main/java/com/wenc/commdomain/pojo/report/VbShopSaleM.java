package com.wenc.commdomain.pojo.report;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "vb_shop_sale_m")
public class VbShopSaleM {
    private Long idx;
    private String tenantId;
    private String statMonth;
    private String shopId;
    private String orgName;
    private BigDecimal saleQty;
    private BigDecimal purAmt;
    private BigDecimal dueAmt;
    private BigDecimal realAmt;
    private BigDecimal shoppeAmt;
    private Long customerFlow;

    @Id
    @Basic
    @Column(name = "idx", nullable = true)
    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
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
    @Column(name = "stat_month", nullable = true, length = 6)
    public String getStatMonth() {
        return statMonth;
    }

    public void setStatMonth(String statMonth) {
        this.statMonth = statMonth;
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
    @Column(name = "org_name", nullable = true, length = 100)
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
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
    @Column(name = "customer_flow", nullable = true, precision = 0)
    public Long getCustomerFlow() {
        return customerFlow;
    }

    public void setCustomerFlow(Long customerFlow) {
        this.customerFlow = customerFlow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbShopSaleM that = (VbShopSaleM) o;
        return Objects.equals(idx, that.idx) &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(statMonth, that.statMonth) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(orgName, that.orgName) &&
                Objects.equals(saleQty, that.saleQty) &&
                Objects.equals(purAmt, that.purAmt) &&
                Objects.equals(dueAmt, that.dueAmt) &&
                Objects.equals(realAmt, that.realAmt) &&
                Objects.equals(shoppeAmt, that.shoppeAmt) &&
                Objects.equals(customerFlow, that.customerFlow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, statMonth, shopId, orgName, saleQty, purAmt, dueAmt, realAmt, shoppeAmt, customerFlow);
    }
}
