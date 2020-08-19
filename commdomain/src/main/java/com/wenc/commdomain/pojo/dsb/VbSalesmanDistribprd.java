package com.wenc.commdomain.pojo.dsb;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_salesman_distribprd")
public class VbSalesmanDistribprd {
    private long idx;
    private String tenantId;
    private String distributorId;
    private String salesmanId;
    private String itemId;
    private String distribUrl;
    private String distribCode;
    private Integer spreadCount;
    private Integer spreadCustomerCount;
    private Integer spreadViewCount;
    private String createUser;
    private Timestamp createTime;
    private Integer state;
    private long salesmanIdx;
    private String salesmanType;
    private String salesmanName;
    private String salesmanMobile;
    private String salesmanHigherId;
    private String bdistributorId;
    private String salesmanIdnum;
    private Timestamp registerDate;
    private Integer salesmanLevel;
    private Integer salesmanIntegral;
    private Integer salesmanRelay;
    private Integer salesmanRelayMax;
    private Integer bstate;
    private String ifCertify;
    private String userId;
    private String wxId;
    private long distribProductIdx;
    private String itemDescribe;
    private String extraId;
    private String authzTenantId;
    private String vendorId;
    private String vendorName;
    private String distributionClass;
    private BigDecimal distributionPrice;
    private String distributionDescribe;
    private String distributionScope;
    private String commissionType;
    private BigDecimal commissionAmt;
    private BigDecimal commissionRate;
    private String rebateType;
    private BigDecimal rebatePrice;
    private BigDecimal rebateAmt;
    private BigDecimal rebateRate;
    private BigDecimal supplyPrice;
    private BigDecimal proposalPriceS;
    private BigDecimal proposalPriceH;
    private String allowBelowDsbprice;
    private Timestamp applyDate;
    private String applyTenantId;
    private String applyUserId;
    private String applyUserName;
    private String chkUserId;
    private String chkUserName;
    private String chkResult;
    private Integer chkState;
    private Timestamp chkDate;
    private String itemType;
    private Integer itemState;
    private String distributionPic;
    private String itemName;
    private String itemUnit;
    private String itemSubno;
    private String itemSpec;
    private String prdOrigin;
    private String prdFactory;
    private Long extraIdx;
    private String vendorTenantId;
    private Long vendorIdx;
    private String itemPic1;
    private String itemPic2;
    private String itemPic3;
    private String prdAttrib;
    private String offerDescribe;

