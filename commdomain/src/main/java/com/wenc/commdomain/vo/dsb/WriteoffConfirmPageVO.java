package com.wenc.commdomain.vo.dsb;

/**
 * 核销确认展现页面结构。
 *
 * @author w.li
 * @date 2019-12-27
 * @see 1.0
 */
public class WriteoffConfirmPageVO {

    //核销码
    private String writeOffKey;

    //核销状态
    private String writeOffState;

    public String getWriteOffState() {
        return writeOffState;
    }

    public void setWriteOffState(String writeOffState) {
        this.writeOffState = writeOffState;
    }

    //内容商信息
    private WriteoffSupplyVO writeoffSupplyInfo;

    //产品信息
    private WriteoffProductVO writeoffProductInfo;

    //顾客信息
    private WriteoffCustomerVO writeoffCustomerInfo;

    //分销商信息。
    private WriteoffDistributeVO writeoffDistributeInfo;


    public String getWriteOffKey() {
        return writeOffKey;
    }

    public void setWriteOffKey(String writeOffKey) {
        this.writeOffKey = writeOffKey;
    }

    public WriteoffSupplyVO getWriteoffSupplyInfo() {
        return writeoffSupplyInfo;
    }

    public void setWriteoffSupplyInfo(WriteoffSupplyVO writeoffSupplyInfo) {
        this.writeoffSupplyInfo = writeoffSupplyInfo;
    }

    public WriteoffProductVO getWriteoffProductInfo() {
        return writeoffProductInfo;
    }

    public void setWriteoffProductInfo(WriteoffProductVO writeoffProductInfo) {
        this.writeoffProductInfo = writeoffProductInfo;
    }

    public WriteoffCustomerVO getWriteoffCustomerInfo() {
        return writeoffCustomerInfo;
    }

    public void setWriteoffCustomerInfo(WriteoffCustomerVO writeoffCustomerInfo) {
        this.writeoffCustomerInfo = writeoffCustomerInfo;
    }

    public WriteoffDistributeVO getWriteoffDistributeInfo() {
        return writeoffDistributeInfo;
    }

    public void setWriteoffDistributeInfo(WriteoffDistributeVO writeoffDistributeInfo) {
        this.writeoffDistributeInfo = writeoffDistributeInfo;
    }
}
