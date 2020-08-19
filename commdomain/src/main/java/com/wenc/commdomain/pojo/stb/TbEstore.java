package com.wenc.commdomain.pojo.stb;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_estore")
public class TbEstore {
    private long idx;
    private String tenantId;
    private String estoreType;
    private String estoreId;
    private String estoreName;
    private Timestamp warrantDate;
    private Integer state;
    private String flag;
    private Timestamp createTime;
    private String createUser;
    private String estoreMapptype;

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
    @Column(name = "estore_type", nullable = true, length = 20)
    public String getEstoreType() {
        return estoreType;
    }

    public void setEstoreType(String estoreType) {
        this.estoreType = estoreType;
    }

    @Basic
    @Column(name = "estore_id", nullable = true, length = 30)
    public String getEstoreId() {
        return estoreId;
    }

    public void setEstoreId(String estoreId) {
        this.estoreId = estoreId;
    }

    @Basic
    @Column(name = "estore_name", nullable = true, length = 50)
    public String getEstoreName() {
        return estoreName;
    }

    public void setEstoreName(String estoreName) {
        this.estoreName = estoreName;
    }

    @Basic
    @Column(name = "warrant_date", nullable = true)
    public Timestamp getWarrantDate() {
        return warrantDate;
    }

    public void setWarrantDate(Timestamp warrantDate) {
        this.warrantDate = warrantDate;
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
    @Column(name = "flag", nullable = true, length = 20)
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 20)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbEstore tbEstore = (TbEstore) o;
        return idx == tbEstore.idx &&
                Objects.equals(tenantId, tbEstore.tenantId) &&
                Objects.equals(estoreType, tbEstore.estoreType) &&
                Objects.equals(estoreId, tbEstore.estoreId) &&
                Objects.equals(estoreName, tbEstore.estoreName) &&
                Objects.equals(warrantDate, tbEstore.warrantDate) &&
                Objects.equals(state, tbEstore.state) &&
                Objects.equals(flag, tbEstore.flag) &&
                Objects.equals(createTime, tbEstore.createTime) &&
                Objects.equals(createUser, tbEstore.createUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, estoreType, estoreId, estoreName, warrantDate, state, flag, createTime, createUser);
    }

    @Basic
    @Column(name = "estore_mapptype", nullable = true, length = 20)
    public String getEstoreMapptype() {
        return estoreMapptype;
    }

    public void setEstoreMapptype(String estoreMapptype) {
        this.estoreMapptype = estoreMapptype;
    }
}
