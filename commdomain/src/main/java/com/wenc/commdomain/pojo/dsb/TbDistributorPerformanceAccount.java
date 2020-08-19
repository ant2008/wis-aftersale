package com.wenc.commdomain.pojo.dsb;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_distributor_performance_account")
public class TbDistributorPerformanceAccount {
    private long idx;
    private String tenantId;
    private String vendorId;
    private String vendorName;
    private String performanceType;
    private String performanceNo;
    private Timestamp performanceDate;
    private BigDecimal distributeOrderAmt;
    private BigDecimal commissionPrice;
    private BigDecimal commissionRate;
    private BigDecimal commissionAmt;
    private BigDecimal distributeRealAmt;
    private BigDecimal actualPaymentAmt;
    private Integer state;
    private BigDecimal confirmCommissionAmt;
    private String chkUserId;
    private String chkUserName;
    private String rejectCode;
    private String rejectResult;
    private BigDecimal platformAmt;
    private BigDecimal platformRate;
    private String vendorTenantId;
    private String vendorPerformanceNo;
    private Timestamp vendorConfirmDate;

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
    @Column(name = "vendor_id", nullable = true, length = 20)
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Basic
    @Column(name = "vendor_name", nullable = true, length = 50)
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    @Basic
    @Column(name = "performance_type", nullable = true, length = 20)
    public String getPerformanceType() {
        return performanceType;
    }

    public void setPerformanceType(String performanceType) {
        this.performanceType = performanceType;
    }

    @Basic
    @Column(name = "performance_no", nullable = true, length = 30)
    public String getPerformanceNo() {
        return performanceNo;
    }

    public void setPerformanceNo(String performanceNo) {
        this.performanceNo = performanceNo;
    }

    @Basic
    @Column(name = "performance_date", nullable = true)
    public Timestamp getPerformanceDate() {
        return performanceDate;
    }

    public void setPerformanceDate(Timestamp performanceDate) {
        this.performanceDate = performanceDate;
    }

    @Basic
    @Column(name = "distribute_order_amt", nullable = true, precision = 6)
    public BigDecimal getDistributeOrderAmt() {
        return distributeOrderAmt;
    }

    public void setDistributeOrderAmt(BigDecimal distributeOrderAmt) {
        this.distributeOrderAmt = distributeOrderAmt;
    }

    @Basic
    @Column(name = "commission_price", nullable = true, precision = 6)
    public BigDecimal getCommissionPrice() {
        return commissionPrice;
    }

