package com.wenc.core.dao.impl;

import cn.hutool.Hutool;
import cn.hutool.core.util.ClassUtil;
import cn.hutool.core.util.TypeUtil;
import com.wenc.core.dao.BaseDao;
import com.wenc.core.dao.GenericBaseDao;
import com.wenc.core.model.SearchConModel;
import com.wenc.core.util.ClassHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.*;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Repository
public class BaseDaoImpl<T> implements BaseDao<T> {

    private final static Logger LOG = LoggerFactory.getLogger(BaseDaoImpl.class);


    private Class<T> entityT = ClassHelper.getSuperClassGenricType(this.getClass());


    @PersistenceContext
    protected EntityManager em;


    @Override
    public List<T> pageQuery(String aJpql, int aPage, int aSize, Object... aParams) {
        try {
            Query query = em.createQuery(aJpql);
            if (aParams != null && aParams.length > 0) {
                for (int i = 0; i < aParams.length; i++) {
                    query.setParameter((i + 1), aParams[i]);
                }
            }
            query.setFirstResult(aPage).setMaxResults(aSize);

            return (List<T>) query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            LOG.error(e.getMessage());
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
            Long num = (Long) em.createQuery("select count(*) from " + getClazzT().getSimpleName()).getSingleResult();
            return num.intValue();
        } catch (Exception ex) {
            LOG.error(ex.getMessage());
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

        List retList = null;

        Object retObj = null;

        try {
            Query query = em.createQuery(aJpql);

            if (aParams != null && aParams.length > 0) {
                for (int i = 0; i < aParams.length; i++) {
                    query.setParameter((i + 1), aParams[i]);
                }
            }

            retObj = query.getSingleResult();

            if(retObj == null)
            {
                return 0;
            }

            Long num = (Long) retObj;

            return num.intValue();

        } catch (Exception e) {
            e.printStackTrace();
            LOG.error(e.getMessage());
        }

        return 0;
    }

    /**
     * add new data
     *
     * @param aT
     * @throws Exception
     */
    @Override
    public void insert(T aT) throws Exception {

        try {


            em.persist(aT);
            em.flush();

        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        }

    }

    /**
     * modify data
     *
     * @param aT
     * @throws Exception
     */
    @Override
    public void update(T aT) throws Exception {

        try {

            em.merge(aT);
            em.flush();

        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        }

    }

    /**
     * delete data
     *
     * @param aT
     * @throws Exception
     */
    @Override
    public void delete(T aT) throws Exception {

        try {
            em.remove(aT);
            em.flush();
        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        }


    }

    /**
     * delete data by union id.
     *
     * @param aId
     */
    @Override
    public void delete(Long aId) throws Exception {

        T t = null;


        try {

            t = em.find(getClazzT(), aId);

            if (t != null) {
                em.remove(t);
                em.flush();
            }

        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * batch insert data;
     *
     * @param aList
     * @throws Exception
     */
    @Override
    public void insert(List<T> aList) throws Exception {

        int rowIdx = 0;

        try {

            for (T a :
                    aList) {

                em.persist(a);

                rowIdx++;

                if (rowIdx % 1000 == 0) {
                    em.flush();
                    em.clear();

                }
            }

        } catch (Exception ex) {

            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());

        }

    }

    /**
     * batch update data
     *
     * @param aList
     * @throws Exception
     */
    @Override
    public void update(List<T> aList) throws Exception {

        int rowIdx = 0;

        try {

            for (T a :
                    aList) {

                em.merge(a);

                rowIdx++;

                if (rowIdx % 1000 == 0) {
                    em.flush();
                    em.clear();

                }
            }

        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());

        }

    }

    /**
     * batch delete data;
     *
     * @param aList
     * @throws Exception
     */
    @Override
    public void delete(List<T> aList) throws Exception {

        int rowIdx = 0;

        try {

            for (T a :
                    aList) {

                em.remove(a);

                rowIdx++;

                if (rowIdx % 1000 == 0) {
                    em.flush();
                    em.clear();

                }
            }

        } catch (Exception ex) {
            LOG.error(ex.getMessage());
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


        try {
            return em.createQuery("from " + getClazzT().getSimpleName()).getResultList();

        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            ex.printStackTrace();
        }

        return null;
    }

    /**
     * find record by idx.
     *
     * @param aId
     * @return
     */
    @Override
    public T findById(Class<T> tClass, Long aId) {

        try {
            return em.find(tClass, aId);
        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            ex.printStackTrace();
        }

        return null;
    }

    /**
     * 根据ID获取对象(在泛型可以确定情况下)
     *
     * @param aId
     * @return
     */
    @Override
    public T findById(Long aId) {
        try {

            if (entityT != null) {
                return findById(entityT, aId);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error(ex.getMessage());
        }

        return null;
    }

    /**
     * delete data by union id.
     *
     * @param tClass
     * @param aId
     * @throws Exception
     */
    @Override
    public void delete(Class<T> tClass, Long aId) throws Exception {

        T t = null;


        try {

            t = findById(tClass, aId);

            if (t != null) {
                delete(t);
            }

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

        T t = null;

        try {

            t = findById(tClass, aId);

            if (t != null) {
                update(t);
            }

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
        String hqlStr = "";
        Query query = null;

        List retList = null;


        try {

            hqlStr = " From " + tClass.getSimpleName() + " Where " + aColName + " = ?1 ";

            query = em.createQuery(hqlStr);

            query.setParameter(1, aValue);


            retList = query.getResultList();

            if (retList == null || retList.size() <= 0) {
                return null;
            }


        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            ex.printStackTrace();
        }

        return retList;
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
        String hqlStr = "";
        Query query = null;

        List retList = null;


        try {

            hqlStr = " From " + tClass.getSimpleName() + " Where " + aColName + " = :colvalue ";

            query = em.createQuery(hqlStr);

            query.setParameter("colvalue", aValue);

            retList = query.getResultList();

            if (retList == null || retList.size() <= 0) {
                return null;
            }


        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            ex.printStackTrace();
        }

        return (T) retList.get(0);
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


        try {

            if (entityT != null) {
                return findListByName(entityT, aColName, aValue);
            }

        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            ex.printStackTrace();
        }

        return null;
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
        try {

            if (entityT != null) {
                return findByName(entityT, aColName, aValue);
            }

        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            ex.printStackTrace();
        }

        return null;
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
}
