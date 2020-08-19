package com.wenc.commdomain.pojo.dsb;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_distributor_performance_h")
public class TbDistributorPerformanceH {
    private long idx;
    private String tenantId;
    private String performanceNo;
    private Timestamp performanceDate;
    private String vendorId;
    private String vendorName;
    private Timestamp settleDate;
    private BigDecimal totalOrderAmt;
    private BigDecimal totalCommissionAmt;
    private BigDecimal totalPlatformRate;
    private BigDecimal totalPlatformAmt;
    private BigDecimal totalPaymentAmt;
    private BigDecimal totalConfirmAmt;
    private String distribTenantId;
    private String vendorTenantId;
    private String vendorPerformanceNo;
    private Integer state;
    private Integer chkBit;
    private String createUser;
    private Timestamp createTime;
    private String doState;
    private Timestamp execDate;

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
    @Column(name = "vendor_id", nullable = true, length = 20)
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Basic
    @Column(name = "vendor_name", nullable = true, length = 20)
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    @Basic
    @Column(name = "settle_date", nullable = true)
    public Timestamp getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(Timestamp settleDate) {
        this.settleDate = settleDate;
    }

    @Basic
    @Column(name = "total_order_amt", nullable = true, precision = 6)
    public BigDecimal getTotalOrderAmt() {
        return totalOrderAmt;
    }

    public void setTotalOrderAmt(BigDecimal totalOrderAmt) {
        this.totalOrderAmt = totalOrderAmt;
    }

    @Basic
    @Column(name = "total_commission_amt", nullable = true, precision = 6)
    public BigDecimal getTotalCommissionAmt() {
        return totalCommissionAmt;
    }

    public void setTotalCommissionAmt(BigDecimal totalCommissionAmt) {
        this.totalCommissionAmt = totalCommissionAmt;
    }

    @Basic
    @Column(name = "total_platform_rate", nullable = true, precision = 3)
    public BigDecimal getTotalPlatformRate() {
        return totalPlatformRate;
    }

    public void setTotalPlatformRate(BigDecimal totalPlatformRate) {
        this.totalPlatformRate = totalPlatformRate;
    }

    @Basic
    @Column(name = "total_platform_amt", nullable = true, precision = 3)
    public BigDecimal getTotalPlatformAmt() {
        return totalPlatformAmt;
    }

    public void setTotalPlatformAmt(BigDecimal totalPlatformAmt) {
        this.totalPlatformAmt = totalPlatformAmt;
    }

    @Basic
    @Column(name = "total_payment_amt", nullable = true, precision = 6)
    public BigDecimal getTotalPaymentAmt() {
        return totalPaymentAmt;
    }

    public void setTotalPaymentAmt(BigDecimal totalPaymentAmt) {
        this.totalPaymentAmt = totalPaymentAmt;
    }

    @Basic
    @Column(name = "total_confirm_amt", nullable = true, precision = 6)
    public BigDecimal getTotalConfirmAmt() {
        return totalConfirmAmt;
    }

    public void setTotalConfirmAmt(BigDecimal totalConfirmAmt) {
        this.totalConfirmAmt = totalConfirmAmt;
    }

    @Basic
    @Column(name = "distrib_tenant_id", nullable = true, length = 50)
    public String getDistribTenantId() {
        return distribTenantId;
    }

    public void setDistribTenantId(String distribTenantId) {
        this.distribTenantId = distribTenantId;
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
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "chk_bit", nullable = true)
    public Integer getChkBit() {
        return chkBit;
    }

    public void setChkBit(Integer chkBit) {
        this.chkBit = chkBit;
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
    @Column(name = "do_state", nullable = true, length = 20)
    public String getDoState() {
        return doState;
    }

    public void setDoState(String doState) {
        this.doState = doState;
    }

    @Basic
    @Column(name = "exec_date", nullable = true)
    public Timestamp getExecDate() {
        return execDate;
    }

    public void setExecDate(Timestamp execDate) {
        this.execDate = execDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbDistributorPerformanceH that = (TbDistributorPerformanceH) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(performanceNo, that.performanceNo) &&
                Objects.equals(performanceDate, that.performanceDate) &&
                Objects.equals(vendorId, that.vendorId) &&
                Objects.equals(vendorName, that.vendorName) &&
                Objects.equals(settleDate, that.settleDate) &&
                Objects.equals(totalOrderAmt, that.totalOrderAmt) &&
                Objects.equals(totalCommissionAmt, that.totalCommissionAmt) &&
                Objects.equals(totalPlatformRate, that.totalPlatformRate) &&
                Objects.equals(totalPlatformAmt, that.totalPlatformAmt) &&
                Objects.equals(totalPaymentAmt, that.totalPaymentAmt) &&
                Objects.equals(totalConfirmAmt, that.totalConfirmAmt) &&
                Objects.equals(distribTenantId, that.distribTenantId) &&
                Objects.equals(vendorTenantId, that.vendorTenantId) &&
                Objects.equals(vendorPerformanceNo, that.vendorPerformanceNo) &&
                Objects.equals(state, that.state) &&
                Objects.equals(chkBit, that.chkBit) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(doState, that.doState) &&
                Objects.equals(execDate, that.execDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, performanceNo, performanceDate, vendorId, vendorName, settleDate,
                totalOrderAmt, totalCommissionAmt, totalPlatformRate, totalPlatformAmt, totalPaymentAmt, totalConfirmAmt, distribTenantId, vendorTenantId, vendorPerformanceNo, state, chkBit, createUser, createTime, doState, execDate);
    }
}
