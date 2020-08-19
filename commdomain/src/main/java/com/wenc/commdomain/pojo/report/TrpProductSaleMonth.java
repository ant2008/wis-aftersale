package com.wenc.commdomain.pojo.report;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "trp_product_sale_month")
public class TrpProductSaleMonth {
    private long idx;
    private String tenantId;
    private Timestamp statDate;
    private String statMonth;
    private String shopId;
    private String itemId;
    private String statYear;
    private BigDecimal saleQty;
    private BigDecimal purAmt;
    private BigDecimal dueAmt;
    private BigDecimal realAmt;
    private String createUser;
    private Timestamp createTime;
    private BigDecimal grossAmt;
    private BigDecimal grossrateAmt;

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
    @Column(name = "stat_date", nullable = true)
    public Timestamp getStatDate() {
        return statDate;
    }

    public void setStatDate(Timestamp statDate) {
        this.statDate = statDate;
    }

    @Basic
    @Column(name = "stat_month", nullable = true, length = 10)
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
    @Column(name = "item_id", nullable = true, length = 20)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "stat_year", nullable = true, length = 20)
    public String getStatYear() {
        return statYear;
    }

    public void setStatYear(String statYear) {
        this.statYear = statYear;
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
    @Column(name = "gross_amt", nullable = true, precision = 6)
    public BigDecimal getGrossAmt() {
        return grossAmt;
    }

    public void setGrossAmt(BigDecimal grossAmt) {
        this.grossAmt = grossAmt;
    }

    @Basic
    @Column(name = "grossrate_amt", nullable = true, precision = 6)
    public BigDecimal getGrossrateAmt() {
        return grossrateAmt;
    }

    public void setGrossrateAmt(BigDecimal grossrateAmt) {
        this.grossrateAmt = grossrateAmt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrpProductSaleMonth that = (TrpProductSaleMonth) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(statDate, that.statDate) &&
                Objects.equals(statMonth, that.statMonth) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(statYear, that.statYear) &&
                Objects.equals(saleQty, that.saleQty) &&
                Objects.equals(purAmt, that.purAmt) &&
                Objects.equals(dueAmt, that.dueAmt) &&
                Objects.equals(realAmt, that.realAmt) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(grossAmt, that.grossAmt) &&
                Objects.equals(grossrateAmt, that.grossrateAmt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, statDate, statMonth, shopId, itemId, statYear, saleQty, purAmt, dueAmt, realAmt, createUser, createTime, grossAmt, grossrateAmt);
    }
}
