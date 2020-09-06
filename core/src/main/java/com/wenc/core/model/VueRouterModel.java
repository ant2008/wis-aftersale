package com.wenc.core.model;

import java.util.List;

public class VueRouterModel {
    private String path;
    private String name;
    private VueRouterMetaModel meta;
    private String component;

    private List<VueRouterModel> children;

    public List<VueRouterModel> getChildren() {
        return children;
    }

    public void setChildren(List<VueRouterModel> children) {
        this.children = children;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VueRouterMetaModel getMeta() {
        return meta;
    }

    public void setMeta(VueRouterMetaModel meta) {
        this.meta = meta;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }
}
