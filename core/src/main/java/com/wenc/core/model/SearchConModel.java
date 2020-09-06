package com.wenc.core.model;

public class SearchConModel {

    private String colName;
    private String opat;
    private Object colValue;
    private String rela;
    private String colType;

    private String leftBracket;

    private String rightBracket;


    public String getColType() {
        return colType;
    }

    public void setColType(String colType) {
        this.colType = colType;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public Object getColValue() {
        return colValue;
    }

    public void setColValue(Object colValue) {
        this.colValue = colValue;
    }

    public String getRela() {
        return rela;
    }

    public void setRela(String rela) {
        this.rela = rela;
    }

    public String getOpat() {
        return opat;
    }

    public void setOpat(String opat) {
        this.opat = opat;
    }


    public String getLeftBracket() {
        return leftBracket;
    }

    public void setLeftBracket(String leftBracket) {
        this.leftBracket = leftBracket;
    }

    public String getRightBracket() {
        return rightBracket;
    }

    public void setRightBracket(String rightBracket) {
        this.rightBracket = rightBracket;
    }
}
