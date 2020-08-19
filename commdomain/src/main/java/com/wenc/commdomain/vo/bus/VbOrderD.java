package com.wenc.commdomain.vo.bus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_order_d")
public class VbOrderD {
    private long idx;
    private String orderNo;
    private Integer seqNo;
    private String itemId;
    private String barCode;
    private String productNo;
    private String itemColor;
    private String itemSize;
    private BigDecimal orderPrice;
    private BigDecimal purPrice;
    private BigDecimal salePrice;
    private BigDecimal purTax;
    private BigDecimal saleTax;
    private BigDecimal rebate;
    private String monKind;
    private BigDecimal orderQty;
    private BigDecimal itempackNum;
    private BigDecimal cmpackNum;
    private BigDecimal purQty;
    private Byte priceSign;
    private Integer enterNo;
    private Integer chgNum;
    private BigDecimal purPriceb;
    private BigDecimal salePriceb;
    private Timestamp lastmodify;
    private short flag;
    private String itemName;
    private String itemSpec;
    private String itemUnit;
    private String itemSubno;
    private String itemSubname;
    private String itemUnitDescr;
    private String tenantId;

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
    @Column(name = "order_no", nullable = true, length = 30)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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
    @Column(name = "product_no", nullable = true, length = 20)
    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    @Basic
    @Column(name = "item_color", nullable = true, length = 3)
    public String getItemColor() {
        return itemColor;
    }

    public void setItemColor(String itemColor) {
        this.itemColor = itemColor;
    }

    @Basic
    @Column(name = "item_size", nullable = true, length = 3)
    public String getItemSize() {
        return itemSize;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
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
    @Column(name = "sale_price", nullable = true, precision = 6)
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
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
    @Column(name = "rebate", nullable = true, precision = 6)
    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    @Basic
    @Column(name = "mon_kind", nullable = true, length = 3)
    public String getMonKind() {
        return monKind;
    }

    public void setMonKind(String monKind) {
        this.monKind = monKind;
    }

    @Basic
    @Column(name = "order_qty", nullable = true, precision = 3)
    public BigDecimal getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
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
    @Column(name = "pur_qty", nullable = true, precision = 3)
    public BigDecimal getPurQty() {
        return purQty;
    }

    public void setPurQty(BigDecimal purQty) {
        this.purQty = purQty;
    }

    @Basic
    @Column(name = "price_sign", nullable = true)
    public Byte getPriceSign() {
        return priceSign;
    }

    public void setPriceSign(Byte priceSign) {
        this.priceSign = priceSign;
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
    @Column(name = "chg_num", nullable = true)
    public Integer getChgNum() {
        return chgNum;
    }

    public void setChgNum(Integer chgNum) {
        this.chgNum = chgNum;
    }

    @Basic
    @Column(name = "pur_priceb", nullable = true, precision = 6)
    public BigDecimal getPurPriceb() {
        return purPriceb;
    }

    public void setPurPriceb(BigDecimal purPriceb) {
        this.purPriceb = purPriceb;
    }

    @Basic
    @Column(name = "sale_priceb", nullable = true, precision = 6)
    public BigDecimal getSalePriceb() {
        return salePriceb;
    }

    public void setSalePriceb(BigDecimal salePriceb) {
        this.salePriceb = salePriceb;
    }

    @Basic
    @Column(name = "lastmodify", nullable = false)
    public Timestamp getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Timestamp lastmodify) {
        this.lastmodify = lastmodify;
    }

    @Basic
    @Column(name = "flag", nullable = false)
    public short getFlag() {
        return flag;
    }

    public void setFlag(short flag) {
        this.flag = flag;
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
        VbOrderD vbOrderD = (VbOrderD) o;
        return idx == vbOrderD.idx &&
                flag == vbOrderD.flag &&
                Objects.equals(orderNo, vbOrderD.orderNo) &&
                Objects.equals(seqNo, vbOrderD.seqNo) &&
                Objects.equals(itemId, vbOrderD.itemId) &&
                Objects.equals(barCode, vbOrderD.barCode) &&
                Objects.equals(productNo, vbOrderD.productNo) &&
                Objects.equals(itemColor, vbOrderD.itemColor) &&
                Objects.equals(itemSize, vbOrderD.itemSize) &&
                Objects.equals(orderPrice, vbOrderD.orderPrice) &&
                Objects.equals(purPrice, vbOrderD.purPrice) &&
                Objects.equals(salePrice, vbOrderD.salePrice) &&
                Objects.equals(purTax, vbOrderD.purTax) &&
                Objects.equals(saleTax, vbOrderD.saleTax) &&
                Objects.equals(rebate, vbOrderD.rebate) &&
                Objects.equals(monKind, vbOrderD.monKind) &&
                Objects.equals(orderQty, vbOrderD.orderQty) &&
                Objects.equals(itempackNum, vbOrderD.itempackNum) &&
                Objects.equals(cmpackNum, vbOrderD.cmpackNum) &&
                Objects.equals(purQty, vbOrderD.purQty) &&
                Objects.equals(priceSign, vbOrderD.priceSign) &&
                Objects.equals(enterNo, vbOrderD.enterNo) &&
                Objects.equals(chgNum, vbOrderD.chgNum) &&
                Objects.equals(purPriceb, vbOrderD.purPriceb) &&
                Objects.equals(salePriceb, vbOrderD.salePriceb) &&
                Objects.equals(lastmodify, vbOrderD.lastmodify) &&
                Objects.equals(itemName, vbOrderD.itemName) &&
                Objects.equals(itemSpec, vbOrderD.itemSpec) &&
                Objects.equals(itemUnit, vbOrderD.itemUnit) &&
                Objects.equals(itemSubno, vbOrderD.itemSubno) &&
                Objects.equals(itemSubname, vbOrderD.itemSubname) &&
                Objects.equals(itemUnitDescr, vbOrderD.itemUnitDescr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, orderNo, seqNo, itemId, barCode, productNo, itemColor, itemSize, orderPrice, purPrice, salePrice, purTax, saleTax, rebate, monKind, orderQty, itempackNum, cmpackNum, purQty, priceSign, enterNo, chgNum, purPriceb, salePriceb, lastmodify, flag, itemName, itemSpec, itemUnit, itemSubno, itemSubname, itemUnitDescr);
    }

    @Basic
    @Column(name = "tenant_id", nullable = true, length = 50)
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
