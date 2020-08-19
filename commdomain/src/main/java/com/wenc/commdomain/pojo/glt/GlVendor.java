package com.wenc.commdomain.pojo.glt;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "gl_vendor", schema = "sitesel_devp", catalog = "")
public class GlVendor {
    private long idx;
    private String tenantId;
    private String scopeFlag;
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
    @Column(name = "scope_flag", nullable = true, length = 20)
    public String getScopeFlag() {
        return scopeFlag;
    }

    public void setScopeFlag(String scopeFlag) {
        this.scopeFlag = scopeFlag;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GlVendor glVendor = (GlVendor) o;
        return idx == glVendor.idx &&
                Objects.equals(tenantId, glVendor.tenantId) &&
                Objects.equals(scopeFlag, glVendor.scopeFlag) &&
                Objects.equals(vendorId, glVendor.vendorId) &&
                Objects.equals(vendorType, glVendor.vendorType) &&
                Objects.equals(vendorSubno, glVendor.vendorSubno) &&
                Objects.equals(vendorName, glVendor.vendorName) &&
                Objects.equals(vendorSubname, glVendor.vendorSubname) &&
                Objects.equals(areaCode, glVendor.areaCode) &&
                Objects.equals(state, glVendor.state) &&
                Objects.equals(address, glVendor.address) &&
                Objects.equals(postCode, glVendor.postCode) &&
                Objects.equals(orderName, glVendor.orderName) &&
                Objects.equals(orderZip, glVendor.orderZip) &&
                Objects.equals(orderTelno, glVendor.orderTelno) &&
                Objects.equals(orderFax, glVendor.orderFax) &&
                Objects.equals(orderCall, glVendor.orderCall) &&
                Objects.equals(orderFixedcall, glVendor.orderFixedcall) &&
                Objects.equals(orderEmail, glVendor.orderEmail) &&
                Objects.equals(ceoName, glVendor.ceoName) &&
                Objects.equals(ceoTelno, glVendor.ceoTelno) &&
                Objects.equals(createUser, glVendor.createUser) &&
                Objects.equals(createTime, glVendor.createTime) &&
                Objects.equals(medVendorId, glVendor.medVendorId) &&
                Objects.equals(svrVendorId, glVendor.svrVendorId) &&
                Objects.equals(othVendorId, glVendor.othVendorId) &&
                Objects.equals(inviteTenantId, glVendor.inviteTenantId) &&
                Objects.equals(inviteUserId, glVendor.inviteUserId) &&
                Objects.equals(doState, glVendor.doState) &&
                Objects.equals(telno, glVendor.telno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, scopeFlag, vendorId, vendorType, vendorSubno, vendorName, vendorSubname,
                areaCode, state, address, postCode, orderName, orderZip, orderTelno, orderFax, orderCall, orderFixedcall, orderEmail, ceoName, ceoTelno, createUser, createTime, medVendorId, svrVendorId, othVendorId, inviteTenantId, inviteUserId, doState, telno);
    }
}
