package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_vendor")
public class TbVendor {
    private long idx;
    private String tenantId;
    private String vendorId;
    private String vendorType;
    private String vendorSubno;
    private String vendorName;
    private String vendorSubname;
    private String areaCode;
    private Integer state;
    private String address;
    private String postCode;
    private String orderName;
    private String orderZip;
    private String orderTelno;
    private String orderFax;
    private String orderCall;
    private String orderFixedcall;
    private String orderEmail;
    private String ceoName;
    private String ceoTelno;
    private String createUser;
    private Timestamp createTime;
    private String medVendorId;
    private String svrVendorId;
    private String othVendorId;
    private String inviteTenantId;
    private String inviteUserId;
    private String doState;
    private String telno;
    private String supplyTenantId;

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
    @Column(name = "vendor_id", nullable = true, length = 20)
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Basic
    @Column(name = "vendor_type", nullable = true, length = 10)
    public String getVendorType() {
        return vendorType;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType;
    }

    @Basic
    @Column(name = "vendor_subno", nullable = true, length = 20)
    public String getVendorSubno() {
        return vendorSubno;
    }

    public void setVendorSubno(String vendorSubno) {
        this.vendorSubno = vendorSubno;
    }

    @Basic
    @Column(name = "vendor_name", nullable = true, length = 80)
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    @Basic
    @Column(name = "vendor_subname", nullable = true, length = 20)
    public String getVendorSubname() {
        return vendorSubname;
    }

    public void setVendorSubname(String vendorSubname) {
        this.vendorSubname = vendorSubname;
    }

