package com.wenc.commdomain.dto.shop;

import com.wenc.commdomain.pojo.bus.TbRetailsaleD;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class RetailProductDailySaleDTO implements Serializable {


    private static final long serialVersionUID = -1664180387507144338L;

    private Long idx;

    private String tenantId;
    private Timestamp statDate;
    private String shopId;
    private String depotId;
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
    private BigDecimal bankAmt;
    private BigDecimal memcardAmt;


    public RetailProductDailySaleDTO()
    {

    }

    /**
     * 所有字段分组函数。
     *
     * @param tenantId
     * @param statDate
     * @param shopId
     * @param itemId
     * @param saleQty
     * @param purAmt
     * @param dueAmt
     * @param realAmt
     * @param backAmt
     * @param ratAmt
     * @param grossAmt
     * @param grossrateAmt
     * @param chgAmt
     * @param giveAmt
     * @param customFlow
     * @param vendorId
     * @param bankAmt
     * @param memcardAmt
     */
    public RetailProductDailySaleDTO(String tenantId, Timestamp statDate, String shopId, String depotId, String itemId,
                                     BigDecimal saleQty, BigDecimal purAmt, BigDecimal dueAmt, BigDecimal realAmt,
                                     BigDecimal backAmt, BigDecimal ratAmt, BigDecimal grossAmt,
                                     BigDecimal grossrateAmt, BigDecimal chgAmt, BigDecimal giveAmt,
                                     Integer customFlow, String vendorId, BigDecimal bankAmt, BigDecimal memcardAmt) {

        this.tenantId = tenantId;
        this.statDate = statDate;
        this.shopId = shopId;
        this.depotId = depotId;
        this.itemId = itemId;
        this.saleQty = saleQty;
        this.purAmt = purAmt;
        this.dueAmt = dueAmt;
        this.realAmt = realAmt;
        this.backAmt = backAmt;
        this.ratAmt = ratAmt;
        this.grossAmt = grossAmt;
        this.grossrateAmt = grossrateAmt;
        this.chgAmt = chgAmt;
        this.giveAmt = giveAmt;
        this.customFlow = customFlow;

        this.bankAmt = bankAmt;
        this.memcardAmt = memcardAmt;

    }


    /**
     * 提供整个对象使用分组函数。
     * @param aShopId
     * @param aStateDate
     */
    public RetailProductDailySaleDTO(
             String tenantId,
             String itemId,
             String rateType,
             BigDecimal saleQty,
             BigDecimal minQty,
             Integer saleToMin,
             BigDecimal saleAmt,
             BigDecimal realAmt,
             String aShopId,
             Date aStateDate)
    {

        this.tenantId = tenantId;
        this.statDate = new Timestamp(aStateDate.getTime());
        this.shopId = aShopId;
        this.itemId = itemId;
        this.saleQty = BigDecimal.valueOf (saleQty.doubleValue() + minQty.doubleValue()
                / saleToMin);
        this.purAmt = BigDecimal.ZERO;
        this.dueAmt = saleAmt;
        this.realAmt = realAmt;

        if(rateType!= null && !rateType.trim().equals(""))
        {
            this.ratAmt = BigDecimal.valueOf(
                      this.dueAmt.doubleValue() - this.realAmt.doubleValue()
            );

            //记录会员卡打折金额
            if(rateType.trim().equals("7"))
            {
                this.memcardAmt = BigDecimal.valueOf(
                        this.dueAmt.doubleValue() - this.realAmt.doubleValue());
            }

            //记录变价金额
            if(rateType.trim().equals("8"))
            {
                this.chgAmt = BigDecimal.valueOf(
                        this.dueAmt.doubleValue() - this.realAmt.doubleValue()
                );
            }

            //记录退货金额
            if(saleQty.doubleValue() < 0)
            {
                this.backAmt = BigDecimal.valueOf(0 - saleQty.doubleValue());
            }


            this.grossAmt = BigDecimal.ZERO;
            this.grossrateAmt = BigDecimal.ZERO;
            this.bankAmt = BigDecimal.ZERO;


        }else
        {

            this.ratAmt = BigDecimal.ZERO;
        }
    }


    /**
     * 提供分组使用构造函数
     *
     * @param tenantId
     * @param statDate
     * @param shopId
     * @param itemId
     * @param saleQty
     * @param dueAmt
     * @param realAmt
     * @param customFlow
     */
    public RetailProductDailySaleDTO(String tenantId,
                                     Date statDate,
                                     String shopId,
                                     String itemId,
                                     BigDecimal saleQty,
                                     BigDecimal dueAmt,
                                     BigDecimal realAmt,
                                     Integer customFlow) {

        this.tenantId = tenantId;
        this.statDate = new Timestamp(statDate.getTime());
        this.shopId = shopId;
        this.itemId = itemId;
        this.saleQty = saleQty;
        this.purAmt = BigDecimal.ZERO;
        this.dueAmt = dueAmt;
        this.realAmt = realAmt;
        this.backAmt = BigDecimal.ZERO;
        this.ratAmt = BigDecimal.ZERO;
        this.grossAmt = BigDecimal.ZERO;
        this.grossrateAmt = BigDecimal.ZERO;
        this.chgAmt = BigDecimal.ZERO;
        this.giveAmt = BigDecimal.ZERO;
        this.customFlow = customFlow;

        this.bankAmt = BigDecimal.ZERO;
        this.memcardAmt = BigDecimal.ZERO;

    }


    @Id
    @Column(name = "idx", nullable = false)
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
    @Column(name="stat_Date")
    public Timestamp getStatDate() {
        return statDate;
    }

    public void setStatDate(Timestamp statDate) {
        this.statDate = statDate;
    }

    @Basic
    @Column(name = "shop_id")
    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "depot_id")
    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    @Basic
    @Column(name = "item_id")
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "sale_qty")
    public BigDecimal getSaleQty() {
        return saleQty;
    }

    public void setSaleQty(BigDecimal saleQty) {
        this.saleQty = saleQty;
    }


    public BigDecimal getPurAmt() {
        return purAmt;
    }

    public void setPurAmt(BigDecimal purAmt) {
        this.purAmt = purAmt;
    }

    @Basic
    @Column(name = "due_amt")
    public BigDecimal getDueAmt() {
        return dueAmt;
    }

    public void setDueAmt(BigDecimal dueAmt) {
        this.dueAmt = dueAmt;
    }

    @Basic
    @Column(name = "real_amt")
    public BigDecimal getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(BigDecimal realAmt) {
        this.realAmt = realAmt;
    }


    @Basic
    @Column(name="back_amt")
    public BigDecimal getBackAmt() {
        return backAmt;
    }

    public void setBackAmt(BigDecimal backAmt) {
        this.backAmt = backAmt;
    }


    @Basic
    @Column(name = "rat_amt")
    public BigDecimal getRatAmt() {
        return ratAmt;
    }

    public void setRatAmt(BigDecimal ratAmt) {
        this.ratAmt = ratAmt;
    }


    @Basic
    @Column(name = "gross_amt")
    public BigDecimal getGrossAmt() {
        return grossAmt;
    }

    public void setGrossAmt(BigDecimal grossAmt) {
        this.grossAmt = grossAmt;
    }


    @Basic
    @Column(name = "grossrate_amt")
    public BigDecimal getGrossrateAmt() {
        return grossrateAmt;
    }

    public void setGrossrateAmt(BigDecimal grossrateAmt) {
        this.grossrateAmt = grossrateAmt;
    }


    @Basic
    @Column(name = "chg_amt")
    public BigDecimal getChgAmt() {
        return chgAmt;
    }

    public void setChgAmt(BigDecimal chgAmt) {
        this.chgAmt = chgAmt;
    }

    @Basic
    @Column(name = "give_amt")
    public BigDecimal getGiveAmt() {
        return giveAmt;
    }

    public void setGiveAmt(BigDecimal giveAmt) {
        this.giveAmt = giveAmt;
    }


    @Basic
    @Column(name="custom_flow")
    public Integer getCustomFlow() {
        return customFlow;
    }

    public void setCustomFlow(Integer customFlow) {
        this.customFlow = customFlow;
    }



    public BigDecimal getBankAmt() {
        return bankAmt;
    }

    public void setBankAmt(BigDecimal bankAmt) {
        this.bankAmt = bankAmt;
    }


    public BigDecimal getMemcardAmt() {
        return memcardAmt;
    }

    public void setMemcardAmt(BigDecimal memcardAmt) {
        this.memcardAmt = memcardAmt;
    }


}
