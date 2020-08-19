package com.wenc.commdomain.pojo.dsb;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_salesman_performance_h")
public class TbSalesmanPerformanceH {
    private long idx;
    private String tenantId;
    private String performanceNo;
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
    private BigDecimal totalOrderAmt;
    private BigDecimal totalPaymentAmt;
    private BigDecimal isvServiceRate;
    private BigDecimal isvServiceAmt;
    private String doState;

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
        TbSalesmanPerformanceH that = (TbSalesmanPerformanceH) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(performanceNo, that.performanceNo) &&
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
        return Objects.hash(idx, tenantId, performanceNo, distrutorId, distributorName, salesmanId, salesmanName,
                salesmanMobileNo, settleDate, commissionTotalAmt, confirmTotalAmt, startDate, endDate, state, chkBit, execDate, createUser, createTime);
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
    @Column(name = "total_payment_amt", nullable = true, precision = 6)
    public BigDecimal getTotalPaymentAmt() {
        return totalPaymentAmt;
    }

    public void setTotalPaymentAmt(BigDecimal totalPaymentAmt) {
        this.totalPaymentAmt = totalPaymentAmt;
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

    @Basic
    @Column(name = "do_state", nullable = true, length = 20)
    public String getDoState() {
        return doState;
    }

    public void setDoState(String doState) {
        this.doState = doState;
    }
}
