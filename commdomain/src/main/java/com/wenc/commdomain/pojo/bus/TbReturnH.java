package com.wenc.commdomain.pojo.bus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_return_h")
public class TbReturnH {
    private long idx;
    private String tenantId;
    private String returnNo;
    private String depotId;
    private String departId;
    private String vendorId;
    private String vendorName;
    private String orderName;
    private String orderTel;
    private String payeeType;
    private BigDecimal purTax;
    private BigDecimal saleTax;
    private BigDecimal discountAmt;
    private String buyerId;
    private Timestamp retDate;
    private String retuserId;
    private String vouchNo;
    private Timestamp execDate;
    private Byte state;
    private Byte chgNo;
    private String notes;
    private String createUser;
    private Timestamp createTime;
    private Integer chkBit;

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
    @Column(name = "return_no", nullable = true, length = 30)
    public String getReturnNo() {
        return returnNo;
    }

    public void setReturnNo(String returnNo) {
        this.returnNo = returnNo;
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
    @Column(name = "depart_id", nullable = true, length = 8)
    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    @Basic
    @Column(name = "vendor_id", nullable = true, length = 13)
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Basic
    @Column(name = "vendor_name", nullable = true, length = 80)
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    @Basic
    @Column(name = "order_name", nullable = true, length = 80)
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Basic
    @Column(name = "order_tel", nullable = true, length = 20)
    public String getOrderTel() {
        return orderTel;
    }

    public void setOrderTel(String orderTel) {
        this.orderTel = orderTel;
    }

    @Basic
    @Column(name = "payee_type", nullable = true, length = 3)
    public String getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(String payeeType) {
        this.payeeType = payeeType;
    }

    @Basic
    @Column(name = "pur_tax", nullable = true, precision = 2)
    public BigDecimal getPurTax() {
        return purTax;
    }

    public void setPurTax(BigDecimal purTax) {
        this.purTax = purTax;
    }

    @Basic
    @Column(name = "sale_tax", nullable = true, precision = 2)
    public BigDecimal getSaleTax() {
        return saleTax;
    }

    public void setSaleTax(BigDecimal saleTax) {
        this.saleTax = saleTax;
    }

    @Basic
    @Column(name = "discount_amt", nullable = true, precision = 2)
    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(BigDecimal discountAmt) {
        this.discountAmt = discountAmt;
    }

    @Basic
    @Column(name = "buyer_id", nullable = true, length = 8)
    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    @Basic
    @Column(name = "ret_date", nullable = true)
    public Timestamp getRetDate() {
        return retDate;
    }

    public void setRetDate(Timestamp retDate) {
        this.retDate = retDate;
    }

    @Basic
    @Column(name = "retuser_id", nullable = true, length = 10)
    public String getRetuserId() {
        return retuserId;
    }

    public void setRetuserId(String retuserId) {
        this.retuserId = retuserId;
    }

    @Basic
    @Column(name = "vouch_no", nullable = true, length = 12)
    public String getVouchNo() {
        return vouchNo;
    }

    public void setVouchNo(String vouchNo) {
        this.vouchNo = vouchNo;
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
    @Column(name = "state", nullable = true)
    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    @Basic
    @Column(name = "chg_no", nullable = true)
    public Byte getChgNo() {
        return chgNo;
    }

    public void setChgNo(Byte chgNo) {
        this.chgNo = chgNo;
    }

    @Basic
    @Column(name = "notes", nullable = true, length = 60)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 8)
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
    @Column(name = "chk_bit", nullable = true)
    public Integer getChkBit() {
        return chkBit;
    }

    public void setChkBit(Integer chkBit) {
        this.chkBit = chkBit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbReturnH tbReturnH = (TbReturnH) o;
        return idx == tbReturnH.idx &&
                Objects.equals(tenantId, tbReturnH.tenantId) &&
                Objects.equals(returnNo, tbReturnH.returnNo) &&
                Objects.equals(depotId, tbReturnH.depotId) &&
                Objects.equals(departId, tbReturnH.departId) &&
                Objects.equals(vendorId, tbReturnH.vendorId) &&
                Objects.equals(vendorName, tbReturnH.vendorName) &&
                Objects.equals(orderName, tbReturnH.orderName) &&
                Objects.equals(orderTel, tbReturnH.orderTel) &&
                Objects.equals(payeeType, tbReturnH.payeeType) &&
                Objects.equals(purTax, tbReturnH.purTax) &&
                Objects.equals(saleTax, tbReturnH.saleTax) &&
                Objects.equals(discountAmt, tbReturnH.discountAmt) &&
                Objects.equals(buyerId, tbReturnH.buyerId) &&
                Objects.equals(retDate, tbReturnH.retDate) &&
                Objects.equals(retuserId, tbReturnH.retuserId) &&
                Objects.equals(vouchNo, tbReturnH.vouchNo) &&
                Objects.equals(execDate, tbReturnH.execDate) &&
                Objects.equals(state, tbReturnH.state) &&
                Objects.equals(chgNo, tbReturnH.chgNo) &&
                Objects.equals(notes, tbReturnH.notes) &&
                Objects.equals(createUser, tbReturnH.createUser) &&
                Objects.equals(createTime, tbReturnH.createTime) &&
                Objects.equals(chkBit, tbReturnH.chkBit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, returnNo, depotId, departId, vendorId, vendorName, orderName, orderTel,
                payeeType, purTax, saleTax, discountAmt, buyerId, retDate, retuserId, vouchNo, execDate, state, chgNo, notes, createUser, createTime, chkBit);
    }
}
