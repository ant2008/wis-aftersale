package com.wenc.commdomain.pojo.glt;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gl_payment_account")
public class GlPaymentAccount {
    private long idx;
    private String tenantId;
    private String paymentType;
    private String paymentDirection;
    private Timestamp paymentDate;
    private String paymentTenantId;
    private String paymentTenantName;
    private String paymentBillType;
    private String paymentBillNo;
    private BigDecimal paymentOrderAmt;
    private String paymentUserId;
    private BigDecimal paymentRealAmt;
    private String paymentCustomerName;
    private String paymentCustomerMobile;
    private String wxOpenId;
    private String wxAppId;
    private String wxMchId;
    private String wxDeviceInfo;
    private String wxTradeType;
    private String wxPrepayId;
    private String wxCodeUrl;
    private String wxNonceStr;
    private String wxSign;
    private Integer state;
    private String payState;
    private String wxRefundId;
    private BigDecimal wxRefundAmt;
    private String paymentOriginalNo;
    private String refundState;
    private String createUser;
    private Timestamp createTime;

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
    @Column(name = "payment_type", nullable = true, length = 20)
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Basic
    @Column(name = "payment_direction", nullable = true, length = 20)
    public String getPaymentDirection() {
        return paymentDirection;
    }

    public void setPaymentDirection(String paymentDirection) {
        this.paymentDirection = paymentDirection;
    }

    @Basic
    @Column(name = "payment_date", nullable = true)
    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Basic
    @Column(name = "payment_tenant_id", nullable = true, length = 50)
    public String getPaymentTenantId() {
        return paymentTenantId;
    }

    public void setPaymentTenantId(String paymentTenantId) {
        this.paymentTenantId = paymentTenantId;
    }

    @Basic
    @Column(name = "payment_tenant_name", nullable = true, length = 100)
    public String getPaymentTenantName() {
        return paymentTenantName;
    }

    public void setPaymentTenantName(String paymentTenantName) {
        this.paymentTenantName = paymentTenantName;
    }

    @Basic
    @Column(name = "payment_bill_type", nullable = true, length = 20)
    public String getPaymentBillType() {
        return paymentBillType;
    }

    public void setPaymentBillType(String paymentBillType) {
        this.paymentBillType = paymentBillType;
    }

    @Basic
    @Column(name = "payment_bill_no", nullable = true, length = 50)
    public String getPaymentBillNo() {
        return paymentBillNo;
    }

    public void setPaymentBillNo(String paymentBillNo) {
        this.paymentBillNo = paymentBillNo;
    }

    @Basic
    @Column(name = "payment_order_amt", nullable = true, precision = 6)
    public BigDecimal getPaymentOrderAmt() {
        return paymentOrderAmt;
    }

    public void setPaymentOrderAmt(BigDecimal paymentOrderAmt) {
        this.paymentOrderAmt = paymentOrderAmt;
    }

    @Basic
    @Column(name = "payment_user_id", nullable = true, length = 20)
    public String getPaymentUserId() {
        return paymentUserId;
    }

    public void setPaymentUserId(String paymentUserId) {
        this.paymentUserId = paymentUserId;
    }

    @Basic
    @Column(name = "payment_real_amt", nullable = true, precision = 6)
    public BigDecimal getPaymentRealAmt() {
        return paymentRealAmt;
    }

    public void setPaymentRealAmt(BigDecimal paymentRealAmt) {
        this.paymentRealAmt = paymentRealAmt;
    }

    @Basic
    @Column(name = "payment_customer_name", nullable = true, length = 20)
    public String getPaymentCustomerName() {
        return paymentCustomerName;
    }

    public void setPaymentCustomerName(String paymentCustomerName) {
        this.paymentCustomerName = paymentCustomerName;
    }

    @Basic
    @Column(name = "payment_customer_mobile", nullable = true, length = 20)
    public String getPaymentCustomerMobile() {
        return paymentCustomerMobile;
    }

    public void setPaymentCustomerMobile(String paymentCustomerMobile) {
        this.paymentCustomerMobile = paymentCustomerMobile;
    }

    @Basic
    @Column(name = "wx_open_id", nullable = true, length = 50)
    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    @Basic
    @Column(name = "wx_app_id", nullable = true, length = 50)
    public String getWxAppId() {
        return wxAppId;
    }

    public void setWxAppId(String wxAppId) {
        this.wxAppId = wxAppId;
    }

    @Basic
    @Column(name = "wx_mch_id", nullable = true, length = 50)
    public String getWxMchId() {
        return wxMchId;
    }

    public void setWxMchId(String wxMchId) {
        this.wxMchId = wxMchId;
    }

    @Basic
    @Column(name = "wx_device_info", nullable = true, length = 50)
    public String getWxDeviceInfo() {
        return wxDeviceInfo;
    }

    public void setWxDeviceInfo(String wxDeviceInfo) {
        this.wxDeviceInfo = wxDeviceInfo;
    }

