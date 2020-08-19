package com.wenc.commdomain.vo.bsys;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_user_pos")
public class VbUserPos {
    private long idx;
    private String tenantId;
    private String userId;
    private String posNo;
    private Integer state;
    private String defaPos;
    private String createUser;
    private Timestamp createTime;
    private String userName;
    private String posDescr;

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
    @Column(name = "tenant_id", nullable = true, length = 50)
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
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
    @Column(name = "pos_no", nullable = true, length = 20)
    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
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
    @Column(name = "defa_pos", nullable = true, length = 20)
    public String getDefaPos() {
        return defaPos;
    }

    public void setDefaPos(String defaPos) {
        this.defaPos = defaPos;
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
    @Column(name = "user_name", nullable = true, length = 50)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "pos_descr", nullable = true, length = 40)
    public String getPosDescr() {
        return posDescr;
    }

    public void setPosDescr(String posDescr) {
        this.posDescr = posDescr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbUserPos vbUserPos = (VbUserPos) o;
        return idx == vbUserPos.idx &&
                Objects.equals(tenantId, vbUserPos.tenantId) &&
                Objects.equals(userId, vbUserPos.userId) &&
                Objects.equals(posNo, vbUserPos.posNo) &&
                Objects.equals(state, vbUserPos.state) &&
                Objects.equals(defaPos, vbUserPos.defaPos) &&
                Objects.equals(createUser, vbUserPos.createUser) &&
                Objects.equals(createTime, vbUserPos.createTime) &&
                Objects.equals(userName, vbUserPos.userName) &&
                Objects.equals(posDescr, vbUserPos.posDescr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, userId, posNo, state, defaPos, createUser, createTime, userName, posDescr);
    }
}
