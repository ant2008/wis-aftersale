package com.wenc.commdomain.vo.matdata;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_stock_d")
public class VbStockD {
    private long idx;
    private String tenantId;
    private String depotId;
    private String itemId;
    private String barCode;
    private String shipNo;
    private String billCode;
    private BigDecimal itemQty;
    private BigDecimal residueQty;
    private BigDecimal curitemQty;
    private String shelf;
    private BigDecimal salePrice;
    private BigDecimal minPrice;
    private BigDecimal allocPrice;
    private BigDecimal purPrice;
    private BigDecimal discount;
    private BigDecimal purTax;
    private BigDecimal pursumAmt;
    private BigDecimal salesumAmt;
    private String buyerId;
    private String vendorId;
    private String payeeType;
    private Timestamp receiveDate;
    private Timestamp overdueDate;
    private Short flag;
    private String createUser;
    private Timestamp createTime;
    private String batchNo;
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
    @Column(name = "ship_no", nullable = true, length = 30)
    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    @Basic
    @Column(name = "bill_code", nullable = true, length = 6)
    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
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
    @Column(name = "shelf", nullable = true, length = 18)
    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
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
    @Column(name = "alloc_price", nullable = true, precision = 6)
    public BigDecimal getAllocPrice() {
        return allocPrice;
    }

    public void setAllocPrice(BigDecimal allocPrice) {
        this.allocPrice = allocPrice;
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
    @Column(name = "discount", nullable = true, precision = 2)
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "pur_tax", nullable = true, precision = 2)
    public BigDecimal getPurTax() {
        return purTax;
    }

    public void setPurTax(BigDecimal purTax) {
        this.purTax = purTax;
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
    @Column(name = "buyer_id", nullable = true, length = 8)
    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    @Basic
    @Column(name = "vendor_id", nullable = true, length = 13)
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Basic
    @Column(name = "payee_type", nullable = true, length = 3)
    public String getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(String payeeType) {
        this.payeeType = payeeType;
    }

    @Basic
    @Column(name = "receive_date", nullable = true)
    public Timestamp getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Timestamp receiveDate) {
        this.receiveDate = receiveDate;
    }

    @Basic
    @Column(name = "overdue_date", nullable = true)
    public Timestamp getOverdueDate() {
        return overdueDate;
    }

    public void setOverdueDate(Timestamp overdueDate) {
        this.overdueDate = overdueDate;
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
    @Column(name = "batch_no", nullable = false, length = 30)
    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
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
        VbStockD vbStockD = (VbStockD) o;
        return idx == vbStockD.idx &&
                Objects.equals(tenantId, vbStockD.tenantId) &&
                Objects.equals(depotId, vbStockD.depotId) &&
                Objects.equals(itemId, vbStockD.itemId) &&
                Objects.equals(barCode, vbStockD.barCode) &&
                Objects.equals(shipNo, vbStockD.shipNo) &&
                Objects.equals(billCode, vbStockD.billCode) &&
                Objects.equals(itemQty, vbStockD.itemQty) &&
                Objects.equals(residueQty, vbStockD.residueQty) &&
                Objects.equals(curitemQty, vbStockD.curitemQty) &&
                Objects.equals(shelf, vbStockD.shelf) &&
                Objects.equals(salePrice, vbStockD.salePrice) &&
                Objects.equals(minPrice, vbStockD.minPrice) &&
                Objects.equals(allocPrice, vbStockD.allocPrice) &&
                Objects.equals(purPrice, vbStockD.purPrice) &&
                Objects.equals(discount, vbStockD.discount) &&
                Objects.equals(purTax, vbStockD.purTax) &&
                Objects.equals(pursumAmt, vbStockD.pursumAmt) &&
                Objects.equals(salesumAmt, vbStockD.salesumAmt) &&
                Objects.equals(buyerId, vbStockD.buyerId) &&
                Objects.equals(vendorId, vbStockD.vendorId) &&
                Objects.equals(payeeType, vbStockD.payeeType) &&
                Objects.equals(receiveDate, vbStockD.receiveDate) &&
                Objects.equals(overdueDate, vbStockD.overdueDate) &&
                Objects.equals(flag, vbStockD.flag) &&
                Objects.equals(createUser, vbStockD.createUser) &&
                Objects.equals(createTime, vbStockD.createTime) &&
                Objects.equals(batchNo, vbStockD.batchNo) &&
                Objects.equals(itemName, vbStockD.itemName) &&
                Objects.equals(itemUnit, vbStockD.itemUnit) &&
                Objects.equals(prdOrigin, vbStockD.prdOrigin) &&
                Objects.equals(prdFactory, vbStockD.prdFactory) &&
                Objects.equals(classCode, vbStockD.classCode) &&
                Objects.equals(classCode1, vbStockD.classCode1) &&
                Objects.equals(classCode2, vbStockD.classCode2) &&
                Objects.equals(specClass, vbStockD.specClass) &&
                Objects.equals(itemSpec, vbStockD.itemSpec) &&
                Objects.equals(itemSubno, vbStockD.itemSubno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, depotId, itemId, barCode, shipNo, billCode, itemQty, residueQty,
                curitemQty, shelf, salePrice, minPrice, allocPrice, purPrice, discount, purTax, pursumAmt, salesumAmt
                , buyerId, vendorId, payeeType, receiveDate, overdueDate, flag, createUser, createTime, batchNo, itemName, itemUnit, prdOrigin, prdFactory, classCode, classCode1, classCode2, specClass, itemSpec, itemSubno);
    }
}
