package com.wenc.core.model;

import java.util.List;

public class ExcelModelT<T> {

    private List<ExcelColModel> headerList;
    private List<T> rowdataList;

    public List<ExcelColModel> getHeaderList() {
        return headerList;
    }

    public void setHeaderList(List<ExcelColModel> headerList) {
        this.headerList = headerList;
    }

    public List<T> getRowdataList() {
        return rowdataList;
    }

    public void setRowdataList(List<T> rowdataList) {
        this.rowdataList = rowdataList;
    }
}