    public void setCommissionPrice(BigDecimal commissionPrice) {
        this.commissionPrice = commissionPrice;
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
    @Column(name = "commission_amt", nullable = true, precision = 6)
    public BigDecimal getCommissionAmt() {
        return commissionAmt;
    }

    public void setCommissionAmt(BigDecimal commissionAmt) {
        this.commissionAmt = commissionAmt;
    }

    @Basic
    @Column(name = "distribute_real_amt", nullable = true, precision = 6)
    public BigDecimal getDistributeRealAmt() {
        return distributeRealAmt;
    }

    public void setDistributeRealAmt(BigDecimal distributeRealAmt) {
        this.distributeRealAmt = distributeRealAmt;
    }

    @Basic
    @Column(name = "actual_payment_amt", nullable = true, precision = 6)
    public BigDecimal getActualPaymentAmt() {
        return actualPaymentAmt;
    }

    public void setActualPaymentAmt(BigDecimal actualPaymentAmt) {
        this.actualPaymentAmt = actualPaymentAmt;
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
    @Column(name = "confirm_commission_amt", nullable = true, precision = 6)
    public BigDecimal getConfirmCommissionAmt() {
        return confirmCommissionAmt;
    }

    public void setConfirmCommissionAmt(BigDecimal confirmCommissionAmt) {
        this.confirmCommissionAmt = confirmCommissionAmt;
    }

    @Basic
    @Column(name = "chk_user_id", nullable = true, length = 20)
    public String getChkUserId() {
        return chkUserId;
    }

    public void setChkUserId(String chkUserId) {
        this.chkUserId = chkUserId;
    }

    @Basic
    @Column(name = "chk_user_name", nullable = true, length = 20)
    public String getChkUserName() {
        return chkUserName;
    }

    public void setChkUserName(String chkUserName) {
        this.chkUserName = chkUserName;
    }

    @Basic
    @Column(name = "reject_code", nullable = true, length = 20)
    public String getRejectCode() {
        return rejectCode;
    }

    public void setRejectCode(String rejectCode) {
        this.rejectCode = rejectCode;
    }

    @Basic
    @Column(name = "reject_result", nullable = true, length = 100)
    public String getRejectResult() {
        return rejectResult;
    }

    public void setRejectResult(String rejectResult) {
        this.rejectResult = rejectResult;
    }

    @Basic
    @Column(name = "platform_amt", nullable = true, precision = 6)
    public BigDecimal getPlatformAmt() {
        return platformAmt;
    }

    public void setPlatformAmt(BigDecimal platformAmt) {
        this.platformAmt = platformAmt;
    }

    @Basic
    @Column(name = "platform_rate", nullable = true, precision = 3)
    public BigDecimal getPlatformRate() {
        return platformRate;
    }

    public void setPlatformRate(BigDecimal platformRate) {
        this.platformRate = platformRate;
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
    @Column(name = "vendor_performance_no", nullable = true, length = 30)
    public String getVendorPerformanceNo() {
        return vendorPerformanceNo;
    }

    public void setVendorPerformanceNo(String vendorPerformanceNo) {
        this.vendorPerformanceNo = vendorPerformanceNo;
    }

    @Basic
    @Column(name = "vendor_confirm_date", nullable = true)
    public Timestamp getVendorConfirmDate() {
        return vendorConfirmDate;
    }

    public void setVendorConfirmDate(Timestamp vendorConfirmDate) {
        this.vendorConfirmDate = vendorConfirmDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbDistributorPerformanceAccount that = (TbDistributorPerformanceAccount) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(vendorId, that.vendorId) &&
                Objects.equals(vendorName, that.vendorName) &&
                Objects.equals(performanceType, that.performanceType) &&
                Objects.equals(performanceNo, that.performanceNo) &&
                Objects.equals(performanceDate, that.performanceDate) &&
                Objects.equals(distributeOrderAmt, that.distributeOrderAmt) &&
                Objects.equals(commissionPrice, that.commissionPrice) &&
                Objects.equals(commissionRate, that.commissionRate) &&
                Objects.equals(commissionAmt, that.commissionAmt) &&
                Objects.equals(distributeRealAmt, that.distributeRealAmt) &&
                Objects.equals(actualPaymentAmt, that.actualPaymentAmt) &&
                Objects.equals(state, that.state) &&
                Objects.equals(confirmCommissionAmt, that.confirmCommissionAmt) &&
                Objects.equals(chkUserId, that.chkUserId) &&
                Objects.equals(chkUserName, that.chkUserName) &&
                Objects.equals(rejectCode, that.rejectCode) &&
                Objects.equals(rejectResult, that.rejectResult) &&
                Objects.equals(platformAmt, that.platformAmt) &&
                Objects.equals(platformRate, that.platformRate) &&
                Objects.equals(vendorTenantId, that.vendorTenantId) &&
                Objects.equals(vendorPerformanceNo, that.vendorPerformanceNo) &&
                Objects.equals(vendorConfirmDate, that.vendorConfirmDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, vendorId, vendorName, performanceType, performanceNo, performanceDate,
                distributeOrderAmt, commissionPrice, commissionRate, commissionAmt, distributeRealAmt,
                actualPaymentAmt, state, confirmCommissionAmt, chkUserId, chkUserName, rejectCode, rejectResult, platformAmt, platformRate, vendorTenantId, vendorPerformanceNo, vendorConfirmDate);
    }
}
