package com.wenc.core.model;

public class VueRouterMetaModel {
    private String title;
    private boolean hideInMenu;
    private boolean notCache;
    private String icon;
    private String href;
    private boolean hideInBread;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isHideInMenu() {
        return hideInMenu;
    }

    public void setHideInMenu(boolean hideInMenu) {
        this.hideInMenu = hideInMenu;
    }

    public boolean isNotCache() {
        return notCache;
    }

    public void setNotCache(boolean notCache) {
        this.notCache = notCache;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public boolean isHideInBread() {
        return hideInBread;
    }

    public void setHideInBread(boolean hideInBread) {
        this.hideInBread = hideInBread;
    }
}
