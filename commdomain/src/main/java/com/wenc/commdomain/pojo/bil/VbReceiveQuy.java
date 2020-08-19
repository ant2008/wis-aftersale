package com.wenc.commdomain.pojo.bil;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vb_receive_quy")
public class VbReceiveQuy {
    private long idx;
    private String tenantId;
    private String receiveNo;
    private Integer enterNo;
    private String itemId;
    private String barCode;
    private String shipNo;
    private String shelf;
    private BigDecimal orderPrice;
    private BigDecimal purPrice;
    private BigDecimal purTax;
    private BigDecimal purQty;
    private BigDecimal salePrice;
    private BigDecimal saleTax;
    private Timestamp overdueDate;
    private BigDecimal rebate;
    private BigDecimal tariff;
    private BigDecimal rate;
    private BigDecimal othRate1;
    private BigDecimal othRate2;
    private String dnotes;
    private Short flag;
    private BigDecimal itempackNum;
    private BigDecimal cmpackNum;
    private Timestamp makeTime;
    private BigDecimal taxRate;
    private BigDecimal taxAmt;
    private BigDecimal attaxPrice;
    private BigDecimal attaxAmt;
    private BigDecimal saleAmt;
    private BigDecimal purAmt;
    private String itemName;
    private String itemSpec;
    private String itemUnit;
    private String prdOrigin;
    private String prdFactory;
    private long aidx;
    private String tallyNo;
    private String orderNo;
    private String contNo;
    private String vendorId;
    private String vendorName;
    private String payeeType;
    private String depotId;
    private String departId;
    private String buyerId;
    private String receiveUserId;
    private Timestamp receiveDate;
    private Timestamp payDate;
    private BigDecimal discountAmt;
    private String invoiceNo;
    private String invoiceType;
    private String deliveryNo;
    private BigDecimal delverySumamt;
    private String vouchNo;
    private String allocateNo;
    private String returnNo;
    private Timestamp execDate;
    private Byte state;
    private Byte chgNo;
    private Byte receiveType;
    private String createUser;
    private Timestamp createTime;
    private String anotes;
    private Integer chkBit;

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
    @Column(name = "receive_no", nullable = true, length = 20)
    public String getReceiveNo() {
        return receiveNo;
    }

    public void setReceiveNo(String receiveNo) {
        this.receiveNo = receiveNo;
    }

    @Basic
    @Column(name = "enter_no", nullable = true)
    public Integer getEnterNo() {
        return enterNo;
    }

    public void setEnterNo(Integer enterNo) {
        this.enterNo = enterNo;
    }

