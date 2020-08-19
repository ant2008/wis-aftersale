package com.wenc.commdomain.vo.stb;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;



public class VoEcorderH {

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
    private String[] addrDomain;
    private String addrFulldetail;


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

    public String getEcorderNo() {
        return ecorderNo;
    }

    public void setEcorderNo(String ecorderNo) {
        this.ecorderNo = ecorderNo;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getCreateType() {
        return createType;
    }

    public void setCreateType(String createType) {
        this.createType = createType;
    }

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName;
    }

    public String getEstoreId() {
        return estoreId;
    }

    public void setEstoreId(String estoreId) {
        this.estoreId = estoreId;
    }

    public String getEstoreName() {
        return estoreName;
    }

    public void setEstoreName(String estoreName) {
        this.estoreName = estoreName;
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

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerMemo() {
        return customerMemo;
    }

    public void setCustomerMemo(String customerMemo) {
        this.customerMemo = customerMemo;
    }

    public String getCustomerIdcard() {
        return customerIdcard;
    }

    public void setCustomerIdcard(String customerIdcard) {
        this.customerIdcard = customerIdcard;
    }

    public String getAddrCountry() {
        return addrCountry;
    }

    public void setAddrCountry(String addrCountry) {
        this.addrCountry = addrCountry;
    }

    public String getAddrProvince() {
        return addrProvince;
    }

    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince;
    }

    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    public String getAddrRegion() {
        return addrRegion;
    }

    public void setAddrRegion(String addrRegion) {
        this.addrRegion = addrRegion;
    }

    public String getAddrStreet() {
        return addrStreet;
    }

    public void setAddrStreet(String addrStreet) {
        this.addrStreet = addrStreet;
    }

    public String getAddrDetail() {
        return addrDetail;
    }

    public void setAddrDetail(String addrDetail) {
        this.addrDetail = addrDetail;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getIfInvoice() {
        return ifInvoice;
    }

    public void setIfInvoice(String ifInvoice) {
        this.ifInvoice = ifInvoice;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getSellerMemo() {
        return sellerMemo;
    }

    public void setSellerMemo(String sellerMemo) {
        this.sellerMemo = sellerMemo;
    }

    public String getSellerMobileno() {
        return sellerMobileno;
    }

    public void setSellerMobileno(String sellerMobileno) {
        this.sellerMobileno = sellerMobileno;
    }

    public String getOrderMark() {
        return orderMark;
    }

    public void setOrderMark(String orderMark) {
        this.orderMark = orderMark;
    }

    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
    }

    public BigDecimal getPostFee() {
        return postFee;
    }

    public void setPostFee(BigDecimal postFee) {
        this.postFee = postFee;
    }

    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    public BigDecimal getTotalDiscountAmt() {
        return totalDiscountAmt;
    }

    public void setTotalDiscountAmt(BigDecimal totalDiscountAmt) {
        this.totalDiscountAmt = totalDiscountAmt;
    }

    public Integer getIfSelfmention() {
        return ifSelfmention;
    }

    public void setIfSelfmention(Integer ifSelfmention) {
        this.ifSelfmention = ifSelfmention;
    }

    public String getSelfmemtionMemo() {
        return selfmemtionMemo;
    }

    public void setSelfmemtionMemo(String selfmemtionMemo) {
        this.selfmemtionMemo = selfmemtionMemo;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayTypeStr() {
        return payTypeStr;
    }

    public void setPayTypeStr(String payTypeStr) {
        this.payTypeStr = payTypeStr;
    }

    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    public String getPayTransactionNo() {
        return payTransactionNo;
    }

    public void setPayTransactionNo(String payTransactionNo) {
        this.payTransactionNo = payTransactionNo;
    }

    public Integer getOrderCloseType() {
        return orderCloseType;
    }

    public void setOrderCloseType(Integer orderCloseType) {
        this.orderCloseType = orderCloseType;
    }

    public Timestamp getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Timestamp expiredTime) {
        this.expiredTime = expiredTime;
    }

    public Timestamp getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Timestamp consignTime) {
        this.consignTime = consignTime;
    }

    public Integer getRefundState() {
        return refundState;
    }

    public void setRefundState(Integer refundState) {
        this.refundState = refundState;
    }

