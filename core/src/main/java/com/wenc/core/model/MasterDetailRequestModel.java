package com.wenc.core.model;

import java.util.List;

public class MasterDetailRequestModel<M, D> {
    private M master;
    private List<D> detail;

    public M getMaster() {
        return master;
    }

    public void setMaster(M master) {
        this.master = master;
    }

    public List<D> getDetail() {
        return detail;
    }

    public void setDetail(List<D> detail) {
        this.detail = detail;
    }
}
