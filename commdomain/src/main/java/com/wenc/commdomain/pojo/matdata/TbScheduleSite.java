package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_schedule_site")
public class TbScheduleSite {
    private long idx;
    private String tenantId;
    private String scheduleSiteId;
    private String scheduleSiteName;
    private String scheduleSiteAddress;
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
    @Column(name = "schedule_site_id", nullable = true, length = 20)
    public String getScheduleSiteId() {
        return scheduleSiteId;
    }

    public void setScheduleSiteId(String scheduleSiteId) {
        this.scheduleSiteId = scheduleSiteId;
    }

    @Basic
    @Column(name = "schedule_site_name", nullable = true, length = 100)
    public String getScheduleSiteName() {
        return scheduleSiteName;
    }

    public void setScheduleSiteName(String scheduleSiteName) {
        this.scheduleSiteName = scheduleSiteName;
    }

    @Basic
    @Column(name = "schedule_site_address", nullable = true, length = 300)
    public String getScheduleSiteAddress() {
        return scheduleSiteAddress;
    }

    public void setScheduleSiteAddress(String scheduleSiteAddress) {
        this.scheduleSiteAddress = scheduleSiteAddress;
    }

    @Basic
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbScheduleSite that = (TbScheduleSite) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(scheduleSiteId, that.scheduleSiteId) &&
                Objects.equals(scheduleSiteName, that.scheduleSiteName) &&
                Objects.equals(scheduleSiteAddress, that.scheduleSiteAddress) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, scheduleSiteId, scheduleSiteName, scheduleSiteAddress, state);
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
}
