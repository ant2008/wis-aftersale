package com.wenc.commdomain.pojo.stb;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_ecorder_h")
public class TbEcorderH {
    private long idx;
    private String tenantId;
    private String ecorderNo;
    private String orderType;
    private String createType;
    private String depotId;
    private String depotName;
    private String estoreId;
    private String estoreName;
    private String customerId;
    private String customerName;
    private String customerMobile;
    private String customerEmail;
    private String customerMemo;
    private String customerIdcard;
    private String addrCountry;
    private String addrProvince;
    private String addrCity;
    private String addrRegion;
    private String addrStreet;
    private String addrDetail;
    private String postCode;
    private String ifInvoice;
    private String invoiceType;
    private String invoiceTitle;
    private String sellerMemo;
    private String sellerMobileno;
    private String orderMark;
    private BigDecimal orderAmt;
    private BigDecimal postFee;
    private BigDecimal totalAmt;
    private BigDecimal totalDiscountAmt;
    private Integer ifSelfmention;
    private String selfmemtionMemo;
    private BigDecimal payAmt;
    private String payType;
    private String payTypeStr;
    private Timestamp payTime;
    private String payTransactionNo;
    private Integer orderCloseType;
    private Timestamp expiredTime;
    private Timestamp consignTime;
    private Integer refundState;
    private String oriOrderNo;
    private String oriOrderType;
    private String oriOrderTypeDescr;
    private String oriStatus;
    private String oriStatusDescr;
    private Timestamp oriCreateTime;
    private Timestamp oriPayTime;
    private Timestamp successTime;
    private String orderFrom;
    private String transState;
    private String ecorderTopno;
    private String doState;
    private Integer state;
    private Timestamp execDate;
    private String payState;
    private String saleNo;
    private Integer chkBit;
    private Timestamp createTime;
    private String createUser;
    private String expressType;
    private Integer ifMemberOrder;
    private Integer ifDistribOrder;
    private Integer ifRetailOrder;
    private Integer ifRefundOrder;
    private Integer ifVirtualOrder;
    private Integer ifFeedback;
    private String expressId;
    private String expressName;
    private String expressNo;
    private String senderName;
    private String senderMobileno;
    private String authzTenantId;
    private String addrDomain;
    private String addrFulldetail;
    private String senderAddr;
    private String estoreType;

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
    @Column(name = "ecorder_no", nullable = true, length = 30)
    public String getEcorderNo() {
        return ecorderNo;
    }

    public void setEcorderNo(String ecorderNo) {
        this.ecorderNo = ecorderNo;
    }

    @Basic
    @Column(name = "order_type", nullable = true, length = 20)
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @Basic
    @Column(name = "create_type", nullable = true, length = 20)
    public String getCreateType() {
        return createType;
    }

    public void setCreateType(String createType) {
        this.createType = createType;
    }

