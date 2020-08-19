package com.wenc.commdomain.pojo.bus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_reservation_account")
public class TbReservationAccount {
    private long idx;
    private String tenantId;
    private String reservationType;
    private Timestamp reservationDate;
    private String reservationNo;
    private String reservationUserName;
    private String reservationUserIdnum;
    private String reservationMobileNo;
    private String reservationMemo;
    private BigDecimal reservationAmt;
    private String paymentBillNo;
    private BigDecimal paymentAmt;
    private Timestamp paymentDate;
    private String paymentType;
    private String vendorTenantId;
    private String vendorId;
    private String vendorName;
    private String distributionTenantId;
    private String distributorId;
    private String distributionName;
    private String salesmanId;
    private String salesmanName;
    private String salesmanMobileNo;
    private String doState;
    private String writeoffCode;
    private Timestamp writeoffDate;
    private String writeoffUserId;
    private String confirmCode;
    private String itemId;
    private String itemName;
    private Integer state;
    private String createUser;
    private Timestamp createTime;
    private Long scheduleIdx;
    private String scheduleType;
    private String scheduleRangeType;
    private String distributionItemId;
    private String scheduleSiteId;
    private String scheduleSiteName;
    private String scheduleSiteAddress;

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
    @Column(name = "reservation_type", nullable = true, length = 20)
    public String getReservationType() {
        return reservationType;
    }

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    @Basic
    @Column(name = "reservation_date", nullable = true)
    public Timestamp getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Timestamp reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Basic
    @Column(name = "reservation_no", nullable = true, length = 30)
    public String getReservationNo() {
        return reservationNo;
    }

    public void setReservationNo(String reservationNo) {
        this.reservationNo = reservationNo;
    }

    @Basic
    @Column(name = "reservation_user_name", nullable = true, length = 20)
    public String getReservationUserName() {
        return reservationUserName;
    }

    public void setReservationUserName(String reservationUserName) {
        this.reservationUserName = reservationUserName;
    }

    @Basic
    @Column(name = "reservation_user_idnum", nullable = true, length = 50)
    public String getReservationUserIdnum() {
        return reservationUserIdnum;
    }

    public void setReservationUserIdnum(String reservationUserIdnum) {
        this.reservationUserIdnum = reservationUserIdnum;
    }

    @Basic
    @Column(name = "reservation_mobile_no", nullable = true, length = 20)
    public String getReservationMobileNo() {
        return reservationMobileNo;
    }

    public void setReservationMobileNo(String reservationMobileNo) {
        this.reservationMobileNo = reservationMobileNo;
    }

    @Basic
    @Column(name = "reservation_memo", nullable = true, length = 100)
    public String getReservationMemo() {
        return reservationMemo;
    }

    public void setReservationMemo(String reservationMemo) {
        this.reservationMemo = reservationMemo;
    }

    @Basic
    @Column(name = "reservation_amt", nullable = true, precision = 6)
    public BigDecimal getReservationAmt() {
        return reservationAmt;
    }

    public void setReservationAmt(BigDecimal reservationAmt) {
        this.reservationAmt = reservationAmt;
    }

    @Basic
    @Column(name = "payment_bill_no", nullable = true, length = 100)
    public String getPaymentBillNo() {
        return paymentBillNo;
    }

    public void setPaymentBillNo(String paymentBillNo) {
        this.paymentBillNo = paymentBillNo;
    }

    @Basic
    @Column(name = "payment_amt", nullable = true, precision = 6)
    public BigDecimal getPaymentAmt() {
        return paymentAmt;
    }

    public void setPaymentAmt(BigDecimal paymentAmt) {
        this.paymentAmt = paymentAmt;
    }

    @Basic
    @Column(name = "payment_date", nullable = true)
    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Basic
    @Column(name = "payment_type", nullable = true, length = 20)
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
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
    @Column(name = "vendor_id", nullable = true, length = 30)
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
    @Column(name = "distribution_tenant_id", nullable = true, length = 50)
    public String getDistributionTenantId() {
        return distributionTenantId;
    }

