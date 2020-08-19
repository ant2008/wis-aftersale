package com.wenc.commdomain.pojo.aftersale;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "vb_afterorder_d")
public class VbAfterorderD {
    private Integer idx;
    private String tenantId;
    private String aftersaleOrderNo;
    private String itemId;
    private String itemClassCode;
    private String itemClassDescr;
    private BigDecimal orderPrice;
    private BigDecimal salePrice;
    private BigDecimal realPrice;
    private BigDecimal orderQty;
    private BigDecimal orderAmt;
    private BigDecimal realAmt;
    private String problemCode;
    private String problemDescr;
    private String problemDetailDescr;
    private String maintainRequestDescr;
    private String memo;
    private String resultDescr;
    private String itemName;
    private String itemSpec;
    private String prdOrigin;
    private String prdFactory;
    private String masterImages;
    private String detailImages;
    private String itemUnit;
    private String policyDescribe;
    private String maintainDescribe;
    private String costDescribe;
    private String otherDescribe;
    private String memoDescribe;
    private String itemUnitDescr;

    @Id
    @Basic
    @Column(name = "idx")
    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    @Basic
    @Column(name = "tenant_id")
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "aftersale_order_no")
    public String getAftersaleOrderNo() {
        return aftersaleOrderNo;
    }

    public void setAftersaleOrderNo(String aftersaleOrderNo) {
        this.aftersaleOrderNo = aftersaleOrderNo;
    }

    @Basic
    @Column(name = "item_id")
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "item_class_code")
    public String getItemClassCode() {
        return itemClassCode;
    }

    public void setItemClassCode(String itemClassCode) {
        this.itemClassCode = itemClassCode;
    }

    @Basic
    @Column(name = "item_class_descr")
    public String getItemClassDescr() {
        return itemClassDescr;
    }

    public void setItemClassDescr(String itemClassDescr) {
        this.itemClassDescr = itemClassDescr;
    }

    @Basic
    @Column(name = "order_price")
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Basic
    @Column(name = "sale_price")
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    @Basic
    @Column(name = "real_price")
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    @Basic
    @Column(name = "order_qty")
    public BigDecimal getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }

    @Basic
    @Column(name = "order_amt")
    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
    }

    @Basic
    @Column(name = "real_amt")
    public BigDecimal getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(BigDecimal realAmt) {
        this.realAmt = realAmt;
    }

    @Basic
    @Column(name = "problem_code")
    public String getProblemCode() {
        return problemCode;
    }

    public void setProblemCode(String problemCode) {
        this.problemCode = problemCode;
    }

    @Basic
    @Column(name = "problem_descr")
    public String getProblemDescr() {
        return problemDescr;
    }

    public void setProblemDescr(String problemDescr) {
        this.problemDescr = problemDescr;
    }

    @Basic
    @Column(name = "problem_detail_descr")
    public String getProblemDetailDescr() {
        return problemDetailDescr;
    }

    public void setProblemDetailDescr(String problemDetailDescr) {
        this.problemDetailDescr = problemDetailDescr;
    }

    @Basic
    @Column(name = "maintain_request_descr")
    public String getMaintainRequestDescr() {
        return maintainRequestDescr;
    }

    public void setMaintainRequestDescr(String maintainRequestDescr) {
        this.maintainRequestDescr = maintainRequestDescr;
    }

    @Basic
    @Column(name = "memo")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "result_descr")
    public String getResultDescr() {
        return resultDescr;
    }

    public void setResultDescr(String resultDescr) {
        this.resultDescr = resultDescr;
    }

    @Basic
    @Column(name = "item_name")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "item_spec")
    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    @Basic
    @Column(name = "prd_origin")
    public String getPrdOrigin() {
        return prdOrigin;
    }

    public void setPrdOrigin(String prdOrigin) {
        this.prdOrigin = prdOrigin;
    }

    @Basic
    @Column(name = "prd_factory")
    public String getPrdFactory() {
        return prdFactory;
    }

    public void setPrdFactory(String prdFactory) {
        this.prdFactory = prdFactory;
    }

    @Basic
    @Column(name = "master_images")
    public String getMasterImages() {
        return masterImages;
    }

    public void setMasterImages(String masterImages) {
        this.masterImages = masterImages;
    }

    @Basic
    @Column(name = "detail_images")
    public String getDetailImages() {
        return detailImages;
    }

    public void setDetailImages(String detailImages) {
        this.detailImages = detailImages;
    }

    @Basic
    @Column(name = "item_unit")
    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    @Basic
    @Column(name = "policy_describe")
    public String getPolicyDescribe() {
        return policyDescribe;
    }

    public void setPolicyDescribe(String policyDescribe) {
        this.policyDescribe = policyDescribe;
    }

    @Basic
    @Column(name = "maintain_describe")
    public String getMaintainDescribe() {
        return maintainDescribe;
    }

    public void setMaintainDescribe(String maintainDescribe) {
        this.maintainDescribe = maintainDescribe;
    }

    @Basic
    @Column(name = "cost_describe")
    public String getCostDescribe() {
        return costDescribe;
    }

    public void setCostDescribe(String costDescribe) {
        this.costDescribe = costDescribe;
    }

    @Basic
    @Column(name = "other_describe")
    public String getOtherDescribe() {
        return otherDescribe;
    }

    public void setOtherDescribe(String otherDescribe) {
        this.otherDescribe = otherDescribe;
    }

    @Basic
    @Column(name = "memo_describe")
    public String getMemoDescribe() {
        return memoDescribe;
    }

    public void setMemoDescribe(String memoDescribe) {
        this.memoDescribe = memoDescribe;
    }

    @Basic
    @Column(name = "item_unit_descr")
    public String getItemUnitDescr() {
        return itemUnitDescr;
    }

    public void setItemUnitDescr(String itemUnitDescr) {
        this.itemUnitDescr = itemUnitDescr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbAfterorderD that = (VbAfterorderD) o;
        return Objects.equals(idx, that.idx) &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(aftersaleOrderNo, that.aftersaleOrderNo) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(itemClassCode, that.itemClassCode) &&
                Objects.equals(itemClassDescr, that.itemClassDescr) &&
                Objects.equals(orderPrice, that.orderPrice) &&
                Objects.equals(salePrice, that.salePrice) &&
                Objects.equals(realPrice, that.realPrice) &&
                Objects.equals(orderQty, that.orderQty) &&
                Objects.equals(orderAmt, that.orderAmt) &&
                Objects.equals(realAmt, that.realAmt) &&
                Objects.equals(problemCode, that.problemCode) &&
                Objects.equals(problemDescr, that.problemDescr) &&
                Objects.equals(problemDetailDescr, that.problemDetailDescr) &&
                Objects.equals(maintainRequestDescr, that.maintainRequestDescr) &&
                Objects.equals(memo, that.memo) &&
                Objects.equals(resultDescr, that.resultDescr) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemSpec, that.itemSpec) &&
                Objects.equals(prdOrigin, that.prdOrigin) &&
                Objects.equals(prdFactory, that.prdFactory) &&
                Objects.equals(masterImages, that.masterImages) &&
                Objects.equals(detailImages, that.detailImages) &&
                Objects.equals(itemUnit, that.itemUnit) &&
                Objects.equals(policyDescribe, that.policyDescribe) &&
                Objects.equals(maintainDescribe, that.maintainDescribe) &&
                Objects.equals(costDescribe, that.costDescribe) &&
                Objects.equals(otherDescribe, that.otherDescribe) &&
                Objects.equals(memoDescribe, that.memoDescribe) &&
                Objects.equals(itemUnitDescr, that.itemUnitDescr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, aftersaleOrderNo, itemId, itemClassCode, itemClassDescr, orderPrice, salePrice, realPrice, orderQty, orderAmt, realAmt, problemCode, problemDescr, problemDetailDescr, maintainRequestDescr, memo, resultDescr, itemName, itemSpec, prdOrigin, prdFactory, masterImages, detailImages, itemUnit, policyDescribe, maintainDescribe, costDescribe, otherDescribe, memoDescribe, itemUnitDescr);
    }
}
