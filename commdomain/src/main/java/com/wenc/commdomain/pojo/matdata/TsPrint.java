package com.wenc.commdomain.pojo.matdata;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ts_print")
public class TsPrint {
    private long idx;
    private String tenantId;
    private String funcNo;
    private Integer printNo;
    private String printName;
    private String printTitle;
    private String printExpress;
    private Integer printType;
    private String notes;
    private Integer controlRow;
    private Timestamp createTime;
    private String createUser;

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
    @Column(name = "func_no", nullable = true, length = 20)
    public String getFuncNo() {
        return funcNo;
    }

    public void setFuncNo(String funcNo) {
        this.funcNo = funcNo;
    }

    @Basic
    @Column(name = "print_no", nullable = true)
    public Integer getPrintNo() {
        return printNo;
    }

    public void setPrintNo(Integer printNo) {
        this.printNo = printNo;
    }

    @Basic
    @Column(name = "print_name", nullable = true, length = 30)
    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
    }

    @Basic
    @Column(name = "print_title", nullable = true, length = 40)
    public String getPrintTitle() {
        return printTitle;
    }

    public void setPrintTitle(String printTitle) {
        this.printTitle = printTitle;
    }

    @Basic
    @Column(name = "print_express", nullable = true, length = 255)
    public String getPrintExpress() {
        return printExpress;
    }

    public void setPrintExpress(String printExpress) {
        this.printExpress = printExpress;
    }

    @Basic
    @Column(name = "print_type", nullable = true)
    public Integer getPrintType() {
        return printType;
    }

    public void setPrintType(Integer printType) {
        this.printType = printType;
    }

    @Basic
    @Column(name = "notes", nullable = true, length = 40)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "control_row", nullable = true)
    public Integer getControlRow() {
        return controlRow;
    }

    public void setControlRow(Integer controlRow) {
        this.controlRow = controlRow;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TsPrint tsPrint = (TsPrint) o;
        return idx == tsPrint.idx &&
                Objects.equals(tenantId, tsPrint.tenantId) &&
                Objects.equals(funcNo, tsPrint.funcNo) &&
                Objects.equals(printNo, tsPrint.printNo) &&
                Objects.equals(printName, tsPrint.printName) &&
                Objects.equals(printTitle, tsPrint.printTitle) &&
                Objects.equals(printExpress, tsPrint.printExpress) &&
                Objects.equals(printType, tsPrint.printType) &&
                Objects.equals(notes, tsPrint.notes) &&
                Objects.equals(controlRow, tsPrint.controlRow) &&
                Objects.equals(createTime, tsPrint.createTime) &&
                Objects.equals(createUser, tsPrint.createUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, tenantId, funcNo, printNo, printName, printTitle, printExpress, printType, notes, controlRow, createTime, createUser);
    }
}
