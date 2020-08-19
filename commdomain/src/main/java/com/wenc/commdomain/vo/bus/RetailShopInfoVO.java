package com.wenc.commdomain.vo.bus;

import java.util.List;

/**
 * 零售销售店铺等信息
 *
 */
public class RetailShopInfoVO {

    private String shopId;
    private String shopName;
    private String cashierId;
    private String cashierName;
    private String posNo;
    private String posDescr;

    List<RetailDepotVO> depotVOS;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getCashierId() {
        return cashierId;
    }

    public void setCashierId(String cashierId) {
        this.cashierId = cashierId;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getPosDescr() {
        return posDescr;
    }

    public void setPosDescr(String posDescr) {
        this.posDescr = posDescr;
    }

    public List<RetailDepotVO> getDepotVOS() {
        return depotVOS;
    }

    public void setDepotVOS(List<RetailDepotVO> depotVOS) {
        this.depotVOS = depotVOS;
    }
}
