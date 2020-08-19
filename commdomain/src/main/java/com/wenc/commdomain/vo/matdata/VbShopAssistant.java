package com.wenc.commdomain.vo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_shop_assistant")
public class VbShopAssistant {
    private long idx;
    private String tenantId;
    private String shopId;
    private String assistantId;
    private String assistantName;
    private Integer state;
    private String createUser;
    private Timestamp createTime;
    private String orgName;
    private String orgAtrrib;

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
    @Column(name = "shop_id", nullable = true, length = 20)
    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "assistant_id", nullable = true, length = 20)
    public String getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    @Basic
    @Column(name = "assistant_name", nullable = true, length = 30)
    public String getAssistantName() {
        return assistantName;
    }

    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
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

    @Basic
    @Column(name = "org_name", nullable = true, length = 100)
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Basic
    @Column(name = "org_atrrib", nullable = true, length = 20)
    public String getOrgAtrrib() {
        return orgAtrrib;
    }

    public void setOrgAtrrib(String orgAtrrib) {
        this.orgAtrrib = orgAtrrib;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbShopAssistant that = (VbShopAssistant) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(assistantId, that.assistantId) &&
                Objects.equals(assistantName, that.assistantName) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(orgName, that.orgName) &&
                Objects.equals(orgAtrrib, that.orgAtrrib);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, shopId, assistantId, assistantName, state, createUser, createTime, orgName, orgAtrrib);
    }
}
