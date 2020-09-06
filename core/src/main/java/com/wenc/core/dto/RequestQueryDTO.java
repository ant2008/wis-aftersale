package com.wenc.core.dto;

public class RequestQueryDTO<T> {

    int page;

    int size;

    T  paramT;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public T getParamT() {
        return paramT;
    }

    public void setParamT(T paramT) {
        this.paramT = paramT;
    }
}
