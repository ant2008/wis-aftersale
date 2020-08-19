package com.wenc.commdomain.pojo.sys;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_stock_d")
public class TbStockD {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbStockD tbStockD = (TbStockD) o;
        return idx == tbStockD.idx &&
                Objects.equals(tenantId, tbStockD.tenantId) &&
                Objects.equals(depotId, tbStockD.depotId) &&
                Objects.equals(itemId, tbStockD.itemId) &&
                Objects.equals(barCode, tbStockD.barCode) &&
                Objects.equals(shipNo, tbStockD.shipNo) &&
                Objects.equals(billCode, tbStockD.billCode) &&
                Objects.equals(itemQty, tbStockD.itemQty) &&
                Objects.equals(residueQty, tbStockD.residueQty) &&
                Objects.equals(curitemQty, tbStockD.curitemQty) &&
                Objects.equals(shelf, tbStockD.shelf) &&
                Objects.equals(salePrice, tbStockD.salePrice) &&
                Objects.equals(minPrice, tbStockD.minPrice) &&
                Objects.equals(allocPrice, tbStockD.allocPrice) &&
                Objects.equals(purPrice, tbStockD.purPrice) &&
                Objects.equals(discount, tbStockD.discount) &&
                Objects.equals(purTax, tbStockD.purTax) &&
                Objects.equals(pursumAmt, tbStockD.pursumAmt) &&
                Objects.equals(salesumAmt, tbStockD.salesumAmt) &&
                Objects.equals(buyerId, tbStockD.buyerId) &&
                Objects.equals(vendorId, tbStockD.vendorId) &&
                Objects.equals(payeeType, tbStockD.payeeType) &&
                Objects.equals(receiveDate, tbStockD.receiveDate) &&
                Objects.equals(overdueDate, tbStockD.overdueDate) &&
                Objects.equals(flag, tbStockD.flag) &&
                Objects.equals(createUser, tbStockD.createUser) &&
                Objects.equals(createTime, tbStockD.createTime) &&
                Objects.equals(batchNo, tbStockD.batchNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, depotId, itemId, barCode, shipNo, billCode, itemQty, residueQty,
                curitemQty, shelf, salePrice, minPrice, allocPrice, purPrice, discount, purTax, pursumAmt, salesumAmt, buyerId, vendorId, payeeType, receiveDate, overdueDate, flag, createUser, createTime, batchNo);
    }
}
