package com.wenc.commdomain.pojo.core;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ss_role_func_h")
public class SsRoleFuncH {
    private long idx;
    private String tenantId;
    private String roleId;
    private String funcNo;
    private Integer actr;
    private Integer addr;
    private Integer modr;
    private Integer delr;
    private Integer prtr;
    private Integer othr;
    private Integer chkr;
    private Integer quyr;
    private Integer state;
    private String createUser;
    private Timestamp createTime;
    private Timestamp lastmodify;

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
    @Column(name = "role_id", nullable = true, length = 20)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "func_no", nullable = true, length = 20)
    public String getFuncNo() {
        return funcNo;
    }

    public void setFuncNo(String funcNo) {
        this.funcNo = funcNo;
    }

    @Basic
    @Column(name = "actr", nullable = true)
    public Integer getActr() {
        return actr;
    }

    public void setActr(Integer actr) {
        this.actr = actr;
    }

    @Basic
    @Column(name = "addr", nullable = true)
    public Integer getAddr() {
        return addr;
    }

    public void setAddr(Integer addr) {
        this.addr = addr;
    }

    @Basic
    @Column(name = "modr", nullable = true)
    public Integer getModr() {
        return modr;
    }

    public void setModr(Integer modr) {
        this.modr = modr;
    }

    @Basic
    @Column(name = "delr", nullable = true)
    public Integer getDelr() {
        return delr;
    }

    public void setDelr(Integer delr) {
        this.delr = delr;
    }

    @Basic
    @Column(name = "prtr", nullable = true)
    public Integer getPrtr() {
        return prtr;
    }

    public void setPrtr(Integer prtr) {
        this.prtr = prtr;
    }

    @Basic
    @Column(name = "othr", nullable = true)
    public Integer getOthr() {
        return othr;
    }

    public void setOthr(Integer othr) {
        this.othr = othr;
    }

    @Basic
    @Column(name = "chkr", nullable = true)
    public Integer getChkr() {
        return chkr;
    }

    public void setChkr(Integer chkr) {
        this.chkr = chkr;
    }

    @Basic
    @Column(name = "quyr", nullable = true)
    public Integer getQuyr() {
        return quyr;
    }

    public void setQuyr(Integer quyr) {
        this.quyr = quyr;
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

    @Basic
    @Column(name = "lastmodify", nullable = true)
    public Timestamp getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Timestamp lastmodify) {
        this.lastmodify = lastmodify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SsRoleFuncH that = (SsRoleFuncH) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(funcNo, that.funcNo) &&
                Objects.equals(actr, that.actr) &&
                Objects.equals(addr, that.addr) &&
                Objects.equals(modr, that.modr) &&
                Objects.equals(delr, that.delr) &&
                Objects.equals(prtr, that.prtr) &&
                Objects.equals(othr, that.othr) &&
                Objects.equals(chkr, that.chkr) &&
                Objects.equals(quyr, that.quyr) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(lastmodify, that.lastmodify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, roleId, funcNo, actr, addr, modr, delr, prtr, othr, chkr, quyr, state, createUser, createTime, lastmodify);
    }
}
