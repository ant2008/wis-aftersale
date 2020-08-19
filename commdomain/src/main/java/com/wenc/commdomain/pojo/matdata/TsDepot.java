package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ts_depot")
public class TsDepot {
    private long idx;
    private String tenantId;
    private String depotId;
    private String depotName;
    private String subno;
    private String orgCode;
    private String groupId;
    private String depotAttrib;
    private String flag;
    private BigDecimal defRate;
    private String manageType;
    private Timestamp allocDate;
    private Integer ifAllocprice;
    private Integer ifCacldepot;
    private Integer safeDays;
    private Integer overDays;
    private BigDecimal area;
    private Integer empNum;
    private String telno;
    private String faxno;
    private String address;
    private String orderName;
    private String lat;
    private String lng;
    private Integer state;
    private String createUser;
    private Timestamp createTime;

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
    @Column(name = "depot_id", nullable = true, length = 20)
    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
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
    @Column(name = "subno", nullable = true, length = 20)
    public String getSubno() {
        return subno;
    }

    public void setSubno(String subno) {
        this.subno = subno;
    }

    @Basic
    @Column(name = "org_code", nullable = true, length = 20)
    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    @Basic
    @Column(name = "group_id", nullable = true, length = 20)
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "depot_attrib", nullable = true, length = 20)
    public String getDepotAttrib() {
        return depotAttrib;
    }

    public void setDepotAttrib(String depotAttrib) {
        this.depotAttrib = depotAttrib;
    }

    @Basic
    @Column(name = "flag", nullable = true, length = 20)
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "def_rate", nullable = true, precision = 3)
    public BigDecimal getDefRate() {
        return defRate;
    }

    public void setDefRate(BigDecimal defRate) {
        this.defRate = defRate;
    }

    @Basic
    @Column(name = "manage_type", nullable = true, length = 20)
    public String getManageType() {
        return manageType;
    }

    public void setManageType(String manageType) {
        this.manageType = manageType;
    }

    @Basic
    @Column(name = "alloc_date", nullable = true)
    public Timestamp getAllocDate() {
        return allocDate;
    }

    public void setAllocDate(Timestamp allocDate) {
        this.allocDate = allocDate;
    }

    @Basic
    @Column(name = "if_allocprice", nullable = true)
    public Integer getIfAllocprice() {
        return ifAllocprice;
    }

    public void setIfAllocprice(Integer ifAllocprice) {
        this.ifAllocprice = ifAllocprice;
    }

    @Basic
    @Column(name = "if_cacldepot", nullable = true)
    public Integer getIfCacldepot() {
        return ifCacldepot;
    }

    public void setIfCacldepot(Integer ifCacldepot) {
        this.ifCacldepot = ifCacldepot;
    }

    @Basic
    @Column(name = "safe_days", nullable = true)
    public Integer getSafeDays() {
        return safeDays;
    }

    public void setSafeDays(Integer safeDays) {
        this.safeDays = safeDays;
    }

    @Basic
    @Column(name = "over_days", nullable = true)
    public Integer getOverDays() {
        return overDays;
    }

    public void setOverDays(Integer overDays) {
        this.overDays = overDays;
    }

    @Basic
    @Column(name = "area", nullable = true, precision = 3)
    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    @Basic
    @Column(name = "emp_num", nullable = true)
    public Integer getEmpNum() {
        return empNum;
    }

    public void setEmpNum(Integer empNum) {
        this.empNum = empNum;
    }

    @Basic
    @Column(name = "telno", nullable = true, length = 20)
    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    @Basic
    @Column(name = "faxno", nullable = true, length = 20)
    public String getFaxno() {
        return faxno;
    }

    public void setFaxno(String faxno) {
        this.faxno = faxno;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 300)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "order_name", nullable = true, length = 20)
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Basic
    @Column(name = "lat", nullable = true, length = 20)
    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Basic
    @Column(name = "lng", nullable = true, length = 20)
    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TsDepot tsDepot = (TsDepot) o;
        return idx == tsDepot.idx &&
                Objects.equals(tenantId, tsDepot.tenantId) &&
                Objects.equals(depotId, tsDepot.depotId) &&
                Objects.equals(depotName, tsDepot.depotName) &&
                Objects.equals(subno, tsDepot.subno) &&
                Objects.equals(orgCode, tsDepot.orgCode) &&
                Objects.equals(groupId, tsDepot.groupId) &&
                Objects.equals(depotAttrib, tsDepot.depotAttrib) &&
                Objects.equals(flag, tsDepot.flag) &&
                Objects.equals(defRate, tsDepot.defRate) &&
                Objects.equals(manageType, tsDepot.manageType) &&
                Objects.equals(allocDate, tsDepot.allocDate) &&
                Objects.equals(ifAllocprice, tsDepot.ifAllocprice) &&
                Objects.equals(ifCacldepot, tsDepot.ifCacldepot) &&
                Objects.equals(safeDays, tsDepot.safeDays) &&
                Objects.equals(overDays, tsDepot.overDays) &&
                Objects.equals(area, tsDepot.area) &&
                Objects.equals(empNum, tsDepot.empNum) &&
                Objects.equals(telno, tsDepot.telno) &&
                Objects.equals(faxno, tsDepot.faxno) &&
                Objects.equals(address, tsDepot.address) &&
                Objects.equals(orderName, tsDepot.orderName) &&
                Objects.equals(lat, tsDepot.lat) &&
                Objects.equals(lng, tsDepot.lng) &&
                Objects.equals(state, tsDepot.state) &&
                Objects.equals(createUser, tsDepot.createUser) &&
                Objects.equals(createTime, tsDepot.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, depotId, depotName, subno, orgCode, groupId, depotAttrib, flag, defRate,
                manageType, allocDate, ifAllocprice, ifCacldepot, safeDays, overDays, area, empNum, telno, faxno, address, orderName, lat, lng, state, createUser, createTime);
    }
}
