package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_mq_record")
public class TbMqRecord {
    private long idx;
    private String tenantId;
    private Timestamp mqDate;
    private String mqType;
    private String mqMessageTag;
    private String mqMessageId;
    private String mqMessageBody;
    private String mqMessageKey;
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
    @Column(name = "tenant_id", nullable = true, length = 50)
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "mq_date", nullable = true)
    public Timestamp getMqDate() {
        return mqDate;
    }

    public void setMqDate(Timestamp mqDate) {
        this.mqDate = mqDate;
    }

    @Basic
    @Column(name = "mq_type", nullable = true, length = 20)
    public String getMqType() {
        return mqType;
    }

    public void setMqType(String mqType) {
        this.mqType = mqType;
    }

    @Basic
    @Column(name = "mq_message_tag", nullable = true, length = 200)
    public String getMqMessageTag() {
        return mqMessageTag;
    }

    public void setMqMessageTag(String mqMessageTag) {
        this.mqMessageTag = mqMessageTag;
    }

    @Basic
    @Column(name = "mq_message_id", nullable = true, length = 200)
    public String getMqMessageId() {
        return mqMessageId;
    }

    public void setMqMessageId(String mqMessageId) {
        this.mqMessageId = mqMessageId;
    }

    @Basic
    @Column(name = "mq_message_body", nullable = true, length = 1000)
    public String getMqMessageBody() {
        return mqMessageBody;
    }

    public void setMqMessageBody(String mqMessageBody) {
        this.mqMessageBody = mqMessageBody;
    }

    @Basic
    @Column(name = "mq_message_key", nullable = true, length = 200)
    public String getMqMessageKey() {
        return mqMessageKey;
    }

    public void setMqMessageKey(String mqMessageKey) {
        this.mqMessageKey = mqMessageKey;
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
        TbMqRecord that = (TbMqRecord) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(mqDate, that.mqDate) &&
                Objects.equals(mqType, that.mqType) &&
                Objects.equals(mqMessageTag, that.mqMessageTag) &&
                Objects.equals(mqMessageId, that.mqMessageId) &&
                Objects.equals(mqMessageBody, that.mqMessageBody) &&
                Objects.equals(mqMessageKey, that.mqMessageKey) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, mqDate, mqType, mqMessageTag, mqMessageId, mqMessageBody, mqMessageKey, state, createUser, createTime);
    }
}
