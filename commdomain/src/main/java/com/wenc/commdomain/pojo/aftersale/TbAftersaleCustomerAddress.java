package com.wenc.commdomain.pojo.aftersale;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_aftersale_customer_address")
public class TbAftersaleCustomerAddress {
    private long idx;
    private String tenantId;
    private String customerId;
    private String customerProvince;
    private String customerCity;
    private String customerDistrict;
    private String customerStreet;
    private String customerLine;
    private String customerDetailAddress;
    private String mainAddress;
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
    @Column(name = "customer_id", nullable = true, length = 30)
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "customer_province", nullable = true, length = 20)
    public String getCustomerProvince() {
        return customerProvince;
    }

    public void setCustomerProvince(String customerProvince) {
        this.customerProvince = customerProvince;
    }

    @Basic
    @Column(name = "customer_city", nullable = true, length = 20)
    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    @Basic
    @Column(name = "customer_district", nullable = true, length = 30)
    public String getCustomerDistrict() {
        return customerDistrict;
    }

    public void setCustomerDistrict(String customerDistrict) {
        this.customerDistrict = customerDistrict;
    }

    @Basic
    @Column(name = "customer_street", nullable = true, length = 100)
    public String getCustomerStreet() {
        return customerStreet;
    }

    public void setCustomerStreet(String customerStreet) {
        this.customerStreet = customerStreet;
    }

    @Basic
    @Column(name = "customer_line", nullable = true, length = 200)
    public String getCustomerLine() {
        return customerLine;
    }

    public void setCustomerLine(String customerLine) {
        this.customerLine = customerLine;
    }

    @Basic
    @Column(name = "customer_detail_address", nullable = true, length = 500)
    public String getCustomerDetailAddress() {
        return customerDetailAddress;
    }

    public void setCustomerDetailAddress(String customerDetailAddress) {
        this.customerDetailAddress = customerDetailAddress;
    }

    @Basic
    @Column(name = "main_address", nullable = true, length = 20)
    public String getMainAddress() {
        return mainAddress;
    }

    public void setMainAddress(String mainAddress) {
        this.mainAddress = mainAddress;
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
        TbAftersaleCustomerAddress that = (TbAftersaleCustomerAddress) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(customerProvince, that.customerProvince) &&
                Objects.equals(customerCity, that.customerCity) &&
                Objects.equals(customerDistrict, that.customerDistrict) &&
                Objects.equals(customerStreet, that.customerStreet) &&
                Objects.equals(customerLine, that.customerLine) &&
                Objects.equals(customerDetailAddress, that.customerDetailAddress) &&
                Objects.equals(mainAddress, that.mainAddress) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, customerId, customerProvince, customerCity, customerDistrict, customerStreet, customerLine, customerDetailAddress, mainAddress, state, createUser, createTime);
    }
}
