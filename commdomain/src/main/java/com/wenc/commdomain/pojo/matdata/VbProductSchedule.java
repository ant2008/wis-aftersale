package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_product_schedule")
public class VbProductSchedule {
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
    private Timestamp createTime;
    private String createUser;
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
    @Column(name = "item_id", nullable = true, length = 30)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "schedule_type", nullable = true, length = 20)
    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    @Basic
    @Column(name = "schedule_date", nullable = true)
    public Timestamp getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Timestamp scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    @Basic
    @Column(name = "schedule_num", nullable = true)
    public Integer getScheduleNum() {
        return scheduleNum;
    }

    public void setScheduleNum(Integer scheduleNum) {
        this.scheduleNum = scheduleNum;
    }

    @Basic
    @Column(name = "used_num", nullable = true)
    public Integer getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }

    @Basic
    @Column(name = "item_price", nullable = true, precision = 6)
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Basic
    @Column(name = "item_price2", nullable = true, precision = 6)
    public BigDecimal getItemPrice2() {
        return itemPrice2;
    }

    public void setItemPrice2(BigDecimal itemPrice2) {
        this.itemPrice2 = itemPrice2;
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
    @Column(name = "item_name", nullable = true, length = 100)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "item_subno", nullable = true, length = 10)
    public String getItemSubno() {
        return itemSubno;
    }

    public void setItemSubno(String itemSubno) {
        this.itemSubno = itemSubno;
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
    @Column(name = "item_unit", nullable = true, length = 3)
    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    @Basic
    @Column(name = "prd_attrib", nullable = true, length = 3)
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
        VbProductSchedule that = (VbProductSchedule) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(scheduleType, that.scheduleType) &&
                Objects.equals(scheduleDate, that.scheduleDate) &&
                Objects.equals(scheduleNum, that.scheduleNum) &&
                Objects.equals(usedNum, that.usedNum) &&
                Objects.equals(itemPrice, that.itemPrice) &&
                Objects.equals(itemPrice2, that.itemPrice2) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemSubno, that.itemSubno) &&
                Objects.equals(prdOrigin, that.prdOrigin) &&
                Objects.equals(prdFactory, that.prdFactory) &&
                Objects.equals(itemUnit, that.itemUnit) &&
                Objects.equals(prdAttrib, that.prdAttrib);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, itemId, scheduleType, scheduleDate, scheduleNum, usedNum, itemPrice, itemPrice2, state, createTime, createUser, itemName, itemSubno, prdOrigin, prdFactory, itemUnit, prdAttrib);
    }

    @Basic
    @Column(name = "range_type", nullable = true, length = 20)
    public String getRangeType() {
        return rangeType;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType;
    }

    @Basic
    @Column(name = "schedule_site_id", nullable = true, length = 20)
    public String getScheduleSiteId() {
        return scheduleSiteId;
    }

    public void setScheduleSiteId(String scheduleSiteId) {
        this.scheduleSiteId = scheduleSiteId;
    }

    @Basic
    @Column(name = "schedule_site_name", nullable = true, length = 200)
    public String getScheduleSiteName() {
        return scheduleSiteName;
    }

    public void setScheduleSiteName(String scheduleSiteName) {
        this.scheduleSiteName = scheduleSiteName;
    }

    @Basic
    @Column(name = "schedule_site_address", nullable = true, length = 300)
    public String getScheduleSiteAddress() {
        return scheduleSiteAddress;
    }

    public void setScheduleSiteAddress(String scheduleSiteAddress) {
        this.scheduleSiteAddress = scheduleSiteAddress;
    }
}
