package com.wenc.core.model;

public class OpListDictModel {

    private String label;

    private String value;

    public OpListDictModel(String aValue, String aLabel) {
        this.value = aValue;
        this.label = aLabel;
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
