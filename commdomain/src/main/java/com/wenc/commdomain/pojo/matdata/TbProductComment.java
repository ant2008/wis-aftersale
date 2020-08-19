package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_product_comment")
public class TbProductComment {
    private long idx;
    private String tenantId;
    private String itemId;
    private String itemName;
    private Integer star;
    private String commentUserId;
    private String commentUserName;
    private String commentContent;
    private Integer state;
    private Integer readNum;
    private Integer replyNum;
    private Integer collectNum;
    private Timestamp createTime;
    private String createUser;
    private String commentPic1;
    private String commentPic2;
    private String commentPic3;
    private String commentPic4;
    private String commentPic5;
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
    @Column(name = "item_id", nullable = true, length = 30)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "item_name", nullable = true, length = 200)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "star", nullable = true)
    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    @Basic
    @Column(name = "comment_user_id", nullable = true, length = 30)
    public String getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(String commentUserId) {
        this.commentUserId = commentUserId;
    }

    @Basic
    @Column(name = "comment_user_name", nullable = true, length = 30)
    public String getCommentUserName() {
        return commentUserName;
    }

    public void setCommentUserName(String commentUserName) {
        this.commentUserName = commentUserName;
    }

    @Basic
    @Column(name = "comment_content", nullable = true, length = -1)
    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
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
    @Column(name = "read_num", nullable = true)
    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    @Basic
    @Column(name = "reply_num", nullable = true)
    public Integer getReplyNum() {
        return replyNum;
    }

    public void setReplyNum(Integer replyNum) {
        this.replyNum = replyNum;
    }

    @Basic
    @Column(name = "collect_num", nullable = true)
    public Integer getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(Integer collectNum) {
        this.collectNum = collectNum;
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
    @Column(name = "create_user", nullable = true, length = 50)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "comment_pic1", nullable = true, length = 500)
    public String getCommentPic1() {
        return commentPic1;
    }

    public void setCommentPic1(String commentPic1) {
        this.commentPic1 = commentPic1;
    }

    @Basic
    @Column(name = "comment_pic2", nullable = true, length = 500)
    public String getCommentPic2() {
        return commentPic2;
    }

    public void setCommentPic2(String commentPic2) {
        this.commentPic2 = commentPic2;
    }

    @Basic
    @Column(name = "comment_pic3", nullable = true, length = 500)
    public String getCommentPic3() {
        return commentPic3;
    }

    public void setCommentPic3(String commentPic3) {
        this.commentPic3 = commentPic3;
    }

    @Basic
    @Column(name = "comment_pic4", nullable = true, length = 500)
    public String getCommentPic4() {
        return commentPic4;
    }

    public void setCommentPic4(String commentPic4) {
        this.commentPic4 = commentPic4;
    }

    @Basic
    @Column(name = "comment_pic5", nullable = true, length = 500)
    public String getCommentPic5() {
        return commentPic5;
    }

    public void setCommentPic5(String commentPic5) {
        this.commentPic5 = commentPic5;
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
        TbProductComment that = (TbProductComment) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(star, that.star) &&
                Objects.equals(commentUserId, that.commentUserId) &&
                Objects.equals(commentUserName, that.commentUserName) &&
                Objects.equals(commentContent, that.commentContent) &&
                Objects.equals(state, that.state) &&
                Objects.equals(readNum, that.readNum) &&
                Objects.equals(replyNum, that.replyNum) &&
                Objects.equals(collectNum, that.collectNum) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(commentPic1, that.commentPic1) &&
                Objects.equals(commentPic2, that.commentPic2) &&
                Objects.equals(commentPic3, that.commentPic3) &&
                Objects.equals(commentPic4, that.commentPic4) &&
                Objects.equals(commentPic5, that.commentPic5) &&
                Objects.equals(avatarPic, that.avatarPic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, itemId, itemName, star, commentUserId, commentUserName, commentContent,
                state, readNum, replyNum, collectNum, createTime, createUser, commentPic1, commentPic2, commentPic3, commentPic4, commentPic5, avatarPic);
    }
}
