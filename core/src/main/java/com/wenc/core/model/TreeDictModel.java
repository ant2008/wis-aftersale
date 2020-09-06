package com.wenc.core.model;

import java.util.List;

/**
 * 树形字典
 */
public class TreeDictModel {

    private  String label;
    private String value;

    List<TreeDictModel> children;


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

    public List<TreeDictModel> getChildren() {
        return children;
    }

    public void setChildren(List<TreeDictModel> children) {
        this.children = children;
    }
}
