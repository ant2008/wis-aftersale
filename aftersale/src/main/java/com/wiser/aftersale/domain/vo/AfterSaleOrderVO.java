package com.wiser.aftersale.domain.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

public class AfterSaleOrderVO {

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
    private Timestamp execTime;
    private String createUser;
    private Timestamp createTime;
    private String doState;

    private String wxId;

    private BigDecimal totalAmt;
    private String orderPic;
    private BigDecimal totalDiscountAmt;
    private BigDecimal totalPayAmt;

    List<AfterSaleOrderItemsVO>  orderItemsVOS;





    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    public String getOrderPic() {
        return orderPic;
    }

    public void setOrderPic(String orderPic) {
        this.orderPic = orderPic;
    }

    public BigDecimal getTotalDiscountAmt() {
        return totalDiscountAmt;
    }

    public void setTotalDiscountAmt(BigDecimal totalDiscountAmt) {
        this.totalDiscountAmt = totalDiscountAmt;
    }

    public BigDecimal getTotalPayAmt() {
        return totalPayAmt;
    }

    public void setTotalPayAmt(BigDecimal totalPayAmt) {
        this.totalPayAmt = totalPayAmt;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }




    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getAftersaleOrderNo() {
        return aftersaleOrderNo;
    }

    public void setAftersaleOrderNo(String aftersaleOrderNo) {
        this.aftersaleOrderNo = aftersaleOrderNo;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public Timestamp getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Timestamp reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMobileNo() {
        return customerMobileNo;
    }

    public void setCustomerMobileNo(String customerMobileNo) {
        this.customerMobileNo = customerMobileNo;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerMemo() {
        return customerMemo;
    }

    public void setCustomerMemo(String customerMemo) {
        this.customerMemo = customerMemo;
    }

    public String getTimerangeType() {
        return timerangeType;
    }

    public void setTimerangeType(String timerangeType) {
        this.timerangeType = timerangeType;
    }

    public String getIfBookEngineer() {
        return ifBookEngineer;
    }

    public void setIfBookEngineer(String ifBookEngineer) {
        this.ifBookEngineer = ifBookEngineer;
    }

    public String getEngineerId() {
        return engineerId;
    }

    public void setEngineerId(String engineerId) {
        this.engineerId = engineerId;
    }

    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }

    public String getEngineerMobileNo() {
        return engineerMobileNo;
    }

    public void setEngineerMobileNo(String engineerMobileNo) {
        this.engineerMobileNo = engineerMobileNo;
    }

    public String getOrderMemo() {
        return orderMemo;
    }

    public void setOrderMemo(String orderMemo) {
        this.orderMemo = orderMemo;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Timestamp getExecTime() {
        return execTime;
    }

    public void setExecTime(Timestamp execTime) {
        this.execTime = execTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getDoState() {
        return doState;
    }

    public void setDoState(String doState) {
        this.doState = doState;
    }

    public List<AfterSaleOrderItemsVO> getOrderItemsVOS() {
        return orderItemsVOS;
    }

    public void setOrderItemsVOS(List<AfterSaleOrderItemsVO> orderItemsVOS) {
        this.orderItemsVOS = orderItemsVOS;
    }
}
