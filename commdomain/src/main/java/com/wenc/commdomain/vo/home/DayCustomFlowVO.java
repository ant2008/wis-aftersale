package com.wenc.commdomain.vo.home;

import cn.hutool.core.date.DateUtil;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class DayCustomFlowVO {

    private String statDate;
    private Integer customFlow;

    public DayCustomFlowVO() {
    }

    public DayCustomFlowVO(Timestamp aDate, Integer aCustomFlow)
    {
          this.statDate = DateUtil.format(new Date(aDate.getTime()),"yyyyMMdd");
          this.customFlow = aCustomFlow;
    }

    @Id
    @Column(name = "stat_date")
    public String getStatDate() {
        return statDate;
    }

    public void setStatDate(String statDate) {
        this.statDate = statDate;
    }

    @Column(name = "custom_flow")
    public Integer getCustomFlow() {
        return customFlow;
    }

    public void setCustomFlow(Integer customFlow) {
        this.customFlow = customFlow;
    }
}
