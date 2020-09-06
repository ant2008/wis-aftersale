package com.wenc.core.model;

import java.util.List;

public class BaseRetMdModel<M, D> {
    private String code;
    private String msg;
    private PageModel<M> page;
    private List<M> masterList;
    private List<D> detailList;
    private M data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public PageModel<M> getPage() {
        return page;
    }

    public void setPage(PageModel<M> page) {
        this.page = page;
    }

    public List<M> getMasterList() {
        return masterList;
    }

    public void setMasterList(List<M> masterList) {
        this.masterList = masterList;
    }

    public List<D> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<D> detailList) {
        this.detailList = detailList;
    }

    public M getData() {
        return data;
    }

    public void setData(M data) {
        this.data = data;
    }
}
