package com.wenc.commdomain.dto.shop;

import com.wenc.commdomain.pojo.bus.TbRetailsaleD;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class RetailProductDailyPaySaleDTO {

    private long idx;
    private String tenantId;
    private Timestamp statDate;
    private String shopId;
    private String itemId;
    private String rateType;
    private String payCode;
    private String payDescr;
    private BigDecimal bankAmt;
    private BigDecimal giveAmt;
    private BigDecimal payTypeAmt;
    private String createUser;
    private Timestamp createTime;

    public RetailProductDailyPaySaleDTO(
            TbRetailsaleD tbRetailsaleD,
            String shopId,
            String payCode,
            BigDecimal payTypeAmt

            ) {


            this.tenantId = tbRetailsaleD.getTenantId();
            this.shopId = shopId;
            this.itemId = tbRetailsaleD.getItemId();
            this.rateType = tbRetailsaleD.getRateType();
            this.payCode = payCode;

            this.payTypeAmt = payTypeAmt;

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

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public String getPayDescr() {
        return payDescr;
    }

    public void setPayDescr(String payDescr) {
        this.payDescr = payDescr;
    }

    public BigDecimal getBankAmt() {
        return bankAmt;
    }

    public void setBankAmt(BigDecimal bankAmt) {
        this.bankAmt = bankAmt;
    }

    public BigDecimal getGiveAmt() {
        return giveAmt;
    }

    public void setGiveAmt(BigDecimal giveAmt) {
        this.giveAmt = giveAmt;
    }

    public BigDecimal getPayTypeAmt() {
        return payTypeAmt;
    }

    public void setPayTypeAmt(BigDecimal payTypeAmt) {
        this.payTypeAmt = payTypeAmt;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
