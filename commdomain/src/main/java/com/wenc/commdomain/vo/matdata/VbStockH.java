package com.wenc.commdomain.vo.matdata;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_stock_h")
public class VbStockH {
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
    private String itemName;
    private String itemUnit;
    private String prdOrigin;
    private String prdFactory;
    private String classCode;
    private String classCode1;
    private String classCode2;
    private String specClass;
    private String itemSpec;
    private String itemSubno;

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

    @Basic
    @Column(name = "item_name", nullable = true, length = 100)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "item_unit", nullable = true, length = 3)
    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    @Basic
    @Column(name = "prd_origin", nullable = true, length = 20)
    public String getPrdOrigin() {
        return prdOrigin;
    }

    public void setPrdOrigin(String prdOrigin) {
        this.prdOrigin = prdOrigin;
    }

    @Basic
    @Column(name = "prd_factory", nullable = true, length = 60)
    public String getPrdFactory() {
        return prdFactory;
    }

    public void setPrdFactory(String prdFactory) {
        this.prdFactory = prdFactory;
    }

    @Basic
    @Column(name = "class_code", nullable = true, length = 8)
    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @Basic
    @Column(name = "class_code1", nullable = true, length = 20)
    public String getClassCode1() {
        return classCode1;
    }

    public void setClassCode1(String classCode1) {
        this.classCode1 = classCode1;
    }

    @Basic
    @Column(name = "class_code2", nullable = true, length = 20)
    public String getClassCode2() {
        return classCode2;
    }

    public void setClassCode2(String classCode2) {
        this.classCode2 = classCode2;
    }

    @Basic
    @Column(name = "spec_class", nullable = true, length = 20)
    public String getSpecClass() {
        return specClass;
    }

    public void setSpecClass(String specClass) {
        this.specClass = specClass;
    }

    @Basic
    @Column(name = "item_spec", nullable = true, length = 80)
    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    @Basic
    @Column(name = "item_subno", nullable = true, length = 10)
    public String getItemSubno() {
        return itemSubno;
    }

    public void setItemSubno(String itemSubno) {
        this.itemSubno = itemSubno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbStockH vbStockH = (VbStockH) o;
        return idx == vbStockH.idx &&
                Objects.equals(tenantId, vbStockH.tenantId) &&
                Objects.equals(depotId, vbStockH.depotId) &&
                Objects.equals(itemId, vbStockH.itemId) &&
                Objects.equals(barCode, vbStockH.barCode) &&
                Objects.equals(itemQty, vbStockH.itemQty) &&
                Objects.equals(residueQty, vbStockH.residueQty) &&
                Objects.equals(curitemQty, vbStockH.curitemQty) &&
                Objects.equals(discount, vbStockH.discount) &&
                Objects.equals(itemType, vbStockH.itemType) &&
                Objects.equals(countType, vbStockH.countType) &&
                Objects.equals(safeQty, vbStockH.safeQty) &&
                Objects.equals(overQty, vbStockH.overQty) &&
                Objects.equals(safeDay, vbStockH.safeDay) &&
                Objects.equals(overDay, vbStockH.overDay) &&
                Objects.equals(outQty, vbStockH.outQty) &&
                Objects.equals(inQty, vbStockH.inQty) &&
                Objects.equals(salePrice, vbStockH.salePrice) &&
                Objects.equals(minPrice, vbStockH.minPrice) &&
                Objects.equals(purPrice, vbStockH.purPrice) &&
                Objects.equals(avgPurprice, vbStockH.avgPurprice) &&
                Objects.equals(avgItemqty, vbStockH.avgItemqty) &&
                Objects.equals(pursumAmt, vbStockH.pursumAmt) &&
                Objects.equals(salesumAmt, vbStockH.salesumAmt) &&
                Objects.equals(state, vbStockH.state) &&
                Objects.equals(flag, vbStockH.flag) &&
                Objects.equals(createUser, vbStockH.createUser) &&
                Objects.equals(createTime, vbStockH.createTime) &&
                Objects.equals(itemName, vbStockH.itemName) &&
                Objects.equals(itemUnit, vbStockH.itemUnit) &&
                Objects.equals(prdOrigin, vbStockH.prdOrigin) &&
                Objects.equals(prdFactory, vbStockH.prdFactory) &&
                Objects.equals(classCode, vbStockH.classCode) &&
                Objects.equals(classCode1, vbStockH.classCode1) &&
                Objects.equals(classCode2, vbStockH.classCode2) &&
                Objects.equals(specClass, vbStockH.specClass) &&
                Objects.equals(itemSpec, vbStockH.itemSpec) &&
                Objects.equals(itemSubno, vbStockH.itemSubno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, depotId, itemId, barCode, itemQty, residueQty, curitemQty, discount,
                itemType, countType, safeQty, overQty, safeDay, overDay, outQty, inQty, salePrice, minPrice, purPrice
                , avgPurprice, avgItemqty, pursumAmt, salesumAmt, state, flag, createUser, createTime, itemName, itemUnit, prdOrigin, prdFactory, classCode, classCode1, classCode2, specClass, itemSpec, itemSubno);
    }
}