    public void setDistributionTenantId(String distributionTenantId) {
        this.distributionTenantId = distributionTenantId;
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
    @Column(name = "distribution_name", nullable = true, length = 50)
    public String getDistributionName() {
        return distributionName;
    }

    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName;
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
    @Column(name = "salesman_name", nullable = true, length = 50)
    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    @Basic
    @Column(name = "salesman_mobile_no", nullable = true, length = 50)
    public String getSalesmanMobileNo() {
        return salesmanMobileNo;
    }

    public void setSalesmanMobileNo(String salesmanMobileNo) {
        this.salesmanMobileNo = salesmanMobileNo;
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
    @Column(name = "writeoff_user_id", nullable = true, length = 20)
    public String getWriteoffUserId() {
        return writeoffUserId;
    }

    public void setWriteoffUserId(String writeoffUserId) {
        this.writeoffUserId = writeoffUserId;
    }

    @Basic
    @Column(name = "confirm_code", nullable = true, length = 20)
    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
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
    @Column(name = "item_name", nullable = true, length = 200)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "schedule_idx", nullable = true)
    public Long getScheduleIdx() {
        return scheduleIdx;
    }

    public void setScheduleIdx(Long scheduleIdx) {
        this.scheduleIdx = scheduleIdx;
    }

    @Basic
    @Column(name = "schedule_type", nullable = true, length = 20)
    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    @Basic
    @Column(name = "schedule_range_type", nullable = true, length = 255)
    public String getScheduleRangeType() {
        return scheduleRangeType;
    }

    public void setScheduleRangeType(String scheduleRangeType) {
        this.scheduleRangeType = scheduleRangeType;
    }

    @Basic
    @Column(name = "distribution_item_id", nullable = true, length = 20)
    public String getDistributionItemId() {
        return distributionItemId;
    }

    public void setDistributionItemId(String distributionItemId) {
        this.distributionItemId = distributionItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbReservationAccount that = (TbReservationAccount) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(reservationType, that.reservationType) &&
                Objects.equals(reservationDate, that.reservationDate) &&
                Objects.equals(reservationNo, that.reservationNo) &&
                Objects.equals(reservationUserName, that.reservationUserName) &&
                Objects.equals(reservationUserIdnum, that.reservationUserIdnum) &&
                Objects.equals(reservationMobileNo, that.reservationMobileNo) &&
                Objects.equals(reservationMemo, that.reservationMemo) &&
                Objects.equals(reservationAmt, that.reservationAmt) &&
                Objects.equals(paymentBillNo, that.paymentBillNo) &&
                Objects.equals(paymentAmt, that.paymentAmt) &&
                Objects.equals(paymentDate, that.paymentDate) &&
                Objects.equals(paymentType, that.paymentType) &&
                Objects.equals(vendorTenantId, that.vendorTenantId) &&
                Objects.equals(vendorId, that.vendorId) &&
                Objects.equals(vendorName, that.vendorName) &&
                Objects.equals(distributionTenantId, that.distributionTenantId) &&
                Objects.equals(distributorId, that.distributorId) &&
                Objects.equals(distributionName, that.distributionName) &&
                Objects.equals(salesmanId, that.salesmanId) &&
                Objects.equals(salesmanName, that.salesmanName) &&
                Objects.equals(salesmanMobileNo, that.salesmanMobileNo) &&
                Objects.equals(doState, that.doState) &&
                Objects.equals(writeoffCode, that.writeoffCode) &&
                Objects.equals(writeoffDate, that.writeoffDate) &&
                Objects.equals(writeoffUserId, that.writeoffUserId) &&
                Objects.equals(confirmCode, that.confirmCode) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(scheduleIdx, that.scheduleIdx) &&
                Objects.equals(scheduleType, that.scheduleType) &&
                Objects.equals(scheduleRangeType, that.scheduleRangeType) &&
                Objects.equals(distributionItemId, that.distributionItemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, reservationType, reservationDate, reservationNo, reservationUserName,
                reservationUserIdnum, reservationMobileNo, reservationMemo, reservationAmt, paymentBillNo, paymentAmt
                , paymentDate, paymentType, vendorTenantId, vendorId, vendorName, distributionTenantId, distributorId
                , distributionName, salesmanId, salesmanName, salesmanMobileNo, doState, writeoffCode, writeoffDate, writeoffUserId, confirmCode, itemId, itemName, state, createUser, createTime, scheduleIdx, scheduleType, scheduleRangeType, distributionItemId);
    }

    @Basic
    @Column(name = "schedule_site_id", nullable = true, length = 20)
    public String getScheduleSiteId() {
        return scheduleSiteId;
    }

    public void setScheduleSiteId(String scheduleSiteId) {
        this.scheduleSiteId = scheduleSiteId;
    }

    @Basic
    @Column(name = "schedule_site_name", nullable = true, length = 100)
    public String getScheduleSiteName() {
        return scheduleSiteName;
    }

    public void setScheduleSiteName(String scheduleSiteName) {
        this.scheduleSiteName = scheduleSiteName;
    }

    @Basic
    @Column(name = "schedule_site_address", nullable = true, length = 200)
    public String getScheduleSiteAddress() {
        return scheduleSiteAddress;
    }

    public void setScheduleSiteAddress(String scheduleSiteAddress) {
        this.scheduleSiteAddress = scheduleSiteAddress;
    }
}
