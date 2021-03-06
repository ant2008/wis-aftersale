package com.wenc.core.service;

import com.wenc.core.model.ExcelModelT;
import com.wenc.core.model.SearchConModel;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface GenericBaseService<T> {


    /**
     * 指定语句分页查询
     *
     * @param aJpql
     * @param aPage
     * @param aSize
     * @param aParams
     * @return
     */
    List<T> pageQuery(String aJpql, int aPage, int aSize, Object... aParams);


    /**
     * 返回所有行数
     *
     * @return
     */
    int pageCount();


    /**
     * 返回指定条件行数。
     *
     * @param aJpql
     * @param aParams
     * @return
     */
    int pageCount(String aJpql, Object... aParams);


    /**
     * add new data
     *
     * @param aT
     * @throws Exception
     */
    void insert(T aT) throws Exception;


    /**
     * modify data
     *
     * @param aT
     * @throws Exception
     */
    void update(T aT) throws Exception;


    /**
     * delete data
     *
     * @param aT
     * @throws Exception
     */
    void delete(T aT) throws Exception;


    /**
     * batch insert data;
     *
     * @param aList
     * @throws Exception
     */
    void insert(List<T> aList) throws Exception;

    /**
     * batch update data
     *
     * @param aList
     * @throws Exception
     */
    void update(List<T> aList) throws Exception;


    /**
     * batch delete data;
     *
     * @param aList
     * @throws Exception
     */
    void delete(List<T> aList) throws Exception;


    /**
     * return all data from table.
     *
     * @return
     */
    List<T> findAll();


    /**
     * find list by colname
     *
     * @param aColName
     * @param aValue
     * @return
     */
    List<T> findListByName(String aColName, Object aValue);


    /**
     * find one by colname.
     *
     * @param aColName
     * @param aValue
     * @return
     */
    T findByName(String aColName, Object aValue);


    Class<T> getClazzT();


    /**
     * 导出Excel方法
     *
     * @param aExpModel
     * @return
     * @throws Exception
     */
    Object ExportExcel(ExcelModelT<?> aExpModel) throws Exception;


    /**
     * find record by idx.
     *
     * @param aId
     * @return
     */
    T findById(Class<T> tClass, Long aId);


    /**
     * delete data by union id.
     *
     * @param tClass
     * @param aId
     * @throws Exception
     */
    void delete(Class<T> tClass, Long aId) throws Exception;


    /**
     * 根据ID修改对象。
     *
     * @param tClass
     * @param aId
     * @throws Exception
     */
    void update(Class<T> tClass, Long aId) throws Exception;


    /**
     * find list by colname
     *
     * @param aColName
     * @param aValue
     * @return
     */
    List<T> findListByName(Class<T> tClass, String aColName, Object aValue);


    /**
     * find one by colname.
     *
     * @param aColName
     * @param aValue
     * @return
     */
    T findByName(Class<T> tClass, String aColName, Object aValue);


    /**
     * 根据ID删除对象
     *
     * @param aId
     * @throws Exception
     */
    void delete(Long aId) throws Exception;


    /**
     * 根据ID获取对象
     *
     * @param aId
     * @return
     */
    T findById(Long aId);


}
