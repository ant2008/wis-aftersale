package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_product_comment_reply")
public class TbProductCommentReply {
    private long idx;
    private String tenantId;
    private Long commentId;
    private String replyType;
    private String replyUserId;
    private String replyUserName;
    private String replyContent;
    private Integer state;
    private Timestamp createTime;
    private String createUser;
    private String replyPic1;
    private String replyPic2;
    private String replyPic3;
    private String replyPic4;
    private String replyPic5;
    private String avatarPic;

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
    @Column(name = "comment_id", nullable = true)
    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "reply_type", nullable = true, length = 20)
    public String getReplyType() {
        return replyType;
    }

    public void setReplyType(String replyType) {
        this.replyType = replyType;
    }

    @Basic
    @Column(name = "reply_user_id", nullable = true, length = 30)
    public String getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(String replyUserId) {
        this.replyUserId = replyUserId;
    }

    @Basic
    @Column(name = "reply_user_name", nullable = true, length = 30)
    public String getReplyUserName() {
        return replyUserName;
    }

    public void setReplyUserName(String replyUserName) {
        this.replyUserName = replyUserName;
    }

    @Basic
    @Column(name = "reply_content", nullable = true, length = -1)
    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
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
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
    @Column(name = "reply_pic1", nullable = true, length = 500)
    public String getReplyPic1() {
        return replyPic1;
    }

    public void setReplyPic1(String replyPic1) {
        this.replyPic1 = replyPic1;
    }

    @Basic
    @Column(name = "reply_pic2", nullable = true, length = 500)
    public String getReplyPic2() {
        return replyPic2;
    }

    public void setReplyPic2(String replyPic2) {
        this.replyPic2 = replyPic2;
    }

    @Basic
    @Column(name = "reply_pic3", nullable = true, length = 500)
    public String getReplyPic3() {
        return replyPic3;
    }

    public void setReplyPic3(String replyPic3) {
        this.replyPic3 = replyPic3;
    }

    @Basic
    @Column(name = "reply_pic4", nullable = true, length = 500)
    public String getReplyPic4() {
        return replyPic4;
    }

    public void setReplyPic4(String replyPic4) {
        this.replyPic4 = replyPic4;
    }

    @Basic
    @Column(name = "reply_pic5", nullable = true, length = 500)
    public String getReplyPic5() {
        return replyPic5;
    }

    public void setReplyPic5(String replyPic5) {
        this.replyPic5 = replyPic5;
    }

    @Basic
    @Column(name = "avatar_pic", nullable = true, length = 300)
    public String getAvatarPic() {
        return avatarPic;
    }

    public void setAvatarPic(String avatarPic) {
        this.avatarPic = avatarPic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbProductCommentReply that = (TbProductCommentReply) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(commentId, that.commentId) &&
                Objects.equals(replyType, that.replyType) &&
                Objects.equals(replyUserId, that.replyUserId) &&
                Objects.equals(replyUserName, that.replyUserName) &&
                Objects.equals(replyContent, that.replyContent) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(replyPic1, that.replyPic1) &&
                Objects.equals(replyPic2, that.replyPic2) &&
                Objects.equals(replyPic3, that.replyPic3) &&
                Objects.equals(replyPic4, that.replyPic4) &&
                Objects.equals(replyPic5, that.replyPic5) &&
                Objects.equals(avatarPic, that.avatarPic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, commentId, replyType, replyUserId, replyUserName, replyContent, state, createTime, createUser, replyPic1, replyPic2, replyPic3, replyPic4, replyPic5, avatarPic);
    }
}
