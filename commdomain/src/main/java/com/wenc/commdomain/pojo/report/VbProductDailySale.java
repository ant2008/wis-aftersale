package com.wenc.commdomain.pojo.report;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_product_daily_sale")
public class VbProductDailySale {
    private long idx;
    private String tenantId;
    private Timestamp statDate;
    private String shopId;
    private String itemId;
    private BigDecimal saleQty;
    private BigDecimal purAmt;
    private BigDecimal dueAmt;
    private BigDecimal realAmt;
    private BigDecimal backAmt;
    private BigDecimal ratAmt;
    private BigDecimal grossAmt;
    private BigDecimal grossrateAmt;
    private BigDecimal chgAmt;
    private BigDecimal giveAmt;
    private Integer customFlow;
    private String vendorId;
    private BigDecimal bankAmt;
    private BigDecimal memcardAmt;
    private String createUser;
    private Timestamp createTime;
    private String itemName;
    private String itemUnit;
    private String itemSpec;
    private String classCode;
    private String prdOrigin;
    private String prdFactory;
    private String orgName;
    private String depotName;
    private String depotId;

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
    @Column(name = "stat_date", nullable = true)
    public Timestamp getStatDate() {
        return statDate;
    }

    public void setStatDate(Timestamp statDate) {
        this.statDate = statDate;
    }

    @Basic
    @Column(name = "shop_id", nullable = true, length = 15)
    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
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
    @Column(name = "sale_qty", nullable = true, precision = 3)
    public BigDecimal getSaleQty() {
        return saleQty;
    }

    public void setSaleQty(BigDecimal saleQty) {
        this.saleQty = saleQty;
    }

    @Basic
    @Column(name = "pur_amt", nullable = true, precision = 6)
    public BigDecimal getPurAmt() {
        return purAmt;
    }

    public void setPurAmt(BigDecimal purAmt) {
        this.purAmt = purAmt;
    }

    @Basic
    @Column(name = "due_amt", nullable = true, precision = 6)
    public BigDecimal getDueAmt() {
        return dueAmt;
    }

    public void setDueAmt(BigDecimal dueAmt) {
        this.dueAmt = dueAmt;
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
    @Column(name = "back_amt", nullable = true, precision = 6)
    public BigDecimal getBackAmt() {
        return backAmt;
    }

    public void setBackAmt(BigDecimal backAmt) {
        this.backAmt = backAmt;
    }

    @Basic
    @Column(name = "rat_amt", nullable = true, precision = 6)
    public BigDecimal getRatAmt() {
        return ratAmt;
    }

    public void setRatAmt(BigDecimal ratAmt) {
        this.ratAmt = ratAmt;
    }

    @Basic
    @Column(name = "gross_amt", nullable = true, precision = 6)
    public BigDecimal getGrossAmt() {
        return grossAmt;
    }

    public void setGrossAmt(BigDecimal grossAmt) {
        this.grossAmt = grossAmt;
    }

    @Basic
    @Column(name = "grossrate_amt", nullable = true, precision = 6)
    public BigDecimal getGrossrateAmt() {
        return grossrateAmt;
    }

    public void setGrossrateAmt(BigDecimal grossrateAmt) {
        this.grossrateAmt = grossrateAmt;
    }

    @Basic
    @Column(name = "chg_amt", nullable = true, precision = 6)
    public BigDecimal getChgAmt() {
        return chgAmt;
    }

    public void setChgAmt(BigDecimal chgAmt) {
        this.chgAmt = chgAmt;
    }

    @Basic
    @Column(name = "give_amt", nullable = true, precision = 6)
    public BigDecimal getGiveAmt() {
        return giveAmt;
    }

    public void setGiveAmt(BigDecimal giveAmt) {
        this.giveAmt = giveAmt;
    }

    @Basic
    @Column(name = "custom_flow", nullable = true)
    public Integer getCustomFlow() {
        return customFlow;
    }

    public void setCustomFlow(Integer customFlow) {
        this.customFlow = customFlow;
    }

    @Basic
    @Column(name = "vendor_id", nullable = true, length = 13)
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Basic
    @Column(name = "bank_amt", nullable = true, precision = 6)
    public BigDecimal getBankAmt() {
        return bankAmt;
    }

    public void setBankAmt(BigDecimal bankAmt) {
        this.bankAmt = bankAmt;
    }

    @Basic
    @Column(name = "memcard_amt", nullable = true, precision = 6)
    public BigDecimal getMemcardAmt() {
        return memcardAmt;
    }

    public void setMemcardAmt(BigDecimal memcardAmt) {
        this.memcardAmt = memcardAmt;
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
    @Column(name = "create_time", nullable = false)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
    @Column(name = "class_code", nullable = true, length = 8)
    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
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
    @Column(name = "org_name", nullable = true, length = 100)
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbProductDailySale that = (VbProductDailySale) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(statDate, that.statDate) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(saleQty, that.saleQty) &&
                Objects.equals(purAmt, that.purAmt) &&
                Objects.equals(dueAmt, that.dueAmt) &&
                Objects.equals(realAmt, that.realAmt) &&
                Objects.equals(backAmt, that.backAmt) &&
                Objects.equals(ratAmt, that.ratAmt) &&
                Objects.equals(grossAmt, that.grossAmt) &&
                Objects.equals(grossrateAmt, that.grossrateAmt) &&
                Objects.equals(chgAmt, that.chgAmt) &&
                Objects.equals(giveAmt, that.giveAmt) &&
                Objects.equals(customFlow, that.customFlow) &&
                Objects.equals(vendorId, that.vendorId) &&
                Objects.equals(bankAmt, that.bankAmt) &&
                Objects.equals(memcardAmt, that.memcardAmt) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemUnit, that.itemUnit) &&
                Objects.equals(itemSpec, that.itemSpec) &&
                Objects.equals(classCode, that.classCode) &&
                Objects.equals(prdOrigin, that.prdOrigin) &&
                Objects.equals(prdFactory, that.prdFactory) &&
                Objects.equals(orgName, that.orgName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, statDate, shopId, itemId, saleQty, purAmt, dueAmt, realAmt, backAmt,
                ratAmt, grossAmt, grossrateAmt, chgAmt, giveAmt, customFlow, vendorId, bankAmt, memcardAmt, createUser, createTime, itemName, itemUnit, itemSpec, classCode, prdOrigin, prdFactory, orgName);
    }

    @Basic
    @Column(name = "depot_name", nullable = true, length = 50)
    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName;
    }

    @Basic
    @Column(name = "depot_id", nullable = true, length = 20)
    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }
}
