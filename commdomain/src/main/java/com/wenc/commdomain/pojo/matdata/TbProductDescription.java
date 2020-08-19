package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_product_description")
public class TbProductDescription {
    private long idx;
    private String tenantId;
    private String itemId;
    private String policyDescribe;
    private String maintainDescribe;
    private String costDescribe;
    private String otherDescribe;
    private String memoDescribe;
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
    @Column(name = "item_id", nullable = true, length = 30)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "policy_describe", nullable = true, length = 1000)
    public String getPolicyDescribe() {
        return policyDescribe;
    }

    public void setPolicyDescribe(String policyDescribe) {
        this.policyDescribe = policyDescribe;
    }

    @Basic
    @Column(name = "maintain_describe", nullable = true, length = 1000)
    public String getMaintainDescribe() {
        return maintainDescribe;
    }

    public void setMaintainDescribe(String maintainDescribe) {
        this.maintainDescribe = maintainDescribe;
    }

    @Basic
    @Column(name = "cost_describe", nullable = true, length = 1000)
    public String getCostDescribe() {
        return costDescribe;
    }

    public void setCostDescribe(String costDescribe) {
        this.costDescribe = costDescribe;
    }

    @Basic
    @Column(name = "other_describe", nullable = true, length = 1000)
    public String getOtherDescribe() {
        return otherDescribe;
    }

    public void setOtherDescribe(String otherDescribe) {
        this.otherDescribe = otherDescribe;
    }

    @Basic
    @Column(name = "memo_describe", nullable = true, length = 1000)
    public String getMemoDescribe() {
        return memoDescribe;
    }

    public void setMemoDescribe(String memoDescribe) {
        this.memoDescribe = memoDescribe;
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
        TbProductDescription that = (TbProductDescription) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(policyDescribe, that.policyDescribe) &&
                Objects.equals(maintainDescribe, that.maintainDescribe) &&
                Objects.equals(costDescribe, that.costDescribe) &&
                Objects.equals(otherDescribe, that.otherDescribe) &&
                Objects.equals(memoDescribe, that.memoDescribe) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, itemId, policyDescribe, maintainDescribe, costDescribe, otherDescribe, memoDescribe, state, createUser, createTime);
    }
}
