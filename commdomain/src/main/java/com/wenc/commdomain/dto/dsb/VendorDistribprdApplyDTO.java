package com.wenc.commdomain.dto.dsb;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class VendorDistribprdApplyDTO {

    private long idx;
    private String tenantId;
    private String itemId;
    private String itemDisctribe;
    private String extraId;
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

    private String offerDescribe;

    public String getOfferDescribe() {
        return offerDescribe;
    }

    public void setOfferDescribe(String offerDescribe) {
        this.offerDescribe = offerDescribe;
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

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemDisctribe() {
        return itemDisctribe;
    }

    public void setItemDisctribe(String itemDisctribe) {
        this.itemDisctribe = itemDisctribe;
    }

    public String getExtraId() {
        return extraId;
    }

    public void setExtraId(String extraId) {
        this.extraId = extraId;
    }

    public String getDistributionClass() {
        return distributionClass;
    }

    public void setDistributionClass(String distributionClass) {
        this.distributionClass = distributionClass;
    }

    public BigDecimal getDistributionPrice() {
        return distributionPrice;
    }

    public void setDistributionPrice(BigDecimal distributionPrice) {
        this.distributionPrice = distributionPrice;
    }

    public String getDistributionDescribe() {
        return distributionDescribe;
    }

    public void setDistributionDescribe(String distributionDescribe) {
        this.distributionDescribe = distributionDescribe;
    }

    public String getDistributionScope() {
        return distributionScope;
    }

    public void setDistributionScope(String distributionScope) {
        this.distributionScope = distributionScope;
    }

    public String getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(String commissionType) {
        this.commissionType = commissionType;
    }

    public BigDecimal getCommissionAmt() {
        return commissionAmt;
    }

    public void setCommissionAmt(BigDecimal commissionAmt) {
        this.commissionAmt = commissionAmt;
    }

    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String getRebateType() {
        return rebateType;
    }

    public void setRebateType(String rebateType) {
        this.rebateType = rebateType;
    }

    public BigDecimal getRebatePrice() {
        return rebatePrice;
    }

    public void setRebatePrice(BigDecimal rebatePrice) {
        this.rebatePrice = rebatePrice;
    }

    public BigDecimal getRebateAmt() {
        return rebateAmt;
    }

    public void setRebateAmt(BigDecimal rebateAmt) {
        this.rebateAmt = rebateAmt;
    }

    public BigDecimal getRebateRate() {
        return rebateRate;
    }

    public void setRebateRate(BigDecimal rebateRate) {
        this.rebateRate = rebateRate;
    }

    public BigDecimal getSupplyPrice() {
        return supplyPrice;
    }

    public void setSupplyPrice(BigDecimal supplyPrice) {
        this.supplyPrice = supplyPrice;
    }

    public BigDecimal getProposalPriceS() {
        return proposalPriceS;
    }

    public void setProposalPriceS(BigDecimal proposalPriceS) {
        this.proposalPriceS = proposalPriceS;
    }

    public BigDecimal getProposalPriceH() {
        return proposalPriceH;
    }

    public void setProposalPriceH(BigDecimal proposalPriceH) {
        this.proposalPriceH = proposalPriceH;
    }

    public String getAllowBelowDsbprice() {
        return allowBelowDsbprice;
    }

    public void setAllowBelowDsbprice(String allowBelowDsbprice) {
        this.allowBelowDsbprice = allowBelowDsbprice;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Integer getItemState() {
        return itemState;
    }

    public void setItemState(Integer itemState) {
        this.itemState = itemState;
    }

    public String getDistributionPic() {
        return distributionPic;
    }

    public void setDistributionPic(String distributionPic) {
        this.distributionPic = distributionPic;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public String getItemSubno() {
        return itemSubno;
    }

    public void setItemSubno(String itemSubno) {
        this.itemSubno = itemSubno;
    }

    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    public String getPrdOrigin() {
        return prdOrigin;
    }

    public void setPrdOrigin(String prdOrigin) {
        this.prdOrigin = prdOrigin;
    }

    public String getPrdFactory() {
        return prdFactory;
    }

    public void setPrdFactory(String prdFactory) {
        this.prdFactory = prdFactory;
    }

    public Long getExtraIdx() {
        return extraIdx;
    }

    public void setExtraIdx(Long extraIdx) {
        this.extraIdx = extraIdx;
    }

    public String getVendorTenantId() {
        return vendorTenantId;
    }

    public void setVendorTenantId(String vendorTenantId) {
        this.vendorTenantId = vendorTenantId;
    }

    public Long getVendorIdx() {
        return vendorIdx;
    }

    public void setVendorIdx(Long vendorIdx) {
        this.vendorIdx = vendorIdx;
    }
}