    @Basic
    @Column(name = "depot_id", nullable = true, length = 20)
    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    @Basic
    @Column(name = "depot_name", nullable = true, length = 30)
    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName;
    }

    @Basic
    @Column(name = "estore_id", nullable = true, length = 20)
    public String getEstoreId() {
        return estoreId;
    }

    public void setEstoreId(String estoreId) {
        this.estoreId = estoreId;
    }

    @Basic
    @Column(name = "estore_name", nullable = true, length = 50)
    public String getEstoreName() {
        return estoreName;
    }

    public void setEstoreName(String estoreName) {
        this.estoreName = estoreName;
    }

    @Basic
    @Column(name = "customer_id", nullable = true, length = 20)
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "customer_name", nullable = true, length = 30)
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "customer_mobile", nullable = true, length = 30)
    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    @Basic
    @Column(name = "customer_email", nullable = true, length = 30)
    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Basic
    @Column(name = "customer_memo", nullable = true, length = 100)
    public String getCustomerMemo() {
        return customerMemo;
    }

    public void setCustomerMemo(String customerMemo) {
        this.customerMemo = customerMemo;
    }

    @Basic
    @Column(name = "customer_idcard", nullable = true, length = 50)
    public String getCustomerIdcard() {
        return customerIdcard;
    }

    public void setCustomerIdcard(String customerIdcard) {
        this.customerIdcard = customerIdcard;
    }

    @Basic
    @Column(name = "addr_country", nullable = true, length = 20)
    public String getAddrCountry() {
        return addrCountry;
    }

    public void setAddrCountry(String addrCountry) {
        this.addrCountry = addrCountry;
    }

    @Basic
    @Column(name = "addr_province", nullable = true, length = 20)
    public String getAddrProvince() {
        return addrProvince;
    }

    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince;
    }

    @Basic
    @Column(name = "addr_city", nullable = true, length = 30)
    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    @Basic
    @Column(name = "addr_region", nullable = true, length = 50)
    public String getAddrRegion() {
        return addrRegion;
    }

    public void setAddrRegion(String addrRegion) {
        this.addrRegion = addrRegion;
    }

    @Basic
    @Column(name = "addr_street", nullable = true, length = 200)
    public String getAddrStreet() {
        return addrStreet;
    }

    public void setAddrStreet(String addrStreet) {
        this.addrStreet = addrStreet;
    }

    @Basic
    @Column(name = "addr_detail", nullable = true, length = 200)
    public String getAddrDetail() {
        return addrDetail;
    }

    public void setAddrDetail(String addrDetail) {
        this.addrDetail = addrDetail;
    }

    @Basic
    @Column(name = "post_code", nullable = true, length = 20)
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Basic
    @Column(name = "if_invoice", nullable = true, length = 10)
    public String getIfInvoice() {
        return ifInvoice;
    }

    public void setIfInvoice(String ifInvoice) {
        this.ifInvoice = ifInvoice;
    }

    @Basic
    @Column(name = "invoice_type", nullable = true, length = 30)
    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    @Basic
    @Column(name = "invoice_title", nullable = true, length = 400)
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    @Basic
    @Column(name = "seller_memo", nullable = true, length = 200)
    public String getSellerMemo() {
        return sellerMemo;
    }

    public void setSellerMemo(String sellerMemo) {
        this.sellerMemo = sellerMemo;
    }

    @Basic
    @Column(name = "seller_mobileno", nullable = true, length = 20)
    public String getSellerMobileno() {
        return sellerMobileno;
    }

    public void setSellerMobileno(String sellerMobileno) {
        this.sellerMobileno = sellerMobileno;
    }

    @Basic
    @Column(name = "order_mark", nullable = true, length = 20)
    public String getOrderMark() {
        return orderMark;
    }

    public void setOrderMark(String orderMark) {
        this.orderMark = orderMark;
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
    @Column(name = "post_fee", nullable = true, precision = 6)
    public BigDecimal getPostFee() {
        return postFee;
    }

    public void setPostFee(BigDecimal postFee) {
        this.postFee = postFee;
    }

    @Basic
    @Column(name = "total_amt", nullable = true, precision = 6)
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    @Basic
    @Column(name = "total_discount_amt", nullable = true, precision = 6)
    public BigDecimal getTotalDiscountAmt() {
        return totalDiscountAmt;
    }

    public void setTotalDiscountAmt(BigDecimal totalDiscountAmt) {
        this.totalDiscountAmt = totalDiscountAmt;
    }

    @Basic
    @Column(name = "if_selfmention", nullable = true)
    public Integer getIfSelfmention() {
        return ifSelfmention;
    }

    public void setIfSelfmention(Integer ifSelfmention) {
        this.ifSelfmention = ifSelfmention;
    }

    @Basic
    @Column(name = "selfmemtion_memo", nullable = true, length = 100)
    public String getSelfmemtionMemo() {
        return selfmemtionMemo;
    }

    public void setSelfmemtionMemo(String selfmemtionMemo) {
        this.selfmemtionMemo = selfmemtionMemo;
    }

    @Basic
    @Column(name = "pay_amt", nullable = true, precision = 6)
    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    @Basic
    @Column(name = "pay_type", nullable = true, length = 20)
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Basic
    @Column(name = "pay_type_str", nullable = true, length = 200)
    public String getPayTypeStr() {
        return payTypeStr;
    }

    public void setPayTypeStr(String payTypeStr) {
        this.payTypeStr = payTypeStr;
    }

    @Basic
    @Column(name = "pay_time", nullable = true)
    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    @Basic
    @Column(name = "pay_transaction_no", nullable = true, length = 100)
    public String getPayTransactionNo() {
        return payTransactionNo;
    }

    public void setPayTransactionNo(String payTransactionNo) {
        this.payTransactionNo = payTransactionNo;
    }

    @Basic
    @Column(name = "order_close_type", nullable = true)
    public Integer getOrderCloseType() {
        return orderCloseType;
    }

    public void setOrderCloseType(Integer orderCloseType) {
        this.orderCloseType = orderCloseType;
    }

    @Basic
    @Column(name = "expired_time", nullable = true)
    public Timestamp getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Timestamp expiredTime) {
        this.expiredTime = expiredTime;
    }

    @Basic
    @Column(name = "consign_time", nullable = true)
    public Timestamp getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Timestamp consignTime) {
        this.consignTime = consignTime;
    }

    @Basic
    @Column(name = "refund_state", nullable = true)
    public Integer getRefundState() {
        return refundState;
    }

    public void setRefundState(Integer refundState) {
        this.refundState = refundState;
    }

    @Basic
    @Column(name = "ori_order_no", nullable = true, length = 50)
    public String getOriOrderNo() {
        return oriOrderNo;
    }

    public void setOriOrderNo(String oriOrderNo) {
        this.oriOrderNo = oriOrderNo;
    }

    @Basic
    @Column(name = "ori_order_type", nullable = true, length = 20)
    public String getOriOrderType() {
        return oriOrderType;
    }

    public void setOriOrderType(String oriOrderType) {
        this.oriOrderType = oriOrderType;
    }

    @Basic
    @Column(name = "ori_order_type_descr", nullable = true, length = 100)
    public String getOriOrderTypeDescr() {
        return oriOrderTypeDescr;
    }

    public void setOriOrderTypeDescr(String oriOrderTypeDescr) {
        this.oriOrderTypeDescr = oriOrderTypeDescr;
    }

    @Basic
    @Column(name = "ori_status", nullable = true, length = 30)
    public String getOriStatus() {
        return oriStatus;
    }

    public void setOriStatus(String oriStatus) {
        this.oriStatus = oriStatus;
    }

    @Basic
    @Column(name = "ori_status_descr", nullable = true, length = 100)
    public String getOriStatusDescr() {
        return oriStatusDescr;
    }

    public void setOriStatusDescr(String oriStatusDescr) {
        this.oriStatusDescr = oriStatusDescr;
    }

    @Basic
    @Column(name = "ori_create_time", nullable = true)
    public Timestamp getOriCreateTime() {
        return oriCreateTime;
    }

    public void setOriCreateTime(Timestamp oriCreateTime) {
        this.oriCreateTime = oriCreateTime;
    }

    @Basic
    @Column(name = "ori_pay_time", nullable = true)
    public Timestamp getOriPayTime() {
        return oriPayTime;
    }

    public void setOriPayTime(Timestamp oriPayTime) {
        this.oriPayTime = oriPayTime;
    }

    @Basic
    @Column(name = "success_time", nullable = true)
    public Timestamp getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Timestamp successTime) {
        this.successTime = successTime;
    }

    @Basic
    @Column(name = "order_from", nullable = true, length = 50)
    public String getOrderFrom() {
        return orderFrom;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    @Basic
    @Column(name = "trans_state", nullable = true, length = 10)
    public String getTransState() {
        return transState;
    }

    public void setTransState(String transState) {
        this.transState = transState;
    }

    @Basic
    @Column(name = "ecorder_topno", nullable = true, length = 20)
    public String getEcorderTopno() {
        return ecorderTopno;
    }

    public void setEcorderTopno(String ecorderTopno) {
        this.ecorderTopno = ecorderTopno;
    }

    @Basic
    @Column(name = "do_state", nullable = true, length = 10)
    public String getDoState() {
        return doState;
    }

    public void setDoState(String doState) {
        this.doState = doState;
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
    @Column(name = "exec_date", nullable = true)
    public Timestamp getExecDate() {
        return execDate;
    }

    public void setExecDate(Timestamp execDate) {
        this.execDate = execDate;
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
    @Column(name = "sale_no", nullable = true, length = 45)
    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    @Basic
    @Column(name = "chk_bit", nullable = true)
    public Integer getChkBit() {
        return chkBit;
    }

    public void setChkBit(Integer chkBit) {
        this.chkBit = chkBit;
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
    @Column(name = "create_user", nullable = true, length = 20)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "express_type", nullable = true, length = 20)
    public String getExpressType() {
        return expressType;
    }

    public void setExpressType(String expressType) {
        this.expressType = expressType;
    }

    @Basic
    @Column(name = "if_member_order", nullable = true)
    public Integer getIfMemberOrder() {
        return ifMemberOrder;
    }

    public void setIfMemberOrder(Integer ifMemberOrder) {
        this.ifMemberOrder = ifMemberOrder;
    }

    @Basic
    @Column(name = "if_distrib_order", nullable = true)
    public Integer getIfDistribOrder() {
        return ifDistribOrder;
    }

    public void setIfDistribOrder(Integer ifDistribOrder) {
        this.ifDistribOrder = ifDistribOrder;
    }

    @Basic
    @Column(name = "if_retail_order", nullable = true)
    public Integer getIfRetailOrder() {
        return ifRetailOrder;
    }

    public void setIfRetailOrder(Integer ifRetailOrder) {
        this.ifRetailOrder = ifRetailOrder;
    }

    @Basic
    @Column(name = "if_refund_order", nullable = true)
    public Integer getIfRefundOrder() {
        return ifRefundOrder;
    }

    public void setIfRefundOrder(Integer ifRefundOrder) {
        this.ifRefundOrder = ifRefundOrder;
    }

    @Basic
    @Column(name = "if_virtual_order", nullable = true)
    public Integer getIfVirtualOrder() {
        return ifVirtualOrder;
    }

    public void setIfVirtualOrder(Integer ifVirtualOrder) {
        this.ifVirtualOrder = ifVirtualOrder;
    }

    @Basic
    @Column(name = "if_feedback", nullable = true)
    public Integer getIfFeedback() {
        return ifFeedback;
    }

    public void setIfFeedback(Integer ifFeedback) {
        this.ifFeedback = ifFeedback;
    }

    @Basic
    @Column(name = "express_id", nullable = true, length = 20)
    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId;
    }

    @Basic
    @Column(name = "express_name", nullable = true, length = 50)
    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    @Basic
    @Column(name = "express_no", nullable = true, length = 100)
    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    @Basic
    @Column(name = "sender_name", nullable = true, length = 20)
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    @Basic
    @Column(name = "sender_mobileno", nullable = true, length = 20)
    public String getSenderMobileno() {
        return senderMobileno;
    }

    public void setSenderMobileno(String senderMobileno) {
        this.senderMobileno = senderMobileno;
    }

    @Basic
    @Column(name = "authz_tenant_id", nullable = true, length = 100)
    public String getAuthzTenantId() {
        return authzTenantId;
    }

    public void setAuthzTenantId(String authzTenantId) {
        this.authzTenantId = authzTenantId;
    }

    @Basic
    @Column(name = "addr_domain", nullable = true, length = 200)
    public String getAddrDomain() {
        return addrDomain;
    }

    public void setAddrDomain(String addrDomain) {
        this.addrDomain = addrDomain;
    }

    @Basic
    @Column(name = "addr_fulldetail", nullable = true, length = 500)
    public String getAddrFulldetail() {
        return addrFulldetail;
    }

    public void setAddrFulldetail(String addrFulldetail) {
        this.addrFulldetail = addrFulldetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbEcorderH ecorderH = (TbEcorderH) o;
        return idx == ecorderH.idx &&
                Objects.equals(tenantId, ecorderH.tenantId) &&
                Objects.equals(ecorderNo, ecorderH.ecorderNo) &&
                Objects.equals(orderType, ecorderH.orderType) &&
                Objects.equals(createType, ecorderH.createType) &&
                Objects.equals(depotId, ecorderH.depotId) &&
                Objects.equals(depotName, ecorderH.depotName) &&
                Objects.equals(estoreId, ecorderH.estoreId) &&
                Objects.equals(estoreName, ecorderH.estoreName) &&
                Objects.equals(customerId, ecorderH.customerId) &&
                Objects.equals(customerName, ecorderH.customerName) &&
                Objects.equals(customerMobile, ecorderH.customerMobile) &&
                Objects.equals(customerEmail, ecorderH.customerEmail) &&
                Objects.equals(customerMemo, ecorderH.customerMemo) &&
                Objects.equals(customerIdcard, ecorderH.customerIdcard) &&
                Objects.equals(addrCountry, ecorderH.addrCountry) &&
                Objects.equals(addrProvince, ecorderH.addrProvince) &&
                Objects.equals(addrCity, ecorderH.addrCity) &&
                Objects.equals(addrRegion, ecorderH.addrRegion) &&
                Objects.equals(addrStreet, ecorderH.addrStreet) &&
                Objects.equals(addrDetail, ecorderH.addrDetail) &&
                Objects.equals(postCode, ecorderH.postCode) &&
                Objects.equals(ifInvoice, ecorderH.ifInvoice) &&
                Objects.equals(invoiceType, ecorderH.invoiceType) &&
                Objects.equals(invoiceTitle, ecorderH.invoiceTitle) &&
                Objects.equals(sellerMemo, ecorderH.sellerMemo) &&
                Objects.equals(sellerMobileno, ecorderH.sellerMobileno) &&
                Objects.equals(orderMark, ecorderH.orderMark) &&
                Objects.equals(orderAmt, ecorderH.orderAmt) &&
                Objects.equals(postFee, ecorderH.postFee) &&
                Objects.equals(totalAmt, ecorderH.totalAmt) &&
                Objects.equals(totalDiscountAmt, ecorderH.totalDiscountAmt) &&
                Objects.equals(ifSelfmention, ecorderH.ifSelfmention) &&
                Objects.equals(selfmemtionMemo, ecorderH.selfmemtionMemo) &&
                Objects.equals(payAmt, ecorderH.payAmt) &&
                Objects.equals(payType, ecorderH.payType) &&
                Objects.equals(payTypeStr, ecorderH.payTypeStr) &&
                Objects.equals(payTime, ecorderH.payTime) &&
                Objects.equals(payTransactionNo, ecorderH.payTransactionNo) &&
                Objects.equals(orderCloseType, ecorderH.orderCloseType) &&
                Objects.equals(expiredTime, ecorderH.expiredTime) &&
                Objects.equals(consignTime, ecorderH.consignTime) &&
                Objects.equals(refundState, ecorderH.refundState) &&
                Objects.equals(oriOrderNo, ecorderH.oriOrderNo) &&
                Objects.equals(oriOrderType, ecorderH.oriOrderType) &&
                Objects.equals(oriOrderTypeDescr, ecorderH.oriOrderTypeDescr) &&
                Objects.equals(oriStatus, ecorderH.oriStatus) &&
                Objects.equals(oriStatusDescr, ecorderH.oriStatusDescr) &&
                Objects.equals(oriCreateTime, ecorderH.oriCreateTime) &&
                Objects.equals(oriPayTime, ecorderH.oriPayTime) &&
                Objects.equals(successTime, ecorderH.successTime) &&
                Objects.equals(orderFrom, ecorderH.orderFrom) &&
                Objects.equals(transState, ecorderH.transState) &&
                Objects.equals(ecorderTopno, ecorderH.ecorderTopno) &&
                Objects.equals(doState, ecorderH.doState) &&
                Objects.equals(state, ecorderH.state) &&
                Objects.equals(execDate, ecorderH.execDate) &&
                Objects.equals(payState, ecorderH.payState) &&
                Objects.equals(saleNo, ecorderH.saleNo) &&
                Objects.equals(chkBit, ecorderH.chkBit) &&
                Objects.equals(createTime, ecorderH.createTime) &&
                Objects.equals(createUser, ecorderH.createUser) &&
                Objects.equals(expressType, ecorderH.expressType) &&
                Objects.equals(ifMemberOrder, ecorderH.ifMemberOrder) &&
                Objects.equals(ifDistribOrder, ecorderH.ifDistribOrder) &&
                Objects.equals(ifRetailOrder, ecorderH.ifRetailOrder) &&
                Objects.equals(ifRefundOrder, ecorderH.ifRefundOrder) &&
                Objects.equals(ifVirtualOrder, ecorderH.ifVirtualOrder) &&
                Objects.equals(ifFeedback, ecorderH.ifFeedback) &&
                Objects.equals(expressId, ecorderH.expressId) &&
                Objects.equals(expressName, ecorderH.expressName) &&
                Objects.equals(expressNo, ecorderH.expressNo) &&
                Objects.equals(senderName, ecorderH.senderName) &&
                Objects.equals(senderMobileno, ecorderH.senderMobileno) &&
                Objects.equals(authzTenantId, ecorderH.authzTenantId) &&
                Objects.equals(addrDomain, ecorderH.addrDomain) &&
                Objects.equals(addrFulldetail, ecorderH.addrFulldetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, ecorderNo, orderType, createType, depotId, depotName, estoreId, estoreName, customerId, customerName, customerMobile, customerEmail, customerMemo, customerIdcard, addrCountry, addrProvince, addrCity, addrRegion, addrStreet, addrDetail, postCode, ifInvoice, invoiceType, invoiceTitle, sellerMemo, sellerMobileno, orderMark, orderAmt, postFee, totalAmt, totalDiscountAmt, ifSelfmention, selfmemtionMemo, payAmt, payType, payTypeStr, payTime, payTransactionNo, orderCloseType, expiredTime, consignTime, refundState, oriOrderNo, oriOrderType, oriOrderTypeDescr, oriStatus, oriStatusDescr, oriCreateTime, oriPayTime, successTime, orderFrom, transState, ecorderTopno, doState, state, execDate, payState, saleNo, chkBit, createTime, createUser, expressType, ifMemberOrder, ifDistribOrder, ifRetailOrder, ifRefundOrder, ifVirtualOrder, ifFeedback, expressId, expressName, expressNo, senderName, senderMobileno, authzTenantId, addrDomain, addrFulldetail);
    }

    @Basic
    @Column(name = "sender_addr", nullable = true, length = 500)
    public String getSenderAddr() {
        return senderAddr;
    }

    public void setSenderAddr(String senderAddr) {
        this.senderAddr = senderAddr;
    }

    @Basic
    @Column(name = "estore_type", nullable = true, length = 20)
    public String getEstoreType() {
        return estoreType;
    }

    public void setEstoreType(String estoreType) {
        this.estoreType = estoreType;
    }
}
