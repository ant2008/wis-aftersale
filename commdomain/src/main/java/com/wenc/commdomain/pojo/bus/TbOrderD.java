package com.wenc.commdomain.pojo.bus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_order_d")
public class TbOrderD {
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
    private String tenantId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbOrderD tbOrderD = (TbOrderD) o;
        return idx == tbOrderD.idx &&
                flag == tbOrderD.flag &&
                Objects.equals(orderNo, tbOrderD.orderNo) &&
                Objects.equals(seqNo, tbOrderD.seqNo) &&
                Objects.equals(itemId, tbOrderD.itemId) &&
                Objects.equals(barCode, tbOrderD.barCode) &&
                Objects.equals(productNo, tbOrderD.productNo) &&
                Objects.equals(itemColor, tbOrderD.itemColor) &&
                Objects.equals(itemSize, tbOrderD.itemSize) &&
                Objects.equals(orderPrice, tbOrderD.orderPrice) &&
                Objects.equals(purPrice, tbOrderD.purPrice) &&
                Objects.equals(salePrice, tbOrderD.salePrice) &&
                Objects.equals(purTax, tbOrderD.purTax) &&
                Objects.equals(saleTax, tbOrderD.saleTax) &&
                Objects.equals(rebate, tbOrderD.rebate) &&
                Objects.equals(monKind, tbOrderD.monKind) &&
                Objects.equals(orderQty, tbOrderD.orderQty) &&
                Objects.equals(itempackNum, tbOrderD.itempackNum) &&
                Objects.equals(cmpackNum, tbOrderD.cmpackNum) &&
                Objects.equals(purQty, tbOrderD.purQty) &&
                Objects.equals(priceSign, tbOrderD.priceSign) &&
                Objects.equals(enterNo, tbOrderD.enterNo) &&
                Objects.equals(chgNum, tbOrderD.chgNum) &&
                Objects.equals(purPriceb, tbOrderD.purPriceb) &&
                Objects.equals(salePriceb, tbOrderD.salePriceb) &&
                Objects.equals(lastmodify, tbOrderD.lastmodify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, orderNo, seqNo, itemId, barCode, productNo, itemColor, itemSize, orderPrice, purPrice, salePrice, purTax, saleTax, rebate, monKind, orderQty, itempackNum, cmpackNum, purQty, priceSign, enterNo, chgNum, purPriceb, salePriceb, lastmodify, flag);
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
