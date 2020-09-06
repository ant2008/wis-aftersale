package com.wenc.core.model.el;

import java.util.List;

/**
 * 获取树形DTO
 */
public class ElTreeDTO {

    private String id;

    private String label;

    private boolean disabled;

    List<ElTreeDTO> children;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public List<ElTreeDTO> getChildren() {
        return children;
    }

    public void setChildren(List<ElTreeDTO> children) {
        this.children = children;
    }
}
