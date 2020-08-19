package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ts_stat_report_log")
public class TsStatReportLog {
    private long idx;
    private String tenantId;
    private String statReportType;
    private String statReportName;
    private Timestamp statDate;
    private String statMsg;
    private Integer state;
    private String createUser;
    private Timestamp createTime;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idx", nullable = false)
    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    @Basic
    @Column(name = "tenant_id", nullable = true, length = 50)
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "stat_report_type", nullable = true, length = 20)
    public String getStatReportType() {
        return statReportType;
    }

    public void setStatReportType(String statReportType) {
        this.statReportType = statReportType;
    }

    @Basic
    @Column(name = "stat_report_name", nullable = true, length = 20)
    public String getStatReportName() {
        return statReportName;
    }

    public void setStatReportName(String statReportName) {
        this.statReportName = statReportName;
    }

    @Basic
    @Column(name = "stat_date", nullable = true)
    public Timestamp getStatDate() {
        return statDate;
    }

    public void setStatDate(Timestamp statDate) {
        this.statDate = statDate;
    }

    @Basic
    @Column(name = "stat_msg", nullable = true, length = 1000)
    public String getStatMsg() {
        return statMsg;
    }

    public void setStatMsg(String statMsg) {
        this.statMsg = statMsg;
    }

    @Basic
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 20)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TsStatReportLog that = (TsStatReportLog) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(statReportType, that.statReportType) &&
                Objects.equals(statReportName, that.statReportName) &&
                Objects.equals(statDate, that.statDate) &&
                Objects.equals(statMsg, that.statMsg) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, statReportType, statReportName, statDate, statMsg, state, createUser, createTime);
    }
}
