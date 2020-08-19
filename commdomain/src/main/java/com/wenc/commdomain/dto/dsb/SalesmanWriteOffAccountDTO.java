package com.wenc.commdomain.dto.dsb;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class SalesmanWriteOffAccountDTO {

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
    private String vendorId;
    private String vendorName;
    private String salesmanType;
    private String salesmanIdnum;
    private Integer salesmanLevel;
    private Integer salesmanIntegral;
    private String userId;

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

    public String getWriteoffType() {
        return writeoffType;
    }

    public void setWriteoffType(String writeoffType) {
        this.writeoffType = writeoffType;
    }

    public Timestamp getWriteoffDate() {
        return writeoffDate;
    }

    public void setWriteoffDate(Timestamp writeoffDate) {
        this.writeoffDate = writeoffDate;
    }

    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getWriteoffCode() {
        return writeoffCode;
    }

    public void setWriteoffCode(String writeoffCode) {
        this.writeoffCode = writeoffCode;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
    }

    public BigDecimal getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(BigDecimal realAmt) {
        this.realAmt = realAmt;
    }

    public String getDistributeOrderNo() {
        return distributeOrderNo;
    }

    public void setDistributeOrderNo(String distributeOrderNo) {
        this.distributeOrderNo = distributeOrderNo;
    }

    public String getSupplyOrderNo() {
        return supplyOrderNo;
    }

    public void setSupplyOrderNo(String supplyOrderNo) {
        this.supplyOrderNo = supplyOrderNo;
    }

    public String getSalesmanMobile() {
        return salesmanMobile;
    }

    public void setSalesmanMobile(String salesmanMobile) {
        this.salesmanMobile = salesmanMobile;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerWxId() {
        return customerWxId;
    }

    public void setCustomerWxId(String customerWxId) {
        this.customerWxId = customerWxId;
    }

    public String getCustomerZfbId() {
        return customerZfbId;
    }

    public void setCustomerZfbId(String customerZfbId) {
        this.customerZfbId = customerZfbId;
    }

    public String getCustomerMinappId() {
        return customerMinappId;
    }

    public void setCustomerMinappId(String customerMinappId) {
        this.customerMinappId = customerMinappId;
    }

    public String getWriteoffUserId() {
        return writeoffUserId;
    }

    public void setWriteoffUserId(String writeoffUserId) {
        this.writeoffUserId = writeoffUserId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDoState() {
        return doState;
    }

    public void setDoState(String doState) {
        this.doState = doState;
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

    public String getDistributeTenantId() {
        return distributeTenantId;
    }

    public void setDistributeTenantId(String distributeTenantId) {
        this.distributeTenantId = distributeTenantId;
    }

    public String getVendorTenantId() {
        return vendorTenantId;
    }

    public void setVendorTenantId(String vendorTenantId) {
        this.vendorTenantId = vendorTenantId;
    }

    public String getCofirmCode() {
        return cofirmCode;
    }

    public void setCofirmCode(String cofirmCode) {
        this.cofirmCode = cofirmCode;
    }

    public String getDistributeName() {
        return distributeName;
    }

    public void setDistributeName(String distributeName) {
        this.distributeName = distributeName;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getSalesmanType() {
        return salesmanType;
    }

    public void setSalesmanType(String salesmanType) {
        this.salesmanType = salesmanType;
    }

    public String getSalesmanIdnum() {
        return salesmanIdnum;
    }

    public void setSalesmanIdnum(String salesmanIdnum) {
        this.salesmanIdnum = salesmanIdnum;
    }

    public Integer getSalesmanLevel() {
        return salesmanLevel;
    }

    public void setSalesmanLevel(Integer salesmanLevel) {
        this.salesmanLevel = salesmanLevel;
    }

    public Integer getSalesmanIntegral() {
        return salesmanIntegral;
    }

    public void setSalesmanIntegral(Integer salesmanIntegral) {
        this.salesmanIntegral = salesmanIntegral;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
