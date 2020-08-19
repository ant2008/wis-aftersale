package com.wenc.commdomain.pojo.core;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ss_bill_chk")
public class SsBillChk {
    private long idx;
    private String tenantId;
    private String billchkType;
    private String billchkNo;
    private Integer billchkBit;
    private Integer billchkAllbit;
    private String billchkMemo;
    private String billchkRejmemo;
    private Timestamp execDate;
    private Integer state;
    private String createUser;
    private Timestamp createTime;
    private String flag;

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
    @Column(name = "billchk_type", nullable = true, length = 20)
    public String getBillchkType() {
        return billchkType;
    }

    public void setBillchkType(String billchkType) {
        this.billchkType = billchkType;
    }

    @Basic
    @Column(name = "billchk_no", nullable = true, length = 50)
    public String getBillchkNo() {
        return billchkNo;
    }

    public void setBillchkNo(String billchkNo) {
        this.billchkNo = billchkNo;
    }

    @Basic
    @Column(name = "billchk_bit", nullable = true)
    public Integer getBillchkBit() {
        return billchkBit;
    }

    public void setBillchkBit(Integer billchkBit) {
        this.billchkBit = billchkBit;
    }

    @Basic
    @Column(name = "billchk_allbit", nullable = true)
    public Integer getBillchkAllbit() {
        return billchkAllbit;
    }

    public void setBillchkAllbit(Integer billchkAllbit) {
        this.billchkAllbit = billchkAllbit;
    }

    @Basic
    @Column(name = "billchk_memo", nullable = true, length = 300)
    public String getBillchkMemo() {
        return billchkMemo;
    }

    public void setBillchkMemo(String billchkMemo) {
        this.billchkMemo = billchkMemo;
    }

    @Basic
    @Column(name = "billchk_rejmemo", nullable = true, length = 300)
    public String getBillchkRejmemo() {
        return billchkRejmemo;
    }

    public void setBillchkRejmemo(String billchkRejmemo) {
        this.billchkRejmemo = billchkRejmemo;
    }

    @Basic
    @Column(name = "exec_date", nullable = true)
    public Timestamp getExecDate() {
        return execDate;
    }

    public void setExecDate(Timestamp execDate) {
        this.execDate = execDate;
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
    @Column(name = "flag", nullable = true, length = 20)
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SsBillChk ssBillChk = (SsBillChk) o;
        return idx == ssBillChk.idx &&
                Objects.equals(tenantId, ssBillChk.tenantId) &&
                Objects.equals(billchkType, ssBillChk.billchkType) &&
                Objects.equals(billchkNo, ssBillChk.billchkNo) &&
                Objects.equals(billchkBit, ssBillChk.billchkBit) &&
                Objects.equals(billchkAllbit, ssBillChk.billchkAllbit) &&
                Objects.equals(billchkMemo, ssBillChk.billchkMemo) &&
                Objects.equals(billchkRejmemo, ssBillChk.billchkRejmemo) &&
                Objects.equals(execDate, ssBillChk.execDate) &&
                Objects.equals(state, ssBillChk.state) &&
                Objects.equals(createUser, ssBillChk.createUser) &&
                Objects.equals(createTime, ssBillChk.createTime) &&
                Objects.equals(flag, ssBillChk.flag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, billchkType, billchkNo, billchkBit, billchkAllbit, billchkMemo, billchkRejmemo, execDate, state, createUser, createTime, flag);
    }
}
