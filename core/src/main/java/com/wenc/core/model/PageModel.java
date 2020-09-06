package com.wenc.core.model;

import java.util.List;

public class PageModel<T> {

    private int pageNumber;
    private int pageSize;
    private int totalPages;
    private int totalRows;

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    private List<T> pageDatas;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<T> getPageDatas() {
        return pageDatas;
    }

    public void setPageDatas(List<T> pageDatas) {
        this.pageDatas = pageDatas;
    }
}
