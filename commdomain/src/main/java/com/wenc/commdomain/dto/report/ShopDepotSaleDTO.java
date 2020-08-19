package com.wenc.commdomain.dto.report;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class ShopDepotSaleDTO {

    private long idx;
    private String tenantId;
    private Timestamp statDate;
    private String shopId;
    private String depotId;
    private BigDecimal saleQty;
    private BigDecimal purAmt;
    private BigDecimal dueAmt;
    private BigDecimal realAmt;
    private BigDecimal shoppeAmt;
    private Integer customerFlow;

    public ShopDepotSaleDTO(  String tenantId,
                              Date statDate,
                              String shopId,
                              String depotId,
                              BigDecimal saleQty,
                              BigDecimal purAmt,
                              BigDecimal dueAmt,
                              BigDecimal realAmt) {
        this.tenantId = tenantId;
        this.statDate = new Timestamp(statDate.getTime());
        this.shopId = shopId;
        this.depotId = depotId;
        this.saleQty = saleQty;
        this.purAmt = purAmt;
        this.dueAmt = dueAmt;
        this.realAmt = realAmt;
    }



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

    public Timestamp getStatDate() {
        return statDate;
    }

    public void setStatDate(Timestamp statDate) {
        this.statDate = statDate;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    public BigDecimal getSaleQty() {
        return saleQty;
    }

    public void setSaleQty(BigDecimal saleQty) {
        this.saleQty = saleQty;
    }

    public BigDecimal getPurAmt() {
        return purAmt;
    }

    public void setPurAmt(BigDecimal purAmt) {
        this.purAmt = purAmt;
    }

    public BigDecimal getDueAmt() {
        return dueAmt;
    }

    public void setDueAmt(BigDecimal dueAmt) {
        this.dueAmt = dueAmt;
    }

    public BigDecimal getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(BigDecimal realAmt) {
        this.realAmt = realAmt;
    }

    public BigDecimal getShoppeAmt() {
        return shoppeAmt;
    }

    public void setShoppeAmt(BigDecimal shoppeAmt) {
        this.shoppeAmt = shoppeAmt;
    }

    public Integer getCustomerFlow() {
        return customerFlow;
    }

    public void setCustomerFlow(Integer customerFlow) {
        this.customerFlow = customerFlow;
    }
}