    @Id
    @Basic
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
    @Column(name = "distributor_id", nullable = true, length = 20)
    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    @Basic
    @Column(name = "salesman_id", nullable = true, length = 20)
    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId;
    }

    @Basic
    @Column(name = "item_id", nullable = true, length = 20)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "distrib_url", nullable = true, length = 300)
    public String getDistribUrl() {
        return distribUrl;
    }

    public void setDistribUrl(String distribUrl) {
        this.distribUrl = distribUrl;
    }

    @Basic
    @Column(name = "distrib_code", nullable = true, length = 20)
    public String getDistribCode() {
        return distribCode;
    }

    public void setDistribCode(String distribCode) {
        this.distribCode = distribCode;
    }

    @Basic
    @Column(name = "spread_count", nullable = true)
    public Integer getSpreadCount() {
        return spreadCount;
    }

    public void setSpreadCount(Integer spreadCount) {
        this.spreadCount = spreadCount;
    }

    @Basic
    @Column(name = "spread_customer_count", nullable = true)
    public Integer getSpreadCustomerCount() {
        return spreadCustomerCount;
    }

    public void setSpreadCustomerCount(Integer spreadCustomerCount) {
        this.spreadCustomerCount = spreadCustomerCount;
    }

    @Basic
    @Column(name = "spread_view_count", nullable = true)
    public Integer getSpreadViewCount() {
        return spreadViewCount;
    }

    public void setSpreadViewCount(Integer spreadViewCount) {
        this.spreadViewCount = spreadViewCount;
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

    @Basic
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "salesman_idx", nullable = false)
    public long getSalesmanIdx() {
        return salesmanIdx;
    }

    public void setSalesmanIdx(long salesmanIdx) {
        this.salesmanIdx = salesmanIdx;
    }

    @Basic
    @Column(name = "salesman_type", nullable = true, length = 20)
    public String getSalesmanType() {
        return salesmanType;
    }

    public void setSalesmanType(String salesmanType) {
        this.salesmanType = salesmanType;
    }

    @Basic
    @Column(name = "salesman_name", nullable = true, length = 30)
    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    @Basic
    @Column(name = "salesman_mobile", nullable = true, length = 30)
    public String getSalesmanMobile() {
        return salesmanMobile;
    }

    public void setSalesmanMobile(String salesmanMobile) {
        this.salesmanMobile = salesmanMobile;
    }

    @Basic
    @Column(name = "salesman_higher_id", nullable = true, length = 20)
    public String getSalesmanHigherId() {
        return salesmanHigherId;
    }

    public void setSalesmanHigherId(String salesmanHigherId) {
        this.salesmanHigherId = salesmanHigherId;
    }

    @Basic
    @Column(name = "bdistributor_id", nullable = true, length = 20)
    public String getBdistributorId() {
        return bdistributorId;
    }

    public void setBdistributorId(String bdistributorId) {
        this.bdistributorId = bdistributorId;
    }

    @Basic
    @Column(name = "salesman_idnum", nullable = true, length = 50)
    public String getSalesmanIdnum() {
        return salesmanIdnum;
    }

    public void setSalesmanIdnum(String salesmanIdnum) {
        this.salesmanIdnum = salesmanIdnum;
    }

    @Basic
    @Column(name = "register_date", nullable = true)
    public Timestamp getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate;
    }

    @Basic
    @Column(name = "salesman_level", nullable = true)
    public Integer getSalesmanLevel() {
        return salesmanLevel;
    }

    public void setSalesmanLevel(Integer salesmanLevel) {
        this.salesmanLevel = salesmanLevel;
    }

    @Basic
    @Column(name = "salesman_integral", nullable = true, precision = 0)
    public Integer getSalesmanIntegral() {
        return salesmanIntegral;
    }

    public void setSalesmanIntegral(Integer salesmanIntegral) {
        this.salesmanIntegral = salesmanIntegral;
    }

    @Basic
    @Column(name = "salesman_relay", nullable = true)
    public Integer getSalesmanRelay() {
        return salesmanRelay;
    }

    public void setSalesmanRelay(Integer salesmanRelay) {
        this.salesmanRelay = salesmanRelay;
    }

    @Basic
    @Column(name = "salesman_relay_max", nullable = true)
    public Integer getSalesmanRelayMax() {
        return salesmanRelayMax;
    }

    public void setSalesmanRelayMax(Integer salesmanRelayMax) {
        this.salesmanRelayMax = salesmanRelayMax;
    }

    @Basic
    @Column(name = "bstate", nullable = true)
    public Integer getBstate() {
        return bstate;
    }

    public void setBstate(Integer bstate) {
        this.bstate = bstate;
    }

    @Basic
    @Column(name = "if_certify", nullable = true, length = 20)
    public String getIfCertify() {
        return ifCertify;
    }

    public void setIfCertify(String ifCertify) {
        this.ifCertify = ifCertify;
    }

    @Basic
    @Column(name = "user_id", nullable = true, length = 30)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "wx_id", nullable = true, length = 50)
    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    @Basic
    @Column(name = "distrib_product_idx", nullable = false)
    public long getDistribProductIdx() {
        return distribProductIdx;
    }

    public void setDistribProductIdx(long distribProductIdx) {
        this.distribProductIdx = distribProductIdx;
    }

    @Basic
    @Column(name = "item_describe", nullable = true, length = 200)
    public String getItemDescribe() {
        return itemDescribe;
    }

    public void setItemDescribe(String itemDescribe) {
        this.itemDescribe = itemDescribe;
    }

    @Basic
    @Column(name = "extra_id", nullable = true, length = 30)
    public String getExtraId() {
        return extraId;
    }

    public void setExtraId(String extraId) {
        this.extraId = extraId;
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
    @Column(name = "vendor_id", nullable = true, length = 20)
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Basic
    @Column(name = "vendor_name", nullable = true, length = 30)
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    @Basic
    @Column(name = "distribution_class", nullable = true, length = 20)
    public String getDistributionClass() {
        return distributionClass;
    }

    public void setDistributionClass(String distributionClass) {
        this.distributionClass = distributionClass;
    }

    @Basic
    @Column(name = "distribution_price", nullable = true, precision = 6)
    public BigDecimal getDistributionPrice() {
        return distributionPrice;
    }

    public void setDistributionPrice(BigDecimal distributionPrice) {
        this.distributionPrice = distributionPrice;
    }

    @Basic
    @Column(name = "distribution_describe", nullable = true, length = 100)
    public String getDistributionDescribe() {
        return distributionDescribe;
    }

    public void setDistributionDescribe(String distributionDescribe) {
        this.distributionDescribe = distributionDescribe;
    }

    @Basic
    @Column(name = "distribution_scope", nullable = true, length = 20)
    public String getDistributionScope() {
        return distributionScope;
    }

    public void setDistributionScope(String distributionScope) {
        this.distributionScope = distributionScope;
    }

    @Basic
    @Column(name = "commission_type", nullable = true, length = 20)
    public String getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(String commissionType) {
        this.commissionType = commissionType;
    }

    @Basic
    @Column(name = "commission_amt", nullable = true, precision = 6)
    public BigDecimal getCommissionAmt() {
        return commissionAmt;
    }

    public void setCommissionAmt(BigDecimal commissionAmt) {
        this.commissionAmt = commissionAmt;
    }

    @Basic
    @Column(name = "commission_rate", nullable = true, precision = 6)
    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Basic
    @Column(name = "rebate_type", nullable = true, length = 20)
    public String getRebateType() {
        return rebateType;
    }

    public void setRebateType(String rebateType) {
        this.rebateType = rebateType;
    }

    @Basic
    @Column(name = "rebate_price", nullable = true, precision = 6)
    public BigDecimal getRebatePrice() {
        return rebatePrice;
    }

    public void setRebatePrice(BigDecimal rebatePrice) {
        this.rebatePrice = rebatePrice;
    }

    @Basic
    @Column(name = "rebate_amt", nullable = true, precision = 6)
    public BigDecimal getRebateAmt() {
        return rebateAmt;
    }

    public void setRebateAmt(BigDecimal rebateAmt) {
        this.rebateAmt = rebateAmt;
    }

    @Basic
    @Column(name = "rebate_rate", nullable = true, precision = 6)
    public BigDecimal getRebateRate() {
        return rebateRate;
    }

    public void setRebateRate(BigDecimal rebateRate) {
        this.rebateRate = rebateRate;
    }

    @Basic
    @Column(name = "supply_price", nullable = true, precision = 6)
    public BigDecimal getSupplyPrice() {
        return supplyPrice;
    }

    public void setSupplyPrice(BigDecimal supplyPrice) {
        this.supplyPrice = supplyPrice;
    }

    @Basic
    @Column(name = "proposal_price_s", nullable = true, precision = 6)
    public BigDecimal getProposalPriceS() {
        return proposalPriceS;
    }

    public void setProposalPriceS(BigDecimal proposalPriceS) {
        this.proposalPriceS = proposalPriceS;
    }

    @Basic
    @Column(name = "proposal_price_h", nullable = true, precision = 6)
    public BigDecimal getProposalPriceH() {
        return proposalPriceH;
    }

    public void setProposalPriceH(BigDecimal proposalPriceH) {
        this.proposalPriceH = proposalPriceH;
    }

    @Basic
    @Column(name = "allow_below_dsbprice", nullable = true, length = 10)
    public String getAllowBelowDsbprice() {
        return allowBelowDsbprice;
    }

    public void setAllowBelowDsbprice(String allowBelowDsbprice) {
        this.allowBelowDsbprice = allowBelowDsbprice;
    }

    @Basic
    @Column(name = "apply_date", nullable = true)
    public Timestamp getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Timestamp applyDate) {
        this.applyDate = applyDate;
    }

    @Basic
    @Column(name = "apply_tenant_id", nullable = true, length = 50)
    public String getApplyTenantId() {
        return applyTenantId;
    }

    public void setApplyTenantId(String applyTenantId) {
        this.applyTenantId = applyTenantId;
    }

    @Basic
    @Column(name = "apply_user_id", nullable = true, length = 20)
    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    @Basic
    @Column(name = "apply_user_name", nullable = true, length = 20)
    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
    }

    @Basic
    @Column(name = "chk_user_id", nullable = true, length = 20)
    public String getChkUserId() {
        return chkUserId;
    }

    public void setChkUserId(String chkUserId) {
        this.chkUserId = chkUserId;
    }

    @Basic
    @Column(name = "chk_user_name", nullable = true, length = 30)
    public String getChkUserName() {
        return chkUserName;
    }

    public void setChkUserName(String chkUserName) {
        this.chkUserName = chkUserName;
    }

    @Basic
    @Column(name = "chk_result", nullable = true, length = 100)
    public String getChkResult() {
        return chkResult;
    }

    public void setChkResult(String chkResult) {
        this.chkResult = chkResult;
    }

    @Basic
    @Column(name = "chk_state", nullable = true)
    public Integer getChkState() {
        return chkState;
    }

    public void setChkState(Integer chkState) {
        this.chkState = chkState;
    }

    @Basic
    @Column(name = "chk_date", nullable = true)
    public Timestamp getChkDate() {
        return chkDate;
    }

    public void setChkDate(Timestamp chkDate) {
        this.chkDate = chkDate;
    }

    @Basic
    @Column(name = "item_type", nullable = true, length = 20)
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Basic
    @Column(name = "item_state", nullable = true)
    public Integer getItemState() {
        return itemState;
    }

    public void setItemState(Integer itemState) {
        this.itemState = itemState;
    }

    @Basic
    @Column(name = "distribution_pic", nullable = true, length = 200)
    public String getDistributionPic() {
        return distributionPic;
    }

    public void setDistributionPic(String distributionPic) {
        this.distributionPic = distributionPic;
    }

    @Basic
    @Column(name = "item_name", nullable = true, length = 200)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "item_unit", nullable = true, length = 20)
    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    @Basic
    @Column(name = "item_subno", nullable = true, length = 20)
    public String getItemSubno() {
        return itemSubno;
    }

    public void setItemSubno(String itemSubno) {
        this.itemSubno = itemSubno;
    }

    @Basic
    @Column(name = "item_spec", nullable = true, length = 80)
    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    @Basic
    @Column(name = "prd_origin", nullable = true, length = 20)
    public String getPrdOrigin() {
        return prdOrigin;
    }

    public void setPrdOrigin(String prdOrigin) {
        this.prdOrigin = prdOrigin;
    }

    @Basic
    @Column(name = "prd_factory", nullable = true, length = 60)
    public String getPrdFactory() {
        return prdFactory;
    }

    public void setPrdFactory(String prdFactory) {
        this.prdFactory = prdFactory;
    }

    @Basic
    @Column(name = "extra_idx", nullable = true)
    public Long getExtraIdx() {
        return extraIdx;
    }

    public void setExtraIdx(Long extraIdx) {
        this.extraIdx = extraIdx;
    }

    @Basic
    @Column(name = "vendor_tenant_id", nullable = true, length = 50)
    public String getVendorTenantId() {
        return vendorTenantId;
    }

    public void setVendorTenantId(String vendorTenantId) {
        this.vendorTenantId = vendorTenantId;
    }

    @Basic
    @Column(name = "vendor_idx", nullable = true)
    public Long getVendorIdx() {
        return vendorIdx;
    }

    public void setVendorIdx(Long vendorIdx) {
        this.vendorIdx = vendorIdx;
    }

    @Basic
    @Column(name = "item_pic1", nullable = true, length = 1000)
    public String getItemPic1() {
        return itemPic1;
    }

    public void setItemPic1(String itemPic1) {
        this.itemPic1 = itemPic1;
    }

    @Basic
    @Column(name = "item_pic2", nullable = true, length = 1000)
    public String getItemPic2() {
        return itemPic2;
    }

    public void setItemPic2(String itemPic2) {
        this.itemPic2 = itemPic2;
    }

    @Basic
    @Column(name = "item_pic3", nullable = true, length = 1000)
    public String getItemPic3() {
        return itemPic3;
    }

    public void setItemPic3(String itemPic3) {
        this.itemPic3 = itemPic3;
    }

    @Basic
    @Column(name = "prd_attrib", nullable = true, length = 10)
    public String getPrdAttrib() {
        return prdAttrib;
    }

    public void setPrdAttrib(String prdAttrib) {
        this.prdAttrib = prdAttrib;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbSalesmanDistribprd that = (VbSalesmanDistribprd) o;
        return idx == that.idx &&
                salesmanIdx == that.salesmanIdx &&
                distribProductIdx == that.distribProductIdx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(distributorId, that.distributorId) &&
                Objects.equals(salesmanId, that.salesmanId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(distribUrl, that.distribUrl) &&
                Objects.equals(distribCode, that.distribCode) &&
                Objects.equals(spreadCount, that.spreadCount) &&
                Objects.equals(spreadCustomerCount, that.spreadCustomerCount) &&
                Objects.equals(spreadViewCount, that.spreadViewCount) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(state, that.state) &&
                Objects.equals(salesmanType, that.salesmanType) &&
                Objects.equals(salesmanName, that.salesmanName) &&
                Objects.equals(salesmanMobile, that.salesmanMobile) &&
                Objects.equals(salesmanHigherId, that.salesmanHigherId) &&
                Objects.equals(bdistributorId, that.bdistributorId) &&
                Objects.equals(salesmanIdnum, that.salesmanIdnum) &&
                Objects.equals(registerDate, that.registerDate) &&
                Objects.equals(salesmanLevel, that.salesmanLevel) &&
                Objects.equals(salesmanIntegral, that.salesmanIntegral) &&
                Objects.equals(salesmanRelay, that.salesmanRelay) &&
                Objects.equals(salesmanRelayMax, that.salesmanRelayMax) &&
                Objects.equals(bstate, that.bstate) &&
                Objects.equals(ifCertify, that.ifCertify) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(wxId, that.wxId) &&
                Objects.equals(itemDescribe, that.itemDescribe) &&
                Objects.equals(extraId, that.extraId) &&
                Objects.equals(authzTenantId, that.authzTenantId) &&
                Objects.equals(vendorId, that.vendorId) &&
                Objects.equals(vendorName, that.vendorName) &&
                Objects.equals(distributionClass, that.distributionClass) &&
                Objects.equals(distributionPrice, that.distributionPrice) &&
                Objects.equals(distributionDescribe, that.distributionDescribe) &&
                Objects.equals(distributionScope, that.distributionScope) &&
                Objects.equals(commissionType, that.commissionType) &&
                Objects.equals(commissionAmt, that.commissionAmt) &&
                Objects.equals(commissionRate, that.commissionRate) &&
                Objects.equals(rebateType, that.rebateType) &&
                Objects.equals(rebatePrice, that.rebatePrice) &&
                Objects.equals(rebateAmt, that.rebateAmt) &&
                Objects.equals(rebateRate, that.rebateRate) &&
                Objects.equals(supplyPrice, that.supplyPrice) &&
                Objects.equals(proposalPriceS, that.proposalPriceS) &&
                Objects.equals(proposalPriceH, that.proposalPriceH) &&
                Objects.equals(allowBelowDsbprice, that.allowBelowDsbprice) &&
                Objects.equals(applyDate, that.applyDate) &&
                Objects.equals(applyTenantId, that.applyTenantId) &&
                Objects.equals(applyUserId, that.applyUserId) &&
                Objects.equals(applyUserName, that.applyUserName) &&
                Objects.equals(chkUserId, that.chkUserId) &&
                Objects.equals(chkUserName, that.chkUserName) &&
                Objects.equals(chkResult, that.chkResult) &&
                Objects.equals(chkState, that.chkState) &&
                Objects.equals(chkDate, that.chkDate) &&
                Objects.equals(itemType, that.itemType) &&
                Objects.equals(itemState, that.itemState) &&
                Objects.equals(distributionPic, that.distributionPic) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemUnit, that.itemUnit) &&
                Objects.equals(itemSubno, that.itemSubno) &&
                Objects.equals(itemSpec, that.itemSpec) &&
                Objects.equals(prdOrigin, that.prdOrigin) &&
                Objects.equals(prdFactory, that.prdFactory) &&
                Objects.equals(extraIdx, that.extraIdx) &&
                Objects.equals(vendorTenantId, that.vendorTenantId) &&
                Objects.equals(vendorIdx, that.vendorIdx) &&
                Objects.equals(itemPic1, that.itemPic1) &&
                Objects.equals(itemPic2, that.itemPic2) &&
                Objects.equals(itemPic3, that.itemPic3) &&
                Objects.equals(prdAttrib, that.prdAttrib);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, distributorId, salesmanId, itemId, distribUrl, distribCode, spreadCount,
                spreadCustomerCount, spreadViewCount, createUser, createTime, state, salesmanIdx, salesmanType,
                salesmanName, salesmanMobile, salesmanHigherId, bdistributorId, salesmanIdnum, registerDate,
                salesmanLevel, salesmanIntegral, salesmanRelay, salesmanRelayMax, bstate, ifCertify, userId, wxId,
                distribProductIdx, itemDescribe, extraId, authzTenantId, vendorId, vendorName, distributionClass,
                distributionPrice, distributionDescribe, distributionScope, commissionType, commissionAmt,
                commissionRate, rebateType, rebatePrice, rebateAmt, rebateRate, supplyPrice, proposalPriceS, proposalPriceH, allowBelowDsbprice, applyDate, applyTenantId, applyUserId, applyUserName, chkUserId, chkUserName, chkResult, chkState, chkDate, itemType, itemState, distributionPic, itemName, itemUnit, itemSubno, itemSpec, prdOrigin, prdFactory, extraIdx, vendorTenantId, vendorIdx, itemPic1, itemPic2, itemPic3, prdAttrib);
    }

    @Basic
    @Column(name = "offer_describe", nullable = true, length = 200)
    public String getOfferDescribe() {
        return offerDescribe;
    }

    public void setOfferDescribe(String offerDescribe) {
        this.offerDescribe = offerDescribe;
    }
}
