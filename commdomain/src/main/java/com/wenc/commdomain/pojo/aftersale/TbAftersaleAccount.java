package com.wenc.commdomain.pojo.aftersale;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_aftersale_account")
public class TbAftersaleAccount {
    private long idx;
    private String tenantId;
    private Timestamp accountDate;
    private String accountType;
    private String aftersaleOrderNo;
    private BigDecimal aftersaleOrderAmt;
    private Integer aftersaleState;
    private String aftersaleDoState;
    private BigDecimal confirmAmt;
    private Timestamp confirmDate;
    private String engineerId;
    private String engineerName;
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
    @Column(name = "account_date", nullable = true)
    public Timestamp getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Timestamp accountDate) {
        this.accountDate = accountDate;
    }

    @Basic
    @Column(name = "account_type", nullable = true, length = 20)
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Basic
    @Column(name = "aftersale_order_no", nullable = true, length = 30)
    public String getAftersaleOrderNo() {
        return aftersaleOrderNo;
    }

    public void setAftersaleOrderNo(String aftersaleOrderNo) {
        this.aftersaleOrderNo = aftersaleOrderNo;
    }

    @Basic
    @Column(name = "aftersale_order_amt", nullable = true, precision = 6)
    public BigDecimal getAftersaleOrderAmt() {
        return aftersaleOrderAmt;
    }

    public void setAftersaleOrderAmt(BigDecimal aftersaleOrderAmt) {
        this.aftersaleOrderAmt = aftersaleOrderAmt;
    }

    @Basic
    @Column(name = "aftersale_state", nullable = true)
    public Integer getAftersaleState() {
        return aftersaleState;
    }

    public void setAftersaleState(Integer aftersaleState) {
        this.aftersaleState = aftersaleState;
    }

    @Basic
    @Column(name = "aftersale_do_state", nullable = true, length = 20)
    public String getAftersaleDoState() {
        return aftersaleDoState;
    }

    public void setAftersaleDoState(String aftersaleDoState) {
        this.aftersaleDoState = aftersaleDoState;
    }

    @Basic
    @Column(name = "confirm_amt", nullable = true, precision = 6)
    public BigDecimal getConfirmAmt() {
        return confirmAmt;
    }

    public void setConfirmAmt(BigDecimal confirmAmt) {
        this.confirmAmt = confirmAmt;
    }

    @Basic
    @Column(name = "confirm_date", nullable = true)
    public Timestamp getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Timestamp confirmDate) {
        this.confirmDate = confirmDate;
    }

    @Basic
    @Column(name = "engineer_id", nullable = true, length = 30)
    public String getEngineerId() {
        return engineerId;
    }

    public void setEngineerId(String engineerId) {
        this.engineerId = engineerId;
    }

    @Basic
    @Column(name = "engineer_name", nullable = true, length = 30)
    public String getEngineerName() {
        return engineerName;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
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
        TbAftersaleAccount that = (TbAftersaleAccount) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(accountDate, that.accountDate) &&
                Objects.equals(accountType, that.accountType) &&
                Objects.equals(aftersaleOrderNo, that.aftersaleOrderNo) &&
                Objects.equals(aftersaleOrderAmt, that.aftersaleOrderAmt) &&
                Objects.equals(aftersaleState, that.aftersaleState) &&
                Objects.equals(aftersaleDoState, that.aftersaleDoState) &&
                Objects.equals(confirmAmt, that.confirmAmt) &&
                Objects.equals(confirmDate, that.confirmDate) &&
                Objects.equals(engineerId, that.engineerId) &&
                Objects.equals(engineerName, that.engineerName) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, accountDate, accountType, aftersaleOrderNo, aftersaleOrderAmt,
                aftersaleState, aftersaleDoState, confirmAmt, confirmDate, engineerId, engineerName, createUser, createTime);
    }
}
