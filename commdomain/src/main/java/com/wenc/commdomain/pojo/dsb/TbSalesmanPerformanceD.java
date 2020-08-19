package com.wenc.commdomain.pojo.dsb;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_salesman_performance_d")
public class TbSalesmanPerformanceD {
    private long idx;
    private String tenantId;
    private String performanceNo;
    private Timestamp distributeOrderDate;
    private String distributeOrderNo;
    private BigDecimal distributeOrderAmt;
    private BigDecimal distributeRealAmt;
    private BigDecimal commissionPrice;
    private BigDecimal commissionAmt;
    private BigDecimal commissionRate;
    private BigDecimal commissionConfirmAmt;
    private BigDecimal commissionPaymentAmt;
    private Integer commissionState;
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
    @Column(name = "performance_no", nullable = true, length = 30)
    public String getPerformanceNo() {
        return performanceNo;
    }

    public void setPerformanceNo(String performanceNo) {
        this.performanceNo = performanceNo;
    }

    @Basic
    @Column(name = "distribute_order_date", nullable = true)
    public Timestamp getDistributeOrderDate() {
        return distributeOrderDate;
    }

    public void setDistributeOrderDate(Timestamp distributeOrderDate) {
        this.distributeOrderDate = distributeOrderDate;
    }

    @Basic
    @Column(name = "distribute_order_no", nullable = true, length = 30)
    public String getDistributeOrderNo() {
        return distributeOrderNo;
    }

    public void setDistributeOrderNo(String distributeOrderNo) {
        this.distributeOrderNo = distributeOrderNo;
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
    @Column(name = "commission_amt", nullable = true, precision = 6)
    public BigDecimal getCommissionAmt() {
        return commissionAmt;
    }

    public void setCommissionAmt(BigDecimal commissionAmt) {
        this.commissionAmt = commissionAmt;
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
    @Column(name = "commission_confirm_amt", nullable = true, precision = 6)
    public BigDecimal getCommissionConfirmAmt() {
        return commissionConfirmAmt;
    }

    public void setCommissionConfirmAmt(BigDecimal commissionConfirmAmt) {
        this.commissionConfirmAmt = commissionConfirmAmt;
    }

    @Basic
    @Column(name = "commission_payment_amt", nullable = true, precision = 6)
    public BigDecimal getCommissionPaymentAmt() {
        return commissionPaymentAmt;
    }

    public void setCommissionPaymentAmt(BigDecimal commissionPaymentAmt) {
        this.commissionPaymentAmt = commissionPaymentAmt;
    }

    @Basic
    @Column(name = "commission_state", nullable = true)
    public Integer getCommissionState() {
        return commissionState;
    }

    public void setCommissionState(Integer commissionState) {
        this.commissionState = commissionState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbSalesmanPerformanceD that = (TbSalesmanPerformanceD) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(performanceNo, that.performanceNo) &&
                Objects.equals(distributeOrderDate, that.distributeOrderDate) &&
                Objects.equals(distributeOrderNo, that.distributeOrderNo) &&
                Objects.equals(distributeOrderAmt, that.distributeOrderAmt) &&
                Objects.equals(distributeRealAmt, that.distributeRealAmt) &&
                Objects.equals(commissionPrice, that.commissionPrice) &&
                Objects.equals(commissionAmt, that.commissionAmt) &&
                Objects.equals(commissionRate, that.commissionRate) &&
                Objects.equals(commissionConfirmAmt, that.commissionConfirmAmt) &&
                Objects.equals(commissionPaymentAmt, that.commissionPaymentAmt) &&
                Objects.equals(commissionState, that.commissionState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, performanceNo, distributeOrderDate, distributeOrderNo, distributeOrderAmt,
                distributeRealAmt, commissionPrice, commissionAmt, commissionRate, commissionConfirmAmt, commissionPaymentAmt, commissionState);
    }

    @Basic
    @Column(name = "isv_service_rate", nullable = true, precision = 3)
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
}
