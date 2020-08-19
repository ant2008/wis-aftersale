package com.wenc.commdomain.pojo.bus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_return_d")
public class TbReturnD {
    private long idx;
    private String tenantId;
    private String returnNo;
    private Integer seqNo;
    private String itemId;
    private String barCode;
    private String shipNo;
    private String batchNo;
    private String shelf;
    private BigDecimal retQty;
    private BigDecimal residueQty;
    private BigDecimal purPrice;
    private String payeeType;
    private BigDecimal purTax;
    private BigDecimal saleTax;
    private BigDecimal salePrice;
    private String notes;
    private Short flag;
    private Timestamp overdueDate;

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
    @Column(name = "return_no", nullable = true, length = 20)
    public String getReturnNo() {
        return returnNo;
    }

    public void setReturnNo(String returnNo) {
        this.returnNo = returnNo;
    }

    @Basic
    @Column(name = "seq_no", nullable = true)
    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
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
    @Column(name = "ship_no", nullable = true, length = 15)
    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    @Basic
    @Column(name = "batch_no", nullable = true, length = 15)
    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
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
    @Column(name = "ret_qty", nullable = true, precision = 3)
    public BigDecimal getRetQty() {
        return retQty;
    }

    public void setRetQty(BigDecimal retQty) {
        this.retQty = retQty;
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
    @Column(name = "pur_price", nullable = true, precision = 6)
    public BigDecimal getPurPrice() {
        return purPrice;
    }

    public void setPurPrice(BigDecimal purPrice) {
        this.purPrice = purPrice;
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
    @Column(name = "pur_tax", nullable = true, precision = 2)
    public BigDecimal getPurTax() {
        return purTax;
    }

    public void setPurTax(BigDecimal purTax) {
        this.purTax = purTax;
    }

    @Basic
    @Column(name = "sale_tax", nullable = true, precision = 2)
    public BigDecimal getSaleTax() {
        return saleTax;
    }

    public void setSaleTax(BigDecimal saleTax) {
        this.saleTax = saleTax;
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
    @Column(name = "notes", nullable = true, length = 60)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
    @Column(name = "overdue_date", nullable = true)
    public Timestamp getOverdueDate() {
        return overdueDate;
    }

    public void setOverdueDate(Timestamp overdueDate) {
        this.overdueDate = overdueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbReturnD tbReturnD = (TbReturnD) o;
        return idx == tbReturnD.idx &&
                Objects.equals(tenantId, tbReturnD.tenantId) &&
                Objects.equals(returnNo, tbReturnD.returnNo) &&
                Objects.equals(seqNo, tbReturnD.seqNo) &&
                Objects.equals(itemId, tbReturnD.itemId) &&
                Objects.equals(barCode, tbReturnD.barCode) &&
                Objects.equals(shipNo, tbReturnD.shipNo) &&
                Objects.equals(batchNo, tbReturnD.batchNo) &&
                Objects.equals(shelf, tbReturnD.shelf) &&
                Objects.equals(retQty, tbReturnD.retQty) &&
                Objects.equals(residueQty, tbReturnD.residueQty) &&
                Objects.equals(purPrice, tbReturnD.purPrice) &&
                Objects.equals(payeeType, tbReturnD.payeeType) &&
                Objects.equals(purTax, tbReturnD.purTax) &&
                Objects.equals(saleTax, tbReturnD.saleTax) &&
                Objects.equals(salePrice, tbReturnD.salePrice) &&
                Objects.equals(notes, tbReturnD.notes) &&
                Objects.equals(flag, tbReturnD.flag) &&
                Objects.equals(overdueDate, tbReturnD.overdueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, returnNo, seqNo, itemId, barCode, shipNo, batchNo, shelf, retQty, residueQty, purPrice, payeeType, purTax, saleTax, salePrice, notes, flag, overdueDate);
    }
}
