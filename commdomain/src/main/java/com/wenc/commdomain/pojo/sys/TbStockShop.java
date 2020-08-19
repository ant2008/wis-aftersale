package com.wenc.commdomain.pojo.sys;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_stock_shop")
public class TbStockShop {
    private long idx;
    private String tenantId;
    private String depotId;
    private String itemId;
    private String barCode;
    private String shipNo;
    private String billType;
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
    private BigDecimal purSumamt;
    private BigDecimal saleSumamt;
    private String buyerId;
    private String vendorId;
    private String payeeType;
    private Timestamp receiveDate;
    private Timestamp overdueDate;
    private Short flag;
    private String createUser;
    private Timestamp createTime;
    private String batchNo;
    private String billNo;

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
    @Column(name = "bill_type", nullable = true, length = 6)
    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
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
    @Column(name = "pur_sumamt", nullable = true, precision = 6)
    public BigDecimal getPurSumamt() {
        return purSumamt;
    }

    public void setPurSumamt(BigDecimal purSumamt) {
        this.purSumamt = purSumamt;
    }

    @Basic
    @Column(name = "sale_sumamt", nullable = true, precision = 6)
    public BigDecimal getSaleSumamt() {
        return saleSumamt;
    }

    public void setSaleSumamt(BigDecimal saleSumamt) {
        this.saleSumamt = saleSumamt;
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
    @Column(name = "batch_no", nullable = true, length = 30)
    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    @Basic
    @Column(name = "bill_no", nullable = false, length = 18)
    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbStockShop that = (TbStockShop) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(depotId, that.depotId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(barCode, that.barCode) &&
                Objects.equals(shipNo, that.shipNo) &&
                Objects.equals(billType, that.billType) &&
                Objects.equals(itemQty, that.itemQty) &&
                Objects.equals(residueQty, that.residueQty) &&
                Objects.equals(curitemQty, that.curitemQty) &&
                Objects.equals(shelf, that.shelf) &&
                Objects.equals(salePrice, that.salePrice) &&
                Objects.equals(minPrice, that.minPrice) &&
                Objects.equals(allocPrice, that.allocPrice) &&
                Objects.equals(purPrice, that.purPrice) &&
                Objects.equals(discount, that.discount) &&
                Objects.equals(purTax, that.purTax) &&
                Objects.equals(purSumamt, that.purSumamt) &&
                Objects.equals(saleSumamt, that.saleSumamt) &&
                Objects.equals(buyerId, that.buyerId) &&
                Objects.equals(vendorId, that.vendorId) &&
                Objects.equals(payeeType, that.payeeType) &&
                Objects.equals(receiveDate, that.receiveDate) &&
                Objects.equals(overdueDate, that.overdueDate) &&
                Objects.equals(flag, that.flag) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(batchNo, that.batchNo) &&
                Objects.equals(billNo, that.billNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, depotId, itemId, barCode, shipNo, billType, itemQty, residueQty,
                curitemQty, shelf, salePrice, minPrice, allocPrice, purPrice, discount, purTax, purSumamt, saleSumamt, buyerId, vendorId, payeeType, receiveDate, overdueDate, flag, createUser, createTime, batchNo, billNo);
    }
}
