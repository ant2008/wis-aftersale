package com.wenc.commdomain.pojo.bus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "tb_sale_hangup_d", schema = "sitesel_devp", catalog = "")
public class TbSaleHangupD {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbSaleHangupD that = (TbSaleHangupD) o;
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
                Objects.equals(itemTag, that.itemTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, saleHangupNo, itemId, itemQty, salePrice, saleTomin, purPrice, realPrice, shipNo, shelfNo, batchNo, itemTag);
    }
}
