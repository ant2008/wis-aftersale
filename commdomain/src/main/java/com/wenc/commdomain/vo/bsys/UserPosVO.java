package com.wenc.commdomain.vo.bsys;

import java.sql.Timestamp;

public class UserPosVO {

    private long idx;

    private String userId;
    private String posNo;
    private Integer state;
    private String userName;
    private String posDescr;

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPosDescr() {
        return posDescr;
    }

    public void setPosDescr(String posDescr) {
        this.posDescr = posDescr;
    }
}
