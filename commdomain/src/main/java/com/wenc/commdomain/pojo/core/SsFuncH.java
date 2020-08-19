package com.wenc.commdomain.pojo.core;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ss_func_h")
public class SsFuncH {
    private long idx;
    private String tenantId;
    private String funcNo;
    private String descr;
    private String parentNo;
    private Integer levels;
    private Integer actr;
    private Integer addr;
    private Integer modr;
    private Integer delr;
    private Integer quyr;
    private Integer prnr;
    private Integer othr;
    private Integer chkr;
    private String funcOrder;
    private Integer state;
    private String flag;
    private String createUser;
    private Timestamp createTime;
    private Timestamp lastmodify;
    private String menuImg;
    private String menuUrl;
    private String menuPath;

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
    @Column(name = "func_no", nullable = true, length = 20)
    public String getFuncNo() {
        return funcNo;
    }

    public void setFuncNo(String funcNo) {
        this.funcNo = funcNo;
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
    @Column(name = "parent_no", nullable = true, length = 20)
    public String getParentNo() {
        return parentNo;
    }

    public void setParentNo(String parentNo) {
        this.parentNo = parentNo;
    }

    @Basic
    @Column(name = "levels", nullable = true)
    public Integer getLevels() {
        return levels;
    }

    public void setLevels(Integer levels) {
        this.levels = levels;
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
    @Column(name = "quyr", nullable = true)
    public Integer getQuyr() {
        return quyr;
    }

    public void setQuyr(Integer quyr) {
        this.quyr = quyr;
    }

    @Basic
    @Column(name = "prnr", nullable = true)
    public Integer getPrnr() {
        return prnr;
    }

    public void setPrnr(Integer prnr) {
        this.prnr = prnr;
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
    @Column(name = "func_order", nullable = true, length = 10)
    public String getFuncOrder() {
        return funcOrder;
    }

    public void setFuncOrder(String funcOrder) {
        this.funcOrder = funcOrder;
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

    @Basic
    @Column(name = "menu_img", nullable = true, length = 300)
    public String getMenuImg() {
        return menuImg;
    }

    public void setMenuImg(String menuImg) {
        this.menuImg = menuImg;
    }

    @Basic
    @Column(name = "menu_url", nullable = true, length = 300)
    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @Basic
    @Column(name = "menu_path", nullable = true, length = 300)
    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SsFuncH ssFuncH = (SsFuncH) o;
        return idx == ssFuncH.idx &&
                Objects.equals(tenantId, ssFuncH.tenantId) &&
                Objects.equals(funcNo, ssFuncH.funcNo) &&
                Objects.equals(descr, ssFuncH.descr) &&
                Objects.equals(parentNo, ssFuncH.parentNo) &&
                Objects.equals(levels, ssFuncH.levels) &&
                Objects.equals(actr, ssFuncH.actr) &&
                Objects.equals(addr, ssFuncH.addr) &&
                Objects.equals(modr, ssFuncH.modr) &&
                Objects.equals(delr, ssFuncH.delr) &&
                Objects.equals(quyr, ssFuncH.quyr) &&
                Objects.equals(prnr, ssFuncH.prnr) &&
                Objects.equals(othr, ssFuncH.othr) &&
                Objects.equals(chkr, ssFuncH.chkr) &&
                Objects.equals(funcOrder, ssFuncH.funcOrder) &&
                Objects.equals(state, ssFuncH.state) &&
                Objects.equals(flag, ssFuncH.flag) &&
                Objects.equals(createUser, ssFuncH.createUser) &&
                Objects.equals(createTime, ssFuncH.createTime) &&
                Objects.equals(lastmodify, ssFuncH.lastmodify) &&
                Objects.equals(menuImg, ssFuncH.menuImg) &&
                Objects.equals(menuUrl, ssFuncH.menuUrl) &&
                Objects.equals(menuPath, ssFuncH.menuPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, funcNo, descr, parentNo, levels, actr, addr, modr, delr, quyr, prnr, othr, chkr, funcOrder, state, flag, createUser, createTime, lastmodify, menuImg, menuUrl, menuPath);
    }
}
