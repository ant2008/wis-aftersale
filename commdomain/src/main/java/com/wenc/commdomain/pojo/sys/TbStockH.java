package com.wenc.commdomain.pojo.sys;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_stock_h")
public class TbStockH {
    private long idx;
    private String tenantId;
    private String depotId;
    private String itemId;
    private String barCode;
    private BigDecimal itemQty;
    private BigDecimal residueQty;
    private BigDecimal curitemQty;
    private BigDecimal discount;
    private String itemType;
    private String countType;
    private BigDecimal safeQty;
    private BigDecimal overQty;
    private Short safeDay;
    private Short overDay;
    private BigDecimal outQty;
    private BigDecimal inQty;
    private BigDecimal salePrice;
    private BigDecimal minPrice;
    private BigDecimal purPrice;
    private BigDecimal avgPurprice;
    private BigDecimal avgItemqty;
    private BigDecimal pursumAmt;
    private BigDecimal salesumAmt;
    private Byte state;
    private Short flag;
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
    @Column(name = "depot_id", nullable = true, length = 15)
    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    @Basic
    @Column(name = "item_id", nullable = true, length = 13)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "bar_code", nullable = true, length = 13)
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Basic
    @Column(name = "item_qty", nullable = true, precision = 3)
    public BigDecimal getItemQty() {
        return itemQty;
    }

    public void setItemQty(BigDecimal itemQty) {
        this.itemQty = itemQty;
    }

    @Basic
    @Column(name = "residue_qty", nullable = true, precision = 3)
    public BigDecimal getResidueQty() {
        return residueQty;
    }

    public void setResidueQty(BigDecimal residueQty) {
        this.residueQty = residueQty;
    }

    @Basic
    @Column(name = "curitem_qty", nullable = true, precision = 3)
    public BigDecimal getCuritemQty() {
        return curitemQty;
    }

    public void setCuritemQty(BigDecimal curitemQty) {
        this.curitemQty = curitemQty;
    }

    @Basic
    @Column(name = "discount", nullable = true, precision = 2)
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "item_type", nullable = true, length = 3)
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Basic
    @Column(name = "count_type", nullable = true, length = 3)
    public String getCountType() {
        return countType;
    }

    public void setCountType(String countType) {
        this.countType = countType;
    }

    @Basic
    @Column(name = "safe_qty", nullable = true, precision = 3)
    public BigDecimal getSafeQty() {
        return safeQty;
    }

    public void setSafeQty(BigDecimal safeQty) {
        this.safeQty = safeQty;
    }

    @Basic
    @Column(name = "over_qty", nullable = true, precision = 3)
    public BigDecimal getOverQty() {
        return overQty;
    }

    public void setOverQty(BigDecimal overQty) {
        this.overQty = overQty;
    }

    @Basic
    @Column(name = "safe_day", nullable = true)
    public Short getSafeDay() {
        return safeDay;
    }

    public void setSafeDay(Short safeDay) {
        this.safeDay = safeDay;
    }

    @Basic
    @Column(name = "over_day", nullable = true)
    public Short getOverDay() {
        return overDay;
    }

    public void setOverDay(Short overDay) {
        this.overDay = overDay;
    }

    @Basic
    @Column(name = "out_qty", nullable = true, precision = 3)
    public BigDecimal getOutQty() {
        return outQty;
    }

    public void setOutQty(BigDecimal outQty) {
        this.outQty = outQty;
    }

    @Basic
    @Column(name = "in_qty", nullable = true, precision = 3)
    public BigDecimal getInQty() {
        return inQty;
    }

    public void setInQty(BigDecimal inQty) {
        this.inQty = inQty;
    }

    @Basic
    @Column(name = "sale_price", nullable = true, precision = 6)
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    @Basic
    @Column(name = "min_price", nullable = true, precision = 6)
    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    @Basic
    @Column(name = "pur_price", nullable = true, precision = 6)
    public BigDecimal getPurPrice() {
        return purPrice;
    }

    public void setPurPrice(BigDecimal purPrice) {
        this.purPrice = purPrice;
    }

    @Basic
    @Column(name = "avg_purprice", nullable = true, precision = 6)
    public BigDecimal getAvgPurprice() {
        return avgPurprice;
    }

    public void setAvgPurprice(BigDecimal avgPurprice) {
        this.avgPurprice = avgPurprice;
    }

    @Basic
    @Column(name = "avg_itemqty", nullable = true, precision = 3)
    public BigDecimal getAvgItemqty() {
        return avgItemqty;
    }

    public void setAvgItemqty(BigDecimal avgItemqty) {
        this.avgItemqty = avgItemqty;
    }

    @Basic
    @Column(name = "pursum_amt", nullable = true, precision = 6)
    public BigDecimal getPursumAmt() {
        return pursumAmt;
    }

    public void setPursumAmt(BigDecimal pursumAmt) {
        this.pursumAmt = pursumAmt;
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
    @Column(name = "state", nullable = true)
    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    @Basic
    @Column(name = "flag", nullable = true)
    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbStockH tbStockH = (TbStockH) o;
        return idx == tbStockH.idx &&
                Objects.equals(tenantId, tbStockH.tenantId) &&
                Objects.equals(depotId, tbStockH.depotId) &&
                Objects.equals(itemId, tbStockH.itemId) &&
                Objects.equals(barCode, tbStockH.barCode) &&
                Objects.equals(itemQty, tbStockH.itemQty) &&
                Objects.equals(residueQty, tbStockH.residueQty) &&
                Objects.equals(curitemQty, tbStockH.curitemQty) &&
                Objects.equals(discount, tbStockH.discount) &&
                Objects.equals(itemType, tbStockH.itemType) &&
                Objects.equals(countType, tbStockH.countType) &&
                Objects.equals(safeQty, tbStockH.safeQty) &&
                Objects.equals(overQty, tbStockH.overQty) &&
                Objects.equals(safeDay, tbStockH.safeDay) &&
                Objects.equals(overDay, tbStockH.overDay) &&
                Objects.equals(outQty, tbStockH.outQty) &&
                Objects.equals(inQty, tbStockH.inQty) &&
                Objects.equals(salePrice, tbStockH.salePrice) &&
                Objects.equals(minPrice, tbStockH.minPrice) &&
                Objects.equals(purPrice, tbStockH.purPrice) &&
                Objects.equals(avgPurprice, tbStockH.avgPurprice) &&
                Objects.equals(avgItemqty, tbStockH.avgItemqty) &&
                Objects.equals(pursumAmt, tbStockH.pursumAmt) &&
                Objects.equals(salesumAmt, tbStockH.salesumAmt) &&
                Objects.equals(state, tbStockH.state) &&
                Objects.equals(flag, tbStockH.flag) &&
                Objects.equals(createUser, tbStockH.createUser) &&
                Objects.equals(createTime, tbStockH.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, depotId, itemId, barCode, itemQty, residueQty, curitemQty, discount, itemType, countType, safeQty, overQty, safeDay, overDay, outQty, inQty, salePrice, minPrice, purPrice, avgPurprice, avgItemqty, pursumAmt, salesumAmt, state, flag, createUser, createTime);
    }
}
