package com.wenc.commdomain.vo.dsb;

import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

/**
 * 核销患者信息。
 *
 */
public class WriteoffCustomerVO {

    private String wxId;

    private String customerId;

    private String customerName;

    private String customerMobileNo;

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMobileNo() {
        return customerMobileNo;
    }

    public void setCustomerMobileNo(String customerMobileNo) {
        this.customerMobileNo = customerMobileNo;
    }
}
