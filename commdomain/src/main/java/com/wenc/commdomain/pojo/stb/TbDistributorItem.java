package com.wenc.commdomain.pojo.stb;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_distributor_item")
public class TbDistributorItem {
    private Long idx;
    private String tenantId;
    private String distributorId;
    private String itemId;
    private BigDecimal purPrice;
    private BigDecimal salePrice;
    private BigDecimal whlsalePrice;
    private BigDecimal memPrice;
    private Integer state;
    private String flag;
    private Timestamp createTime;
    private String createUser;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idx", nullable = false)
    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
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
    @Column(name = "distributor_id", nullable = true, length = 30)
    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
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
    @Column(name = "mem_price", nullable = true, precision = 6)
    public BigDecimal getMemPrice() {
        return memPrice;
    }

    public void setMemPrice(BigDecimal memPrice) {
        this.memPrice = memPrice;
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
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 20)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbDistributorItem that = (TbDistributorItem) o;
        return Objects.equals(idx, that.idx) &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(distributorId, that.distributorId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(purPrice, that.purPrice) &&
                Objects.equals(salePrice, that.salePrice) &&
                Objects.equals(whlsalePrice, that.whlsalePrice) &&
                Objects.equals(memPrice, that.memPrice) &&
                Objects.equals(state, that.state) &&
                Objects.equals(flag, that.flag) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, distributorId, itemId, purPrice, salePrice, whlsalePrice, memPrice, state, flag, createTime, createUser);
    }
}