    @Basic
    @Column(name = "item_id", nullable = false, length = 13)
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "bar_code", nullable = true, length = 13)
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Basic
    @Column(name = "ship_no", nullable = true, length = 15)
    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    @Basic
    @Column(name = "shelf", nullable = true, length = 18)
    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @Basic
    @Column(name = "order_price", nullable = true, precision = 6)
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Basic
    @Column(name = "pur_price", nullable = true, precision = 6)
    public BigDecimal getPurPrice() {
        return purPrice;
    }

    public void setPurPrice(BigDecimal purPrice) {
        this.purPrice = purPrice;
    }

    @Basic
    @Column(name = "pur_tax", nullable = true, precision = 2)
    public BigDecimal getPurTax() {
        return purTax;
    }

    public void setPurTax(BigDecimal purTax) {
        this.purTax = purTax;
    }

    @Basic
    @Column(name = "pur_qty", nullable = true, precision = 3)
    public BigDecimal getPurQty() {
        return purQty;
    }

    public void setPurQty(BigDecimal purQty) {
        this.purQty = purQty;
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
    @Column(name = "sale_tax", nullable = true, precision = 2)
    public BigDecimal getSaleTax() {
        return saleTax;
    }

    public void setSaleTax(BigDecimal saleTax) {
        this.saleTax = saleTax;
    }

    @Basic
    @Column(name = "overdue_date", nullable = true)
    public Timestamp getOverdueDate() {
        return overdueDate;
    }

    public void setOverdueDate(Timestamp overdueDate) {
        this.overdueDate = overdueDate;
    }

    @Basic
    @Column(name = "rebate", nullable = true, precision = 6)
    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    @Basic
    @Column(name = "tariff", nullable = true, precision = 6)
    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    @Basic
    @Column(name = "rate", nullable = true, precision = 6)
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "oth_rate1", nullable = true, precision = 6)
    public BigDecimal getOthRate1() {
        return othRate1;
    }

    public void setOthRate1(BigDecimal othRate1) {
        this.othRate1 = othRate1;
    }

    @Basic
    @Column(name = "oth_rate2", nullable = true, precision = 6)
    public BigDecimal getOthRate2() {
        return othRate2;
    }

    public void setOthRate2(BigDecimal othRate2) {
        this.othRate2 = othRate2;
    }

    @Basic
    @Column(name = "dnotes", nullable = true, length = 60)
    public String getDnotes() {
        return dnotes;
    }

    public void setDnotes(String dnotes) {
        this.dnotes = dnotes;
    }

    @Basic
    @Column(name = "flag", nullable = true)
    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "itempack_num", nullable = true, precision = 3)
    public BigDecimal getItempackNum() {
        return itempackNum;
    }

    public void setItempackNum(BigDecimal itempackNum) {
        this.itempackNum = itempackNum;
    }

    @Basic
    @Column(name = "cmpack_num", nullable = true, precision = 3)
    public BigDecimal getCmpackNum() {
        return cmpackNum;
    }

    public void setCmpackNum(BigDecimal cmpackNum) {
        this.cmpackNum = cmpackNum;
    }

    @Basic
    @Column(name = "make_time", nullable = true)
    public Timestamp getMakeTime() {
        return makeTime;
    }

    public void setMakeTime(Timestamp makeTime) {
        this.makeTime = makeTime;
    }

    @Basic
    @Column(name = "tax_rate", nullable = true, precision = 3)
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    @Basic
    @Column(name = "tax_amt", nullable = true, precision = 6)
    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
    }

    @Basic
    @Column(name = "attax_price", nullable = true, precision = 6)
    public BigDecimal getAttaxPrice() {
        return attaxPrice;
    }

    public void setAttaxPrice(BigDecimal attaxPrice) {
        this.attaxPrice = attaxPrice;
    }

    @Basic
    @Column(name = "attax_amt", nullable = true, precision = 6)
    public BigDecimal getAttaxAmt() {
        return attaxAmt;
    }

    public void setAttaxAmt(BigDecimal attaxAmt) {
        this.attaxAmt = attaxAmt;
    }

    @Basic
    @Column(name = "sale_amt", nullable = true, precision = 6)
    public BigDecimal getSaleAmt() {
        return saleAmt;
    }

    public void setSaleAmt(BigDecimal saleAmt) {
        this.saleAmt = saleAmt;
    }

    @Basic
    @Column(name = "pur_amt", nullable = true, precision = 6)
    public BigDecimal getPurAmt() {
        return purAmt;
    }

    public void setPurAmt(BigDecimal purAmt) {
        this.purAmt = purAmt;
    }

    @Basic
    @Column(name = "item_name", nullable = true, length = 100)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "item_spec", nullable = true, length = 80)
    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    @Basic
    @Column(name = "item_unit", nullable = true, length = 3)
    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    @Basic
    @Column(name = "prd_origin", nullable = true, length = 20)
    public String getPrdOrigin() {
        return prdOrigin;
    }

    public void setPrdOrigin(String prdOrigin) {
        this.prdOrigin = prdOrigin;
    }

    @Basic
    @Column(name = "prd_factory", nullable = true, length = 60)
    public String getPrdFactory() {
        return prdFactory;
    }

    public void setPrdFactory(String prdFactory) {
        this.prdFactory = prdFactory;
    }

    @Basic
    @Column(name = "aidx", nullable = false)
    public long getAidx() {
        return aidx;
    }

    public void setAidx(long aidx) {
        this.aidx = aidx;
    }

    @Basic
    @Column(name = "tally_no", nullable = true, length = 20)
    public String getTallyNo() {
        return tallyNo;
    }

    public void setTallyNo(String tallyNo) {
        this.tallyNo = tallyNo;
    }

    @Basic
    @Column(name = "order_no", nullable = true, length = 20)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "cont_no", nullable = true, length = 20)
    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo;
    }

    @Basic
    @Column(name = "vendor_id", nullable = true, length = 13)
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
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
    @Column(name = "payee_type", nullable = true, length = 3)
    public String getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(String payeeType) {
        this.payeeType = payeeType;
    }

    @Basic
    @Column(name = "depot_id", nullable = true, length = 15)
    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    @Basic
    @Column(name = "depart_id", nullable = true, length = 8)
    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    @Basic
    @Column(name = "buyer_id", nullable = true, length = 8)
    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    @Basic
    @Column(name = "receive_user_id", nullable = true, length = 8)
    public String getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(String receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    @Basic
    @Column(name = "receive_date", nullable = true)
    public Timestamp getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Timestamp receiveDate) {
        this.receiveDate = receiveDate;
    }

    @Basic
    @Column(name = "pay_date", nullable = true)
    public Timestamp getPayDate() {
        return payDate;
    }

    public void setPayDate(Timestamp payDate) {
        this.payDate = payDate;
    }

    @Basic
    @Column(name = "discount_amt", nullable = true, precision = 2)
    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(BigDecimal discountAmt) {
        this.discountAmt = discountAmt;
    }

    @Basic
    @Column(name = "invoice_no", nullable = true, length = 20)
    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @Basic
    @Column(name = "invoice_type", nullable = true, length = 20)
    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    @Basic
    @Column(name = "delivery_no", nullable = true, length = 20)
    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    @Basic
    @Column(name = "delvery_sumamt", nullable = true, precision = 6)
    public BigDecimal getDelverySumamt() {
        return delverySumamt;
    }

    public void setDelverySumamt(BigDecimal delverySumamt) {
        this.delverySumamt = delverySumamt;
    }

    @Basic
    @Column(name = "vouch_no", nullable = true, length = 12)
    public String getVouchNo() {
        return vouchNo;
    }

    public void setVouchNo(String vouchNo) {
        this.vouchNo = vouchNo;
    }

    @Basic
    @Column(name = "allocate_no", nullable = true, length = 12)
    public String getAllocateNo() {
        return allocateNo;
    }

    public void setAllocateNo(String allocateNo) {
        this.allocateNo = allocateNo;
    }

    @Basic
    @Column(name = "return_no", nullable = true, length = 12)
    public String getReturnNo() {
        return returnNo;
    }

    public void setReturnNo(String returnNo) {
        this.returnNo = returnNo;
    }

    @Basic
    @Column(name = "exec_date", nullable = true)
    public Timestamp getExecDate() {
        return execDate;
    }

    public void setExecDate(Timestamp execDate) {
        this.execDate = execDate;
    }

    @Basic
    @Column(name = "state", nullable = true)
    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    @Basic
    @Column(name = "chg_no", nullable = true)
    public Byte getChgNo() {
        return chgNo;
    }

    public void setChgNo(Byte chgNo) {
        this.chgNo = chgNo;
    }

    @Basic
    @Column(name = "receive_type", nullable = true)
    public Byte getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(Byte receiveType) {
        this.receiveType = receiveType;
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
    @Column(name = "anotes", nullable = true, length = 60)
    public String getAnotes() {
        return anotes;
    }

    public void setAnotes(String anotes) {
        this.anotes = anotes;
    }

    @Basic
    @Column(name = "chk_bit", nullable = true)
    public Integer getChkBit() {
        return chkBit;
    }

    public void setChkBit(Integer chkBit) {
        this.chkBit = chkBit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VbReceiveQuy that = (VbReceiveQuy) o;
        return idx == that.idx &&
                aidx == that.aidx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(receiveNo, that.receiveNo) &&
                Objects.equals(enterNo, that.enterNo) &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(barCode, that.barCode) &&
                Objects.equals(shipNo, that.shipNo) &&
                Objects.equals(shelf, that.shelf) &&
                Objects.equals(orderPrice, that.orderPrice) &&
                Objects.equals(purPrice, that.purPrice) &&
                Objects.equals(purTax, that.purTax) &&
                Objects.equals(purQty, that.purQty) &&
                Objects.equals(salePrice, that.salePrice) &&
                Objects.equals(saleTax, that.saleTax) &&
                Objects.equals(overdueDate, that.overdueDate) &&
                Objects.equals(rebate, that.rebate) &&
                Objects.equals(tariff, that.tariff) &&
                Objects.equals(rate, that.rate) &&
                Objects.equals(othRate1, that.othRate1) &&
                Objects.equals(othRate2, that.othRate2) &&
                Objects.equals(dnotes, that.dnotes) &&
                Objects.equals(flag, that.flag) &&
                Objects.equals(itempackNum, that.itempackNum) &&
                Objects.equals(cmpackNum, that.cmpackNum) &&
                Objects.equals(makeTime, that.makeTime) &&
                Objects.equals(taxRate, that.taxRate) &&
                Objects.equals(taxAmt, that.taxAmt) &&
                Objects.equals(attaxPrice, that.attaxPrice) &&
                Objects.equals(attaxAmt, that.attaxAmt) &&
                Objects.equals(saleAmt, that.saleAmt) &&
                Objects.equals(purAmt, that.purAmt) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemSpec, that.itemSpec) &&
                Objects.equals(itemUnit, that.itemUnit) &&
                Objects.equals(prdOrigin, that.prdOrigin) &&
                Objects.equals(prdFactory, that.prdFactory) &&
                Objects.equals(tallyNo, that.tallyNo) &&
                Objects.equals(orderNo, that.orderNo) &&
                Objects.equals(contNo, that.contNo) &&
                Objects.equals(vendorId, that.vendorId) &&
                Objects.equals(vendorName, that.vendorName) &&
                Objects.equals(payeeType, that.payeeType) &&
                Objects.equals(depotId, that.depotId) &&
                Objects.equals(departId, that.departId) &&
                Objects.equals(buyerId, that.buyerId) &&
                Objects.equals(receiveUserId, that.receiveUserId) &&
                Objects.equals(receiveDate, that.receiveDate) &&
                Objects.equals(payDate, that.payDate) &&
                Objects.equals(discountAmt, that.discountAmt) &&
                Objects.equals(invoiceNo, that.invoiceNo) &&
                Objects.equals(invoiceType, that.invoiceType) &&
                Objects.equals(deliveryNo, that.deliveryNo) &&
                Objects.equals(delverySumamt, that.delverySumamt) &&
                Objects.equals(vouchNo, that.vouchNo) &&
                Objects.equals(allocateNo, that.allocateNo) &&
                Objects.equals(returnNo, that.returnNo) &&
                Objects.equals(execDate, that.execDate) &&
                Objects.equals(state, that.state) &&
                Objects.equals(chgNo, that.chgNo) &&
                Objects.equals(receiveType, that.receiveType) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(anotes, that.anotes) &&
                Objects.equals(chkBit, that.chkBit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, receiveNo, enterNo, itemId, barCode, shipNo, shelf, orderPrice, purPrice,
                purTax, purQty, salePrice, saleTax, overdueDate, rebate, tariff, rate, othRate1, othRate2, dnotes,
                flag, itempackNum, cmpackNum, makeTime, taxRate, taxAmt, attaxPrice, attaxAmt, saleAmt, purAmt,
                itemName, itemSpec, itemUnit, prdOrigin, prdFactory, aidx, tallyNo, orderNo, contNo, vendorId, vendorName, payeeType, depotId, departId, buyerId, receiveUserId, receiveDate, payDate, discountAmt, invoiceNo, invoiceType, deliveryNo, delverySumamt, vouchNo, allocateNo, returnNo, execDate, state, chgNo, receiveType, createUser, createTime, anotes, chkBit);
    }
}
