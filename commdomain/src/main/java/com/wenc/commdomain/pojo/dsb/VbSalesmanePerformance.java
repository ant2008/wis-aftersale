package com.wenc.commdomain.pojo.dsb;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_salesmane_performance")
public class VbSalesmanePerformance {
    private long idx;
    private String tenantId;
    private String bperformanceNo;
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
    private long aidx;
    private String distrutorId;
    private String distributorName;
    private String salesmanId;
    private String salesmanName;
    private String salesmanMobileNo;
    private Timestamp settleDate;
    private BigDecimal commissionTotalAmt;
    private BigDecimal confirmTotalAmt;
    private Timestamp startDate;
    private Timestamp endDate;
    private Integer state;
    private Integer chkBit;
    private Timestamp execDate;
    private String createUser;
    private Timestamp createTime;

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
    @Column(name = "bperformance_no", nullable = true, length = 30)
    public String getBperformanceNo() {
        return bperformanceNo;
    }

    public void setBperformanceNo(String bperformanceNo) {
        this.bperformanceNo = bperformanceNo;
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

    @Basic
    @Column(name = "aidx", nullable = false)
    public long getAidx() {
        return aidx;
    }

    public void setAidx(long aidx) {
        this.aidx = aidx;
    }

    @Basic
    @Column(name = "distrutor_id", nullable = true, length = 20)
    public String getDistrutorId() {
        return distrutorId;
    }

    public void setDistrutorId(String distrutorId) {
        this.distrutorId = distrutorId;
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
    @Column(name = "salesman_mobile_no", nullable = true, length = 20)
    public String getSalesmanMobileNo() {
        return salesmanMobileNo;
    }

    public void setSalesmanMobileNo(String salesmanMobileNo) {
        this.salesmanMobileNo = salesmanMobileNo;
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
    @Column(name = "commission_total_amt", nullable = true, precision = 6)
    public BigDecimal getCommissionTotalAmt() {
        return commissionTotalAmt;
    }

    public void setCommissionTotalAmt(BigDecimal commissionTotalAmt) {
        this.commissionTotalAmt = commissionTotalAmt;
    }

    @Basic
    @Column(name = "confirm_total_amt", nullable = true, precision = 6)
    public BigDecimal getConfirmTotalAmt() {
        return confirmTotalAmt;
    }

    public void setConfirmTotalAmt(BigDecimal confirmTotalAmt) {
        this.confirmTotalAmt = confirmTotalAmt;
    }

    @Basic
    @Column(name = "start_date", nullable = true)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "end_date", nullable = true)
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
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
    @Column(name = "exec_date", nullable = true)
    public Timestamp getExecDate() {
        return execDate;
    }

    public void setExecDate(Timestamp execDate) {
        this.execDate = execDate;
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
        VbSalesmanePerformance that = (VbSalesmanePerformance) o;
        return idx == that.idx &&
                aidx == that.aidx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(bperformanceNo, that.bperformanceNo) &&
                Objects.equals(distributeOrderDate, that.distributeOrderDate) &&
                Objects.equals(distributeOrderNo, that.distributeOrderNo) &&
                Objects.equals(distributeOrderAmt, that.distributeOrderAmt) &&
                Objects.equals(distributeRealAmt, that.distributeRealAmt) &&
                Objects.equals(commissionPrice, that.commissionPrice) &&
                Objects.equals(commissionAmt, that.commissionAmt) &&
                Objects.equals(commissionRate, that.commissionRate) &&
                Objects.equals(commissionConfirmAmt, that.commissionConfirmAmt) &&
                Objects.equals(commissionPaymentAmt, that.commissionPaymentAmt) &&
                Objects.equals(commissionState, that.commissionState) &&
                Objects.equals(distrutorId, that.distrutorId) &&
                Objects.equals(distributorName, that.distributorName) &&
                Objects.equals(salesmanId, that.salesmanId) &&
                Objects.equals(salesmanName, that.salesmanName) &&
                Objects.equals(salesmanMobileNo, that.salesmanMobileNo) &&
                Objects.equals(settleDate, that.settleDate) &&
                Objects.equals(commissionTotalAmt, that.commissionTotalAmt) &&
                Objects.equals(confirmTotalAmt, that.confirmTotalAmt) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(state, that.state) &&
                Objects.equals(chkBit, that.chkBit) &&
                Objects.equals(execDate, that.execDate) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, bperformanceNo, distributeOrderDate, distributeOrderNo, distributeOrderAmt
                , distributeRealAmt, commissionPrice, commissionAmt, commissionRate, commissionConfirmAmt,
                commissionPaymentAmt, commissionState, aidx, distrutorId, distributorName, salesmanId, salesmanName, salesmanMobileNo, settleDate, commissionTotalAmt, confirmTotalAmt, startDate, endDate, state, chkBit, execDate, createUser, createTime);
    }
}
