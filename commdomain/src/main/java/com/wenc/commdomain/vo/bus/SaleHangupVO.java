package com.wenc.commdomain.vo.bus;

import java.sql.Timestamp;
import java.util.List;

public class SaleHangupVO {

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

    private List<SaleHangupItemVO>  saleHangupItemVOS;

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getSaleHangupNo() {
        return saleHangupNo;
    }

    public void setSaleHangupNo(String saleHangupNo) {
        this.saleHangupNo = saleHangupNo;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getCashierId() {
        return cashierId;
    }

    public void setCashierId(String cashierId) {
        this.cashierId = cashierId;
    }

    public String getVipCode() {
        return vipCode;
    }

    public void setVipCode(String vipCode) {
        this.vipCode = vipCode;
    }

    public Timestamp getHangDate() {
        return hangDate;
    }

    public void setHangDate(Timestamp hangDate) {
        this.hangDate = hangDate;
    }

    public String getHangNote() {
        return hangNote;
    }

    public void setHangNote(String hangNote) {
        this.hangNote = hangNote;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public List<SaleHangupItemVO> getSaleHangupItemVOS() {
        return saleHangupItemVOS;
    }

    public void setSaleHangupItemVOS(List<SaleHangupItemVO> saleHangupItemVOS) {
        this.saleHangupItemVOS = saleHangupItemVOS;
    }
}
