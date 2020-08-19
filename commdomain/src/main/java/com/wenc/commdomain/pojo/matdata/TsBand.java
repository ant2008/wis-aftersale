package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ts_band")
public class TsBand {
    private long idx;
    private String bandCode;
    private String bandName;
    private Integer state;
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
    @Column(name = "band_code", nullable = true, length = 20)
    public String getBandCode() {
        return bandCode;
    }

    public void setBandCode(String bandCode) {
        this.bandCode = bandCode;
    }

    @Basic
    @Column(name = "band_name", nullable = true, length = 50)
    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TsBand tsBand = (TsBand) o;
        return idx == tsBand.idx &&
                Objects.equals(bandCode, tsBand.bandCode) &&
                Objects.equals(bandName, tsBand.bandName) &&
                Objects.equals(state, tsBand.state) &&
                Objects.equals(createUser, tsBand.createUser) &&
                Objects.equals(createTime, tsBand.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, bandCode, bandName, state, createUser, createTime);
    }
}
