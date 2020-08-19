package com.wenc.commdomain.pojo.shop;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "tb_retailsale_sum_d")
public class TbRetailsaleSumD {
    private long idx;
    private String retailsaleSumNo;
    private String tenantId;
    private String payType;
    private String payTypeName;
    private BigDecimal realsumAmt;
    private BigDecimal paysumAmt;

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
    @Column(name = "retailsale_sum_no", nullable = true, length = 30)
    public String getRetailsaleSumNo() {
        return retailsaleSumNo;
    }

    public void setRetailsaleSumNo(String retailsaleSumNo) {
        this.retailsaleSumNo = retailsaleSumNo;
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
    @Column(name = "pay_type", nullable = true, length = 30)
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Basic
    @Column(name = "pay_type_name", nullable = true, length = 30)
    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName;
    }

    @Basic
    @Column(name = "realsum_amt", nullable = true, precision = 6)
    public BigDecimal getRealsumAmt() {
        return realsumAmt;
    }

    public void setRealsumAmt(BigDecimal realsumAmt) {
        this.realsumAmt = realsumAmt;
    }

    @Basic
    @Column(name = "paysum_amt", nullable = true, precision = 6)
    public BigDecimal getPaysumAmt() {
        return paysumAmt;
    }

    public void setPaysumAmt(BigDecimal paysumAmt) {
        this.paysumAmt = paysumAmt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbRetailsaleSumD that = (TbRetailsaleSumD) o;
        return idx == that.idx &&
                Objects.equals(retailsaleSumNo, that.retailsaleSumNo) &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(payType, that.payType) &&
                Objects.equals(payTypeName, that.payTypeName) &&
                Objects.equals(realsumAmt, that.realsumAmt) &&
                Objects.equals(paysumAmt, that.paysumAmt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, retailsaleSumNo, tenantId, payType, payTypeName, realsumAmt, paysumAmt);
    }
}
