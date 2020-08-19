package com.wenc.commdomain.pojo.bus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "tb_retailsale_pay")
public class TbRetailsalePay {
    private long idx;
    private String tenantId;
    private String saleNo;
    private String payType;
    private String payClass;
    private String payCode;
    private BigDecimal payAmount;
    private BigDecimal payRate;
    private BigDecimal realAmount;
    private Integer rowTocol;

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
    @Column(name = "sale_no", nullable = true, length = 18)
    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    @Basic
    @Column(name = "pay_type", nullable = true, length = 20)
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Basic
    @Column(name = "pay_class", nullable = true, length = 20)
    public String getPayClass() {
        return payClass;
    }

    public void setPayClass(String payClass) {
        this.payClass = payClass;
    }

    @Basic
    @Column(name = "pay_code", nullable = true, length = 20)
    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    @Basic
    @Column(name = "pay_amount", nullable = true, precision = 6)
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    @Basic
    @Column(name = "pay_rate", nullable = true, precision = 6)
    public BigDecimal getPayRate() {
        return payRate;
    }

    public void setPayRate(BigDecimal payRate) {
        this.payRate = payRate;
    }

    @Basic
    @Column(name = "real_amount", nullable = true, precision = 6)
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    @Basic
    @Column(name = "row_tocol", nullable = true)
    public Integer getRowTocol() {
        return rowTocol;
    }

    public void setRowTocol(Integer rowTocol) {
        this.rowTocol = rowTocol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbRetailsalePay that = (TbRetailsalePay) o;
        return idx == that.idx &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(saleNo, that.saleNo) &&
                Objects.equals(payType, that.payType) &&
                Objects.equals(payClass, that.payClass) &&
                Objects.equals(payCode, that.payCode) &&
                Objects.equals(payAmount, that.payAmount) &&
                Objects.equals(payRate, that.payRate) &&
                Objects.equals(realAmount, that.realAmount) &&
                Objects.equals(rowTocol, that.rowTocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, saleNo, payType, payClass, payCode, payAmount, payRate, realAmount, rowTocol);
    }
}
