package com.wenc.commdomain.pojo.aftersale;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "tb_aftersale_order_d")
public class TbAftersaleOrderD {
    private long idx;
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
    @Column(name = "aftersale_order_no", nullable = true, length = 30)
    public String getAftersaleOrderNo() {
        return aftersaleOrderNo;
    }

    public void setAftersaleOrderNo(String aftersaleOrderNo) {
        this.aftersaleOrderNo = aftersaleOrderNo;
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
    @Column(name = "item_class_code", nullable = true, length = 20)
    public String getItemClassCode() {
        return itemClassCode;
    }

    public void setItemClassCode(String itemClassCode) {
        this.itemClassCode = itemClassCode;
    }

    @Basic
    @Column(name = "item_class_descr", nullable = true, length = 50)
    public String getItemClassDescr() {
        return itemClassDescr;
    }

    public void setItemClassDescr(String itemClassDescr) {
        this.itemClassDescr = itemClassDescr;
    }

    @Basic
    @Column(name = "order_price", nullable = true, precision = 6)
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
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
    @Column(name = "real_price", nullable = true, precision = 6)
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    @Basic
    @Column(name = "order_qty", nullable = true, precision = 2)
    public BigDecimal getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }

    @Basic
    @Column(name = "order_amt", nullable = true, precision = 6)
    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
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
    @Column(name = "problem_code", nullable = true, length = 20)
    public String getProblemCode() {
        return problemCode;
    }

    public void setProblemCode(String problemCode) {
        this.problemCode = problemCode;
    }

    @Basic
    @Column(name = "problem_descr", nullable = true, length = 300)
    public String getProblemDescr() {
        return problemDescr;
    }

    public void setProblemDescr(String problemDescr) {
        this.problemDescr = problemDescr;
    }

    @Basic
    @Column(name = "problem_detail_descr", nullable = true, length = 1000)
    public String getProblemDetailDescr() {
        return problemDetailDescr;
    }

    public void setProblemDetailDescr(String problemDetailDescr) {
        this.problemDetailDescr = problemDetailDescr;
    }

    @Basic
    @Column(name = "maintain_request_descr", nullable = true, length = 300)
    public String getMaintainRequestDescr() {
        return maintainRequestDescr;
    }

    public void setMaintainRequestDescr(String maintainRequestDescr) {
        this.maintainRequestDescr = maintainRequestDescr;
    }

    @Basic
    @Column(name = "memo", nullable = true, length = 300)
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "result_descr", nullable = true, length = 1000)
    public String getResultDescr() {
        return resultDescr;
    }

    public void setResultDescr(String resultDescr) {
        this.resultDescr = resultDescr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbAftersaleOrderD that = (TbAftersaleOrderD) o;
        return idx == that.idx &&
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
                Objects.equals(resultDescr, that.resultDescr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, aftersaleOrderNo, itemId, itemClassCode, itemClassDescr, orderPrice,
                salePrice, realPrice, orderQty, orderAmt, realAmt, problemCode, problemDescr, problemDetailDescr, maintainRequestDescr, memo, resultDescr);
    }
}
