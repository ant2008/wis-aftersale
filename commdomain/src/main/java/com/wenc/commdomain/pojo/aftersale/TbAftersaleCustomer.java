package com.wenc.commdomain.pojo.aftersale;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_aftersale_customer")
public class TbAftersaleCustomer {
    private long idx;
    private String tenantId;
    private String customerId;
    private String customerName;
    private String customerNickName;
    private String customerSex;
    private String customerMobileNo;
    private String customerAddress;
    private String wxId;
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
    @Column(name = "customer_name", nullable = true, length = 20)
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "customer_nick_name", nullable = true, length = 50)
    public String getCustomerNickName() {
        return customerNickName;
    }

    public void setCustomerNickName(String customerNickName) {
        this.customerNickName = customerNickName;
    }

    @Basic
    @Column(name = "customer_sex", nullable = true, length = 20)
    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    @Basic
    @Column(name = "customer_mobile_no", nullable = true, length = 30)
    public String getCustomerMobileNo() {
        return customerMobileNo;
    }

    public void setCustomerMobileNo(String customerMobileNo) {
        this.customerMobileNo = customerMobileNo;
    }

    @Basic
    @Column(name = "customer_address", nullable = true, length = 100)
    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Basic
    @Column(name = "wx_id", nullable = true, length = 300)
    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
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
        TbAftersaleCustomer that = (TbAftersaleCustomer) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(customerNickName, that.customerNickName) &&
                Objects.equals(customerSex, that.customerSex) &&
                Objects.equals(customerMobileNo, that.customerMobileNo) &&
                Objects.equals(customerAddress, that.customerAddress) &&
                Objects.equals(wxId, that.wxId) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, customerId, customerName, customerNickName, customerSex, customerMobileNo, customerAddress, wxId, state, createUser, createTime);
    }
}
