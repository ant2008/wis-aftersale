package com.wenc.commdomain.pojo.bus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_receive_h")
public class TbReceiveH {
    private long idx;
    private String tenantId;
    private String receiveNo;
    private String tallyNo;
    private String orderNo;
    private String contNo;
    private String vendorId;
    private String vendorName;
    private String payeeType;
    private String depotId;
    private String departId;
    private String buyerId;
    private String receiveUserId;
    private Timestamp receiveDate;
    private Timestamp payDate;
    private BigDecimal purTax;
    private BigDecimal saleTax;
    private BigDecimal discountAmt;
    private String invoiceNo;
    private String deliveryNo;
    private BigDecimal delverySumamt;
    private String vouchNo;
    private String allocateNo;
    private String returnNo;
    private Timestamp execDate;
    private Byte state;
    private Byte chgNo;
    private Byte receiveType;
    private String createUser;
    private Timestamp createTime;
    private String notes;
    private Integer chkBit;
    private String invoiceType;

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
    @Column(name = "receive_no", nullable = true, length = 12)
    public String getReceiveNo() {
        return receiveNo;
    }

    public void setReceiveNo(String receiveNo) {
        this.receiveNo = receiveNo;
    }

    @Basic
    @Column(name = "tally_no", nullable = true, length = 12)
    public String getTallyNo() {
        return tallyNo;
    }

    public void setTallyNo(String tallyNo) {
        this.tallyNo = tallyNo;
    }

    @Basic
    @Column(name = "order_no", nullable = true, length = 12)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "cont_no", nullable = true, length = 13)
    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo;
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
    @Column(name = "payee_type", nullable = true, length = 3)
    public String getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(String payeeType) {
        this.payeeType = payeeType;
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
    @Column(name = "buyer_id", nullable = true, length = 8)
    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    @Basic
    @Column(name = "receive_user_id", nullable = true, length = 8)
    public String getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(String receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    @Basic
    @Column(name = "receive_date", nullable = true)
    public Timestamp getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Timestamp receiveDate) {
        this.receiveDate = receiveDate;
    }

    @Basic
    @Column(name = "pay_date", nullable = true)
    public Timestamp getPayDate() {
        return payDate;
    }

    public void setPayDate(Timestamp payDate) {
        this.payDate = payDate;
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
    @Column(name = "invoice_no", nullable = true, length = 20)
    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @Basic
    @Column(name = "delivery_no", nullable = true, length = 20)
    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    @Basic
    @Column(name = "delvery_sumamt", nullable = true, precision = 6)
    public BigDecimal getDelverySumamt() {
        return delverySumamt;
    }

    public void setDelverySumamt(BigDecimal delverySumamt) {
        this.delverySumamt = delverySumamt;
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
    @Column(name = "allocate_no", nullable = true, length = 12)
    public String getAllocateNo() {
        return allocateNo;
    }

    public void setAllocateNo(String allocateNo) {
        this.allocateNo = allocateNo;
    }

    @Basic
    @Column(name = "return_no", nullable = true, length = 12)
    public String getReturnNo() {
        return returnNo;
    }

    public void setReturnNo(String returnNo) {
        this.returnNo = returnNo;
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
    @Column(name = "receive_type", nullable = true)
    public Byte getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(Byte receiveType) {
        this.receiveType = receiveType;
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
    @Column(name = "notes", nullable = true, length = 60)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
        TbReceiveH that = (TbReceiveH) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(receiveNo, that.receiveNo) &&
                Objects.equals(tallyNo, that.tallyNo) &&
                Objects.equals(orderNo, that.orderNo) &&
                Objects.equals(contNo, that.contNo) &&
                Objects.equals(vendorId, that.vendorId) &&
                Objects.equals(vendorName, that.vendorName) &&
                Objects.equals(payeeType, that.payeeType) &&
                Objects.equals(depotId, that.depotId) &&
                Objects.equals(departId, that.departId) &&
                Objects.equals(buyerId, that.buyerId) &&
                Objects.equals(receiveUserId, that.receiveUserId) &&
                Objects.equals(receiveDate, that.receiveDate) &&
                Objects.equals(payDate, that.payDate) &&
                Objects.equals(purTax, that.purTax) &&
                Objects.equals(saleTax, that.saleTax) &&
                Objects.equals(discountAmt, that.discountAmt) &&
                Objects.equals(invoiceNo, that.invoiceNo) &&
                Objects.equals(deliveryNo, that.deliveryNo) &&
                Objects.equals(delverySumamt, that.delverySumamt) &&
                Objects.equals(vouchNo, that.vouchNo) &&
                Objects.equals(allocateNo, that.allocateNo) &&
                Objects.equals(returnNo, that.returnNo) &&
                Objects.equals(execDate, that.execDate) &&
                Objects.equals(state, that.state) &&
                Objects.equals(chgNo, that.chgNo) &&
                Objects.equals(receiveType, that.receiveType) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(chkBit, that.chkBit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, receiveNo, tallyNo, orderNo, contNo, vendorId, vendorName, payeeType, depotId, departId, buyerId, receiveUserId, receiveDate, payDate, purTax, saleTax, discountAmt, invoiceNo, deliveryNo, delverySumamt, vouchNo, allocateNo, returnNo, execDate, state, chgNo, receiveType, createUser, createTime, notes, chkBit);
    }

    @Basic
    @Column(name = "invoice_type", nullable = true, length = 20)
    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }
}
