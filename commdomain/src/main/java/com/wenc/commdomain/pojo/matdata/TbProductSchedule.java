package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_product_schedule")
public class TbProductSchedule {
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
    private String rangeType;
    private String scheduleSiteId;
    private String scheduleSiteName;
    private String scheduleSiteAddress;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbProductSchedule that = (TbProductSchedule) o;
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
                Objects.equals(createUser, that.createUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, itemId, scheduleType, scheduleDate, scheduleNum, usedNum, itemPrice, itemPrice2, state, createTime, createUser);
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
