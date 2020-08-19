package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ts_orgcode")
public class TsOrgcode {
    private long idx;
    private String tenantId;
    private String orgCode;
    private String orgName;
    private String subno;
    private String parentCode;
    private String orgAtrrib;
    private String flag;
    private Integer empNum;
    private String financeNo;
    private String telno;
    private String fax;
    private String address;
    private String email;
    private String postCode;
    private String bankNo;
    private String accountNo;
    private String taxNo;
    private String leader;
    private String leaderTelno;
    private String orderder;
    private String ordererTelno;
    private String createUser;
    private Timestamp createTime;
    private Integer state;
    private String ifUse;
    private Timestamp lastmodify;
    private String priceGroupId;

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
    @Column(name = "org_code", nullable = true, length = 20)
    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    @Basic
    @Column(name = "org_name", nullable = true, length = 100)
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Basic
    @Column(name = "subno", nullable = true, length = 50)
    public String getSubno() {
        return subno;
    }

    public void setSubno(String subno) {
        this.subno = subno;
    }

    @Basic
    @Column(name = "parent_code", nullable = true, length = 20)
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Basic
    @Column(name = "org_atrrib", nullable = true, length = 20)
    public String getOrgAtrrib() {
        return orgAtrrib;
    }

    public void setOrgAtrrib(String orgAtrrib) {
        this.orgAtrrib = orgAtrrib;
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
    @Column(name = "emp_num", nullable = true)
    public Integer getEmpNum() {
        return empNum;
    }

    public void setEmpNum(Integer empNum) {
        this.empNum = empNum;
    }

    @Basic
    @Column(name = "finance_no", nullable = true, length = 100)
    public String getFinanceNo() {
        return financeNo;
    }

    public void setFinanceNo(String financeNo) {
        this.financeNo = financeNo;
    }

    @Basic
    @Column(name = "telno", nullable = true, length = 30)
    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    @Basic
    @Column(name = "fax", nullable = true, length = 30)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 30)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "post_code", nullable = true, length = 20)
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Basic
    @Column(name = "bank_no", nullable = true, length = 30)
    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    @Basic
    @Column(name = "account_no", nullable = true, length = 50)
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    @Basic
    @Column(name = "tax_no", nullable = true, length = 30)
    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    @Basic
    @Column(name = "leader", nullable = true, length = 20)
    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    @Basic
    @Column(name = "leader_telno", nullable = true, length = 30)
    public String getLeaderTelno() {
        return leaderTelno;
    }

    public void setLeaderTelno(String leaderTelno) {
        this.leaderTelno = leaderTelno;
    }

    @Basic
    @Column(name = "orderder", nullable = true, length = 20)
    public String getOrderder() {
        return orderder;
    }

    public void setOrderder(String orderder) {
        this.orderder = orderder;
    }

    @Basic
    @Column(name = "orderer_telno", nullable = true, length = 30)
    public String getOrdererTelno() {
        return ordererTelno;
    }

    public void setOrdererTelno(String ordererTelno) {
        this.ordererTelno = ordererTelno;
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
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "if_use", nullable = true, length = 20)
    public String getIfUse() {
        return ifUse;
    }

    public void setIfUse(String ifUse) {
        this.ifUse = ifUse;
    }

    @Basic
    @Column(name = "lastmodify", nullable = true)
    public Timestamp getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Timestamp lastmodify) {
        this.lastmodify = lastmodify;
    }

    @Basic
    @Column(name = "price_group_id", nullable = true, length = 20)
    public String getPriceGroupId() {
        return priceGroupId;
    }

    public void setPriceGroupId(String priceGroupId) {
        this.priceGroupId = priceGroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TsOrgcode tsOrgcode = (TsOrgcode) o;
        return idx == tsOrgcode.idx &&
                Objects.equals(tenantId, tsOrgcode.tenantId) &&
                Objects.equals(orgCode, tsOrgcode.orgCode) &&
                Objects.equals(orgName, tsOrgcode.orgName) &&
                Objects.equals(subno, tsOrgcode.subno) &&
                Objects.equals(parentCode, tsOrgcode.parentCode) &&
                Objects.equals(orgAtrrib, tsOrgcode.orgAtrrib) &&
                Objects.equals(flag, tsOrgcode.flag) &&
                Objects.equals(empNum, tsOrgcode.empNum) &&
                Objects.equals(financeNo, tsOrgcode.financeNo) &&
                Objects.equals(telno, tsOrgcode.telno) &&
                Objects.equals(fax, tsOrgcode.fax) &&
                Objects.equals(address, tsOrgcode.address) &&
                Objects.equals(email, tsOrgcode.email) &&
                Objects.equals(postCode, tsOrgcode.postCode) &&
                Objects.equals(bankNo, tsOrgcode.bankNo) &&
                Objects.equals(accountNo, tsOrgcode.accountNo) &&
                Objects.equals(taxNo, tsOrgcode.taxNo) &&
                Objects.equals(leader, tsOrgcode.leader) &&
                Objects.equals(leaderTelno, tsOrgcode.leaderTelno) &&
                Objects.equals(orderder, tsOrgcode.orderder) &&
                Objects.equals(ordererTelno, tsOrgcode.ordererTelno) &&
                Objects.equals(createUser, tsOrgcode.createUser) &&
                Objects.equals(createTime, tsOrgcode.createTime) &&
                Objects.equals(state, tsOrgcode.state) &&
                Objects.equals(ifUse, tsOrgcode.ifUse) &&
                Objects.equals(lastmodify, tsOrgcode.lastmodify) &&
                Objects.equals(priceGroupId, tsOrgcode.priceGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, orgCode, orgName, subno, parentCode, orgAtrrib, flag, empNum, financeNo,
                telno, fax, address, email, postCode, bankNo, accountNo, taxNo, leader, leaderTelno, orderder, ordererTelno, createUser, createTime, state, ifUse, lastmodify, priceGroupId);
    }
}