    public String getOriOrderNo() {
        return oriOrderNo;
    }

    public void setOriOrderNo(String oriOrderNo) {
        this.oriOrderNo = oriOrderNo;
    }

    public String getOriOrderType() {
        return oriOrderType;
    }

    public void setOriOrderType(String oriOrderType) {
        this.oriOrderType = oriOrderType;
    }

    public String getOriOrderTypeDescr() {
        return oriOrderTypeDescr;
    }

    public void setOriOrderTypeDescr(String oriOrderTypeDescr) {
        this.oriOrderTypeDescr = oriOrderTypeDescr;
    }

    public String getOriStatus() {
        return oriStatus;
    }

    public void setOriStatus(String oriStatus) {
        this.oriStatus = oriStatus;
    }

    public String getOriStatusDescr() {
        return oriStatusDescr;
    }

    public void setOriStatusDescr(String oriStatusDescr) {
        this.oriStatusDescr = oriStatusDescr;
    }

    public Timestamp getOriCreateTime() {
        return oriCreateTime;
    }

    public void setOriCreateTime(Timestamp oriCreateTime) {
        this.oriCreateTime = oriCreateTime;
    }

    public Timestamp getOriPayTime() {
        return oriPayTime;
    }

    public void setOriPayTime(Timestamp oriPayTime) {
        this.oriPayTime = oriPayTime;
    }

    public Timestamp getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Timestamp successTime) {
        this.successTime = successTime;
    }

    public String getOrderFrom() {
        return orderFrom;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    public String getTransState() {
        return transState;
    }

    public void setTransState(String transState) {
        this.transState = transState;
    }

    public String getEcorderTopno() {
        return ecorderTopno;
    }

    public void setEcorderTopno(String ecorderTopno) {
        this.ecorderTopno = ecorderTopno;
    }

    public String getDoState() {
        return doState;
    }

    public void setDoState(String doState) {
        this.doState = doState;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Timestamp getExecDate() {
        return execDate;
    }

    public void setExecDate(Timestamp execDate) {
        this.execDate = execDate;
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }

    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    public Integer getChkBit() {
        return chkBit;
    }

    public void setChkBit(Integer chkBit) {
        this.chkBit = chkBit;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getExpressType() {
        return expressType;
    }

    public void setExpressType(String expressType) {
        this.expressType = expressType;
    }

    public Integer getIfMemberOrder() {
        return ifMemberOrder;
    }

    public void setIfMemberOrder(Integer ifMemberOrder) {
        this.ifMemberOrder = ifMemberOrder;
    }

    public Integer getIfDistribOrder() {
        return ifDistribOrder;
    }

    public void setIfDistribOrder(Integer ifDistribOrder) {
        this.ifDistribOrder = ifDistribOrder;
    }

    public Integer getIfRetailOrder() {
        return ifRetailOrder;
    }

    public void setIfRetailOrder(Integer ifRetailOrder) {
        this.ifRetailOrder = ifRetailOrder;
    }

    public Integer getIfRefundOrder() {
        return ifRefundOrder;
    }

    public void setIfRefundOrder(Integer ifRefundOrder) {
        this.ifRefundOrder = ifRefundOrder;
    }

    public Integer getIfVirtualOrder() {
        return ifVirtualOrder;
    }

    public void setIfVirtualOrder(Integer ifVirtualOrder) {
        this.ifVirtualOrder = ifVirtualOrder;
    }

    public Integer getIfFeedback() {
        return ifFeedback;
    }

    public void setIfFeedback(Integer ifFeedback) {
        this.ifFeedback = ifFeedback;
    }

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderMobileno() {
        return senderMobileno;
    }

    public void setSenderMobileno(String senderMobileno) {
        this.senderMobileno = senderMobileno;
    }

    public String getAuthzTenantId() {
        return authzTenantId;
    }

    public void setAuthzTenantId(String authzTenantId) {
        this.authzTenantId = authzTenantId;
    }

    public String[] getAddrDomain() {
        return addrDomain;
    }

    public void setAddrDomain(String[] addrDomain) {
        this.addrDomain = addrDomain;
    }

    public String getAddrFulldetail() {
        return addrFulldetail;
    }

    public void setAddrFulldetail(String addrFulldetail) {
        this.addrFulldetail = addrFulldetail;
    }
}
