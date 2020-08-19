package com.wenc.commdomain.pojo.core;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "v_func_right")
public class VFuncRight {
    private long idx;
    private String userId;
    private String userName;
    private Integer userStatus;
    private Integer funcState;
    private Integer roleStatus;
    private String funcNo;
    private String parentNo;
    private String descr;
    private Integer funcActive;
    private Integer addr;
    private Integer modr;
    private Integer delr;
    private Integer prtr;
    private Integer chkr;
    private Integer othr;
    private Integer quyr;
    private Integer rfuncStatus;
    private String menuUrl;
    private String menuImg;
    private String menuorder;
    private String menuPath;
    private String tenantId;

    @Id
    @Basic
    @Column(name = "idx", nullable = true)
    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    @Basic
    @Column(name = "user_id", nullable = true, length = 20)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name", nullable = true, length = 50)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_status", nullable = true)
    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Basic
    @Column(name = "func_state", nullable = true)
    public Integer getFuncState() {
        return funcState;
    }

    public void setFuncState(Integer funcState) {
        this.funcState = funcState;
    }

    @Basic
    @Column(name = "role_status", nullable = true)
    public Integer getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
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
    @Column(name = "parent_no", nullable = true, length = 20)
    public String getParentNo() {
        return parentNo;
    }

    public void setParentNo(String parentNo) {
        this.parentNo = parentNo;
    }

    @Basic
    @Column(name = "descr", nullable = true, length = 50)
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Basic
    @Column(name = "func_active", nullable = true)
    public Integer getFuncActive() {
        return funcActive;
    }

    public void setFuncActive(Integer funcActive) {
        this.funcActive = funcActive;
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
    @Column(name = "chkr", nullable = true)
    public Integer getChkr() {
        return chkr;
    }

    public void setChkr(Integer chkr) {
        this.chkr = chkr;
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
    @Column(name = "quyr", nullable = true)
    public Integer getQuyr() {
        return quyr;
    }

    public void setQuyr(Integer quyr) {
        this.quyr = quyr;
    }

    @Basic
    @Column(name = "rfunc_status", nullable = true)
    public Integer getRfuncStatus() {
        return rfuncStatus;
    }

    public void setRfuncStatus(Integer rfuncStatus) {
        this.rfuncStatus = rfuncStatus;
    }

    @Basic
    @Column(name = "menu_url", nullable = true, length = -1)
    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @Basic
    @Column(name = "menu_img", nullable = true, length = -1)
    public String getMenuImg() {
        return menuImg;
    }

    public void setMenuImg(String menuImg) {
        this.menuImg = menuImg;
    }

    @Basic
    @Column(name = "menuorder", nullable = true, length = -1)
    public String getMenuorder() {
        return menuorder;
    }

    public void setMenuorder(String menuorder) {
        this.menuorder = menuorder;
    }

    @Basic
    @Column(name = "menu_path", nullable = true, length = -1)
    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath;
    }

    @Basic
    @Column(name = "tenant_id", nullable = true, length = -1)
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VFuncRight that = (VFuncRight) o;
        return Objects.equals(idx, that.idx) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userStatus, that.userStatus) &&
                Objects.equals(funcState, that.funcState) &&
                Objects.equals(roleStatus, that.roleStatus) &&
                Objects.equals(funcNo, that.funcNo) &&
                Objects.equals(parentNo, that.parentNo) &&
                Objects.equals(descr, that.descr) &&
                Objects.equals(funcActive, that.funcActive) &&
                Objects.equals(addr, that.addr) &&
                Objects.equals(modr, that.modr) &&
                Objects.equals(delr, that.delr) &&
                Objects.equals(prtr, that.prtr) &&
                Objects.equals(chkr, that.chkr) &&
                Objects.equals(othr, that.othr) &&
                Objects.equals(quyr, that.quyr) &&
                Objects.equals(rfuncStatus, that.rfuncStatus) &&
                Objects.equals(menuUrl, that.menuUrl) &&
                Objects.equals(menuImg, that.menuImg) &&
                Objects.equals(menuorder, that.menuorder) &&
                Objects.equals(menuPath, that.menuPath) &&
                Objects.equals(tenantId, that.tenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, userId, userName, userStatus, funcState, roleStatus, funcNo, parentNo, descr, funcActive, addr, modr, delr, prtr, chkr, othr, quyr, rfuncStatus, menuUrl, menuImg, menuorder, menuPath, tenantId);
    }
}
