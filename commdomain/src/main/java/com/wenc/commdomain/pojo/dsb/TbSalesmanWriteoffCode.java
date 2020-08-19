package com.wenc.commdomain.pojo.dsb;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_salesman_writeoff_code")
public class TbSalesmanWriteoffCode {
    private long idx;
    private String tenantId;
    private String distributorId;
    private String salesmanId;
    private String itemId;
    private String spreadUrl;
    private Timestamp spreadDate;
    private String salesmanMobile;
    private String customerMobile;
    private String customerName;
    private String wxId;
    private String zfbId;
    private String wxappId;
    private String writeoffCode;
    private Timestamp writeoffDate;
    private String spreadState;
    private Timestamp expireDate;
    private String sourceType;
    private Integer state;
    private String createUser;
    private Timestamp createDate;
    private String vendorTenantId;
    private Long vendorIdx;
    private String customerId;

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
    @Column(name = "item_id", nullable = true, length = 30)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "spread_url", nullable = true, length = 300)
    public String getSpreadUrl() {
        return spreadUrl;
    }

    public void setSpreadUrl(String spreadUrl) {
        this.spreadUrl = spreadUrl;
    }

    @Basic
    @Column(name = "spread_date", nullable = true)
    public Timestamp getSpreadDate() {
        return spreadDate;
    }

    public void setSpreadDate(Timestamp spreadDate) {
        this.spreadDate = spreadDate;
    }

    @Basic
    @Column(name = "salesman_mobile", nullable = true, length = 20)
    public String getSalesmanMobile() {
        return salesmanMobile;
    }

    public void setSalesmanMobile(String salesmanMobile) {
        this.salesmanMobile = salesmanMobile;
    }

    @Basic
    @Column(name = "customer_mobile", nullable = true, length = 20)
    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    @Basic
    @Column(name = "customer_name", nullable = true, length = 20)
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "wx_id", nullable = true, length = 50)
    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    @Basic
    @Column(name = "zfb_id", nullable = true, length = 50)
    public String getZfbId() {
        return zfbId;
    }

    public void setZfbId(String zfbId) {
        this.zfbId = zfbId;
    }

    @Basic
    @Column(name = "wxapp_id", nullable = true, length = 50)
    public String getWxappId() {
        return wxappId;
    }

    public void setWxappId(String wxappId) {
        this.wxappId = wxappId;
    }

    @Basic
    @Column(name = "writeoff_code", nullable = true, length = 20)
    public String getWriteoffCode() {
        return writeoffCode;
    }

    public void setWriteoffCode(String writeoffCode) {
        this.writeoffCode = writeoffCode;
    }

    @Basic
    @Column(name = "writeoff_date", nullable = true)
    public Timestamp getWriteoffDate() {
        return writeoffDate;
    }

    public void setWriteoffDate(Timestamp writeoffDate) {
        this.writeoffDate = writeoffDate;
    }

    @Basic
    @Column(name = "spread_state", nullable = true, length = 20)
    public String getSpreadState() {
        return spreadState;
    }

    public void setSpreadState(String spreadState) {
        this.spreadState = spreadState;
    }

    @Basic
    @Column(name = "expire_date", nullable = true)
    public Timestamp getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Timestamp expireDate) {
        this.expireDate = expireDate;
    }

    @Basic
    @Column(name = "source_type", nullable = true, length = 20)
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
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
    @Column(name = "create_user", nullable = true, length = 20)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "create_date", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbSalesmanWriteoffCode that = (TbSalesmanWriteoffCode) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(distributorId, that.distributorId) &&
                Objects.equals(salesmanId, that.salesmanId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(spreadUrl, that.spreadUrl) &&
                Objects.equals(spreadDate, that.spreadDate) &&
                Objects.equals(salesmanMobile, that.salesmanMobile) &&
                Objects.equals(customerMobile, that.customerMobile) &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(wxId, that.wxId) &&
                Objects.equals(zfbId, that.zfbId) &&
                Objects.equals(wxappId, that.wxappId) &&
                Objects.equals(writeoffCode, that.writeoffCode) &&
                Objects.equals(writeoffDate, that.writeoffDate) &&
                Objects.equals(spreadState, that.spreadState) &&
                Objects.equals(expireDate, that.expireDate) &&
                Objects.equals(sourceType, that.sourceType) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createDate, that.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, distributorId, salesmanId, itemId, spreadUrl, spreadDate, salesmanMobile,
                customerMobile, customerName, wxId, zfbId, wxappId, writeoffCode, writeoffDate, spreadState, expireDate, sourceType, state, createUser, createDate);
    }

    @Basic
    @Column(name = "vendor_tenant_id", nullable = true, length = 50)
    public String getVendorTenantId() {
        return vendorTenantId;
    }

    public void setVendorTenantId(String vendorTenantId) {
        this.vendorTenantId = vendorTenantId;
    }

    @Basic
    @Column(name = "vendor_idx", nullable = true)
    public Long getVendorIdx() {
        return vendorIdx;
    }

    public void setVendorIdx(Long vendorIdx) {
        this.vendorIdx = vendorIdx;
    }

    @Basic
    @Column(name = "customer_id", nullable = true, length = 20)
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
