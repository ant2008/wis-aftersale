package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_hwdms_log")
public class TbHwdmsLog {
    private long idx;
    private String tenantId;
    private Timestamp dmsDate;
    private String dmsId;
    private String dmsData;
    private String dmsTag;
    private Integer state;
    private String errMsg;
    private String dmsFrom;
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
    @Column(name = "dms_date", nullable = true)
    public Timestamp getDmsDate() {
        return dmsDate;
    }

    public void setDmsDate(Timestamp dmsDate) {
        this.dmsDate = dmsDate;
    }

    @Basic
    @Column(name = "dms_id", nullable = true, length = 2000)
    public String getDmsId() {
        return dmsId;
    }

    public void setDmsId(String dmsId) {
        this.dmsId = dmsId;
    }

    @Basic
    @Column(name = "dms_data", nullable = true, length = 5000)
    public String getDmsData() {
        return dmsData;
    }

    public void setDmsData(String dmsData) {
        this.dmsData = dmsData;
    }

    @Basic
    @Column(name = "dms_tag", nullable = true, length = 100)
    public String getDmsTag() {
        return dmsTag;
    }

    public void setDmsTag(String dmsTag) {
        this.dmsTag = dmsTag;
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
    @Column(name = "err_msg", nullable = true, length = 1000)
    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    @Basic
    @Column(name = "dms_from", nullable = true, length = 50)
    public String getDmsFrom() {
        return dmsFrom;
    }

    public void setDmsFrom(String dmsFrom) {
        this.dmsFrom = dmsFrom;
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
        TbHwdmsLog that = (TbHwdmsLog) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(dmsDate, that.dmsDate) &&
                Objects.equals(dmsId, that.dmsId) &&
                Objects.equals(dmsData, that.dmsData) &&
                Objects.equals(dmsTag, that.dmsTag) &&
                Objects.equals(state, that.state) &&
                Objects.equals(errMsg, that.errMsg) &&
                Objects.equals(dmsFrom, that.dmsFrom) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, dmsDate, dmsId, dmsData, dmsTag, state, errMsg, dmsFrom, createTime);
    }
}
