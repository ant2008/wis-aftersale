package com.wenc.core.model.el;

import java.util.List;

public class ElCascaderDTO {
    private String label;
    private String value;
    private List<ElCascaderDTO> children;

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

    public List<ElCascaderDTO> getChildren() {
        return children;
    }

    public void setChildren(List<ElCascaderDTO> children) {
        this.children = children;
    }
}
