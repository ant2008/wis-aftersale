package com.wenc.commdomain.vo.bus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "vb_retailsale_d")
public class VbRetailsaleD {
    private long idx;
    private String tenantId;
    private String saleNo;
    private Integer rowNo;
    private Integer goodsSnf;
    private String barCode;
    private String itemId;
    private String shipNo;
    private String depotId;
    private BigDecimal salePrice;
    private BigDecimal itemQty;
    private Integer saleTomin;
    private BigDecimal minPrice;
    private BigDecimal minQty;
    private BigDecimal realPrice;
    private BigDecimal itemRate;
    private String rateType;
    private String rateCause;
    private String promNo;
    private String fileNo;
    private BigDecimal saleAmt;
    private BigDecimal realAmt;
    private String notes;
    private String clerkerId;
    private BigDecimal clerkAmt;
    private String costType;
    private String outDepotid;
    private String ifLimit;
    private BigDecimal limitQty;
    private String ifProm;
    private String promDescr;
    private BigDecimal matchQty;
    private BigDecimal matchAmt;
    private String itemType;
    private String promType;
    private BigDecimal rateQty;
    private BigDecimal rateAmt;
    private Integer presQty;
    private String parentItemid;
    private String itemName;
    private String itemUnit;
    private String itemSpec;
    private String prdOrigin;
    private String prdFactory;

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
    @Column(name = "sale_no", nullable = true, length = 30)
    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    @Basic
    @Column(name = "row_no", nullable = true)
    public Integer getRowNo() {
        return rowNo;
    }

    public void setRowNo(Integer rowNo) {
        this.rowNo = rowNo;
    }

    @Basic
    @Column(name = "goods_snf", nullable = true)
    public Integer getGoodsSnf() {
        return goodsSnf;
    }

    public void setGoodsSnf(Integer goodsSnf) {
        this.goodsSnf = goodsSnf;
    }

