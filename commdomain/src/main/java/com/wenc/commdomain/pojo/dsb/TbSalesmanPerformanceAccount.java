package com.wenc.commdomain.pojo.dsb;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_salesman_performance_account")
public class TbSalesmanPerformanceAccount {
    private long idx;
    private String tenantId;
    private String distributorId;
    private String distributorName;
    private String salesmanId;
    private String salesmanName;
    private String performanceType;
    private Timestamp performaceDate;
    private String performanceNo;
    private BigDecimal distributeOrderAmt;
    private BigDecimal distributeRealAmt;
    private BigDecimal commissionPrice;
    private BigDecimal commissionRate;
    private String chkUserId;
    private String chkUserName;
    private BigDecimal commissionAmt;
    private BigDecimal commissionConfirmAmt;
    private BigDecimal actualPaymentAmt;
    private Integer state;
    private String rejectCode;
    private String rejectResult;
    private BigDecimal isvServiceRate;
    private BigDecimal isvServiceAmt;

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
    @Column(name = "distributor_name", nullable = true, length = 20)
    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
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
    @Column(name = "salesman_name", nullable = true, length = 20)
    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
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
    @Column(name = "performace_date", nullable = true)
    public Timestamp getPerformaceDate() {
        return performaceDate;
    }

    public void setPerformaceDate(Timestamp performaceDate) {
        this.performaceDate = performaceDate;
    }

    @Basic
    @Column(name = "performance_no", nullable = true, length = 20)
    public String getPerformanceNo() {
        return performanceNo;
    }

    public void setPerformanceNo(String performanceNo) {
        this.performanceNo = performanceNo;
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
    @Column(name = "distribute_real_amt", nullable = true, precision = 6)
    public BigDecimal getDistributeRealAmt() {
        return distributeRealAmt;
    }

    public void setDistributeRealAmt(BigDecimal distributeRealAmt) {
        this.distributeRealAmt = distributeRealAmt;
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
    @Column(name = "commission_amt", nullable = true, precision = 6)
    public BigDecimal getCommissionAmt() {
        return commissionAmt;
    }

    public void setCommissionAmt(BigDecimal commissionAmt) {
        this.commissionAmt = commissionAmt;
    }

    @Basic
    @Column(name = "commission_confirm_amt", nullable = true, precision = 6)
    public BigDecimal getCommissionConfirmAmt() {
        return commissionConfirmAmt;
    }

    public void setCommissionConfirmAmt(BigDecimal commissionConfirmAmt) {
        this.commissionConfirmAmt = commissionConfirmAmt;
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
    @Column(name = "isv_service_rate", nullable = true, precision = 6)
    public BigDecimal getIsvServiceRate() {
        return isvServiceRate;
    }

    public void setIsvServiceRate(BigDecimal isvServiceRate) {
        this.isvServiceRate = isvServiceRate;
    }

    @Basic
    @Column(name = "isv_service_amt", nullable = true, precision = 6)
    public BigDecimal getIsvServiceAmt() {
        return isvServiceAmt;
    }

    public void setIsvServiceAmt(BigDecimal isvServiceAmt) {
        this.isvServiceAmt = isvServiceAmt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbSalesmanPerformanceAccount that = (TbSalesmanPerformanceAccount) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(distributorId, that.distributorId) &&
                Objects.equals(distributorName, that.distributorName) &&
                Objects.equals(salesmanId, that.salesmanId) &&
                Objects.equals(salesmanName, that.salesmanName) &&
                Objects.equals(performanceType, that.performanceType) &&
                Objects.equals(performaceDate, that.performaceDate) &&
                Objects.equals(performanceNo, that.performanceNo) &&
                Objects.equals(distributeOrderAmt, that.distributeOrderAmt) &&
                Objects.equals(distributeRealAmt, that.distributeRealAmt) &&
                Objects.equals(commissionPrice, that.commissionPrice) &&
                Objects.equals(commissionRate, that.commissionRate) &&
                Objects.equals(chkUserId, that.chkUserId) &&
                Objects.equals(chkUserName, that.chkUserName) &&
                Objects.equals(commissionAmt, that.commissionAmt) &&
                Objects.equals(commissionConfirmAmt, that.commissionConfirmAmt) &&
                Objects.equals(actualPaymentAmt, that.actualPaymentAmt) &&
                Objects.equals(state, that.state) &&
                Objects.equals(rejectCode, that.rejectCode) &&
                Objects.equals(rejectResult, that.rejectResult) &&
                Objects.equals(isvServiceRate, that.isvServiceRate) &&
                Objects.equals(isvServiceAmt, that.isvServiceAmt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, distributorId, distributorName, salesmanId, salesmanName, performanceType,
                performaceDate, performanceNo, distributeOrderAmt, distributeRealAmt, commissionPrice, commissionRate
                , chkUserId, chkUserName, commissionAmt, commissionConfirmAmt, actualPaymentAmt, state, rejectCode, rejectResult, isvServiceRate, isvServiceAmt);
    }
}
