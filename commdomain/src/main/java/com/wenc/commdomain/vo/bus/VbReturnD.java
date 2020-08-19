package com.wenc.commdomain.vo.bus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_return_d")
public class VbReturnD {
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
    private String itemName;
    private String itemSpec;
    private String itemUnit;
    private String itemSubno;
    private String itemSubname;
    private String prdOrigin;
    private String prdFactory;

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

    @Basic
    @Column(name = "item_name", nullable = true, length = 100)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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
    @Column(name = "item_unit", nullable = true, length = 3)
    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    @Basic
    @Column(name = "item_subno", nullable = true, length = 10)
    public String getItemSubno() {
        return itemSubno;
    }

    public void setItemSubno(String itemSubno) {
        this.itemSubno = itemSubno;
    }

    @Basic
    @Column(name = "item_subname", nullable = true, length = 60)
    public String getItemSubname() {
        return itemSubname;
    }

    public void setItemSubname(String itemSubname) {
        this.itemSubname = itemSubname;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbReturnD vbReturnD = (VbReturnD) o;
        return idx == vbReturnD.idx &&
                Objects.equals(tenantId, vbReturnD.tenantId) &&
                Objects.equals(returnNo, vbReturnD.returnNo) &&
                Objects.equals(seqNo, vbReturnD.seqNo) &&
                Objects.equals(itemId, vbReturnD.itemId) &&
                Objects.equals(barCode, vbReturnD.barCode) &&
                Objects.equals(shipNo, vbReturnD.shipNo) &&
                Objects.equals(batchNo, vbReturnD.batchNo) &&
                Objects.equals(shelf, vbReturnD.shelf) &&
                Objects.equals(retQty, vbReturnD.retQty) &&
                Objects.equals(residueQty, vbReturnD.residueQty) &&
                Objects.equals(purPrice, vbReturnD.purPrice) &&
                Objects.equals(payeeType, vbReturnD.payeeType) &&
                Objects.equals(purTax, vbReturnD.purTax) &&
                Objects.equals(saleTax, vbReturnD.saleTax) &&
                Objects.equals(salePrice, vbReturnD.salePrice) &&
                Objects.equals(notes, vbReturnD.notes) &&
                Objects.equals(flag, vbReturnD.flag) &&
                Objects.equals(overdueDate, vbReturnD.overdueDate) &&
                Objects.equals(itemName, vbReturnD.itemName) &&
                Objects.equals(itemSpec, vbReturnD.itemSpec) &&
                Objects.equals(itemUnit, vbReturnD.itemUnit) &&
                Objects.equals(itemSubno, vbReturnD.itemSubno) &&
                Objects.equals(itemSubname, vbReturnD.itemSubname) &&
                Objects.equals(prdOrigin, vbReturnD.prdOrigin) &&
                Objects.equals(prdFactory, vbReturnD.prdFactory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, returnNo, seqNo, itemId, barCode, shipNo, batchNo, shelf, retQty,
                residueQty, purPrice, payeeType, purTax, saleTax, salePrice, notes, flag, overdueDate, itemName, itemSpec, itemUnit, itemSubno, itemSubname, prdOrigin, prdFactory);
    }
}
