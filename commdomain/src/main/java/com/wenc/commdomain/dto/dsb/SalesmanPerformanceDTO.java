package com.wenc.commdomain.dto.dsb;

import com.wenc.commdomain.pojo.dsb.TbSalesmanPerformanceD;
import com.wenc.commdomain.pojo.dsb.TbSalesmanPerformanceH;

import java.util.List;

public class SalesmanPerformanceDTO {

    private TbSalesmanPerformanceH tbSalesmanPerformanceH;

    private List<TbSalesmanPerformanceD> tbSalesmanPerformanceDS;

    public TbSalesmanPerformanceH getTbSalesmanPerformanceH() {
        return tbSalesmanPerformanceH;
    }

    public void setTbSalesmanPerformanceH(TbSalesmanPerformanceH tbSalesmanPerformanceH) {
        this.tbSalesmanPerformanceH = tbSalesmanPerformanceH;
    }

    public List<TbSalesmanPerformanceD> getTbSalesmanPerformanceDS() {
        return tbSalesmanPerformanceDS;
    }

    public void setTbSalesmanPerformanceDS(List<TbSalesmanPerformanceD> tbSalesmanPerformanceDS) {
        this.tbSalesmanPerformanceDS = tbSalesmanPerformanceDS;
    }
}
