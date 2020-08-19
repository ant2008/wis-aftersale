package com.wenc.commdomain.dto.sal;

import java.math.BigDecimal;

public class RetailSaleMasterDTO {

    //收银员ID
    private String cashierId;
    //收银员名称
    private String cashierName;
    //店铺ID
    private String shopId;
    //店铺名称
    private String shopName;
    //收银机ID
    private String posNo;
    //仓库ID
    private String depotId;
    //VIP
    private String vipCode;
    //运行状态
    private int    runState;
    //Vip名称
    private String vipName;
    //客户身份证
    private String idCardNum;
    //客户名称
    private String customName;
    //手机号
    private String customMobileNo;


    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName;
    }

    public String getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public String getCustomMobileNo() {
        return customMobileNo;
    }

    public void setCustomMobileNo(String customMobileNo) {
        this.customMobileNo = customMobileNo;
    }

    private BigDecimal totalShouldPayAmt;

    public BigDecimal getTotalShouldPayAmt() {
        return totalShouldPayAmt;
    }

    public void setTotalShouldPayAmt(BigDecimal totalShouldPayAmt) {
        this.totalShouldPayAmt = totalShouldPayAmt;
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

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    public String getVipCode() {
        return vipCode;
    }

    public void setVipCode(String vipCode) {
        this.vipCode = vipCode;
    }

    public int getRunState() {
        return runState;
    }

    public void setRunState(int runState) {
        this.runState = runState;
    }
}
