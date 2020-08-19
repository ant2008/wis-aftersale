package com.wenc.commdomain.vo.dsb;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ReservationPaymentVO {

    private long idx;
    private Long distribProductIdx;
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
    private String distributiorId;
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
    private Timestamp createTime;
    private String vendorAddress;
    private Long scheduleIdx;
    private String scheduleType;
    private String scheduleRangeType;


    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }



    public Long getScheduleIdx() {
        return scheduleIdx;
    }

    public void setScheduleIdx(Long scheduleIdx) {
        this.scheduleIdx = scheduleIdx;
    }

    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public String getScheduleRangeType() {
        return scheduleRangeType;
    }

    public void setScheduleRangeType(String scheduleRangeType) {
        this.scheduleRangeType = scheduleRangeType;
    }

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public Long getDistribProductIdx() {
        return distribProductIdx;
    }

    public void setDistribProductIdx(Long distribProductIdx) {
        this.distribProductIdx = distribProductIdx;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getReservationType() {
        return reservationType;
    }

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    public Timestamp getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Timestamp reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservationNo() {
        return reservationNo;
    }

    public void setReservationNo(String reservationNo) {
        this.reservationNo = reservationNo;
    }

    public String getReservationUserName() {
        return reservationUserName;
    }

    public void setReservationUserName(String reservationUserName) {
        this.reservationUserName = reservationUserName;
    }

    public String getReservationUserIdnum() {
        return reservationUserIdnum;
    }

    public void setReservationUserIdnum(String reservationUserIdnum) {
        this.reservationUserIdnum = reservationUserIdnum;
    }

    public String getReservationMobileNo() {
        return reservationMobileNo;
    }

    public void setReservationMobileNo(String reservationMobileNo) {
        this.reservationMobileNo = reservationMobileNo;
    }

    public String getReservationMemo() {
        return reservationMemo;
    }

    public void setReservationMemo(String reservationMemo) {
        this.reservationMemo = reservationMemo;
    }

    public BigDecimal getReservationAmt() {
        return reservationAmt;
    }

    public void setReservationAmt(BigDecimal reservationAmt) {
        this.reservationAmt = reservationAmt;
    }

    public String getPaymentBillNo() {
        return paymentBillNo;
    }

    public void setPaymentBillNo(String paymentBillNo) {
        this.paymentBillNo = paymentBillNo;
    }

    public BigDecimal getPaymentAmt() {
        return paymentAmt;
    }

    public void setPaymentAmt(BigDecimal paymentAmt) {
        this.paymentAmt = paymentAmt;
    }

    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getVendorTenantId() {
        return vendorTenantId;
    }

    public void setVendorTenantId(String vendorTenantId) {
        this.vendorTenantId = vendorTenantId;
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

    public String getDistributionTenantId() {
        return distributionTenantId;
    }

    public void setDistributionTenantId(String distributionTenantId) {
        this.distributionTenantId = distributionTenantId;
    }

    public String getDistributiorId() {
        return distributiorId;
    }

    public void setDistributiorId(String distributiorId) {
        this.distributiorId = distributiorId;
    }

    public String getDistributionName() {
        return distributionName;
    }

    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName;
    }

    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public String getSalesmanMobileNo() {
        return salesmanMobileNo;
    }

    public void setSalesmanMobileNo(String salesmanMobileNo) {
        this.salesmanMobileNo = salesmanMobileNo;
    }

    public String getDoState() {
        return doState;
    }

    public void setDoState(String doState) {
        this.doState = doState;
    }

    public String getWriteoffCode() {
        return writeoffCode;
    }

    public void setWriteoffCode(String writeoffCode) {
        this.writeoffCode = writeoffCode;
    }

    public Timestamp getWriteoffDate() {
        return writeoffDate;
    }

    public void setWriteoffDate(Timestamp writeoffDate) {
        this.writeoffDate = writeoffDate;
    }

    public String getWriteoffUserId() {
        return writeoffUserId;
    }

    public void setWriteoffUserId(String writeoffUserId) {
        this.writeoffUserId = writeoffUserId;
    }

    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
