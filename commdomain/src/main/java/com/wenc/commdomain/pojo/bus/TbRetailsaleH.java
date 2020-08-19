package com.wenc.commdomain.pojo.bus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_retailsale_h")
public class TbRetailsaleH {
    private long idx;
    private String tenantId;
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
    @Column(name = "sale_no", nullable = true, length = 18)
    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    @Basic
    @Column(name = "shop_id", nullable = true, length = 15)
    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "pos_no", nullable = true, length = 12)
    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
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
    @Column(name = "shroff_id", nullable = true, length = 8)
    public String getShroffId() {
        return shroffId;
    }

    public void setShroffId(String shroffId) {
        this.shroffId = shroffId;
    }

    @Basic
    @Column(name = "salesman_id", nullable = true, length = 8)
    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId;
    }

    @Basic
    @Column(name = "claimman_id", nullable = true, length = 8)
    public String getClaimmanId() {
        return claimmanId;
    }

    public void setClaimmanId(String claimmanId) {
        this.claimmanId = claimmanId;
    }

    @Basic
    @Column(name = "discountman_id", nullable = true, length = 8)
    public String getDiscountmanId() {
        return discountmanId;
    }

    public void setDiscountmanId(String discountmanId) {
        this.discountmanId = discountmanId;
    }

    @Basic
    @Column(name = "changeman_id", nullable = true, length = 8)
    public String getChangemanId() {
        return changemanId;
    }

    public void setChangemanId(String changemanId) {
        this.changemanId = changemanId;
    }

    @Basic
    @Column(name = "giftman_id", nullable = true, length = 8)
    public String getGiftmanId() {
        return giftmanId;
    }

    public void setGiftmanId(String giftmanId) {
        this.giftmanId = giftmanId;
    }

    @Basic
    @Column(name = "debitman_id", nullable = true, length = 8)
    public String getDebitmanId() {
        return debitmanId;
    }

    public void setDebitmanId(String debitmanId) {
        this.debitmanId = debitmanId;
    }

    @Basic
    @Column(name = "reserver_id", nullable = true, length = 8)
    public String getReserverId() {
        return reserverId;
    }

    public void setReserverId(String reserverId) {
        this.reserverId = reserverId;
    }

    @Basic
    @Column(name = "operator_id", nullable = true, length = 8)
    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    @Basic
    @Column(name = "amount", nullable = true, precision = 6)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "real_amt", nullable = true, precision = 6)
    public BigDecimal getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(BigDecimal realAmt) {
        this.realAmt = realAmt;
    }

    @Basic
    @Column(name = "discount_amt", nullable = true, precision = 6)
    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(BigDecimal discountAmt) {
        this.discountAmt = discountAmt;
    }

    @Basic
    @Column(name = "doctor_id", nullable = true, length = 20)
    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    @Basic
    @Column(name = "patient_id", nullable = true, length = 20)
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "depart_id", nullable = true, length = 20)
    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    @Basic
    @Column(name = "ybcard_no", nullable = true, length = 50)
    public String getYbcardNo() {
        return ybcardNo;
    }

    public void setYbcardNo(String ybcardNo) {
        this.ybcardNo = ybcardNo;
    }

    @Basic
    @Column(name = "medrec_no", nullable = true, length = 20)
    public String getMedrecNo() {
        return medrecNo;
    }

    public void setMedrecNo(String medrecNo) {
        this.medrecNo = medrecNo;
    }

    @Basic
    @Column(name = "prescription_no", nullable = true, length = 20)
    public String getPrescriptionNo() {
        return prescriptionNo;
    }

    public void setPrescriptionNo(String prescriptionNo) {
        this.prescriptionNo = prescriptionNo;
    }

    @Basic
    @Column(name = "bill_type", nullable = true, length = 20)
    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    @Basic
    @Column(name = "bill_no", nullable = true, length = 20)
    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    @Basic
    @Column(name = "sale_type", nullable = true, length = 20)
    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    @Basic
    @Column(name = "oriorder_no", nullable = true, length = 45)
    public String getOriorderNo() {
        return oriorderNo;
    }

    public void setOriorderNo(String oriorderNo) {
        this.oriorderNo = oriorderNo;
    }

    @Basic
    @Column(name = "syn_state", nullable = true)
    public Integer getSynState() {
        return synState;
    }

    public void setSynState(Integer synState) {
        this.synState = synState;
    }

    @Basic
    @Column(name = "idcard_no", nullable = true, length = 50)
    public String getIdcardNo() {
        return idcardNo;
    }

    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo;
    }

    @Basic
    @Column(name = "custom_name", nullable = true, length = 20)
    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    @Basic
    @Column(name = "custom_telno", nullable = true, length = 20)
    public String getCustomTelno() {
        return customTelno;
    }

    public void setCustomTelno(String customTelno) {
        this.customTelno = customTelno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbRetailsaleH that = (TbRetailsaleH) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(saleNo, that.saleNo) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(posNo, that.posNo) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(shroffId, that.shroffId) &&
                Objects.equals(salesmanId, that.salesmanId) &&
                Objects.equals(claimmanId, that.claimmanId) &&
                Objects.equals(discountmanId, that.discountmanId) &&
                Objects.equals(changemanId, that.changemanId) &&
                Objects.equals(giftmanId, that.giftmanId) &&
                Objects.equals(debitmanId, that.debitmanId) &&
                Objects.equals(reserverId, that.reserverId) &&
                Objects.equals(operatorId, that.operatorId) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(realAmt, that.realAmt) &&
                Objects.equals(discountAmt, that.discountAmt) &&
                Objects.equals(doctorId, that.doctorId) &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(departId, that.departId) &&
                Objects.equals(ybcardNo, that.ybcardNo) &&
                Objects.equals(medrecNo, that.medrecNo) &&
                Objects.equals(prescriptionNo, that.prescriptionNo) &&
                Objects.equals(billType, that.billType) &&
                Objects.equals(billNo, that.billNo) &&
                Objects.equals(saleType, that.saleType) &&
                Objects.equals(oriorderNo, that.oriorderNo) &&
                Objects.equals(synState, that.synState) &&
                Objects.equals(idcardNo, that.idcardNo) &&
                Objects.equals(customName, that.customName) &&
                Objects.equals(customTelno, that.customTelno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, saleNo, shopId, posNo, startDate, endDate, shroffId, salesmanId,
                claimmanId, discountmanId, changemanId, giftmanId, debitmanId, reserverId, operatorId, amount, realAmt, discountAmt, doctorId, patientId, departId, ybcardNo, medrecNo, prescriptionNo, billType, billNo, saleType, oriorderNo, synState, idcardNo, customName, customTelno);
    }

    @Basic
    @Column(name = "vip_code", nullable = true, length = 30)
    public String getVipCode() {
        return vipCode;
    }

    public void setVipCode(String vipCode) {
        this.vipCode = vipCode;
    }
}
