package com.wenc.commdomain.dto.bus;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 预留申请提交DTO
 *
 */
public class ReservationApplicationDTO {

    private Long   distribProductIdx;
    private String reservationType;
    private Timestamp reservationDate;
    private String reservationUserName;
    private String reservationUserIdnum;
    private String reservationMobileNo;
    private String reservationMemo;
    private BigDecimal reservationAmt;
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
    private String writeoffCode;
    private String confirmCode;
    private String itemId;
    private String itemName;

    private Long   productScheduleIdx;

    private String spreadKey;



    public String getSpreadKey() {
        return spreadKey;
    }

    public void setSpreadKey(String spreadKey) {
        this.spreadKey = spreadKey;
    }

    public Long getProductScheduleIdx() {
        return productScheduleIdx;
    }

    public void setProductScheduleIdx(Long productScheduleIdx) {
        this.productScheduleIdx = productScheduleIdx;
    }

    public Long getDistribProductIdx() {
        return distribProductIdx;
    }

    public void setDistribProductIdx(Long distribProductIdx) {
        this.distribProductIdx = distribProductIdx;
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

    public String getWriteoffCode() {
        return writeoffCode;
    }

    public void setWriteoffCode(String writeoffCode) {
        this.writeoffCode = writeoffCode;
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
}
