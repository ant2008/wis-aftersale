package com.wenc.core.model;

public class DictModel {

    private String name;
    private String value;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        if (value == null) {
            this.value = "";
        }
        this.value = value.trim();
    }


    public DictModel(String aName, String aValue) {
        this.setName(aName);
        this.setValue(aValue);
    }

    public DictModel(String aName, int aValue) {
        this.setName(aName);
        this.setValue(String.valueOf(aValue));
    }

    public DictModel(String aName, Long aValue) {
        this.setName(aName);
        this.setValue(String.valueOf(aValue.intValue()));
    }
}
