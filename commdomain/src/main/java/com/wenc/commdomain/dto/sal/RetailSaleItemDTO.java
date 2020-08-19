package com.wenc.commdomain.dto.sal;

import java.math.BigDecimal;

public class RetailSaleItemDTO {

    //商品ID
    private String itemId;
    //商品标志
    private String itemTag;

    //商品名称
    private String itemName;

    //商品单位
    private String itemUnit;

    //商品数量
    private BigDecimal itemQty;

    //折扣
    private BigDecimal itemRate;

    //标准价
    private BigDecimal salePrice;

    //实际价
    private BigDecimal realPrice;

    //实际金额
    private BigDecimal realAmt;

    //营业员
    private String clerkerId;

    //营业金额
    private BigDecimal clerkAmt;

    //费用类型
    private String costType;

    //批号
    private String shipNo;
    //中药付数
    private Integer productSnf;

    //是否限制
    private String ifLimit;

    //是否促销
    private String ifProm;

    //商品类型
    private String itemType;

    //组合商品
    private String parentItemId;

    //限制销售数量
    private BigDecimal limitItemQty;

    //拆零销售数量
    private BigDecimal minQty;
    //拆零价格
    private BigDecimal minPrice;

    //是否拆零
    private Integer saleToMin;

    public Integer getSaleToMin() {
        return saleToMin;
    }

    public void setSaleToMin(Integer saleToMin) {
        this.saleToMin = saleToMin;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMinQty() {
        return minQty;
    }

    public void setMinQty(BigDecimal minQty) {
        this.minQty = minQty;
    }

    public BigDecimal getLimitItemQty() {
        return limitItemQty;
    }

    public void setLimitItemQty(BigDecimal limitItemQty) {
        this.limitItemQty = limitItemQty;
    }

    public String getParentItemId() {
        return parentItemId;
    }

    public void setParentItemId(String parentItemId) {
        this.parentItemId = parentItemId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getIfProm() {
        return ifProm;
    }

    public void setIfProm(String ifProm) {
        this.ifProm = ifProm;
    }

    public String getIfLimit() {
        return ifLimit;
    }

    public void setIfLimit(String ifLimit) {
        this.ifLimit = ifLimit;
    }

    public Integer getProductSnf() {
        return productSnf;
    }

    public void setProductSnf(Integer productSnf) {
        this.productSnf = productSnf;
    }

    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public BigDecimal getClerkAmt() {
        return clerkAmt;
    }

    public void setClerkAmt(BigDecimal clerkAmt) {
        this.clerkAmt = clerkAmt;
    }

    public String getClerkerId() {
        return clerkerId;
    }

    public void setClerkerId(String clerkerId) {
        this.clerkerId = clerkerId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemTag() {
        return itemTag;
    }

    public void setItemTag(String itemTag) {
        this.itemTag = itemTag;
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

    public BigDecimal getItemQty() {
        return itemQty;
    }

    public void setItemQty(BigDecimal itemQty) {
        this.itemQty = itemQty;
    }

    public BigDecimal getItemRate() {
        return itemRate;
    }

    public void setItemRate(BigDecimal itemRate) {
        this.itemRate = itemRate;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    public BigDecimal getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(BigDecimal realAmt) {
        this.realAmt = realAmt;
    }
}
