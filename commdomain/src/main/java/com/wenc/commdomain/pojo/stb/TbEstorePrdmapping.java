package com.wenc.commdomain.pojo.stb;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_estore_prdmapping")
public class TbEstorePrdmapping {
    private long idx;
    private String tenantId;
    private String estoreId;
    private String estoreType;
    private String onlineItemId;
    private String onlineItemName;
    private String onlineItemSpec;
    private String onlineItemSku;
    private String itemId;
    private String itemName;
    private Integer state;
    private Integer mapState;
    private String createUser;
    private Timestamp createTime;
    private BigDecimal onlineItemPrice;
    private String onlineItemImg;

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
    @Column(name = "estore_id", nullable = true, length = 30)
    public String getEstoreId() {
        return estoreId;
    }

    public void setEstoreId(String estoreId) {
        this.estoreId = estoreId;
    }

    @Basic
    @Column(name = "estore_type", nullable = true, length = 20)
    public String getEstoreType() {
        return estoreType;
    }

    public void setEstoreType(String estoreType) {
        this.estoreType = estoreType;
    }

    @Basic
    @Column(name = "online_item_id", nullable = true, length = 100)
    public String getOnlineItemId() {
        return onlineItemId;
    }

    public void setOnlineItemId(String onlineItemId) {
        this.onlineItemId = onlineItemId;
    }

    @Basic
    @Column(name = "online_item_name", nullable = true, length = 200)
    public String getOnlineItemName() {
        return onlineItemName;
    }

    public void setOnlineItemName(String onlineItemName) {
        this.onlineItemName = onlineItemName;
    }

    @Basic
    @Column(name = "online_item_spec", nullable = true, length = 200)
    public String getOnlineItemSpec() {
        return onlineItemSpec;
    }

    public void setOnlineItemSpec(String onlineItemSpec) {
        this.onlineItemSpec = onlineItemSpec;
    }

    @Basic
    @Column(name = "online_item_sku", nullable = true, length = 100)
    public String getOnlineItemSku() {
        return onlineItemSku;
    }

    public void setOnlineItemSku(String onlineItemSku) {
        this.onlineItemSku = onlineItemSku;
    }

    @Basic
    @Column(name = "item_id", nullable = true, length = 20)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "item_name", nullable = true, length = 200)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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
    @Column(name = "map_state", nullable = true)
    public Integer getMapState() {
        return mapState;
    }

    public void setMapState(Integer mapState) {
        this.mapState = mapState;
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
        TbEstorePrdmapping that = (TbEstorePrdmapping) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(estoreId, that.estoreId) &&
                Objects.equals(estoreType, that.estoreType) &&
                Objects.equals(onlineItemId, that.onlineItemId) &&
                Objects.equals(onlineItemName, that.onlineItemName) &&
                Objects.equals(onlineItemSpec, that.onlineItemSpec) &&
                Objects.equals(onlineItemSku, that.onlineItemSku) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(state, that.state) &&
                Objects.equals(mapState, that.mapState) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, estoreId, estoreType, onlineItemId, onlineItemName, onlineItemSpec, onlineItemSku, itemId, itemName, state, mapState, createUser, createTime);
    }

    @Basic
    @Column(name = "online_item_price", nullable = true, precision = 6)
    public BigDecimal getOnlineItemPrice() {
        return onlineItemPrice;
    }

    public void setOnlineItemPrice(BigDecimal onlineItemPrice) {
        this.onlineItemPrice = onlineItemPrice;
    }

    @Basic
    @Column(name = "online_item_img", nullable = true, length = 500)
    public String getOnlineItemImg() {
        return onlineItemImg;
    }

    public void setOnlineItemImg(String onlineItemImg) {
        this.onlineItemImg = onlineItemImg;
    }
}
