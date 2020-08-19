package com.wenc.commdomain.vo.matdata;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ProductScheduleVO
{
    private long idx;
    private String tenantId;
    private String itemId;
    private String scheduleType;
    private Timestamp scheduleDate;
    private Integer scheduleNum;
    private Integer usedNum;
    private BigDecimal itemPrice;
    private BigDecimal itemPrice2;
    private Integer state;
    private String itemName;
    private String itemSubno;
    private String prdOrigin;
    private String prdFactory;
    private String itemUnit;
    private String prdAttrib;
    private String rangeType;

    private String scheduleSiteId;
    private String scheduleSiteName;
    private String scheduleSiteAddress;

    public String getScheduleSiteId() {
        return scheduleSiteId;
    }

    public void setScheduleSiteId(String scheduleSiteId) {
        this.scheduleSiteId = scheduleSiteId;
    }

    public String getScheduleSiteName() {
        return scheduleSiteName;
    }

    public void setScheduleSiteName(String scheduleSiteName) {
        this.scheduleSiteName = scheduleSiteName;
    }

    public String getScheduleSiteAddress() {
        return scheduleSiteAddress;
    }

    public void setScheduleSiteAddress(String scheduleSiteAddress) {
        this.scheduleSiteAddress = scheduleSiteAddress;
    }

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public String getRangeType() {
        return rangeType;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType;
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

    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public Timestamp getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Timestamp scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public Integer getScheduleNum() {
        return scheduleNum;
    }

    public void setScheduleNum(Integer scheduleNum) {
        this.scheduleNum = scheduleNum;
    }

    public Integer getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public BigDecimal getItemPrice2() {
        return itemPrice2;
    }

    public void setItemPrice2(BigDecimal itemPrice2) {
        this.itemPrice2 = itemPrice2;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemSubno() {
        return itemSubno;
    }

    public void setItemSubno(String itemSubno) {
        this.itemSubno = itemSubno;
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

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public String getPrdAttrib() {
        return prdAttrib;
    }

    public void setPrdAttrib(String prdAttrib) {
        this.prdAttrib = prdAttrib;
    }
}
