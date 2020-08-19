package com.wenc.commdomain.pojo.bus;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_sale_hangup_h")
public class TbSaleHangupH {
    private long idx;
    private String tenantId;
    private String saleHangupNo;
    private String shopId;
    private String depotId;
    private String posNo;
    private String cashierId;
    private String vipCode;
    private Timestamp hangDate;
    private String hangNote;
    private Integer state;
    private String flag;
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
    @Column(name = "sale_hangup_no", nullable = true, length = 30)
    public String getSaleHangupNo() {
        return saleHangupNo;
    }

    public void setSaleHangupNo(String saleHangupNo) {
        this.saleHangupNo = saleHangupNo;
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
    @Column(name = "depot_id", nullable = true, length = 20)
    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    @Basic
    @Column(name = "pos_no", nullable = true, length = 20)
    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    @Basic
    @Column(name = "cashier_id", nullable = true, length = 20)
    public String getCashierId() {
        return cashierId;
    }

    public void setCashierId(String cashierId) {
        this.cashierId = cashierId;
    }

    @Basic
    @Column(name = "vip_code", nullable = true, length = 30)
    public String getVipCode() {
        return vipCode;
    }

    public void setVipCode(String vipCode) {
        this.vipCode = vipCode;
    }

    @Basic
    @Column(name = "hang_date", nullable = true)
    public Timestamp getHangDate() {
        return hangDate;
    }

    public void setHangDate(Timestamp hangDate) {
        this.hangDate = hangDate;
    }

    @Basic
    @Column(name = "hang_note", nullable = true, length = 300)
    public String getHangNote() {
        return hangNote;
    }

    public void setHangNote(String hangNote) {
        this.hangNote = hangNote;
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
    @Column(name = "flag", nullable = true, length = 20)
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 10)
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
        TbSaleHangupH that = (TbSaleHangupH) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(saleHangupNo, that.saleHangupNo) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(depotId, that.depotId) &&
                Objects.equals(posNo, that.posNo) &&
                Objects.equals(cashierId, that.cashierId) &&
                Objects.equals(vipCode, that.vipCode) &&
                Objects.equals(hangDate, that.hangDate) &&
                Objects.equals(hangNote, that.hangNote) &&
                Objects.equals(state, that.state) &&
                Objects.equals(flag, that.flag) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, saleHangupNo, shopId, depotId, posNo, cashierId, vipCode, hangDate, hangNote, state, flag, createUser, createTime);
    }
}
