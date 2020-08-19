package com.wenc.commdomain.pojo.dsb;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_salesman")
public class TbSalesman {
    private long idx;
    private String tenantId;
    private String salesmanId;
    private String salesmanType;
    private String salesmanName;
    private String salesmanMobile;
    private String salesmanHigherId;
    private String distributorId;
    private String salesmanIdnum;
    private Timestamp registerDate;
    private Integer salesmanLevel;
    private Integer salesmanIntegral;
    private Integer salesmanRelay;
    private Integer salesmanRelayMax;
    private Timestamp createTime;
    private String createUser;
    private Integer state;
    private String ifCertify;
    private String userId;
    private String wxId;
    private String ifDefaultRecommend;

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
    @Column(name = "salesman_id", nullable = true, length = 20)
    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId;
    }

    @Basic
    @Column(name = "salesman_type", nullable = true, length = 20)
    public String getSalesmanType() {
        return salesmanType;
    }

    public void setSalesmanType(String salesmanType) {
        this.salesmanType = salesmanType;
    }

    @Basic
    @Column(name = "salesman_name", nullable = true, length = 30)
    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    @Basic
    @Column(name = "salesman_mobile", nullable = true, length = 30)
    public String getSalesmanMobile() {
        return salesmanMobile;
    }

    public void setSalesmanMobile(String salesmanMobile) {
        this.salesmanMobile = salesmanMobile;
    }

    @Basic
    @Column(name = "salesman_higher_id", nullable = true, length = 20)
    public String getSalesmanHigherId() {
        return salesmanHigherId;
    }

    public void setSalesmanHigherId(String salesmanHigherId) {
        this.salesmanHigherId = salesmanHigherId;
    }

    @Basic
    @Column(name = "distributor_id", nullable = true, length = 20)
    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    @Basic
    @Column(name = "salesman_idnum", nullable = true, length = 50)
    public String getSalesmanIdnum() {
        return salesmanIdnum;
    }

    public void setSalesmanIdnum(String salesmanIdnum) {
        this.salesmanIdnum = salesmanIdnum;
    }

    @Basic
    @Column(name = "register_date", nullable = true)
    public Timestamp getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate;
    }

    @Basic
    @Column(name = "salesman_level", nullable = true)
    public Integer getSalesmanLevel() {
        return salesmanLevel;
    }

    public void setSalesmanLevel(Integer salesmanLevel) {
        this.salesmanLevel = salesmanLevel;
    }

    @Basic
    @Column(name = "salesman_integral", nullable = true, precision = 0)
    public Integer getSalesmanIntegral() {
        return salesmanIntegral;
    }

    public void setSalesmanIntegral(Integer salesmanIntegral) {
        this.salesmanIntegral = salesmanIntegral;
    }

    @Basic
    @Column(name = "salesman_relay", nullable = true)
    public Integer getSalesmanRelay() {
        return salesmanRelay;
    }

    public void setSalesmanRelay(Integer salesmanRelay) {
        this.salesmanRelay = salesmanRelay;
    }

    @Basic
    @Column(name = "salesman_relay_max", nullable = true)
    public Integer getSalesmanRelayMax() {
        return salesmanRelayMax;
    }

    public void setSalesmanRelayMax(Integer salesmanRelayMax) {
        this.salesmanRelayMax = salesmanRelayMax;
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
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "if_certify", nullable = true, length = 20)
    public String getIfCertify() {
        return ifCertify;
    }

    public void setIfCertify(String ifCertify) {
        this.ifCertify = ifCertify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbSalesman that = (TbSalesman) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(salesmanId, that.salesmanId) &&
                Objects.equals(salesmanType, that.salesmanType) &&
                Objects.equals(salesmanName, that.salesmanName) &&
                Objects.equals(salesmanMobile, that.salesmanMobile) &&
                Objects.equals(salesmanHigherId, that.salesmanHigherId) &&
                Objects.equals(distributorId, that.distributorId) &&
                Objects.equals(salesmanIdnum, that.salesmanIdnum) &&
                Objects.equals(registerDate, that.registerDate) &&
                Objects.equals(salesmanLevel, that.salesmanLevel) &&
                Objects.equals(salesmanIntegral, that.salesmanIntegral) &&
                Objects.equals(salesmanRelay, that.salesmanRelay) &&
                Objects.equals(salesmanRelayMax, that.salesmanRelayMax) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(state, that.state) &&
                Objects.equals(ifCertify, that.ifCertify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, salesmanId, salesmanType, salesmanName, salesmanMobile, salesmanHigherId,
                distributorId, salesmanIdnum, registerDate, salesmanLevel, salesmanIntegral, salesmanRelay, salesmanRelayMax, createTime, createUser, state, ifCertify);
    }

    @Basic
    @Column(name = "user_id", nullable = true, length = 30)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "wx_id", nullable = true, length = 50)
    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    @Basic
    @Column(name = "if_default_recommend", nullable = true, length = 20)
    public String getIfDefaultRecommend() {
        return ifDefaultRecommend;
    }

    public void setIfDefaultRecommend(String ifDefaultRecommend) {
        this.ifDefaultRecommend = ifDefaultRecommend;
    }
}
