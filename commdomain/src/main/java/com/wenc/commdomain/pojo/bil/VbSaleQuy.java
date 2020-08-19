package com.wenc.commdomain.pojo.bil;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_sale_quy")
public class VbSaleQuy {
    private long idx;
    private String tenantId;
    private Integer rowNo;
    private Integer goodsSnf;
    private String barCode;
    private String itemId;
    private String shipNo;
    private String depotId;
    private BigDecimal salePrice;
    private BigDecimal itemQty;
    private Integer saleTomin;
    private BigDecimal minPrice;
    private BigDecimal minQty;
    private BigDecimal realPrice;
    private BigDecimal itemRate;
    private String rateType;
    private String rateCause;
    private String promNo;
    private String fileNo;
    private BigDecimal saleAmt;
    private BigDecimal brealAmt;
    private String notes;
    private String clerkerId;
    private BigDecimal clerkAmt;
    private String costType;
    private String outDepotid;
    private String ifLimit;
    private BigDecimal limitQty;
    private String ifProm;
    private String promDescr;
    private BigDecimal matchQty;
    private BigDecimal matchAmt;
    private String itemType;
    private String promType;
    private BigDecimal rateQty;
    private BigDecimal rateAmt;
    private Integer presQty;
    private String parentItemid;
    private long aidx;
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
    private BigDecimal realAmtSum;
    private BigDecimal discountAmtSum;
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
    private String itemName;
    private String itemSpec;
    private String itemUnit;
    private String prdFactory;
    private String prdOrigin;

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
    @Column(name = "row_no", nullable = true)
    public Integer getRowNo() {
        return rowNo;
    }

    public void setRowNo(Integer rowNo) {
        this.rowNo = rowNo;
    }

    @Basic
    @Column(name = "goods_snf", nullable = true)
    public Integer getGoodsSnf() {
        return goodsSnf;
    }

    public void setGoodsSnf(Integer goodsSnf) {
        this.goodsSnf = goodsSnf;
    }

