package com.wenc.commdomain.dto.dsb;

import com.wenc.commdomain.pojo.dsb.TbDistributorPerformanceD;
import com.wenc.commdomain.pojo.dsb.TbDistributorPerformanceH;

import java.util.List;

public class DistribPerformanceDTO {

    private TbDistributorPerformanceH tbDistributorPerformanceH;

    private List<TbDistributorPerformanceD> tbDistributorPerformanceDList;

    public TbDistributorPerformanceH getTbDistributorPerformanceH() {
        return tbDistributorPerformanceH;
    }

    public void setTbDistributorPerformanceH(TbDistributorPerformanceH tbDistributorPerformanceH) {
        this.tbDistributorPerformanceH = tbDistributorPerformanceH;
    }

    public List<TbDistributorPerformanceD> getTbDistributorPerformanceDList() {
        return tbDistributorPerformanceDList;
    }

    public void setTbDistributorPerformanceDList(List<TbDistributorPerformanceD> tbDistributorPerformanceDList) {
        this.tbDistributorPerformanceDList = tbDistributorPerformanceDList;
    }
}
