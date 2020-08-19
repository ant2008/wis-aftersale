package com.wenc.commdomain.dto.dsb;

public class ConfirmCodeOrderDTO {

    private DistributeOrderDTO distributeOrderDTO;
    private SupplyOrderDTO supplyOrderDTO;

    public DistributeOrderDTO getDistributeOrderDTO() {
        return distributeOrderDTO;
    }

    public void setDistributeOrderDTO(DistributeOrderDTO distributeOrderDTO) {
        this.distributeOrderDTO = distributeOrderDTO;
    }

    public SupplyOrderDTO getSupplyOrderDTO() {
        return supplyOrderDTO;
    }

    public void setSupplyOrderDTO(SupplyOrderDTO supplyOrderDTO) {
        this.supplyOrderDTO = supplyOrderDTO;
    }
}
