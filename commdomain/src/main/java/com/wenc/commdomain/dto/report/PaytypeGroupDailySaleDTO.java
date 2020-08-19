package com.wenc.commdomain.dto.report;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class PaytypeGroupDailySaleDTO {

    private long idx;
    private String tenantId;
    private Timestamp statDate;
    private String shopId;
    private String posNo;
    private String salemanId;
    private String payCode;
    private BigDecimal dueAmount;
    private BigDecimal realAmount;

    @Id
    @Column(name = "idx", nullable = false)
    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    @Column(name = "tenant_id")
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Column(name="stat_date")
    public Timestamp getStatDate() {
        return statDate;
    }

    public void setStatDate(Timestamp statDate) {
        this.statDate = statDate;
    }

    @Column(name = "shop_id")
    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Column(name = "pos_no")
    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    @Column(name = "saleman_id")
    public String getSalemanId() {
        return salemanId;
    }

    public void setSalemanId(String salemanId) {
        this.salemanId = salemanId;
    }

    @Column(name="pay_code")
    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }


    @Column(name = "due_amount")
    public BigDecimal getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(BigDecimal dueAmount) {
        this.dueAmount = dueAmount;
    }

    @Column(name = "real_amount")
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }
}
