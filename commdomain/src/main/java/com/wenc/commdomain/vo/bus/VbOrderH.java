package com.wenc.commdomain.vo.bus;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_order_h")
public class VbOrderH {
    private long idx;
    private String orderNo;
    private String examNo;
    private String orderplanNo;
    private String contNo;
    private String payeeType;
    private String depotId;
    private String departCode;
    private String vendorNo;
    private String vendorName;
    private String orderName;
    private String orderTel;
    private Timestamp consTime;
    private Timestamp arrDate;
    private String consType;
    private String orderType;
    private String buyer;
    private String chkUser1;
    private Byte chkBit1;
    private String chkUser2;
    private Byte chkBit2;
    private String chkUser3;
    private Byte chkBit3;
    private String chkUser4;
    private Byte chkBit4;
    private String vouchNo;
    private Timestamp execDate;
    private Byte state;
    private String createUser;
    private Timestamp createTime;
    private Timestamp lastmodify;
    private String tenantId;

    @Id
    @Basic
    @Column(name = "idx", nullable = false)
    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    @Basic
    @Column(name = "order_no", nullable = true, length = 30)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "exam_no", nullable = true, length = 12)
    public String getExamNo() {
        return examNo;
    }

    public void setExamNo(String examNo) {
        this.examNo = examNo;
    }

    @Basic
    @Column(name = "orderplan_no", nullable = true, length = 12)
    public String getOrderplanNo() {
        return orderplanNo;
    }

    public void setOrderplanNo(String orderplanNo) {
        this.orderplanNo = orderplanNo;
    }

    @Basic
    @Column(name = "cont_no", nullable = true, length = 20)
    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo;
    }

    @Basic
    @Column(name = "payee_type", nullable = true, length = 3)
    public String getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(String payeeType) {
        this.payeeType = payeeType;
    }

    @Basic
    @Column(name = "depot_id", nullable = true, length = 15)
    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    @Basic
    @Column(name = "depart_code", nullable = true, length = 8)
    public String getDepartCode() {
        return departCode;
    }

    public void setDepartCode(String departCode) {
        this.departCode = departCode;
    }

    @Basic
    @Column(name = "vendor_no", nullable = true, length = 13)
    public String getVendorNo() {
        return vendorNo;
    }

    public void setVendorNo(String vendorNo) {
        this.vendorNo = vendorNo;
    }

    @Basic
    @Column(name = "vendor_name", nullable = true, length = 100)
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    @Basic
    @Column(name = "order_name", nullable = true, length = 80)
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Basic
    @Column(name = "order_tel", nullable = true, length = 20)
    public String getOrderTel() {
        return orderTel;
    }

    public void setOrderTel(String orderTel) {
        this.orderTel = orderTel;
    }

    @Basic
    @Column(name = "cons_time", nullable = true)
    public Timestamp getConsTime() {
        return consTime;
    }

    public void setConsTime(Timestamp consTime) {
        this.consTime = consTime;
    }

    @Basic
    @Column(name = "arr_date", nullable = true)
    public Timestamp getArrDate() {
        return arrDate;
    }

    public void setArrDate(Timestamp arrDate) {
        this.arrDate = arrDate;
    }

    @Basic
    @Column(name = "cons_type", nullable = true, length = 30)
    public String getConsType() {
        return consType;
    }

    public void setConsType(String consType) {
        this.consType = consType;
    }

    @Basic
    @Column(name = "order_type", nullable = true, length = 3)
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @Basic
    @Column(name = "buyer", nullable = true, length = 8)
    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    @Basic
    @Column(name = "chk_user1", nullable = true, length = 8)
    public String getChkUser1() {
        return chkUser1;
    }

    public void setChkUser1(String chkUser1) {
        this.chkUser1 = chkUser1;
    }

    @Basic
    @Column(name = "chk_bit1", nullable = true)
    public Byte getChkBit1() {
        return chkBit1;
    }

    public void setChkBit1(Byte chkBit1) {
        this.chkBit1 = chkBit1;
    }

    @Basic
    @Column(name = "chk_user2", nullable = true, length = 8)
    public String getChkUser2() {
        return chkUser2;
    }

    public void setChkUser2(String chkUser2) {
        this.chkUser2 = chkUser2;
    }

    @Basic
    @Column(name = "chk_bit2", nullable = true)
    public Byte getChkBit2() {
        return chkBit2;
    }

    public void setChkBit2(Byte chkBit2) {
        this.chkBit2 = chkBit2;
    }

    @Basic
    @Column(name = "chk_user3", nullable = true, length = 8)
    public String getChkUser3() {
        return chkUser3;
    }

    public void setChkUser3(String chkUser3) {
        this.chkUser3 = chkUser3;
    }

    @Basic
    @Column(name = "chk_bit3", nullable = true)
    public Byte getChkBit3() {
        return chkBit3;
    }

    public void setChkBit3(Byte chkBit3) {
        this.chkBit3 = chkBit3;
    }

    @Basic
    @Column(name = "chk_user4", nullable = true, length = 8)
    public String getChkUser4() {
        return chkUser4;
    }

    public void setChkUser4(String chkUser4) {
        this.chkUser4 = chkUser4;
    }

    @Basic
    @Column(name = "chk_bit4", nullable = true)
    public Byte getChkBit4() {
        return chkBit4;
    }

    public void setChkBit4(Byte chkBit4) {
        this.chkBit4 = chkBit4;
    }

    @Basic
    @Column(name = "vouch_no", nullable = true, length = 12)
    public String getVouchNo() {
        return vouchNo;
    }

    public void setVouchNo(String vouchNo) {
        this.vouchNo = vouchNo;
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
    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 8)
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
    @Column(name = "lastmodify", nullable = false)
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
        VbOrderH vbOrderH = (VbOrderH) o;
        return idx == vbOrderH.idx &&
                Objects.equals(orderNo, vbOrderH.orderNo) &&
                Objects.equals(examNo, vbOrderH.examNo) &&
                Objects.equals(orderplanNo, vbOrderH.orderplanNo) &&
                Objects.equals(contNo, vbOrderH.contNo) &&
                Objects.equals(payeeType, vbOrderH.payeeType) &&
                Objects.equals(depotId, vbOrderH.depotId) &&
                Objects.equals(departCode, vbOrderH.departCode) &&
                Objects.equals(vendorNo, vbOrderH.vendorNo) &&
                Objects.equals(vendorName, vbOrderH.vendorName) &&
                Objects.equals(orderName, vbOrderH.orderName) &&
                Objects.equals(orderTel, vbOrderH.orderTel) &&
                Objects.equals(consTime, vbOrderH.consTime) &&
                Objects.equals(arrDate, vbOrderH.arrDate) &&
                Objects.equals(consType, vbOrderH.consType) &&
                Objects.equals(orderType, vbOrderH.orderType) &&
                Objects.equals(buyer, vbOrderH.buyer) &&
                Objects.equals(chkUser1, vbOrderH.chkUser1) &&
                Objects.equals(chkBit1, vbOrderH.chkBit1) &&
                Objects.equals(chkUser2, vbOrderH.chkUser2) &&
                Objects.equals(chkBit2, vbOrderH.chkBit2) &&
                Objects.equals(chkUser3, vbOrderH.chkUser3) &&
                Objects.equals(chkBit3, vbOrderH.chkBit3) &&
                Objects.equals(chkUser4, vbOrderH.chkUser4) &&
                Objects.equals(chkBit4, vbOrderH.chkBit4) &&
                Objects.equals(vouchNo, vbOrderH.vouchNo) &&
                Objects.equals(execDate, vbOrderH.execDate) &&
                Objects.equals(state, vbOrderH.state) &&
                Objects.equals(createUser, vbOrderH.createUser) &&
                Objects.equals(createTime, vbOrderH.createTime) &&
                Objects.equals(lastmodify, vbOrderH.lastmodify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, orderNo, examNo, orderplanNo, contNo, payeeType, depotId, departCode, vendorNo, vendorName, orderName, orderTel, consTime, arrDate, consType, orderType, buyer, chkUser1, chkBit1, chkUser2, chkBit2, chkUser3, chkBit3, chkUser4, chkBit4, vouchNo, execDate, state, createUser, createTime, lastmodify);
    }

    @Basic
    @Column(name = "tenant_id", nullable = true, length = 50)
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