    @Basic
    @Column(name = "wx_trade_type", nullable = true, length = 20)
    public String getWxTradeType() {
        return wxTradeType;
    }

    public void setWxTradeType(String wxTradeType) {
        this.wxTradeType = wxTradeType;
    }

    @Basic
    @Column(name = "wx_prepay_id", nullable = true, length = 80)
    public String getWxPrepayId() {
        return wxPrepayId;
    }

    public void setWxPrepayId(String wxPrepayId) {
        this.wxPrepayId = wxPrepayId;
    }

    @Basic
    @Column(name = "wx_code_url", nullable = true, length = 80)
    public String getWxCodeUrl() {
        return wxCodeUrl;
    }

    public void setWxCodeUrl(String wxCodeUrl) {
        this.wxCodeUrl = wxCodeUrl;
    }

    @Basic
    @Column(name = "wx_nonce_str", nullable = true, length = 50)
    public String getWxNonceStr() {
        return wxNonceStr;
    }

    public void setWxNonceStr(String wxNonceStr) {
        this.wxNonceStr = wxNonceStr;
    }

    @Basic
    @Column(name = "wx_sign", nullable = true, length = 50)
    public String getWxSign() {
        return wxSign;
    }

    public void setWxSign(String wxSign) {
        this.wxSign = wxSign;
    }

    @Basic
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "pay_state", nullable = true, length = 20)
    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }

    @Basic
    @Column(name = "wx_refund_id", nullable = true, length = 50)
    public String getWxRefundId() {
        return wxRefundId;
    }

    public void setWxRefundId(String wxRefundId) {
        this.wxRefundId = wxRefundId;
    }

    @Basic
    @Column(name = "wx_refund_amt", nullable = true, precision = 6)
    public BigDecimal getWxRefundAmt() {
        return wxRefundAmt;
    }

    public void setWxRefundAmt(BigDecimal wxRefundAmt) {
        this.wxRefundAmt = wxRefundAmt;
    }

    @Basic
    @Column(name = "payment_original_no", nullable = true, length = 50)
    public String getPaymentOriginalNo() {
        return paymentOriginalNo;
    }

    public void setPaymentOriginalNo(String paymentOriginalNo) {
        this.paymentOriginalNo = paymentOriginalNo;
    }

    @Basic
    @Column(name = "refund_state", nullable = true, length = 20)
    public String getRefundState() {
        return refundState;
    }

    public void setRefundState(String refundState) {
        this.refundState = refundState;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 20)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlPaymentAccount that = (GlPaymentAccount) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(paymentType, that.paymentType) &&
                Objects.equals(paymentDirection, that.paymentDirection) &&
                Objects.equals(paymentDate, that.paymentDate) &&
                Objects.equals(paymentTenantId, that.paymentTenantId) &&
                Objects.equals(paymentTenantName, that.paymentTenantName) &&
                Objects.equals(paymentBillType, that.paymentBillType) &&
                Objects.equals(paymentBillNo, that.paymentBillNo) &&
                Objects.equals(paymentOrderAmt, that.paymentOrderAmt) &&
                Objects.equals(paymentUserId, that.paymentUserId) &&
                Objects.equals(paymentRealAmt, that.paymentRealAmt) &&
                Objects.equals(paymentCustomerName, that.paymentCustomerName) &&
                Objects.equals(paymentCustomerMobile, that.paymentCustomerMobile) &&
                Objects.equals(wxOpenId, that.wxOpenId) &&
                Objects.equals(wxAppId, that.wxAppId) &&
                Objects.equals(wxMchId, that.wxMchId) &&
                Objects.equals(wxDeviceInfo, that.wxDeviceInfo) &&
                Objects.equals(wxTradeType, that.wxTradeType) &&
                Objects.equals(wxPrepayId, that.wxPrepayId) &&
                Objects.equals(wxCodeUrl, that.wxCodeUrl) &&
                Objects.equals(wxNonceStr, that.wxNonceStr) &&
                Objects.equals(wxSign, that.wxSign) &&
                Objects.equals(state, that.state) &&
                Objects.equals(payState, that.payState) &&
                Objects.equals(wxRefundId, that.wxRefundId) &&
                Objects.equals(wxRefundAmt, that.wxRefundAmt) &&
                Objects.equals(paymentOriginalNo, that.paymentOriginalNo) &&
                Objects.equals(refundState, that.refundState) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, paymentType, paymentDirection, paymentDate, paymentTenantId,
                paymentTenantName, paymentBillType, paymentBillNo, paymentOrderAmt, paymentUserId, paymentRealAmt,
                paymentCustomerName, paymentCustomerMobile, wxOpenId, wxAppId, wxMchId, wxDeviceInfo, wxTradeType, wxPrepayId, wxCodeUrl, wxNonceStr, wxSign, state, payState, wxRefundId, wxRefundAmt, paymentOriginalNo, refundState, createUser, createTime);
    }
}
