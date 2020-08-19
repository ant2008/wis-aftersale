package com.wenc.commdomain.dto.sal;

import java.util.List;

/**
 * 前端提交销售结构
 */
public class CommitRetailSaleDTO {

    private RetailSaleMasterDTO retailSaleMaster;
    private List<RetailSaleItemDTO> retailSaleItems;
    private List<RetailSalePayDTO> retailSalePay;

    public RetailSaleMasterDTO getRetailSaleMaster() {
        return retailSaleMaster;
    }

    public void setRetailSaleMaster(RetailSaleMasterDTO retailSaleMaster) {
        this.retailSaleMaster = retailSaleMaster;
    }

    public List<RetailSaleItemDTO> getRetailSaleItems() {
        return retailSaleItems;
    }

    public void setRetailSaleItems(List<RetailSaleItemDTO> retailSaleItems) {
        this.retailSaleItems = retailSaleItems;
    }

    public List<RetailSalePayDTO> getRetailSalePay() {
        return retailSalePay;
    }

    public void setRetailSalePay(List<RetailSalePayDTO> retailSalePay) {
        this.retailSalePay = retailSalePay;
    }
}
