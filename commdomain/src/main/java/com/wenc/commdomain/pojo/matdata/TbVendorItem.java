package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_vendor_item")
public class TbVendorItem {
    private long idx;
    private String tenantId;
    private String vendorId;
    private String itemId;
    private String barCode;
    private String payeeType;
    private BigDecimal realPrice;
    private BigDecimal orderPrice;
    private BigDecimal purPrice;
    private BigDecimal purTax;
    private BigDecimal salePrice;
    private BigDecimal rebate;
    private BigDecimal tariff;
    private BigDecimal rate;
    private BigDecimal othRate1;
    private BigDecimal othRate2;
    private String buyerId;
    private String watcherId;
    private String promType;
    private BigDecimal promPrice;
    private String promNo;
    private String rebateType;
    private BigDecimal promRate;
    private Timestamp beginTime;
    private Timestamp endTime;
    private String createUser;
    private Timestamp createTime;
    private String turnFlag;

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
    @Column(name = "vendor_id", nullable = true, length = 13)
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
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
    @Column(name = "payee_type", nullable = true, length = 3)
    public String getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(String payeeType) {
        this.payeeType = payeeType;
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
    @Column(name = "pur_tax", nullable = true, precision = 2)
    public BigDecimal getPurTax() {
        return purTax;
    }

    public void setPurTax(BigDecimal purTax) {
        this.purTax = purTax;
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
    @Column(name = "rebate", nullable = true, precision = 6)
    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    @Basic
    @Column(name = "tariff", nullable = true, precision = 6)
    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    @Basic
    @Column(name = "rate", nullable = true, precision = 6)
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "oth_rate1", nullable = true, precision = 6)
    public BigDecimal getOthRate1() {
        return othRate1;
    }

    public void setOthRate1(BigDecimal othRate1) {
        this.othRate1 = othRate1;
    }

    @Basic
    @Column(name = "oth_rate2", nullable = true, precision = 6)
    public BigDecimal getOthRate2() {
        return othRate2;
    }

    public void setOthRate2(BigDecimal othRate2) {
        this.othRate2 = othRate2;
    }

    @Basic
    @Column(name = "buyer_id", nullable = true, length = 8)
    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    @Basic
    @Column(name = "watcher_id", nullable = true, length = 8)
    public String getWatcherId() {
        return watcherId;
    }

    public void setWatcherId(String watcherId) {
        this.watcherId = watcherId;
    }

    @Basic
    @Column(name = "prom_type", nullable = true, length = 3)
    public String getPromType() {
        return promType;
    }

    public void setPromType(String promType) {
        this.promType = promType;
    }

    @Basic
    @Column(name = "prom_price", nullable = true, precision = 6)
    public BigDecimal getPromPrice() {
        return promPrice;
    }

    public void setPromPrice(BigDecimal promPrice) {
        this.promPrice = promPrice;
    }

    @Basic
    @Column(name = "prom_no", nullable = true, length = 12)
    public String getPromNo() {
        return promNo;
    }

    public void setPromNo(String promNo) {
        this.promNo = promNo;
    }

    @Basic
    @Column(name = "rebate_type", nullable = true, length = 3)
    public String getRebateType() {
        return rebateType;
    }

    public void setRebateType(String rebateType) {
        this.rebateType = rebateType;
    }

    @Basic
    @Column(name = "prom_rate", nullable = true, precision = 2)
    public BigDecimal getPromRate() {
        return promRate;
    }

    public void setPromRate(BigDecimal promRate) {
        this.promRate = promRate;
    }

    @Basic
    @Column(name = "begin_time", nullable = true)
    public Timestamp getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }

    @Basic
    @Column(name = "end_time", nullable = true)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 8)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "turn_flag", nullable = true, length = 20)
    public String getTurnFlag() {
        return turnFlag;
    }

    public void setTurnFlag(String turnFlag) {
        this.turnFlag = turnFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbVendorItem that = (TbVendorItem) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(vendorId, that.vendorId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(barCode, that.barCode) &&
                Objects.equals(payeeType, that.payeeType) &&
                Objects.equals(realPrice, that.realPrice) &&
                Objects.equals(orderPrice, that.orderPrice) &&
                Objects.equals(purPrice, that.purPrice) &&
                Objects.equals(purTax, that.purTax) &&
                Objects.equals(salePrice, that.salePrice) &&
                Objects.equals(rebate, that.rebate) &&
                Objects.equals(tariff, that.tariff) &&
                Objects.equals(rate, that.rate) &&
                Objects.equals(othRate1, that.othRate1) &&
                Objects.equals(othRate2, that.othRate2) &&
                Objects.equals(buyerId, that.buyerId) &&
                Objects.equals(watcherId, that.watcherId) &&
                Objects.equals(promType, that.promType) &&
                Objects.equals(promPrice, that.promPrice) &&
                Objects.equals(promNo, that.promNo) &&
                Objects.equals(rebateType, that.rebateType) &&
                Objects.equals(promRate, that.promRate) &&
                Objects.equals(beginTime, that.beginTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(turnFlag, that.turnFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, vendorId, itemId, barCode, payeeType, realPrice, orderPrice, purPrice,
                purTax, salePrice, rebate, tariff, rate, othRate1, othRate2, buyerId, watcherId, promType, promPrice, promNo, rebateType, promRate, beginTime, endTime, createUser, createTime, turnFlag);
    }
}
