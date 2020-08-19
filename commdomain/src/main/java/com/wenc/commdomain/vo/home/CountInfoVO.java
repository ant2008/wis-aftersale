package com.wenc.commdomain.vo.home;


/**
 * 为适应前端IVIEW进行的结构。
 */
public class CountInfoVO {
     private String title;
     private String icon;
     private double count;
     private String color;

    public CountInfoVO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
