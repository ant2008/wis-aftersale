package com.wenc.commdomain.pojo.dsb;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_salesman_customer")
public class TbSalesmanCustomer {
    private long idx;
    private String tenantId;
    private String salesmanId;
    private String distributorId;
    private String customerId;
    private String customerMobile;
    private String customerName;
    private Integer customerState;
    private String customerWxId;
    private String customerZfbId;
    private String customerMinappId;
    private Timestamp bindingDate;
    private Timestamp expireDate;
    private Integer state;
    private String sourceChanel;
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
    @Column(name = "salesman_id", nullable = true, length = 30)
    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId;
    }

    @Basic
    @Column(name = "distributor_id", nullable = true, length = 30)
    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
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
    @Column(name = "customer_mobile", nullable = true, length = 30)
    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
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
    @Column(name = "customer_state", nullable = true)
    public Integer getCustomerState() {
        return customerState;
    }

    public void setCustomerState(Integer customerState) {
        this.customerState = customerState;
    }

    @Basic
    @Column(name = "customer_wx_id", nullable = true, length = 50)
    public String getCustomerWxId() {
        return customerWxId;
    }

    public void setCustomerWxId(String customerWxId) {
        this.customerWxId = customerWxId;
    }

    @Basic
    @Column(name = "customer_zfb_id", nullable = true, length = 50)
    public String getCustomerZfbId() {
        return customerZfbId;
    }

    public void setCustomerZfbId(String customerZfbId) {
        this.customerZfbId = customerZfbId;
    }

    @Basic
    @Column(name = "customer_minapp_id", nullable = true, length = 50)
    public String getCustomerMinappId() {
        return customerMinappId;
    }

    public void setCustomerMinappId(String customerMinappId) {
        this.customerMinappId = customerMinappId;
    }

    @Basic
    @Column(name = "binding_date", nullable = true)
    public Timestamp getBindingDate() {
        return bindingDate;
    }

    public void setBindingDate(Timestamp bindingDate) {
        this.bindingDate = bindingDate;
    }

    @Basic
    @Column(name = "expire_date", nullable = true)
    public Timestamp getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Timestamp expireDate) {
        this.expireDate = expireDate;
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
    @Column(name = "source_chanel", nullable = true, length = 20)
    public String getSourceChanel() {
        return sourceChanel;
    }

    public void setSourceChanel(String sourceChanel) {
        this.sourceChanel = sourceChanel;
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
        TbSalesmanCustomer that = (TbSalesmanCustomer) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(salesmanId, that.salesmanId) &&
                Objects.equals(distributorId, that.distributorId) &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(customerMobile, that.customerMobile) &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(customerState, that.customerState) &&
                Objects.equals(customerWxId, that.customerWxId) &&
                Objects.equals(customerZfbId, that.customerZfbId) &&
                Objects.equals(customerMinappId, that.customerMinappId) &&
                Objects.equals(bindingDate, that.bindingDate) &&
                Objects.equals(expireDate, that.expireDate) &&
                Objects.equals(state, that.state) &&
                Objects.equals(sourceChanel, that.sourceChanel) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, salesmanId, distributorId, customerId, customerMobile, customerName,
                customerState, customerWxId, customerZfbId, customerMinappId, bindingDate, expireDate, state, sourceChanel, createUser, createTime);
    }
}
