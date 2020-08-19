package com.wenc.commdomain.vo.dsb;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "vb_distribute_order_d")
public class VbDistributeOrderD {
    private long idx;
    private String tenantId;
    private String distrbuteOrderNo;
    private String itemId;
    private String barCode;
    private String ecCode;
    private BigDecimal orderQty;
    private BigDecimal realQty;
    private BigDecimal orderPrice;
    private BigDecimal purPrice;
    private BigDecimal salePrice;
    private BigDecimal memPrice;
    private BigDecimal realPrice;
    private BigDecimal orderAmt;
    private BigDecimal realAmt;
    private String supllierId;
    private String supplierName;
    private String imgUrl;
    private String skuId;
    private String itemName;
    private String itemType;
    private String detailPageUrl;
    private String customsCode;
    private String presaleType;
    private BigDecimal distribPrice;
    private String itemSpec;
    private String oriItemNo;
    private BigDecimal discountPrice;
    private BigDecimal distribAmt;
    private String glItemId;

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
    @Column(name = "distrbute_order_no", nullable = true, length = 30)
    public String getDistrbuteOrderNo() {
        return distrbuteOrderNo;
    }

    public void setDistrbuteOrderNo(String distrbuteOrderNo) {
        this.distrbuteOrderNo = distrbuteOrderNo;
    }

    @Basic
    @Column(name = "item_id", nullable = true, length = 15)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "bar_code", nullable = true, length = 30)
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Basic
    @Column(name = "ec_code", nullable = true, length = 50)
    public String getEcCode() {
        return ecCode;
    }

    public void setEcCode(String ecCode) {
        this.ecCode = ecCode;
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
    @Column(name = "real_qty", nullable = true, precision = 3)
    public BigDecimal getRealQty() {
        return realQty;
    }

    public void setRealQty(BigDecimal realQty) {
        this.realQty = realQty;
    }

    @Basic
    @Column(name = "order_price", nullable = true, precision = 3)
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Basic
    @Column(name = "pur_price", nullable = true, precision = 3)
    public BigDecimal getPurPrice() {
        return purPrice;
    }

    public void setPurPrice(BigDecimal purPrice) {
        this.purPrice = purPrice;
    }

    @Basic
    @Column(name = "sale_price", nullable = true, precision = 3)
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    @Basic
    @Column(name = "mem_price", nullable = true, precision = 3)
    public BigDecimal getMemPrice() {
        return memPrice;
    }

    public void setMemPrice(BigDecimal memPrice) {
        this.memPrice = memPrice;
    }

    @Basic
    @Column(name = "real_price", nullable = true, precision = 3)
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    @Basic
    @Column(name = "order_amt", nullable = true, precision = 3)
    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
    }

    @Basic
    @Column(name = "real_amt", nullable = true, precision = 3)
    public BigDecimal getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(BigDecimal realAmt) {
        this.realAmt = realAmt;
    }

    @Basic
    @Column(name = "supllier_id", nullable = true, length = 30)
    public String getSupllierId() {
        return supllierId;
    }

    public void setSupllierId(String supllierId) {
        this.supllierId = supllierId;
    }

    @Basic
    @Column(name = "supplier_name", nullable = true, length = 200)
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Basic
    @Column(name = "img_url", nullable = true, length = 300)
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Basic
    @Column(name = "sku_id", nullable = true, length = 50)
    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    @Basic
    @Column(name = "item_name", nullable = true, length = 300)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "item_type", nullable = true, length = 20)
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Basic
    @Column(name = "detail_page_url", nullable = true, length = 300)
    public String getDetailPageUrl() {
        return detailPageUrl;
    }

    public void setDetailPageUrl(String detailPageUrl) {
        this.detailPageUrl = detailPageUrl;
    }

    @Basic
    @Column(name = "customs_code", nullable = true, length = 100)
    public String getCustomsCode() {
        return customsCode;
    }

    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    @Basic
    @Column(name = "presale_type", nullable = true, length = 20)
    public String getPresaleType() {
        return presaleType;
    }

    public void setPresaleType(String presaleType) {
        this.presaleType = presaleType;
    }

    @Basic
    @Column(name = "distrib_price", nullable = true, precision = 6)
    public BigDecimal getDistribPrice() {
        return distribPrice;
    }

    public void setDistribPrice(BigDecimal distribPrice) {
        this.distribPrice = distribPrice;
    }

    @Basic
    @Column(name = "item_spec", nullable = true, length = 100)
    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    @Basic
    @Column(name = "ori_item_no", nullable = true, length = 50)
    public String getOriItemNo() {
        return oriItemNo;
    }

    public void setOriItemNo(String oriItemNo) {
        this.oriItemNo = oriItemNo;
    }

    @Basic
    @Column(name = "discount_price", nullable = true, precision = 6)
    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Basic
    @Column(name = "distrib_amt", nullable = true, precision = 6)
    public BigDecimal getDistribAmt() {
        return distribAmt;
    }

    public void setDistribAmt(BigDecimal distribAmt) {
        this.distribAmt = distribAmt;
    }

    @Basic
    @Column(name = "gl_item_id", nullable = true, length = 20)
    public String getGlItemId() {
        return glItemId;
    }

    public void setGlItemId(String glItemId) {
        this.glItemId = glItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbDistributeOrderD that = (VbDistributeOrderD) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(distrbuteOrderNo, that.distrbuteOrderNo) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(barCode, that.barCode) &&
                Objects.equals(ecCode, that.ecCode) &&
                Objects.equals(orderQty, that.orderQty) &&
                Objects.equals(realQty, that.realQty) &&
                Objects.equals(orderPrice, that.orderPrice) &&
                Objects.equals(purPrice, that.purPrice) &&
                Objects.equals(salePrice, that.salePrice) &&
                Objects.equals(memPrice, that.memPrice) &&
                Objects.equals(realPrice, that.realPrice) &&
                Objects.equals(orderAmt, that.orderAmt) &&
                Objects.equals(realAmt, that.realAmt) &&
                Objects.equals(supllierId, that.supllierId) &&
                Objects.equals(supplierName, that.supplierName) &&
                Objects.equals(imgUrl, that.imgUrl) &&
                Objects.equals(skuId, that.skuId) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemType, that.itemType) &&
                Objects.equals(detailPageUrl, that.detailPageUrl) &&
                Objects.equals(customsCode, that.customsCode) &&
                Objects.equals(presaleType, that.presaleType) &&
                Objects.equals(distribPrice, that.distribPrice) &&
                Objects.equals(itemSpec, that.itemSpec) &&
                Objects.equals(oriItemNo, that.oriItemNo) &&
                Objects.equals(discountPrice, that.discountPrice) &&
                Objects.equals(distribAmt, that.distribAmt) &&
                Objects.equals(glItemId, that.glItemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, distrbuteOrderNo, itemId, barCode, ecCode, orderQty, realQty, orderPrice,
                purPrice, salePrice, memPrice, realPrice, orderAmt, realAmt, supllierId, supplierName, imgUrl, skuId, itemName, itemType, detailPageUrl, customsCode, presaleType, distribPrice, itemSpec, oriItemNo, discountPrice, distribAmt, glItemId);
    }
}
