package com.wenc.commdomain.pojo.dsb;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_vendor_writeoff_account")
public class VbVendorWriteoffAccount {
    private long idx;
    private String tenantId;
    private String writeoffType;
    private Timestamp writeoffDate;
    private String distributorId;
    private String salesmanId;
    private String customerId;
    private String writeoffCode;
    private String itemId;
    private BigDecimal itemPrice;
    private BigDecimal realPrice;
    private BigDecimal commissionRate;
    private BigDecimal orderAmt;
    private BigDecimal realAmt;
    private String distributeOrderNo;
    private String supplyOrderNo;
    private String salesmanMobile;
    private String customerMobile;
    private String customerName;
    private String customerWxId;
    private String customerZfbId;
    private String customerMinappId;
    private String writeoffUserId;
    private Integer state;
    private String doState;
    private String createUser;
    private Timestamp createTime;
    private String distributeTenantId;
    private String vendorTenantId;
    private String cofirmCode;
    private String distributeName;
    private String salesmanName;
    private String itemName;
    private String distributorTelno;
    private String distributorAddress;
    private String applyState;

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
    @Column(name = "writeoff_type", nullable = true, length = 20)
    public String getWriteoffType() {
        return writeoffType;
    }

    public void setWriteoffType(String writeoffType) {
        this.writeoffType = writeoffType;
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
    @Column(name = "distributor_id", nullable = true, length = 30)
    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    @Basic
    @Column(name = "salesman_id", nullable = true, length = 30)
    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId;
    }

    @Basic
    @Column(name = "customer_id", nullable = true, length = 30)
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
    @Column(name = "item_id", nullable = true, length = 30)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "item_price", nullable = true, precision = 6)
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
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
    @Column(name = "commission_rate", nullable = true, precision = 6)
    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Basic
    @Column(name = "order_amt", nullable = true, precision = 6)
    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
    }

    @Basic
    @Column(name = "real_amt", nullable = true, precision = 6)
    public BigDecimal getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(BigDecimal realAmt) {
        this.realAmt = realAmt;
    }

    @Basic
    @Column(name = "distribute_order_no", nullable = true, length = 50)
    public String getDistributeOrderNo() {
        return distributeOrderNo;
    }

    public void setDistributeOrderNo(String distributeOrderNo) {
        this.distributeOrderNo = distributeOrderNo;
    }

    @Basic
    @Column(name = "supply_order_no", nullable = true, length = 50)
    public String getSupplyOrderNo() {
        return supplyOrderNo;
    }

    public void setSupplyOrderNo(String supplyOrderNo) {
        this.supplyOrderNo = supplyOrderNo;
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
    @Column(name = "customer_wx_id", nullable = true, length = 50)
    public String getCustomerWxId() {
        return customerWxId;
    }

    public void setCustomerWxId(String customerWxId) {
        this.customerWxId = customerWxId;
    }

    @Basic
    @Column(name = "customer_zfb_id", nullable = true, length = 50)
    public String getCustomerZfbId() {
        return customerZfbId;
    }

    public void setCustomerZfbId(String customerZfbId) {
        this.customerZfbId = customerZfbId;
    }

    @Basic
    @Column(name = "customer_minapp_id", nullable = true, length = 50)
    public String getCustomerMinappId() {
        return customerMinappId;
    }

    public void setCustomerMinappId(String customerMinappId) {
        this.customerMinappId = customerMinappId;
    }

    @Basic
    @Column(name = "writeoff_user_id", nullable = true, length = 20)
    public String getWriteoffUserId() {
        return writeoffUserId;
    }

    public void setWriteoffUserId(String writeoffUserId) {
        this.writeoffUserId = writeoffUserId;
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
    @Column(name = "do_state", nullable = true, length = 20)
    public String getDoState() {
        return doState;
    }

    public void setDoState(String doState) {
        this.doState = doState;
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
    @Column(name = "distribute_tenant_id", nullable = true, length = 50)
    public String getDistributeTenantId() {
        return distributeTenantId;
    }

    public void setDistributeTenantId(String distributeTenantId) {
        this.distributeTenantId = distributeTenantId;
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
    @Column(name = "cofirm_code", nullable = true, length = 50)
    public String getCofirmCode() {
        return cofirmCode;
    }

    public void setCofirmCode(String cofirmCode) {
        this.cofirmCode = cofirmCode;
    }

    @Basic
    @Column(name = "distribute_name", nullable = true, length = 30)
    public String getDistributeName() {
        return distributeName;
    }

    public void setDistributeName(String distributeName) {
        this.distributeName = distributeName;
    }

    @Basic
    @Column(name = "salesman_name", nullable = true, length = 30)
    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    @Basic
    @Column(name = "item_name", nullable = true, length = 200)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "distributor_telno", nullable = true, length = 30)
    public String getDistributorTelno() {
        return distributorTelno;
    }

    public void setDistributorTelno(String distributorTelno) {
        this.distributorTelno = distributorTelno;
    }

    @Basic
    @Column(name = "distributor_address", nullable = true, length = 300)
    public String getDistributorAddress() {
        return distributorAddress;
    }

    public void setDistributorAddress(String distributorAddress) {
        this.distributorAddress = distributorAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbVendorWriteoffAccount that = (VbVendorWriteoffAccount) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(writeoffType, that.writeoffType) &&
                Objects.equals(writeoffDate, that.writeoffDate) &&
                Objects.equals(distributorId, that.distributorId) &&
                Objects.equals(salesmanId, that.salesmanId) &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(writeoffCode, that.writeoffCode) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(itemPrice, that.itemPrice) &&
                Objects.equals(realPrice, that.realPrice) &&
                Objects.equals(commissionRate, that.commissionRate) &&
                Objects.equals(orderAmt, that.orderAmt) &&
                Objects.equals(realAmt, that.realAmt) &&
                Objects.equals(distributeOrderNo, that.distributeOrderNo) &&
                Objects.equals(supplyOrderNo, that.supplyOrderNo) &&
                Objects.equals(salesmanMobile, that.salesmanMobile) &&
                Objects.equals(customerMobile, that.customerMobile) &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(customerWxId, that.customerWxId) &&
                Objects.equals(customerZfbId, that.customerZfbId) &&
                Objects.equals(customerMinappId, that.customerMinappId) &&
                Objects.equals(writeoffUserId, that.writeoffUserId) &&
                Objects.equals(state, that.state) &&
                Objects.equals(doState, that.doState) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(distributeTenantId, that.distributeTenantId) &&
                Objects.equals(vendorTenantId, that.vendorTenantId) &&
                Objects.equals(cofirmCode, that.cofirmCode) &&
                Objects.equals(distributeName, that.distributeName) &&
                Objects.equals(salesmanName, that.salesmanName) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(distributorTelno, that.distributorTelno) &&
                Objects.equals(distributorAddress, that.distributorAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, writeoffType, writeoffDate, distributorId, salesmanId, customerId,
                writeoffCode, itemId, itemPrice, realPrice, commissionRate, orderAmt, realAmt, distributeOrderNo,
                supplyOrderNo, salesmanMobile, customerMobile, customerName, customerWxId, customerZfbId,
                customerMinappId, writeoffUserId, state, doState, createUser, createTime, distributeTenantId, vendorTenantId, cofirmCode, distributeName, salesmanName, itemName, distributorTelno, distributorAddress);
    }

    @Basic
    @Column(name = "apply_state", nullable = true, length = 20)
    public String getApplyState() {
        return applyState;
    }

    public void setApplyState(String applyState) {
        this.applyState = applyState;
    }
}