    @Basic
    @Column(name = "bar_code", nullable = true, length = 13)
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Basic
    @Column(name = "item_id", nullable = true, length = 13)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "ship_no", nullable = true, length = 20)
    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
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
    @Column(name = "sale_price", nullable = true, precision = 6)
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    @Basic
    @Column(name = "item_qty", nullable = true, precision = 3)
    public BigDecimal getItemQty() {
        return itemQty;
    }

    public void setItemQty(BigDecimal itemQty) {
        this.itemQty = itemQty;
    }

    @Basic
    @Column(name = "sale_tomin", nullable = true)
    public Integer getSaleTomin() {
        return saleTomin;
    }

    public void setSaleTomin(Integer saleTomin) {
        this.saleTomin = saleTomin;
    }

    @Basic
    @Column(name = "min_price", nullable = true, precision = 6)
    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    @Basic
    @Column(name = "min_qty", nullable = true, precision = 3)
    public BigDecimal getMinQty() {
        return minQty;
    }

    public void setMinQty(BigDecimal minQty) {
        this.minQty = minQty;
    }

    @Basic
    @Column(name = "real_price", nullable = true, precision = 6)
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    @Basic
    @Column(name = "item_rate", nullable = true, precision = 2)
    public BigDecimal getItemRate() {
        return itemRate;
    }

    public void setItemRate(BigDecimal itemRate) {
        this.itemRate = itemRate;
    }

    @Basic
    @Column(name = "rate_type", nullable = true, length = 3)
    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    @Basic
    @Column(name = "rate_cause", nullable = true, length = 30)
    public String getRateCause() {
        return rateCause;
    }

    public void setRateCause(String rateCause) {
        this.rateCause = rateCause;
    }

    @Basic
    @Column(name = "prom_no", nullable = true, length = 12)
    public String getPromNo() {
        return promNo;
    }

    public void setPromNo(String promNo) {
        this.promNo = promNo;
    }

    @Basic
    @Column(name = "file_no", nullable = true, length = 20)
    public String getFileNo() {
        return fileNo;
    }

    public void setFileNo(String fileNo) {
        this.fileNo = fileNo;
    }

    @Basic
    @Column(name = "sale_amt", nullable = true, precision = 6)
    public BigDecimal getSaleAmt() {
        return saleAmt;
    }

    public void setSaleAmt(BigDecimal saleAmt) {
        this.saleAmt = saleAmt;
    }

    @Basic
    @Column(name = "real_amt", nullable = true, precision = 6)
    public BigDecimal getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(BigDecimal realAmt) {
        this.realAmt = realAmt;
    }

    @Basic
    @Column(name = "notes", nullable = true, length = 40)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "clerker_id", nullable = true, length = 12)
    public String getClerkerId() {
        return clerkerId;
    }

    public void setClerkerId(String clerkerId) {
        this.clerkerId = clerkerId;
    }

    @Basic
    @Column(name = "clerk_amt", nullable = true, precision = 6)
    public BigDecimal getClerkAmt() {
        return clerkAmt;
    }

    public void setClerkAmt(BigDecimal clerkAmt) {
        this.clerkAmt = clerkAmt;
    }

    @Basic
    @Column(name = "cost_type", nullable = true, length = 20)
    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    @Basic
    @Column(name = "out_depotid", nullable = true, length = 20)
    public String getOutDepotid() {
        return outDepotid;
    }

    public void setOutDepotid(String outDepotid) {
        this.outDepotid = outDepotid;
    }

    @Basic
    @Column(name = "if_limit", nullable = true, length = 10)
    public String getIfLimit() {
        return ifLimit;
    }

    public void setIfLimit(String ifLimit) {
        this.ifLimit = ifLimit;
    }

    @Basic
    @Column(name = "limit_qty", nullable = true, precision = 2)
    public BigDecimal getLimitQty() {
        return limitQty;
    }

    public void setLimitQty(BigDecimal limitQty) {
        this.limitQty = limitQty;
    }

    @Basic
    @Column(name = "if_prom", nullable = true, length = 10)
    public String getIfProm() {
        return ifProm;
    }

    public void setIfProm(String ifProm) {
        this.ifProm = ifProm;
    }

    @Basic
    @Column(name = "prom_descr", nullable = true, length = 255)
    public String getPromDescr() {
        return promDescr;
    }

    public void setPromDescr(String promDescr) {
        this.promDescr = promDescr;
    }

    @Basic
    @Column(name = "match_qty", nullable = true, precision = 2)
    public BigDecimal getMatchQty() {
        return matchQty;
    }

    public void setMatchQty(BigDecimal matchQty) {
        this.matchQty = matchQty;
    }

    @Basic
    @Column(name = "match_amt", nullable = true, precision = 6)
    public BigDecimal getMatchAmt() {
        return matchAmt;
    }

    public void setMatchAmt(BigDecimal matchAmt) {
        this.matchAmt = matchAmt;
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
    @Column(name = "prom_type", nullable = true, length = 20)
    public String getPromType() {
        return promType;
    }

    public void setPromType(String promType) {
        this.promType = promType;
    }

    @Basic
    @Column(name = "rate_qty", nullable = true, precision = 2)
    public BigDecimal getRateQty() {
        return rateQty;
    }

    public void setRateQty(BigDecimal rateQty) {
        this.rateQty = rateQty;
    }

    @Basic
    @Column(name = "rate_amt", nullable = true, precision = 6)
    public BigDecimal getRateAmt() {
        return rateAmt;
    }

    public void setRateAmt(BigDecimal rateAmt) {
        this.rateAmt = rateAmt;
    }

    @Basic
    @Column(name = "pres_qty", nullable = true)
    public Integer getPresQty() {
        return presQty;
    }

    public void setPresQty(Integer presQty) {
        this.presQty = presQty;
    }

    @Basic
    @Column(name = "parent_itemid", nullable = true, length = 20)
    public String getParentItemid() {
        return parentItemid;
    }

    public void setParentItemid(String parentItemid) {
        this.parentItemid = parentItemid;
    }

    @Basic
    @Column(name = "item_name", nullable = true, length = 100)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "item_unit", nullable = true, length = 3)
    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbRetailsaleD that = (VbRetailsaleD) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(saleNo, that.saleNo) &&
                Objects.equals(rowNo, that.rowNo) &&
                Objects.equals(goodsSnf, that.goodsSnf) &&
                Objects.equals(barCode, that.barCode) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(shipNo, that.shipNo) &&
                Objects.equals(depotId, that.depotId) &&
                Objects.equals(salePrice, that.salePrice) &&
                Objects.equals(itemQty, that.itemQty) &&
                Objects.equals(saleTomin, that.saleTomin) &&
                Objects.equals(minPrice, that.minPrice) &&
                Objects.equals(minQty, that.minQty) &&
                Objects.equals(realPrice, that.realPrice) &&
                Objects.equals(itemRate, that.itemRate) &&
                Objects.equals(rateType, that.rateType) &&
                Objects.equals(rateCause, that.rateCause) &&
                Objects.equals(promNo, that.promNo) &&
                Objects.equals(fileNo, that.fileNo) &&
                Objects.equals(saleAmt, that.saleAmt) &&
                Objects.equals(realAmt, that.realAmt) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(clerkerId, that.clerkerId) &&
                Objects.equals(clerkAmt, that.clerkAmt) &&
                Objects.equals(costType, that.costType) &&
                Objects.equals(outDepotid, that.outDepotid) &&
                Objects.equals(ifLimit, that.ifLimit) &&
                Objects.equals(limitQty, that.limitQty) &&
                Objects.equals(ifProm, that.ifProm) &&
                Objects.equals(promDescr, that.promDescr) &&
                Objects.equals(matchQty, that.matchQty) &&
                Objects.equals(matchAmt, that.matchAmt) &&
                Objects.equals(itemType, that.itemType) &&
                Objects.equals(promType, that.promType) &&
                Objects.equals(rateQty, that.rateQty) &&
                Objects.equals(rateAmt, that.rateAmt) &&
                Objects.equals(presQty, that.presQty) &&
                Objects.equals(parentItemid, that.parentItemid) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemUnit, that.itemUnit) &&
                Objects.equals(itemSpec, that.itemSpec) &&
                Objects.equals(prdOrigin, that.prdOrigin) &&
                Objects.equals(prdFactory, that.prdFactory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, saleNo, rowNo, goodsSnf, barCode, itemId, shipNo, depotId, salePrice,
                itemQty, saleTomin, minPrice, minQty, realPrice, itemRate, rateType, rateCause, promNo, fileNo,
                saleAmt, realAmt, notes, clerkerId, clerkAmt, costType, outDepotid, ifLimit, limitQty, ifProm,
                promDescr, matchQty, matchAmt, itemType, promType, rateQty, rateAmt, presQty, parentItemid, itemName,
                itemUnit, itemSpec, prdOrigin, prdFactory);
    }
}
