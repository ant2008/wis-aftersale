package com.wenc.commdomain.vo.bus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_receive_d")
public class VbReceiveD {
    private long idx;
    private String tenantId;
    private String receiveNo;
    private Integer enterNo;
    private String itemId;
    private String barCode;
    private String shipNo;
    private String shelf;
    private BigDecimal orderPrice;
    private BigDecimal purPrice;
    private BigDecimal purTax;
    private BigDecimal purQty;
    private BigDecimal salePrice;
    private BigDecimal saleTax;
    private Timestamp overdueDate;
    private BigDecimal rebate;
    private BigDecimal tariff;
    private BigDecimal rate;
    private BigDecimal othRate1;
    private BigDecimal othRate2;
    private String notes;
    private Short flag;
    private BigDecimal itempackNum;
    private BigDecimal cmpackNum;
    private Timestamp makeTime;
    private String itemName;
    private String itemSpec;
    private String itemUnit;
    private String itemSubno;
    private String itemSubname;
    private String itemUnitDescr;
    private BigDecimal taxRate;
    private BigDecimal taxAmt;
    private BigDecimal attaxPrice;
    private BigDecimal attaxAmt;
    private BigDecimal saleAmt;
    private BigDecimal purAmt;

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
    @Column(name = "receive_no", nullable = true, length = 12)
    public String getReceiveNo() {
        return receiveNo;
    }

    public void setReceiveNo(String receiveNo) {
        this.receiveNo = receiveNo;
    }

    @Basic
    @Column(name = "enter_no", nullable = true)
    public Integer getEnterNo() {
        return enterNo;
    }

    public void setEnterNo(Integer enterNo) {
        this.enterNo = enterNo;
    }

    @Basic
    @Column(name = "item_id", nullable = false, length = 13)
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
    @Column(name = "shelf", nullable = true, length = 18)
    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @Basic
    @Column(name = "order_price", nullable = true, precision = 6)
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
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
    @Column(name = "pur_tax", nullable = true, precision = 2)
    public BigDecimal getPurTax() {
        return purTax;
    }

    public void setPurTax(BigDecimal purTax) {
        this.purTax = purTax;
    }

    @Basic
    @Column(name = "pur_qty", nullable = true, precision = 3)
    public BigDecimal getPurQty() {
        return purQty;
    }

    public void setPurQty(BigDecimal purQty) {
        this.purQty = purQty;
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
    @Column(name = "sale_tax", nullable = true, precision = 2)
    public BigDecimal getSaleTax() {
        return saleTax;
    }

    public void setSaleTax(BigDecimal saleTax) {
        this.saleTax = saleTax;
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
    @Column(name = "rebate", nullable = true, precision = 6)
    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    @Basic
    @Column(name = "tariff", nullable = true, precision = 6)
    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    @Basic
    @Column(name = "rate", nullable = true, precision = 6)
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "oth_rate1", nullable = true, precision = 6)
    public BigDecimal getOthRate1() {
        return othRate1;
    }

    public void setOthRate1(BigDecimal othRate1) {
        this.othRate1 = othRate1;
    }

    @Basic
    @Column(name = "oth_rate2", nullable = true, precision = 6)
    public BigDecimal getOthRate2() {
        return othRate2;
    }

    public void setOthRate2(BigDecimal othRate2) {
        this.othRate2 = othRate2;
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
    @Column(name = "itempack_num", nullable = true, precision = 3)
    public BigDecimal getItempackNum() {
        return itempackNum;
    }

    public void setItempackNum(BigDecimal itempackNum) {
        this.itempackNum = itempackNum;
    }

    @Basic
    @Column(name = "cmpack_num", nullable = true, precision = 3)
    public BigDecimal getCmpackNum() {
        return cmpackNum;
    }

    public void setCmpackNum(BigDecimal cmpackNum) {
        this.cmpackNum = cmpackNum;
    }

    @Basic
    @Column(name = "make_time", nullable = true)
    public Timestamp getMakeTime() {
        return makeTime;
    }

    public void setMakeTime(Timestamp makeTime) {
        this.makeTime = makeTime;
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
    @Column(name = "item_unit_descr", nullable = true, length = 50)
    public String getItemUnitDescr() {
        return itemUnitDescr;
    }

    public void setItemUnitDescr(String itemUnitDescr) {
        this.itemUnitDescr = itemUnitDescr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbReceiveD that = (VbReceiveD) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(receiveNo, that.receiveNo) &&
                Objects.equals(enterNo, that.enterNo) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(barCode, that.barCode) &&
                Objects.equals(shipNo, that.shipNo) &&
                Objects.equals(shelf, that.shelf) &&
                Objects.equals(orderPrice, that.orderPrice) &&
                Objects.equals(purPrice, that.purPrice) &&
                Objects.equals(purTax, that.purTax) &&
                Objects.equals(purQty, that.purQty) &&
                Objects.equals(salePrice, that.salePrice) &&
                Objects.equals(saleTax, that.saleTax) &&
                Objects.equals(overdueDate, that.overdueDate) &&
                Objects.equals(rebate, that.rebate) &&
                Objects.equals(tariff, that.tariff) &&
                Objects.equals(rate, that.rate) &&
                Objects.equals(othRate1, that.othRate1) &&
                Objects.equals(othRate2, that.othRate2) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(flag, that.flag) &&
                Objects.equals(itempackNum, that.itempackNum) &&
                Objects.equals(cmpackNum, that.cmpackNum) &&
                Objects.equals(makeTime, that.makeTime) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemSpec, that.itemSpec) &&
                Objects.equals(itemUnit, that.itemUnit) &&
                Objects.equals(itemSubno, that.itemSubno) &&
                Objects.equals(itemSubname, that.itemSubname) &&
                Objects.equals(itemUnitDescr, that.itemUnitDescr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, receiveNo, enterNo, itemId, barCode, shipNo, shelf, orderPrice, purPrice, purTax, purQty, salePrice, saleTax, overdueDate, rebate, tariff, rate, othRate1, othRate2, notes, flag, itempackNum, cmpackNum, makeTime, itemName, itemSpec, itemUnit, itemSubno, itemSubname, itemUnitDescr);
    }

    @Basic
    @Column(name = "tax_rate", nullable = true, precision = 3)
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    @Basic
    @Column(name = "tax_amt", nullable = true, precision = 6)
    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
    }

    @Basic
    @Column(name = "attax_price", nullable = true, precision = 6)
    public BigDecimal getAttaxPrice() {
        return attaxPrice;
    }

    public void setAttaxPrice(BigDecimal attaxPrice) {
        this.attaxPrice = attaxPrice;
    }

    @Basic
    @Column(name = "attax_amt", nullable = true, precision = 6)
    public BigDecimal getAttaxAmt() {
        return attaxAmt;
    }

    public void setAttaxAmt(BigDecimal attaxAmt) {
        this.attaxAmt = attaxAmt;
    }

    @Basic
    @Column(name = "sale_amt", nullable = true, precision = 6)
    public BigDecimal getSaleAmt() {
        return saleAmt;
    }

    public void setSaleAmt(BigDecimal saleAmt) {
        this.saleAmt = saleAmt;
    }

    @Basic
    @Column(name = "pur_amt", nullable = true, precision = 6)
    public BigDecimal getPurAmt() {
        return purAmt;
    }

    public void setPurAmt(BigDecimal purAmt) {
        this.purAmt = purAmt;
    }
}
