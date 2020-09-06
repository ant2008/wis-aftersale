package com.wenc.core.service.impl;

import cn.hutool.core.util.ClassUtil;
import com.google.gson.internal.LinkedTreeMap;
import com.wenc.commdomain.pojo.core.SsUser;
import com.wenc.core.BaseConstant;
import com.wenc.core.dao.BaseDao;
import com.wenc.core.dao.GenericBaseDao;
import com.wenc.core.dao.impl.BaseDaoImpl;
import com.wenc.core.model.ExcelColModel;
import com.wenc.core.model.ExcelModelT;
import com.wenc.core.model.SearchConModel;
import com.wenc.core.service.GenericBaseService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.*;
import java.lang.reflect.ParameterizedType;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class GenericBaseServiceImpl<T> implements GenericBaseService<T> {


    private final static Logger LOG = LoggerFactory.getLogger(GenericBaseServiceImpl.class);


    @Autowired
    protected BaseDao<T> baseDao;


    @Override
    public List<T> pageQuery(String aJpql, int aPage, int aSize, Object... aParams) {

        try {
            return baseDao.pageQuery(aJpql, aPage, aSize, aParams);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }


    /**
     * 返回所有行数
     *
     * @return
     */
    @Override
    public int pageCount() {
        try {
            return baseDao.pageCount();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return 0;
    }


    /**
     * 返回指定条件行数。
     *
     * @param aJpql
     * @param aParams
     * @return
     */
    @Override
    public int pageCount(String aJpql, Object... aParams) {
        try {
            return baseDao.pageCount(aJpql, aParams);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return 0;
    }

    /**
     * add new data
     *
     * @param aT
     * @throws Exception
     */
    @Transactional
    @Override
    public void insert(T aT) throws Exception {


        try {
            baseDao.insert(aT);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }


    }

    /**
     * modify data
     *
     * @param aT
     * @throws Exception
     */
    @Transactional
    @Override
    public void update(T aT) throws Exception {

        try {
            baseDao.update(aT);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }


    }

    /**
     * delete data
     *
     * @param aT
     * @throws Exception
     */
    @Transactional
    @Override
    public void delete(T aT) throws Exception {

        try {
            baseDao.delete(aT);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

    }

    /**
     * delete data by union id.
     *
     * @param aId
     */
    @Transactional
    @Override
    public void delete(Long aId) throws Exception {

        try {
            baseDao.delete(aId);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }


    }

    /**
     * 根据ID获取对象
     *
     * @param aId
     * @return
     */
    @Override
    public T findById(Long aId) {


        try {

            return baseDao.findById(aId);

        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error(ex.getMessage());
        }

        return null;
    }

    /**
     * batch insert data;
     *
     * @param aList
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void insert(List<T> aList) throws Exception {

        try {
            baseDao.insert(aList);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }


    }

    /**
     * batch update data
     *
     * @param aList
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void update(List<T> aList) throws Exception {

        try {
            baseDao.update(aList);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }


    }

    /**
     * batch delete data;
     *
     * @param aList
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(List<T> aList) throws Exception {

        try {
            baseDao.delete(aList);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }


    }

    /**
     * return all data from table.
     *
     * @return
     */
    @Override
    public List<T> findAll() {

        return baseDao.findAll();
    }

    /**
     * find record by idx.
     *
     * @param aId
     * @return
     */
    @Override
    public T findById(Class<T> tClass, Long aId) {
        return baseDao.findById(tClass, aId);
    }

    /**
     * delete data by union id.
     *
     * @param tClass
     * @param aId
     * @throws Exception
     */
    @Transactional
    @Override
    public void delete(Class<T> tClass, Long aId) throws Exception {

        try {
            baseDao.delete(tClass, aId);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * 根据ID修改对象。
     *
     * @param tClass
     * @param aId
     * @throws Exception
     */
    @Override
    public void update(Class<T> tClass, Long aId) throws Exception {

        try {
            baseDao.update(tClass, aId);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

    }

    /**
     * find list by colname
     *
     * @param tClass
     * @param aColName
     * @param aValue
     * @return
     */
    @Override
    public List<T> findListByName(Class<T> tClass, String aColName, Object aValue) {
        return baseDao.findListByName(tClass, aColName, aValue);
    }

    /**
     * find one by colname.
     *
     * @param tClass
     * @param aColName
     * @param aValue
     * @return
     */
    @Override
    public T findByName(Class<T> tClass, String aColName, Object aValue) {
        return baseDao.findByName(tClass, aColName, aValue);
    }

    /**
     * find list by colname
     *
     * @param aColName
     * @param aValue
     * @return
     */
    @Override
    public List<T> findListByName(String aColName, Object aValue) {
        return baseDao.findListByName(aColName, aValue);
    }

    /**
     * find one by colname.
     *
     * @param aColName
     * @param aValue
     * @return
     */
    @Override
    public T findByName(String aColName, Object aValue) {
        return baseDao.findByName(aColName, aValue);
    }


    @Override
    public Class<T> getClazzT() {
        Class<T> clazzT = null;
        try {


            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
            clazzT = (Class<T>) pt.getActualTypeArguments()[0];

            LOG.debug("classT Name:[" + clazzT.getSimpleName() + "]");
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return clazzT;

    }

    /**
     * 导出Excel方法
     *
     * @param aExpModel
     * @return
     * @throws Exception
     */
    @Override
    public Object ExportExcel(ExcelModelT<?> aExpModel) throws Exception {
        ExcelColModel tmpCol = null;
        HSSFWorkbook workBook = new HSSFWorkbook();
        HSSFSheet sheet = workBook.createSheet();
        HSSFRow row = null;


        LinkedTreeMap objValues = null;
        Iterator iter = null;

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");


        Iterator it = null;

        String map_key = "";

        String tmpValue = "";


        try {

            //define poi class


            //create sheet


            //sheet页名称
            //workBook.setSheetName(0, "targetStockList");


            //创建header页
//        HSSFHeader header = sheet.getHeader();
//        //设置标题居中
//        header.setCenter("标题");


            //设置第一行为Header
            row = sheet.createRow(0);
            HSSFCell tmpCell = null;
            for (int i = 0; i < aExpModel.getHeaderList().size(); i++) {

                tmpCol = aExpModel.getHeaderList().get(i);
                if (tmpCol.getColname().equals("idx") || tmpCol.getColname().equals("idno")) {
                    continue;
                }

                tmpCell = row.createCell(i);
                tmpCell.setCellValue(tmpCol.getColtext());
            }


            //设置数据

            for (int j = 0; j < aExpModel.getRowdataList().size(); j++) {
                row = sheet.createRow(j + 1);


                objValues = (LinkedTreeMap) aExpModel.getRowdataList().get(j);


                for (int k = 0; k < aExpModel.getHeaderList().size(); k++) {
                    tmpCol = aExpModel.getHeaderList().get(k);
                    if (tmpCol.getColname().equals("idx") || tmpCol.getColname().equals("idno")) {
                        continue;
                    }


                    tmpCell = row.createCell(k);
                    if (tmpCol.getColname().trim().toLowerCase().indexOf("createtime") > 0 ||
                            tmpCol.getColname().trim().toLowerCase().indexOf("createdate") > 0 ||
                            tmpCol.getColname().trim().toLowerCase().indexOf("time") > 0 ||
                            tmpCol.getColname().trim().toLowerCase().indexOf("date") > 0 ||
                            tmpCol.getColname().trim().toLowerCase().indexOf("sdate") > 0 ||
                            tmpCol.getColname().trim().toLowerCase().indexOf("edate") > 0 ||
                            tmpCol.getColname().trim().toLowerCase().indexOf("overduedate") > 0 ||
                            tmpCol.getColname().trim().toLowerCase().indexOf("datetime") > 0
                    ) {
                        // tmpCell.setCellValue(sf.format(objValues.get(tmpCol.getColname().trim())));

                        //modify:add exception for java.lang.
                        try {

                            tmpValue = String.valueOf(objValues.get(tmpCol.getColname().trim()));

//                            tmpCell.setCellValue(sf.format(
//                                    new Date(Long.parseLong((String) objValues.get(tmpCol.getColname().trim())))));

                            tmpCell.setCellValue(sf2.format(
                                    new Date(new Timestamp(Double.valueOf(tmpValue).longValue()).getTime())));

                        } catch (java.lang.Exception jex) {
                            tmpCell.setCellValue(String.valueOf(objValues.get(tmpCol.getColname().trim())));
                        }


                    } else {


                        tmpCell.setCellValue(String.valueOf(objValues.get(tmpCol.getColname().trim())));
                    }

                    //tmpCell.setCellValue(String.valueOf(objValues.get(tmpCol.getColname().trim())));

                }


                //ExpexcelHelper.SetObjectValueToExcelRow(goods,row);
            }


//            HSSFCell cell0 = row.createCell(0);
//            HSSFCell cell1 = row.createCell(1);
//            HSSFCell cell2 = row.createCell(2);


            // 设置字符集

//        cell0.setEncoding(HSSFCell.ENCODING_UTF_16);
//        cell1.setEncoding(HSSFCell.ENCODING_UTF_16);
//        cell2.setEncoding(HSSFCell.ENCODING_UTF_16);


//            cell0.setCellValue("问题标题");
//            cell1.setCellValue("问题描述");
//            cell2.setCellValue("反馈时间");

//
//        if(targetStockList != null && !targetStockList.isEmpty()) {
//            for(int i = 0; i < targetStockList.size(); i++) {
//                Suggestion targetStock = targetStockList.get(i);
//                row = sheet.createRow(i + 1);
//                cell0 = row.createCell(Short.valueOf("0"));
//                cell1 = row.createCell(Short.valueOf("1"));
//                cell2 = row.createCell(Short.valueOf("2"));
//
//
//                // 设置字符集
//                cell0.setEncoding(HSSFCell.ENCODING_UTF_16);
//                cell1.setEncoding(HSSFCell.ENCODING_UTF_16);
//                cell2.setEncoding(HSSFCell.ENCODING_UTF_16);
//
//
//                cell0.setCellValue(targetStock.getType());
//                cell1.setCellValue(targetStock.getContent());
//                cell2.setCellValue(targetStock.getPublishTime());
//
//
//
//                sheet.setColumnWidth((short) 0, (short) 4000);
//                sheet.setColumnWidth((short) 1, (short) 4000);
//                sheet.setColumnWidth((short) 2, (short) 4000);
//            }
//        }
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

        return workBook;
    }


//    @Override
//    public Page<T> pageQuery(int aPage, int aSize, Map<String, SearchConModel> aParams) {
//        PageRequest pageRequest = PageRequest.of(aPage,aSize);
//
//
//
//
//
////        try {
////            return findAll((root, criteriaQuery, criteriaBuilder) -> {
////
////                List<Predicate> predicateList = new ArrayList<>();
////
////                final Iterator<Map.Entry<String, SearchConModel>> searchConModelIterator ;
////                SearchConModel searchConModel = null;
////                Predicate tmpPredicate = null;
////
////
////                try {
////
////
////                    //假如没有输入任何条件.
////                    if (aParams == null || aParams.size() <= 0) {
////                        Path idx = root.get("idx");
////                        if (idx == null) {
////                            throw new Exception("表中不存在idx");
////                        }
////
////                        predicateList.add(criteriaBuilder.ge(idx,0));
////                    }else
////                    {
////                        searchConModelIterator = aParams.entrySet().iterator();
////
////                        //遍历获取相应数据组成查询条件
////                        while (searchConModelIterator.hasNext())
////                        {
////                            Map.Entry entry = searchConModelIterator.next();
////                            if(entry != null)
////                            {
////                                searchConModel = (SearchConModel) entry.getValue();
////                                if(searchConModel.getColName() != null && !searchConModel.getColName().trim().equals(""))
////                                {
////                                    //获取字段名
////                                    Path tmpPath = root.get(searchConModel.getColName().trim());
////
////                                    //判断使用的符号。
////                                    if(searchConModel.getOpat()!= null && searchConModel.getOpat().trim().equals(""))
////                                    {
////                                        switch (searchConModel.getOpat())
////                                        {
////                                            case ">":
////                                                tmpPredicate = criteriaBuilder.gt(tmpPath,(Number) searchConModel.getColValue());
////                                                break;
////                                            case ">=":
////                                                tmpPredicate = criteriaBuilder.ge(tmpPath,(Number) searchConModel.getColValue());
////                                                break;
////                                            case "<":
////                                                tmpPredicate = criteriaBuilder.lt(tmpPath,(Number) searchConModel.getColValue());
////                                                break;
////                                            case "<=":
////                                                tmpPredicate = criteriaBuilder.le(tmpPath,(Number) searchConModel.getColValue());
////                                                break;
////                                            case "like":
////                                                tmpPredicate = criteriaBuilder.like(tmpPath,"%"+(String) searchConModel.getColValue()+"%");
////                                                break;
////                                            case "not like":
////                                                tmpPredicate = criteriaBuilder.notLike(tmpPath,"%"+(String) searchConModel.getColValue()+"%");
////                                                break;
////                                            default:
////                                                tmpPredicate = criteriaBuilder.equal(tmpPath,searchConModel.getColValue());
////                                                break;
////                                        }
////                                    }
////                                }
////
////                                //判断下一个连接关系。
////                                if(searchConModel.getRela() == null || searchConModel.getRela().trim().equals(""))
////                                {
////                                    predicateList.add(criteriaBuilder.and(tmpPredicate));
////                                }else
////                                {
////                                    predicateList.add(criteriaBuilder.or(tmpPredicate));
////                                }
////
////                            }
////                        }
////
////                    }
////
////                }catch (Exception ex1)
////                {
////                    ex1.printStackTrace();
////                }
////
////
////                Predicate[] predicates = new Predicate[predicateList.size()];
////                return criteriaBuilder.and(predicateList.toArray(predicates));
////            }, pageRequest);
////
////        }catch (Exception ex)
////        {
////            ex.printStackTrace();
////        }
//
//        return  null;
//    }
}