    @Basic
    @Column(name = "area_code", nullable = true, length = 8)
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
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
    @Column(name = "address", nullable = true, length = 80)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "post_code", nullable = true, length = 6)
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Basic
    @Column(name = "order_name", nullable = true, length = 20)
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Basic
    @Column(name = "order_zip", nullable = true, length = 6)
    public String getOrderZip() {
        return orderZip;
    }

    public void setOrderZip(String orderZip) {
        this.orderZip = orderZip;
    }

    @Basic
    @Column(name = "order_telno", nullable = true, length = 20)
    public String getOrderTelno() {
        return orderTelno;
    }

    public void setOrderTelno(String orderTelno) {
        this.orderTelno = orderTelno;
    }

    @Basic
    @Column(name = "order_fax", nullable = true, length = 20)
    public String getOrderFax() {
        return orderFax;
    }

    public void setOrderFax(String orderFax) {
        this.orderFax = orderFax;
    }

    @Basic
    @Column(name = "order_call", nullable = true, length = 20)
    public String getOrderCall() {
        return orderCall;
    }

    public void setOrderCall(String orderCall) {
        this.orderCall = orderCall;
    }

    @Basic
    @Column(name = "order_fixedcall", nullable = true, length = 20)
    public String getOrderFixedcall() {
        return orderFixedcall;
    }

    public void setOrderFixedcall(String orderFixedcall) {
        this.orderFixedcall = orderFixedcall;
    }

    @Basic
    @Column(name = "order_email", nullable = true, length = 20)
    public String getOrderEmail() {
        return orderEmail;
    }

    public void setOrderEmail(String orderEmail) {
        this.orderEmail = orderEmail;
    }

    @Basic
    @Column(name = "ceo_name", nullable = true, length = 20)
    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    @Basic
    @Column(name = "ceo_telno", nullable = true, length = 20)
    public String getCeoTelno() {
        return ceoTelno;
    }

    public void setCeoTelno(String ceoTelno) {
        this.ceoTelno = ceoTelno;
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
    @Column(name = "med_vendor_id", nullable = true, length = 13)
    public String getMedVendorId() {
        return medVendorId;
    }

    public void setMedVendorId(String medVendorId) {
        this.medVendorId = medVendorId;
    }

    @Basic
    @Column(name = "svr_vendor_id", nullable = true, length = 13)
    public String getSvrVendorId() {
        return svrVendorId;
    }

    public void setSvrVendorId(String svrVendorId) {
        this.svrVendorId = svrVendorId;
    }

    @Basic
    @Column(name = "oth_vendor_id", nullable = true, length = 13)
    public String getOthVendorId() {
        return othVendorId;
    }

    public void setOthVendorId(String othVendorId) {
        this.othVendorId = othVendorId;
    }

    @Basic
    @Column(name = "invite_tenant_id", nullable = true, length = 50)
    public String getInviteTenantId() {
        return inviteTenantId;
    }

    public void setInviteTenantId(String inviteTenantId) {
        this.inviteTenantId = inviteTenantId;
    }

    @Basic
    @Column(name = "invite_user_id", nullable = true, length = 20)
    public String getInviteUserId() {
        return inviteUserId;
    }

    public void setInviteUserId(String inviteUserId) {
        this.inviteUserId = inviteUserId;
    }

    @Basic
    @Column(name = "do_state", nullable = true, length = 20)
    public String getDoState() {
        return doState;
    }

    public void setDoState(String doState) {
        this.doState = doState;
    }

    @Basic
    @Column(name = "telno", nullable = true, length = 20)
    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    @Basic
    @Column(name = "supply_tenant_id", nullable = true, length = 50)
    public String getSupplyTenantId() {
        return supplyTenantId;
    }

    public void setSupplyTenantId(String supplyTenantId) {
        this.supplyTenantId = supplyTenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbVendor tbVendor = (TbVendor) o;
        return idx == tbVendor.idx &&
                Objects.equals(tenantId, tbVendor.tenantId) &&
                Objects.equals(vendorId, tbVendor.vendorId) &&
                Objects.equals(vendorType, tbVendor.vendorType) &&
                Objects.equals(vendorSubno, tbVendor.vendorSubno) &&
                Objects.equals(vendorName, tbVendor.vendorName) &&
                Objects.equals(vendorSubname, tbVendor.vendorSubname) &&
                Objects.equals(areaCode, tbVendor.areaCode) &&
                Objects.equals(state, tbVendor.state) &&
                Objects.equals(address, tbVendor.address) &&
                Objects.equals(postCode, tbVendor.postCode) &&
                Objects.equals(orderName, tbVendor.orderName) &&
                Objects.equals(orderZip, tbVendor.orderZip) &&
                Objects.equals(orderTelno, tbVendor.orderTelno) &&
                Objects.equals(orderFax, tbVendor.orderFax) &&
                Objects.equals(orderCall, tbVendor.orderCall) &&
                Objects.equals(orderFixedcall, tbVendor.orderFixedcall) &&
                Objects.equals(orderEmail, tbVendor.orderEmail) &&
                Objects.equals(ceoName, tbVendor.ceoName) &&
                Objects.equals(ceoTelno, tbVendor.ceoTelno) &&
                Objects.equals(createUser, tbVendor.createUser) &&
                Objects.equals(createTime, tbVendor.createTime) &&
                Objects.equals(medVendorId, tbVendor.medVendorId) &&
                Objects.equals(svrVendorId, tbVendor.svrVendorId) &&
                Objects.equals(othVendorId, tbVendor.othVendorId) &&
                Objects.equals(inviteTenantId, tbVendor.inviteTenantId) &&
                Objects.equals(inviteUserId, tbVendor.inviteUserId) &&
                Objects.equals(doState, tbVendor.doState) &&
                Objects.equals(telno, tbVendor.telno) &&
                Objects.equals(supplyTenantId, tbVendor.supplyTenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, vendorId, vendorType, vendorSubno, vendorName, vendorSubname, areaCode,
                state, address, postCode, orderName, orderZip, orderTelno, orderFax, orderCall, orderFixedcall, orderEmail, ceoName, ceoTelno, createUser, createTime, medVendorId, svrVendorId, othVendorId, inviteTenantId, inviteUserId, doState, telno, supplyTenantId);
    }
}
