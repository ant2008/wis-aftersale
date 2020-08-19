package com.wenc.commdomain.dto.stb;

import java.math.BigDecimal;

/**
 * Excel 订单对象
 */
public class OrderExcelDTO {

    private String orderNo;
    private String orderDate;
    private String buyerAccount;
    private String paymentNo;
    private String paymentType;
    private String orderMemo;
    private String buyerMemo;
    private String paymentDate;

    private BigDecimal freightAmt;
    private BigDecimal orderAmt;
    private String consigneeName;
    private String consigneeMobile;
    private String consigneePhone;
    private String province;
    private String city;
    private String district;
    private String street;
    private String address;
    private String zipCode;
    private String onlineItemCode;
    private String itemName;
    private String itemSpec;
    private BigDecimal itemQty;
    private BigDecimal itemPrice;
    private String expressCompany;
    private String expressBillNo;
    private String expressDate;
    private String expressState;
    private String expressOpator;
    private String expressMemo;
    private String state;
    private String payState;

    private String itemId;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getOrderMemo() {
        return orderMemo;
    }

    public void setOrderMemo(String orderMemo) {
        this.orderMemo = orderMemo;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }



    public String getBuyerMemo() {
        return buyerMemo;
    }

    public void setBuyerMemo(String buyerMemo) {
        this.buyerMemo = buyerMemo;
    }

    public BigDecimal getFreightAmt() {
        return freightAmt;
    }

    public void setFreightAmt(BigDecimal freightAmt) {
        this.freightAmt = freightAmt;
    }

    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getOnlineItemCode() {
        return onlineItemCode;
    }

    public void setOnlineItemCode(String onlineItemCode) {
        this.onlineItemCode = onlineItemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    public BigDecimal getItemQty() {
        return itemQty;
    }

    public void setItemQty(BigDecimal itemQty) {
        this.itemQty = itemQty;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getExpressBillNo() {
        return expressBillNo;
    }

    public void setExpressBillNo(String expressBillNo) {
        this.expressBillNo = expressBillNo;
    }

    public String getExpressDate() {
        return expressDate;
    }

    public void setExpressDate(String expressDate) {
        this.expressDate = expressDate;
    }

    public String getExpressState() {
        return expressState;
    }

    public void setExpressState(String expressState) {
        this.expressState = expressState;
    }

    public String getExpressOpator() {
        return expressOpator;
    }

    public void setExpressOpator(String expressOpator) {
        this.expressOpator = expressOpator;
    }

    public String getExpressMemo() {
        return expressMemo;
    }

    public void setExpressMemo(String expressMemo) {
        this.expressMemo = expressMemo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }
}
