package com.wenc.commdomain.dto.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;

public class RetailProductStockPurpriceDTO {

    private String tenantId;
    private String shopId;
    private String itemId;
    private BigDecimal saleQty;
    private BigDecimal itemQty;
    private BigDecimal purPrice;
    private BigDecimal avgPurPrice;

    public RetailProductStockPurpriceDTO(
                                         String tenantId,
                                         String shopId,
                                         String itemId,
                                         BigDecimal saleQty,
                                         BigDecimal itemQty,
                                         BigDecimal purAmt,
                                         BigDecimal avgPurAmt) {




            this.tenantId = tenantId;

            this.shopId = shopId;

            this.itemId = itemId;
            this.saleQty = saleQty;
            this.itemQty = itemQty;
            if (itemQty != null && itemQty.doubleValue() != 0  && purAmt != null) {
                this.purPrice = BigDecimal.valueOf(purAmt.doubleValue() / itemQty.doubleValue())
                        .setScale(2, RoundingMode.HALF_UP).abs();
            }else
            {
                this.purPrice = BigDecimal.ZERO;
            }
            if (itemQty != null && itemQty.doubleValue() != 0 && avgPurAmt != null) {
                this.avgPurPrice = BigDecimal.valueOf(avgPurAmt.doubleValue() / itemQty.doubleValue())
                        .setScale(2,RoundingMode.HALF_UP).abs();
            }else
            {
                this.avgPurPrice = BigDecimal.ZERO;
            }

    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }



    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }



    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getSaleQty() {
        return saleQty;
    }

    public void setSaleQty(BigDecimal saleQty) {
        this.saleQty = saleQty;
    }

    public BigDecimal getItemQty() {
        return itemQty;
    }

    public void setItemQty(BigDecimal itemQty) {
        this.itemQty = itemQty;
    }

    public BigDecimal getPurPrice() {
        return purPrice;
    }

    public void setPurPrice(BigDecimal purPrice) {
        this.purPrice = purPrice;
    }

    public BigDecimal getAvgPurPrice() {
        return avgPurPrice;
    }

    public void setAvgPurPrice(BigDecimal avgPurPrice) {
        this.avgPurPrice = avgPurPrice;
    }
}
