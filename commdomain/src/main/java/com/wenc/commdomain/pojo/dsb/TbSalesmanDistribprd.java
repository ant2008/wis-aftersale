package com.wenc.commdomain.pojo.dsb;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_salesman_distribprd")
public class TbSalesmanDistribprd {
    private long idx;
    private String tenantId;
    private String distributorId;
    private String salesmanId;
    private String itemId;
    private String distribUrl;
    private String distribCode;
    private Integer spreadCount;
    private Integer spreadCustomerCount;
    private Integer spreadViewCount;
    private String createUser;
    private Timestamp createTime;
    private Integer state;
    private Long extraIdx;
    private String extraId;

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
    @Column(name = "distributor_id", nullable = true, length = 20)
    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    @Basic
    @Column(name = "salesman_id", nullable = true, length = 20)
    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId;
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
    @Column(name = "distrib_url", nullable = true, length = 300)
    public String getDistribUrl() {
        return distribUrl;
    }

    public void setDistribUrl(String distribUrl) {
        this.distribUrl = distribUrl;
    }

    @Basic
    @Column(name = "distrib_code", nullable = true, length = 20)
    public String getDistribCode() {
        return distribCode;
    }

    public void setDistribCode(String distribCode) {
        this.distribCode = distribCode;
    }

    @Basic
    @Column(name = "spread_count", nullable = true)
    public Integer getSpreadCount() {
        return spreadCount;
    }

    public void setSpreadCount(Integer spreadCount) {
        this.spreadCount = spreadCount;
    }

    @Basic
    @Column(name = "spread_customer_count", nullable = true)
    public Integer getSpreadCustomerCount() {
        return spreadCustomerCount;
    }

    public void setSpreadCustomerCount(Integer spreadCustomerCount) {
        this.spreadCustomerCount = spreadCustomerCount;
    }

    @Basic
    @Column(name = "spread_view_count", nullable = true)
    public Integer getSpreadViewCount() {
        return spreadViewCount;
    }

    public void setSpreadViewCount(Integer spreadViewCount) {
        this.spreadViewCount = spreadViewCount;
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

    @Basic
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbSalesmanDistribprd that = (TbSalesmanDistribprd) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(distributorId, that.distributorId) &&
                Objects.equals(salesmanId, that.salesmanId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(distribUrl, that.distribUrl) &&
                Objects.equals(distribCode, that.distribCode) &&
                Objects.equals(spreadCount, that.spreadCount) &&
                Objects.equals(spreadCustomerCount, that.spreadCustomerCount) &&
                Objects.equals(spreadViewCount, that.spreadViewCount) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, distributorId, salesmanId, itemId, distribUrl, distribCode, spreadCount, spreadCustomerCount, spreadViewCount, createUser, createTime, state);
    }

    @Basic
    @Column(name = "extra_idx", nullable = true)
    public Long getExtraIdx() {
        return extraIdx;
    }

    public void setExtraIdx(Long extraIdx) {
        this.extraIdx = extraIdx;
    }

    @Basic
    @Column(name = "extra_id", nullable = true, length = 30)
    public String getExtraId() {
        return extraId;
    }

    public void setExtraId(String extraId) {
        this.extraId = extraId;
    }
}
