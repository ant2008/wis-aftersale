package com.wenc.commdomain.vo.bus;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

public class RetailSaleDetailVO {

    private long idx;

    private String saleNo;
    private String shopId;
    private String posNo;
    private Timestamp startDate;
    private Timestamp endDate;
    private String shroffId;
    private String salesmanId;
    private String claimmanId;
    private String discountmanId;
    private String changemanId;
    private String giftmanId;
    private String debitmanId;
    private String reserverId;
    private String operatorId;
    private BigDecimal amount;
    private BigDecimal realAmt;
    private BigDecimal discountAmt;
    private String doctorId;
    private String patientId;
    private String departId;
    private String ybcardNo;
    private String medrecNo;
    private String prescriptionNo;
    private String billType;
    private String billNo;
    private String saleType;
    private String oriorderNo;
    private Integer synState;
    private String idcardNo;
    private String customName;
    private String customTelno;
    private String vipCode;

    private List<RetailSaleDetailItemVO> retailSaleDetailItemVOS;

    private List<RetailSaleDetailPayVO> retailSaleDetailPayVOS;


    public List<RetailSaleDetailPayVO> getRetailSaleDetailPayVOS() {
        return retailSaleDetailPayVOS;
    }

    public void setRetailSaleDetailPayVOS(List<RetailSaleDetailPayVO> retailSaleDetailPayVOS) {
        this.retailSaleDetailPayVOS = retailSaleDetailPayVOS;
    }

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public String getShroffId() {
        return shroffId;
    }

    public void setShroffId(String shroffId) {
        this.shroffId = shroffId;
    }

    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId;
    }

    public String getClaimmanId() {
        return claimmanId;
    }

    public void setClaimmanId(String claimmanId) {
        this.claimmanId = claimmanId;
    }

    public String getDiscountmanId() {
        return discountmanId;
    }

    public void setDiscountmanId(String discountmanId) {
        this.discountmanId = discountmanId;
    }

    public String getChangemanId() {
        return changemanId;
    }

    public void setChangemanId(String changemanId) {
        this.changemanId = changemanId;
    }

    public String getGiftmanId() {
        return giftmanId;
    }

    public void setGiftmanId(String giftmanId) {
        this.giftmanId = giftmanId;
    }

    public String getDebitmanId() {
        return debitmanId;
    }

    public void setDebitmanId(String debitmanId) {
        this.debitmanId = debitmanId;
    }

    public String getReserverId() {
        return reserverId;
    }

    public void setReserverId(String reserverId) {
        this.reserverId = reserverId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(BigDecimal realAmt) {
        this.realAmt = realAmt;
    }

    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(BigDecimal discountAmt) {
        this.discountAmt = discountAmt;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getYbcardNo() {
        return ybcardNo;
    }

    public void setYbcardNo(String ybcardNo) {
        this.ybcardNo = ybcardNo;
    }

    public String getMedrecNo() {
        return medrecNo;
    }

    public void setMedrecNo(String medrecNo) {
        this.medrecNo = medrecNo;
    }

    public String getPrescriptionNo() {
        return prescriptionNo;
    }

    public void setPrescriptionNo(String prescriptionNo) {
        this.prescriptionNo = prescriptionNo;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public String getOriorderNo() {
        return oriorderNo;
    }

    public void setOriorderNo(String oriorderNo) {
        this.oriorderNo = oriorderNo;
    }

    public Integer getSynState() {
        return synState;
    }

    public void setSynState(Integer synState) {
        this.synState = synState;
    }

    public String getIdcardNo() {
        return idcardNo;
    }

    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public String getCustomTelno() {
        return customTelno;
    }

    public void setCustomTelno(String customTelno) {
        this.customTelno = customTelno;
    }

    public String getVipCode() {
        return vipCode;
    }

    public void setVipCode(String vipCode) {
        this.vipCode = vipCode;
    }

    public List<RetailSaleDetailItemVO> getRetailSaleDetailItemVOS() {
        return retailSaleDetailItemVOS;
    }

    public void setRetailSaleDetailItemVOS(List<RetailSaleDetailItemVO> retailSaleDetailItemVOS) {
        this.retailSaleDetailItemVOS = retailSaleDetailItemVOS;
    }
}
