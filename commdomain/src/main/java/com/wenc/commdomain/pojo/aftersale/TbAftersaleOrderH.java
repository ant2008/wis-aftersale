package com.wenc.commdomain.pojo.aftersale;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_aftersale_order_h")
public class TbAftersaleOrderH {
    private long idx;
    private String tenantId;
    private String aftersaleOrderNo;
    private Timestamp orderDate;
    private Timestamp reservationDate;
    private String customerId;
    private String customerName;
    private String customerMobileNo;
    private String customerAddress;
    private String customerMemo;
    private String timerangeType;
    private String ifBookEngineer;
    private String engineerId;
    private String engineerName;
    private String engineerMobileNo;
    private String orderMemo;
    private Integer state;
    private Integer chkBit;
    private Timestamp execDate;
    private String createUser;
    private Timestamp createTime;
    private String doState;
    private BigDecimal totalAmt;
    private String orderPic;
    private BigDecimal totalDiscountAmt;
    private BigDecimal totalPayAmt;
    private Integer star;
    private String evaluateDescr;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idx")
    public long getIdx() {
        return idx;
    }


    public void setIdx(long idx) {
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
    @Column(name = "order_date")
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "reservation_date")
    public Timestamp getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Timestamp reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Basic
    @Column(name = "customer_id")
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "customer_name")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "customer_mobile_no")
    public String getCustomerMobileNo() {
        return customerMobileNo;
    }

    public void setCustomerMobileNo(String customerMobileNo) {
        this.customerMobileNo = customerMobileNo;
    }

    @Basic
    @Column(name = "customer_address")
    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Basic
    @Column(name = "customer_memo")
    public String getCustomerMemo() {
        return customerMemo;
    }

    public void setCustomerMemo(String customerMemo) {
        this.customerMemo = customerMemo;
    }

    @Basic
    @Column(name = "timerange_type")
    public String getTimerangeType() {
        return timerangeType;
    }

    public void setTimerangeType(String timerangeType) {
        this.timerangeType = timerangeType;
    }

    @Basic
    @Column(name = "if_book_engineer")
    public String getIfBookEngineer() {
        return ifBookEngineer;
    }

    public void setIfBookEngineer(String ifBookEngineer) {
        this.ifBookEngineer = ifBookEngineer;
    }

    @Basic
    @Column(name = "engineer_id")
    public String getEngineerId() {
        return engineerId;
    }

    public void setEngineerId(String engineerId) {
        this.engineerId = engineerId;
    }

    @Basic
    @Column(name = "engineer_name")
    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }

    @Basic
    @Column(name = "engineer_mobile_no")
    public String getEngineerMobileNo() {
        return engineerMobileNo;
    }

    public void setEngineerMobileNo(String engineerMobileNo) {
        this.engineerMobileNo = engineerMobileNo;
    }

    @Basic
    @Column(name = "order_memo")
    public String getOrderMemo() {
        return orderMemo;
    }

    public void setOrderMemo(String orderMemo) {
        this.orderMemo = orderMemo;
    }

    @Basic
    @Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "chk_bit")
    public Integer getChkBit() {
        return chkBit;
    }

    public void setChkBit(Integer chkBit) {
        this.chkBit = chkBit;
    }

    @Basic
    @Column(name = "exec_date")
    public Timestamp getExecDate() {
        return execDate;
    }

    public void setExecDate(Timestamp execDate) {
        this.execDate = execDate;
    }

    @Basic
    @Column(name = "create_user")
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "do_state")
    public String getDoState() {
        return doState;
    }

    public void setDoState(String doState) {
        this.doState = doState;
    }

    @Basic
    @Column(name = "total_amt")
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    @Basic
    @Column(name = "order_pic")
    public String getOrderPic() {
        return orderPic;
    }

    public void setOrderPic(String orderPic) {
        this.orderPic = orderPic;
    }

    @Basic
    @Column(name = "total_discount_amt")
    public BigDecimal getTotalDiscountAmt() {
        return totalDiscountAmt;
    }

    public void setTotalDiscountAmt(BigDecimal totalDiscountAmt) {
        this.totalDiscountAmt = totalDiscountAmt;
    }

    @Basic
    @Column(name = "total_pay_amt")
    public BigDecimal getTotalPayAmt() {
        return totalPayAmt;
    }

    public void setTotalPayAmt(BigDecimal totalPayAmt) {
        this.totalPayAmt = totalPayAmt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbAftersaleOrderH that = (TbAftersaleOrderH) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(aftersaleOrderNo, that.aftersaleOrderNo) &&
                Objects.equals(orderDate, that.orderDate) &&
                Objects.equals(reservationDate, that.reservationDate) &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(customerMobileNo, that.customerMobileNo) &&
                Objects.equals(customerAddress, that.customerAddress) &&
                Objects.equals(customerMemo, that.customerMemo) &&
                Objects.equals(timerangeType, that.timerangeType) &&
                Objects.equals(ifBookEngineer, that.ifBookEngineer) &&
                Objects.equals(engineerId, that.engineerId) &&
                Objects.equals(engineerName, that.engineerName) &&
                Objects.equals(engineerMobileNo, that.engineerMobileNo) &&
                Objects.equals(orderMemo, that.orderMemo) &&
                Objects.equals(state, that.state) &&
                Objects.equals(chkBit, that.chkBit) &&
                Objects.equals(execDate, that.execDate) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(doState, that.doState) &&
                Objects.equals(totalAmt, that.totalAmt) &&
                Objects.equals(orderPic, that.orderPic) &&
                Objects.equals(totalDiscountAmt, that.totalDiscountAmt) &&
                Objects.equals(totalPayAmt, that.totalPayAmt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, aftersaleOrderNo, orderDate, reservationDate, customerId, customerName, customerMobileNo, customerAddress, customerMemo, timerangeType, ifBookEngineer, engineerId, engineerName, engineerMobileNo, orderMemo, state, chkBit, execDate, createUser, createTime, doState, totalAmt, orderPic, totalDiscountAmt, totalPayAmt);
    }

    @Basic
    @Column(name = "star")
    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    @Basic
    @Column(name = "evaluate_descr")
    public String getEvaluateDescr() {
        return evaluateDescr;
    }

    public void setEvaluateDescr(String evaluateDescr) {
        this.evaluateDescr = evaluateDescr;
    }
}
