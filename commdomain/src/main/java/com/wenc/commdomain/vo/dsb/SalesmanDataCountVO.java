package com.wenc.commdomain.vo.dsb;

/**
 * 业务员绩效看板VO
 *
 * @author w.li
 * @date 2019-1-8
 */
public class SalesmanDataCountVO {

    //总订单数
    private int totalOrderNums;

    //核销订单数
    private int writeoffOrderNums;

    //有效客户数
    private int validCustomerNums;

    //推广客户数
    private int totalCustomerNums;

    //总绩效数据
    private double totalPerformanceAmt;

    //总订单金额
    private double totalOrderAmt;

    //上新商品
    private int newProductNums;

    //可用商品数
    private int distribProductNums;


    public int getTotalOrderNums() {
        return totalOrderNums;
    }

    public void setTotalOrderNums(int totalOrderNums) {
        this.totalOrderNums = totalOrderNums;
    }

    public int getWriteoffOrderNums() {
        return writeoffOrderNums;
    }

    public void setWriteoffOrderNums(int writeoffOrderNums) {
        this.writeoffOrderNums = writeoffOrderNums;
    }

    public int getValidCustomerNums() {
        return validCustomerNums;
    }

    public void setValidCustomerNums(int validCustomerNums) {
        this.validCustomerNums = validCustomerNums;
    }

    public int getTotalCustomerNums() {
        return totalCustomerNums;
    }

    public void setTotalCustomerNums(int totalCustomerNums) {
        this.totalCustomerNums = totalCustomerNums;
    }

    public double getTotalPerformanceAmt() {
        return totalPerformanceAmt;
    }

    public void setTotalPerformanceAmt(double totalPerformanceAmt) {
        this.totalPerformanceAmt = totalPerformanceAmt;
    }

    public double getTotalOrderAmt() {
        return totalOrderAmt;
    }

    public void setTotalOrderAmt(double totalOrderAmt) {
        this.totalOrderAmt = totalOrderAmt;
    }

    public int getNewProductNums() {
        return newProductNums;
    }

    public void setNewProductNums(int newProductNums) {
        this.newProductNums = newProductNums;
    }

    public int getDistribProductNums() {
        return distribProductNums;
    }

    public void setDistribProductNums(int distribProductNums) {
        this.distribProductNums = distribProductNums;
    }
}
