package com.wenc.commdomain.vo.bus;

import java.math.BigDecimal;

public class SaleHangupItemVO {

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

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getSaleHangupNo() {
        return saleHangupNo;
    }

    public void setSaleHangupNo(String saleHangupNo) {
        this.saleHangupNo = saleHangupNo;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getItemQty() {
        return itemQty;
    }

    public void setItemQty(BigDecimal itemQty) {
        this.itemQty = itemQty;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getSaleTomin() {
        return saleTomin;
    }

    public void setSaleTomin(Integer saleTomin) {
        this.saleTomin = saleTomin;
    }

    public BigDecimal getPurPrice() {
        return purPrice;
    }

    public void setPurPrice(BigDecimal purPrice) {
        this.purPrice = purPrice;
    }

    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    public String getShelfNo() {
        return shelfNo;
    }

    public void setShelfNo(String shelfNo) {
        this.shelfNo = shelfNo;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getItemTag() {
        return itemTag;
    }

    public void setItemTag(String itemTag) {
        this.itemTag = itemTag;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    public String getPrdOrigin() {
        return prdOrigin;
    }

    public void setPrdOrigin(String prdOrigin) {
        this.prdOrigin = prdOrigin;
    }

    public String getPrdFactory() {
        return prdFactory;
    }

    public void setPrdFactory(String prdFactory) {
        this.prdFactory = prdFactory;
    }
}
