package com.wenc.commdomain.pojo.report;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "vb_product_sale_m")
public class VbProductSaleM {
    private Long idx;
    private String tenantId;
    private String statMonth;
    private String shopId;
    private String depotId;
    private String itemId;
    private String itemName;
    private String itemUnit;
    private String itemSpec;
    private String classCode;
    private String prdOrigin;
    private String prdFactory;
    private String orgName;
    private String depotName;
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
    private Long customFlow;
    private BigDecimal bankAmt;
    private BigDecimal memcardAmt;

    @Id
    @Basic
    @Column(name = "idx", nullable = true)
    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
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
    @Column(name = "stat_month", nullable = true, length = 6)
    public String getStatMonth() {
        return statMonth;
    }

    public void setStatMonth(String statMonth) {
        this.statMonth = statMonth;
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
    @Column(name = "depot_id", nullable = true, length = 20)
    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
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

    @Basic
    @Column(name = "depot_name", nullable = true, length = 50)
    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName;
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
    @Column(name = "custom_flow", nullable = true, precision = 0)
    public Long getCustomFlow() {
        return customFlow;
    }

    public void setCustomFlow(Long customFlow) {
        this.customFlow = customFlow;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbProductSaleM that = (VbProductSaleM) o;
        return Objects.equals(idx, that.idx) &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(statMonth, that.statMonth) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(depotId, that.depotId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemUnit, that.itemUnit) &&
                Objects.equals(itemSpec, that.itemSpec) &&
                Objects.equals(classCode, that.classCode) &&
                Objects.equals(prdOrigin, that.prdOrigin) &&
                Objects.equals(prdFactory, that.prdFactory) &&
                Objects.equals(orgName, that.orgName) &&
                Objects.equals(depotName, that.depotName) &&
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
                Objects.equals(bankAmt, that.bankAmt) &&
                Objects.equals(memcardAmt, that.memcardAmt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, statMonth, shopId, depotId, itemId, itemName, itemUnit, itemSpec,
                classCode, prdOrigin, prdFactory, orgName, depotName, saleQty, purAmt, dueAmt, realAmt, backAmt, ratAmt, grossAmt, grossrateAmt, chgAmt, giveAmt, customFlow, bankAmt, memcardAmt);
    }
}
