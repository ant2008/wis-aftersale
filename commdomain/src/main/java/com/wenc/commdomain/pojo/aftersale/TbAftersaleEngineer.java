package com.wenc.commdomain.pojo.aftersale;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_aftersale_engineer")
public class TbAftersaleEngineer {
    private long idx;
    private String tenantId;
    private String engineerId;
    private String engineerName;
    private String engineerMobile;
    private String engineerIdnum;
    private String engineerAddress;
    private Integer state;
    private String createUser;
    private Timestamp createTime;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idx")
    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    @Basic
    @Column(name = "tenant_id")
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "engineer_id")
    public String getEngineerId() {
        return engineerId;
    }

    public void setEngineerId(String engineerId) {
        this.engineerId = engineerId;
    }

    @Basic
    @Column(name = "engineer_name")
    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }

    @Basic
    @Column(name = "engineer_mobile")
    public String getEngineerMobile() {
        return engineerMobile;
    }

    public void setEngineerMobile(String engineerMobile) {
        this.engineerMobile = engineerMobile;
    }

    @Basic
    @Column(name = "engineer_idnum")
    public String getEngineerIdnum() {
        return engineerIdnum;
    }

    public void setEngineerIdnum(String engineerIdnum) {
        this.engineerIdnum = engineerIdnum;
    }

    @Basic
    @Column(name = "engineer_address")
    public String getEngineerAddress() {
        return engineerAddress;
    }

    public void setEngineerAddress(String engineerAddress) {
        this.engineerAddress = engineerAddress;
    }

    @Basic
    @Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "create_user")
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "create_time")
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
        TbAftersaleEngineer that = (TbAftersaleEngineer) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(engineerId, that.engineerId) &&
                Objects.equals(engineerName, that.engineerName) &&
                Objects.equals(engineerMobile, that.engineerMobile) &&
                Objects.equals(engineerIdnum, that.engineerIdnum) &&
                Objects.equals(engineerAddress, that.engineerAddress) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, engineerId, engineerName, engineerMobile, engineerIdnum, engineerAddress, state, createUser, createTime);
    }
}
