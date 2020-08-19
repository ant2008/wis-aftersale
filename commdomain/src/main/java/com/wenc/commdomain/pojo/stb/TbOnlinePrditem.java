package com.wenc.commdomain.pojo.stb;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tb_online_prditem")
public class TbOnlinePrditem {
    private long idx;
    private String estoreId;
    private String itemNo;
    private BigDecimal itemPrice;
    private String updateTime;
    private String classId;
    private String subClassId;
    private String freightType;
    private BigDecimal freightFee;
    private String imgUrl;
    private BigDecimal orginPrice;
    private String itemTitle;
    private String itemAlias;
    private String pageUrl;
    private String itemDescr;
    private BigDecimal salePrice;
    private String itemType;
    private String shareDescr;
    private String shareImg;
    private Integer itemSeq;
    private Timestamp createTime;
    private Timestamp downTime;
    private Integer state;
    private String doState;
    private BigDecimal stockQty;
    private Integer ifInvoice;
    private String outerId;
    private Integer soldQty;
    private Integer ifWarranty;
    private String tenantId;

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
    @Column(name = "estore_id", nullable = true, length = 50)
    public String getEstoreId() {
        return estoreId;
    }

    public void setEstoreId(String estoreId) {
        this.estoreId = estoreId;
    }

    @Basic
    @Column(name = "item_no", nullable = true, length = 100)
    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    @Basic
    @Column(name = "item_price", nullable = true, precision = 6)
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Basic
    @Column(name = "update_time", nullable = true, length = 20)
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "class_id", nullable = true, length = 20)
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "sub_class_id", nullable = true, length = 20)
    public String getSubClassId() {
        return subClassId;
    }

    public void setSubClassId(String subClassId) {
        this.subClassId = subClassId;
    }

    @Basic
    @Column(name = "freight_type", nullable = true, length = 20)
    public String getFreightType() {
        return freightType;
    }

    public void setFreightType(String freightType) {
        this.freightType = freightType;
    }

    @Basic
    @Column(name = "freight_fee", nullable = true, precision = 6)
    public BigDecimal getFreightFee() {
        return freightFee;
    }

    public void setFreightFee(BigDecimal freightFee) {
        this.freightFee = freightFee;
    }

    @Basic
    @Column(name = "img_url", nullable = true, length = 300)
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Basic
    @Column(name = "orgin_price", nullable = true, precision = 6)
    public BigDecimal getOrginPrice() {
        return orginPrice;
    }

    public void setOrginPrice(BigDecimal orginPrice) {
        this.orginPrice = orginPrice;
    }

    @Basic
    @Column(name = "item_title", nullable = true, length = 50)
    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    @Basic
    @Column(name = "item_alias", nullable = true, length = 50)
    public String getItemAlias() {
        return itemAlias;
    }

    public void setItemAlias(String itemAlias) {
        this.itemAlias = itemAlias;
    }

    @Basic
    @Column(name = "page_url", nullable = true, length = 300)
    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    @Basic
    @Column(name = "item_descr", nullable = true, length = 300)
    public String getItemDescr() {
        return itemDescr;
    }

    public void setItemDescr(String itemDescr) {
        this.itemDescr = itemDescr;
    }

    @Basic
    @Column(name = "sale_price", nullable = true, precision = 6)
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    @Basic
    @Column(name = "item_type", nullable = true, length = 20)
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Basic
    @Column(name = "share_descr", nullable = true, length = 200)
    public String getShareDescr() {
        return shareDescr;
    }

    public void setShareDescr(String shareDescr) {
        this.shareDescr = shareDescr;
    }

    @Basic
    @Column(name = "share_img", nullable = true, length = 300)
    public String getShareImg() {
        return shareImg;
    }

    public void setShareImg(String shareImg) {
        this.shareImg = shareImg;
    }

    @Basic
    @Column(name = "item_seq", nullable = true)
    public Integer getItemSeq() {
        return itemSeq;
    }

    public void setItemSeq(Integer itemSeq) {
        this.itemSeq = itemSeq;
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
    @Column(name = "down_time", nullable = true)
    public Timestamp getDownTime() {
        return downTime;
    }

    public void setDownTime(Timestamp downTime) {
        this.downTime = downTime;
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
    @Column(name = "do_state", nullable = true, length = 20)
    public String getDoState() {
        return doState;
    }

    public void setDoState(String doState) {
        this.doState = doState;
    }

    @Basic
    @Column(name = "stock_qty", nullable = true, precision = 6)
    public BigDecimal getStockQty() {
        return stockQty;
    }

    public void setStockQty(BigDecimal stockQty) {
        this.stockQty = stockQty;
    }

    @Basic
    @Column(name = "if_invoice", nullable = true)
    public Integer getIfInvoice() {
        return ifInvoice;
    }

    public void setIfInvoice(Integer ifInvoice) {
        this.ifInvoice = ifInvoice;
    }

    @Basic
    @Column(name = "outer_id", nullable = true, length = 100)
    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    @Basic
    @Column(name = "sold_qty", nullable = true)
    public Integer getSoldQty() {
        return soldQty;
    }

    public void setSoldQty(Integer soldQty) {
        this.soldQty = soldQty;
    }

    @Basic
    @Column(name = "if_warranty", nullable = true)
    public Integer getIfWarranty() {
        return ifWarranty;
    }

    public void setIfWarranty(Integer ifWarranty) {
        this.ifWarranty = ifWarranty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbOnlinePrditem that = (TbOnlinePrditem) o;
        return idx == that.idx &&
                Objects.equals(estoreId, that.estoreId) &&
                Objects.equals(itemNo, that.itemNo) &&
                Objects.equals(itemPrice, that.itemPrice) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(classId, that.classId) &&
                Objects.equals(subClassId, that.subClassId) &&
                Objects.equals(freightType, that.freightType) &&
                Objects.equals(freightFee, that.freightFee) &&
                Objects.equals(imgUrl, that.imgUrl) &&
                Objects.equals(orginPrice, that.orginPrice) &&
                Objects.equals(itemTitle, that.itemTitle) &&
                Objects.equals(itemAlias, that.itemAlias) &&
                Objects.equals(pageUrl, that.pageUrl) &&
                Objects.equals(itemDescr, that.itemDescr) &&
                Objects.equals(salePrice, that.salePrice) &&
                Objects.equals(itemType, that.itemType) &&
                Objects.equals(shareDescr, that.shareDescr) &&
                Objects.equals(shareImg, that.shareImg) &&
                Objects.equals(itemSeq, that.itemSeq) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(downTime, that.downTime) &&
                Objects.equals(state, that.state) &&
                Objects.equals(doState, that.doState) &&
                Objects.equals(stockQty, that.stockQty) &&
                Objects.equals(ifInvoice, that.ifInvoice) &&
                Objects.equals(outerId, that.outerId) &&
                Objects.equals(soldQty, that.soldQty) &&
                Objects.equals(ifWarranty, that.ifWarranty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, estoreId, itemNo, itemPrice, updateTime, classId, subClassId, freightType, freightFee, imgUrl, orginPrice, itemTitle, itemAlias, pageUrl, itemDescr, salePrice, itemType, shareDescr, shareImg, itemSeq, createTime, downTime, state, doState, stockQty, ifInvoice, outerId, soldQty, ifWarranty);
    }

    @Basic
    @Column(name = "tenant_id", nullable = true, length = 50)
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
