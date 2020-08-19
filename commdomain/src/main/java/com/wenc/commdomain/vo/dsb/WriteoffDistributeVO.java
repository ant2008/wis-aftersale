package com.wenc.commdomain.vo.dsb;

/**
 * 核销分销信息
 */
public class WriteoffDistributeVO {

    private String distribtorId;

    private String distribtionName;

    private String salesmanId;

    private String salesmanMobileNo;

    private String salesmanName;

    public String getDistribtorId() {
        return distribtorId;
    }

    public void setDistribtorId(String distribtorId) {
        this.distribtorId = distribtorId;
    }

    public String getDistribtionName() {
        return distribtionName;
    }

    public void setDistribtionName(String distribtionName) {
        this.distribtionName = distribtionName;
    }

    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId;
    }

    public String getSalesmanMobileNo() {
        return salesmanMobileNo;
    }

    public void setSalesmanMobileNo(String salesmanMobileNo) {
        this.salesmanMobileNo = salesmanMobileNo;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }
}
