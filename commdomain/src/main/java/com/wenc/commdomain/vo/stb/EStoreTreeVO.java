package com.wenc.commdomain.vo.stb;

import java.util.List;

public class EStoreTreeVO {

    private String title;
    private String code;
    private Boolean expand;
    private Boolean disabled;
    private Boolean disableCheckbox;
    private Boolean selected;
    private Boolean checked;
    private List<EStoreTreeVO> children;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getExpand() {
        return expand;
    }

    public void setExpand(Boolean expand) {
        this.expand = expand;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Boolean getDisableCheckbox() {
        return disableCheckbox;
    }

    public void setDisableCheckbox(Boolean disableCheckbox) {
        this.disableCheckbox = disableCheckbox;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public List<EStoreTreeVO> getChildren() {
        return children;
    }

    public void setChildren(List<EStoreTreeVO> children) {
        this.children = children;
    }
}