    @Basic
    @Column(name = "bar_code", nullable = true, length = 13)
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Basic
    @Column(name = "item_id", nullable = true, length = 13)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "ship_no", nullable = true, length = 20)
    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    @Basic
    @Column(name = "depot_id", nullable = true, length = 15)
    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    @Basic
    @Column(name = "sale_price", nullable = true, precision = 6)
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    @Basic
    @Column(name = "item_qty", nullable = true, precision = 3)
    public BigDecimal getItemQty() {
        return itemQty;
    }

    public void setItemQty(BigDecimal itemQty) {
        this.itemQty = itemQty;
    }

    @Basic
    @Column(name = "sale_tomin", nullable = true)
    public Integer getSaleTomin() {
        return saleTomin;
    }

    public void setSaleTomin(Integer saleTomin) {
        this.saleTomin = saleTomin;
    }

    @Basic
    @Column(name = "min_price", nullable = true, precision = 6)
    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    @Basic
    @Column(name = "min_qty", nullable = true, precision = 3)
    public BigDecimal getMinQty() {
        return minQty;
    }

    public void setMinQty(BigDecimal minQty) {
        this.minQty = minQty;
    }

    @Basic
    @Column(name = "real_price", nullable = true, precision = 6)
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    @Basic
    @Column(name = "item_rate", nullable = true, precision = 2)
    public BigDecimal getItemRate() {
        return itemRate;
    }

    public void setItemRate(BigDecimal itemRate) {
        this.itemRate = itemRate;
    }

    @Basic
    @Column(name = "rate_type", nullable = true, length = 3)
    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    @Basic
    @Column(name = "rate_cause", nullable = true, length = 30)
    public String getRateCause() {
        return rateCause;
    }

    public void setRateCause(String rateCause) {
        this.rateCause = rateCause;
    }

    @Basic
    @Column(name = "prom_no", nullable = true, length = 12)
    public String getPromNo() {
        return promNo;
    }

    public void setPromNo(String promNo) {
        this.promNo = promNo;
    }

    @Basic
    @Column(name = "file_no", nullable = true, length = 20)
    public String getFileNo() {
        return fileNo;
    }

    public void setFileNo(String fileNo) {
        this.fileNo = fileNo;
    }

    @Basic
    @Column(name = "sale_amt", nullable = true, precision = 6)
    public BigDecimal getSaleAmt() {
        return saleAmt;
    }

    public void setSaleAmt(BigDecimal saleAmt) {
        this.saleAmt = saleAmt;
    }

    @Basic
    @Column(name = "breal_amt", nullable = true, precision = 6)
    public BigDecimal getBrealAmt() {
        return brealAmt;
    }

    public void setBrealAmt(BigDecimal brealAmt) {
        this.brealAmt = brealAmt;
    }

    @Basic
    @Column(name = "notes", nullable = true, length = 40)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "clerker_id", nullable = true, length = 12)
    public String getClerkerId() {
        return clerkerId;
    }

    public void setClerkerId(String clerkerId) {
        this.clerkerId = clerkerId;
    }

    @Basic
    @Column(name = "clerk_amt", nullable = true, precision = 6)
    public BigDecimal getClerkAmt() {
        return clerkAmt;
    }

    public void setClerkAmt(BigDecimal clerkAmt) {
        this.clerkAmt = clerkAmt;
    }

    @Basic
    @Column(name = "cost_type", nullable = true, length = 20)
    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    @Basic
    @Column(name = "out_depotid", nullable = true, length = 20)
    public String getOutDepotid() {
        return outDepotid;
    }

    public void setOutDepotid(String outDepotid) {
        this.outDepotid = outDepotid;
    }

    @Basic
    @Column(name = "if_limit", nullable = true, length = 10)
    public String getIfLimit() {
        return ifLimit;
    }

    public void setIfLimit(String ifLimit) {
        this.ifLimit = ifLimit;
    }

    @Basic
    @Column(name = "limit_qty", nullable = true, precision = 2)
    public BigDecimal getLimitQty() {
        return limitQty;
    }

    public void setLimitQty(BigDecimal limitQty) {
        this.limitQty = limitQty;
    }

    @Basic
    @Column(name = "if_prom", nullable = true, length = 10)
    public String getIfProm() {
        return ifProm;
    }

    public void setIfProm(String ifProm) {
        this.ifProm = ifProm;
    }

    @Basic
    @Column(name = "prom_descr", nullable = true, length = 255)
    public String getPromDescr() {
        return promDescr;
    }

    public void setPromDescr(String promDescr) {
        this.promDescr = promDescr;
    }

    @Basic
    @Column(name = "match_qty", nullable = true, precision = 2)
    public BigDecimal getMatchQty() {
        return matchQty;
    }

    public void setMatchQty(BigDecimal matchQty) {
        this.matchQty = matchQty;
    }

    @Basic
    @Column(name = "match_amt", nullable = true, precision = 6)
    public BigDecimal getMatchAmt() {
        return matchAmt;
    }

    public void setMatchAmt(BigDecimal matchAmt) {
        this.matchAmt = matchAmt;
    }

    @Basic
    @Column(name = "item_type", nullable = true, length = 20)
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Basic
    @Column(name = "prom_type", nullable = true, length = 20)
    public String getPromType() {
        return promType;
    }

    public void setPromType(String promType) {
        this.promType = promType;
    }

    @Basic
    @Column(name = "rate_qty", nullable = true, precision = 2)
    public BigDecimal getRateQty() {
        return rateQty;
    }

    public void setRateQty(BigDecimal rateQty) {
        this.rateQty = rateQty;
    }

    @Basic
    @Column(name = "rate_amt", nullable = true, precision = 6)
    public BigDecimal getRateAmt() {
        return rateAmt;
    }

    public void setRateAmt(BigDecimal rateAmt) {
        this.rateAmt = rateAmt;
    }

    @Basic
    @Column(name = "pres_qty", nullable = true)
    public Integer getPresQty() {
        return presQty;
    }

    public void setPresQty(Integer presQty) {
        this.presQty = presQty;
    }

    @Basic
    @Column(name = "parent_itemid", nullable = true, length = 20)
    public String getParentItemid() {
        return parentItemid;
    }

    public void setParentItemid(String parentItemid) {
        this.parentItemid = parentItemid;
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
    @Column(name = "sale_no", nullable = true, length = 30)
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
    @Column(name = "shroff_id", nullable = true, length = 20)
    public String getShroffId() {
        return shroffId;
    }

    public void setShroffId(String shroffId) {
        this.shroffId = shroffId;
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
    @Column(name = "claimman_id", nullable = true, length = 20)
    public String getClaimmanId() {
        return claimmanId;
    }

    public void setClaimmanId(String claimmanId) {
        this.claimmanId = claimmanId;
    }

    @Basic
    @Column(name = "discountman_id", nullable = true, length = 20)
    public String getDiscountmanId() {
        return discountmanId;
    }

    public void setDiscountmanId(String discountmanId) {
        this.discountmanId = discountmanId;
    }

    @Basic
    @Column(name = "changeman_id", nullable = true, length = 20)
    public String getChangemanId() {
        return changemanId;
    }

    public void setChangemanId(String changemanId) {
        this.changemanId = changemanId;
    }

    @Basic
    @Column(name = "giftman_id", nullable = true, length = 20)
    public String getGiftmanId() {
        return giftmanId;
    }

    public void setGiftmanId(String giftmanId) {
        this.giftmanId = giftmanId;
    }

    @Basic
    @Column(name = "debitman_id", nullable = true, length = 20)
    public String getDebitmanId() {
        return debitmanId;
    }

    public void setDebitmanId(String debitmanId) {
        this.debitmanId = debitmanId;
    }

    @Basic
    @Column(name = "reserver_id", nullable = true, length = 20)
    public String getReserverId() {
        return reserverId;
    }

    public void setReserverId(String reserverId) {
        this.reserverId = reserverId;
    }

    @Basic
    @Column(name = "operator_id", nullable = true, length = 20)
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
    @Column(name = "real_amt_sum", nullable = true, precision = 6)
    public BigDecimal getRealAmtSum() {
        return realAmtSum;
    }

    public void setRealAmtSum(BigDecimal realAmtSum) {
        this.realAmtSum = realAmtSum;
    }

    @Basic
    @Column(name = "discount_amt_sum", nullable = true, precision = 6)
    public BigDecimal getDiscountAmtSum() {
        return discountAmtSum;
    }

    public void setDiscountAmtSum(BigDecimal discountAmtSum) {
        this.discountAmtSum = discountAmtSum;
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

    @Basic
    @Column(name = "vip_code", nullable = true, length = 30)
    public String getVipCode() {
        return vipCode;
    }

    public void setVipCode(String vipCode) {
        this.vipCode = vipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbSaleQuy vbSaleQuy = (VbSaleQuy) o;
        return idx == vbSaleQuy.idx &&
                aidx == vbSaleQuy.aidx &&
                Objects.equals(tenantId, vbSaleQuy.tenantId) &&
                Objects.equals(rowNo, vbSaleQuy.rowNo) &&
                Objects.equals(goodsSnf, vbSaleQuy.goodsSnf) &&
                Objects.equals(barCode, vbSaleQuy.barCode) &&
                Objects.equals(itemId, vbSaleQuy.itemId) &&
                Objects.equals(shipNo, vbSaleQuy.shipNo) &&
                Objects.equals(depotId, vbSaleQuy.depotId) &&
                Objects.equals(salePrice, vbSaleQuy.salePrice) &&
                Objects.equals(itemQty, vbSaleQuy.itemQty) &&
                Objects.equals(saleTomin, vbSaleQuy.saleTomin) &&
                Objects.equals(minPrice, vbSaleQuy.minPrice) &&
                Objects.equals(minQty, vbSaleQuy.minQty) &&
                Objects.equals(realPrice, vbSaleQuy.realPrice) &&
                Objects.equals(itemRate, vbSaleQuy.itemRate) &&
                Objects.equals(rateType, vbSaleQuy.rateType) &&
                Objects.equals(rateCause, vbSaleQuy.rateCause) &&
                Objects.equals(promNo, vbSaleQuy.promNo) &&
                Objects.equals(fileNo, vbSaleQuy.fileNo) &&
                Objects.equals(saleAmt, vbSaleQuy.saleAmt) &&
                Objects.equals(brealAmt, vbSaleQuy.brealAmt) &&
                Objects.equals(notes, vbSaleQuy.notes) &&
                Objects.equals(clerkerId, vbSaleQuy.clerkerId) &&
                Objects.equals(clerkAmt, vbSaleQuy.clerkAmt) &&
                Objects.equals(costType, vbSaleQuy.costType) &&
                Objects.equals(outDepotid, vbSaleQuy.outDepotid) &&
                Objects.equals(ifLimit, vbSaleQuy.ifLimit) &&
                Objects.equals(limitQty, vbSaleQuy.limitQty) &&
                Objects.equals(ifProm, vbSaleQuy.ifProm) &&
                Objects.equals(promDescr, vbSaleQuy.promDescr) &&
                Objects.equals(matchQty, vbSaleQuy.matchQty) &&
                Objects.equals(matchAmt, vbSaleQuy.matchAmt) &&
                Objects.equals(itemType, vbSaleQuy.itemType) &&
                Objects.equals(promType, vbSaleQuy.promType) &&
                Objects.equals(rateQty, vbSaleQuy.rateQty) &&
                Objects.equals(rateAmt, vbSaleQuy.rateAmt) &&
                Objects.equals(presQty, vbSaleQuy.presQty) &&
                Objects.equals(parentItemid, vbSaleQuy.parentItemid) &&
                Objects.equals(saleNo, vbSaleQuy.saleNo) &&
                Objects.equals(shopId, vbSaleQuy.shopId) &&
                Objects.equals(posNo, vbSaleQuy.posNo) &&
                Objects.equals(startDate, vbSaleQuy.startDate) &&
                Objects.equals(endDate, vbSaleQuy.endDate) &&
                Objects.equals(shroffId, vbSaleQuy.shroffId) &&
                Objects.equals(salesmanId, vbSaleQuy.salesmanId) &&
                Objects.equals(claimmanId, vbSaleQuy.claimmanId) &&
                Objects.equals(discountmanId, vbSaleQuy.discountmanId) &&
                Objects.equals(changemanId, vbSaleQuy.changemanId) &&
                Objects.equals(giftmanId, vbSaleQuy.giftmanId) &&
                Objects.equals(debitmanId, vbSaleQuy.debitmanId) &&
                Objects.equals(reserverId, vbSaleQuy.reserverId) &&
                Objects.equals(operatorId, vbSaleQuy.operatorId) &&
                Objects.equals(amount, vbSaleQuy.amount) &&
                Objects.equals(realAmtSum, vbSaleQuy.realAmtSum) &&
                Objects.equals(discountAmtSum, vbSaleQuy.discountAmtSum) &&
                Objects.equals(doctorId, vbSaleQuy.doctorId) &&
                Objects.equals(patientId, vbSaleQuy.patientId) &&
                Objects.equals(departId, vbSaleQuy.departId) &&
                Objects.equals(ybcardNo, vbSaleQuy.ybcardNo) &&
                Objects.equals(medrecNo, vbSaleQuy.medrecNo) &&
                Objects.equals(prescriptionNo, vbSaleQuy.prescriptionNo) &&
                Objects.equals(billType, vbSaleQuy.billType) &&
                Objects.equals(billNo, vbSaleQuy.billNo) &&
                Objects.equals(saleType, vbSaleQuy.saleType) &&
                Objects.equals(oriorderNo, vbSaleQuy.oriorderNo) &&
                Objects.equals(synState, vbSaleQuy.synState) &&
                Objects.equals(idcardNo, vbSaleQuy.idcardNo) &&
                Objects.equals(customName, vbSaleQuy.customName) &&
                Objects.equals(customTelno, vbSaleQuy.customTelno) &&
                Objects.equals(vipCode, vbSaleQuy.vipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, rowNo, goodsSnf, barCode, itemId, shipNo, depotId, salePrice, itemQty,
                saleTomin, minPrice, minQty, realPrice, itemRate, rateType, rateCause, promNo, fileNo, saleAmt,
                brealAmt, notes, clerkerId, clerkAmt, costType, outDepotid, ifLimit, limitQty, ifProm, promDescr,
                matchQty, matchAmt, itemType, promType, rateQty, rateAmt, presQty, parentItemid, aidx, saleNo, shopId
                , posNo, startDate, endDate, shroffId, salesmanId, claimmanId, discountmanId, changemanId, giftmanId, debitmanId, reserverId, operatorId, amount, realAmtSum, discountAmtSum, doctorId, patientId, departId, ybcardNo, medrecNo, prescriptionNo, billType, billNo, saleType, oriorderNo, synState, idcardNo, customName, customTelno, vipCode);
    }

    @Basic
    @Column(name = "item_name", nullable = true, length = 100)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "item_spec", nullable = true, length = 80)
    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    @Basic
    @Column(name = "item_unit", nullable = true, length = 3)
    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    @Basic
    @Column(name = "prd_factory", nullable = true, length = 60)
    public String getPrdFactory() {
        return prdFactory;
    }

    public void setPrdFactory(String prdFactory) {
        this.prdFactory = prdFactory;
    }

    @Basic
    @Column(name = "prd_origin", nullable = true, length = 20)
    public String getPrdOrigin() {
        return prdOrigin;
    }

    public void setPrdOrigin(String prdOrigin) {
        this.prdOrigin = prdOrigin;
    }
}
