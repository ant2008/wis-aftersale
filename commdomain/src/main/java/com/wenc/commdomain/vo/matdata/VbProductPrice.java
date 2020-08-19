package com.wenc.commdomain.vo.matdata;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_product_price")
public class VbProductPrice {
    private long idx;
    private String tenantId;
    private String priceGroupId;
    private String itemId;
    private BigDecimal salePrice;
    private BigDecimal minPrice;
    private BigDecimal purPrice;
    private BigDecimal chkPrice;
    private BigDecimal whlPrice;
    private BigDecimal memPrice;
    private BigDecimal allocPrice;
    private String createUser;
    private Timestamp createTime;
    private BigDecimal addrate;
    private BigDecimal deductRate;
    private Integer state;
    private String itemName;
    private String itemUnit;
    private String itemSpec;
    private String prdOrigin;
    private String prdFactory;
    private String groupName;
    private String ifDefa;

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
    @Column(name = "price_group_id", nullable = true, length = 20)
    public String getPriceGroupId() {
        return priceGroupId;
    }

    public void setPriceGroupId(String priceGroupId) {
        this.priceGroupId = priceGroupId;
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
    @Column(name = "sale_price", nullable = true, precision = 6)
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    @Basic
    @Column(name = "min_price", nullable = true, precision = 6)
    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
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
    @Column(name = "chk_price", nullable = true, precision = 6)
    public BigDecimal getChkPrice() {
        return chkPrice;
    }

    public void setChkPrice(BigDecimal chkPrice) {
        this.chkPrice = chkPrice;
    }

    @Basic
    @Column(name = "whl_price", nullable = true, precision = 6)
    public BigDecimal getWhlPrice() {
        return whlPrice;
    }

    public void setWhlPrice(BigDecimal whlPrice) {
        this.whlPrice = whlPrice;
    }

    @Basic
    @Column(name = "mem_price", nullable = true, precision = 6)
    public BigDecimal getMemPrice() {
        return memPrice;
    }

    public void setMemPrice(BigDecimal memPrice) {
        this.memPrice = memPrice;
    }

    @Basic
    @Column(name = "alloc_price", nullable = true, precision = 6)
    public BigDecimal getAllocPrice() {
        return allocPrice;
    }

    public void setAllocPrice(BigDecimal allocPrice) {
        this.allocPrice = allocPrice;
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
    @Column(name = "addrate", nullable = false, precision = 2)
    public BigDecimal getAddrate() {
        return addrate;
    }

    public void setAddrate(BigDecimal addrate) {
        this.addrate = addrate;
    }

    @Basic
    @Column(name = "deduct_rate", nullable = false, precision = 2)
    public BigDecimal getDeductRate() {
        return deductRate;
    }

    public void setDeductRate(BigDecimal deductRate) {
        this.deductRate = deductRate;
    }

    @Basic
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    @Basic
    @Column(name = "group_name", nullable = true, length = 50)
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Basic
    @Column(name = "if_defa", nullable = true, length = 10)
    public String getIfDefa() {
        return ifDefa;
    }

    public void setIfDefa(String ifDefa) {
        this.ifDefa = ifDefa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbProductPrice that = (VbProductPrice) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(priceGroupId, that.priceGroupId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(salePrice, that.salePrice) &&
                Objects.equals(minPrice, that.minPrice) &&
                Objects.equals(purPrice, that.purPrice) &&
                Objects.equals(chkPrice, that.chkPrice) &&
                Objects.equals(whlPrice, that.whlPrice) &&
                Objects.equals(memPrice, that.memPrice) &&
                Objects.equals(allocPrice, that.allocPrice) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(addrate, that.addrate) &&
                Objects.equals(deductRate, that.deductRate) &&
                Objects.equals(state, that.state) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemUnit, that.itemUnit) &&
                Objects.equals(itemSpec, that.itemSpec) &&
                Objects.equals(prdOrigin, that.prdOrigin) &&
                Objects.equals(prdFactory, that.prdFactory) &&
                Objects.equals(groupName, that.groupName) &&
                Objects.equals(ifDefa, that.ifDefa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, priceGroupId, itemId, salePrice, minPrice, purPrice, chkPrice, whlPrice,
                memPrice, allocPrice, createUser, createTime, addrate, deductRate, state, itemName, itemUnit, itemSpec, prdOrigin, prdFactory, groupName, ifDefa);
    }
}
