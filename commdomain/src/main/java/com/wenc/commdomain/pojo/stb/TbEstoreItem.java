package com.wenc.commdomain.pojo.stb;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_estore_item")
public class TbEstoreItem {
    private long idx;
    private String tenantId;
    private String storeId;
    private String itemId;
    private BigDecimal purPrice;
    private BigDecimal salePrice;
    private BigDecimal whlsalePrice;
    private String vendorId;
    private Integer state;
    private String flag;
    private String createUser;
    private Timestamp createTime;

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
    @Column(name = "store_id", nullable = true, length = 30)
    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "item_id", nullable = true, length = 30)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
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
    @Column(name = "sale_price", nullable = true, precision = 6)
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    @Basic
    @Column(name = "whlsale_price", nullable = true, precision = 6)
    public BigDecimal getWhlsalePrice() {
        return whlsalePrice;
    }

    public void setWhlsalePrice(BigDecimal whlsalePrice) {
        this.whlsalePrice = whlsalePrice;
    }

    @Basic
    @Column(name = "vendor_id", nullable = true, length = 30)
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
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
    @Column(name = "flag", nullable = true, length = 20)
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 20)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbEstoreItem that = (TbEstoreItem) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(storeId, that.storeId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(purPrice, that.purPrice) &&
                Objects.equals(salePrice, that.salePrice) &&
                Objects.equals(whlsalePrice, that.whlsalePrice) &&
                Objects.equals(vendorId, that.vendorId) &&
                Objects.equals(state, that.state) &&
                Objects.equals(flag, that.flag) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, storeId, itemId, purPrice, salePrice, whlsalePrice, vendorId, state, flag, createUser, createTime);
    }
}
