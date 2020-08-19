package com.wenc.commdomain.pojo.glt;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gl_syspara")
public class GlSyspara {
    private long idx;
    private String tenantId;
    private String paraType;
    private String paraCode;
    private String paraDescr;
    private String paraDefa;
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
    @Column(name = "para_type", nullable = true, length = 20)
    public String getParaType() {
        return paraType;
    }

    public void setParaType(String paraType) {
        this.paraType = paraType;
    }

    @Basic
    @Column(name = "para_code", nullable = true, length = 20)
    public String getParaCode() {
        return paraCode;
    }

    public void setParaCode(String paraCode) {
        this.paraCode = paraCode;
    }

    @Basic
    @Column(name = "para_descr", nullable = true, length = 30)
    public String getParaDescr() {
        return paraDescr;
    }

    public void setParaDescr(String paraDescr) {
        this.paraDescr = paraDescr;
    }

    @Basic
    @Column(name = "para_defa", nullable = true, length = 200)
    public String getParaDefa() {
        return paraDefa;
    }

    public void setParaDefa(String paraDefa) {
        this.paraDefa = paraDefa;
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
        GlSyspara glSyspara = (GlSyspara) o;
        return idx == glSyspara.idx &&
                Objects.equals(tenantId, glSyspara.tenantId) &&
                Objects.equals(paraType, glSyspara.paraType) &&
                Objects.equals(paraCode, glSyspara.paraCode) &&
                Objects.equals(paraDescr, glSyspara.paraDescr) &&
                Objects.equals(paraDefa, glSyspara.paraDefa) &&
                Objects.equals(state, glSyspara.state) &&
                Objects.equals(createUser, glSyspara.createUser) &&
                Objects.equals(createTime, glSyspara.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, paraType, paraCode, paraDescr, paraDefa, state, createUser, createTime);
    }
}
