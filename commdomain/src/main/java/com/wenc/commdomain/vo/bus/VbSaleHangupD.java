package com.wenc.commdomain.vo.bus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "vb_sale_hangup_d")
public class VbSaleHangupD {
    private long idx;
    private String tenantId;
    private String saleHangupNo;
    private String itemId;
    private BigDecimal itemQty;
    private BigDecimal salePrice;
    private Integer saleTomin;
    private BigDecimal purPrice;
    private BigDecimal realPrice;
    private String shipNo;
    private String shelfNo;
    private String batchNo;
    private String itemTag;
    private String itemName;
    private String itemUnit;
    private String itemSpec;
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
    @Column(name = "sale_hangup_no", nullable = true, length = 30)
    public String getSaleHangupNo() {
        return saleHangupNo;
    }

    public void setSaleHangupNo(String saleHangupNo) {
        this.saleHangupNo = saleHangupNo;
    }

    @Basic
    @Column(name = "item_id", nullable = true, length = 20)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
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
    @Column(name = "sale_price", nullable = true, precision = 6)
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    @Basic
    @Column(name = "sale_tomin", nullable = true)
    public Integer getSaleTomin() {
        return saleTomin;
    }

    public void setSaleTomin(Integer saleTomin) {
        this.saleTomin = saleTomin;
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
    @Column(name = "real_price", nullable = true, precision = 6)
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    @Basic
    @Column(name = "ship_no", nullable = true, length = 20)
    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    @Basic
    @Column(name = "shelf_no", nullable = true, length = 20)
    public String getShelfNo() {
        return shelfNo;
    }

    public void setShelfNo(String shelfNo) {
        this.shelfNo = shelfNo;
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
    @Column(name = "item_tag", nullable = true, length = 20)
    public String getItemTag() {
        return itemTag;
    }

    public void setItemTag(String itemTag) {
        this.itemTag = itemTag;
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
    @Column(name = "item_spec", nullable = true, length = 80)
    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
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
        VbSaleHangupD that = (VbSaleHangupD) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(saleHangupNo, that.saleHangupNo) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(itemQty, that.itemQty) &&
                Objects.equals(salePrice, that.salePrice) &&
                Objects.equals(saleTomin, that.saleTomin) &&
                Objects.equals(purPrice, that.purPrice) &&
                Objects.equals(realPrice, that.realPrice) &&
                Objects.equals(shipNo, that.shipNo) &&
                Objects.equals(shelfNo, that.shelfNo) &&
                Objects.equals(batchNo, that.batchNo) &&
                Objects.equals(itemTag, that.itemTag) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemUnit, that.itemUnit) &&
                Objects.equals(itemSpec, that.itemSpec) &&
                Objects.equals(prdOrigin, that.prdOrigin) &&
                Objects.equals(prdFactory, that.prdFactory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, saleHangupNo, itemId, itemQty, salePrice, saleTomin, purPrice, realPrice, shipNo, shelfNo, batchNo, itemTag, itemName, itemUnit, itemSpec, prdOrigin, prdFactory);
    }
}
