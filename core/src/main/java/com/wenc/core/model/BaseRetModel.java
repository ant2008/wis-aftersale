package com.wenc.core.model;

import com.wenc.core.BaseConstant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BaseRetModel<T> {

    private String code;
    private String msg;
    private PageModel<T> page;
    private List<T> dataList;
    private T data;

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


    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public PageModel<T> getPage() {
        return page;
    }

    public void setPage(PageModel<T> page) {
        this.page = page;
    }


    public  BaseRetModel<T>  ok(String aCode,String aMsg)
    {
         setCode(aCode);
         setMsg(aMsg);

         return this;
    }


    public  BaseRetModel<T>  ok(T aData)
    {
        setCode(BaseConstant.SUCESS);
        setMsg(BaseConstant.SUCCESS_MSG);
        setData(aData);
        return this;
    }

    public  BaseRetModel<T>  ok(List<T> aList)
    {
        setCode(BaseConstant.SUCESS);
        setMsg(BaseConstant.SUCCESS_MSG);
        setDataList(aList);
        return this;
    }

    public  BaseRetModel<T>  ok(PageModel<T> aPageData)
    {
        setCode(BaseConstant.SUCESS);
        setMsg(BaseConstant.SUCCESS_MSG);
        setPage(aPageData);
        return this;
    }



    public BaseRetModel<T> err(String aCode,String aMsg)
    {
        setCode(aCode);
        setMsg(aMsg);

        return this;
    }


}
