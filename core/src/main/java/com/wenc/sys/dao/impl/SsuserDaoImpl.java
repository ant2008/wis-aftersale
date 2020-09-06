package com.wenc.sys.dao.impl;

import com.wenc.sys.dao.SsuserDao;
import com.wenc.commdomain.pojo.core.SsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;

@Repository
public class SsuserDaoImpl implements SsuserDao {

//    @Autowired
//    private SessionFactory sessionFactory;


    @Autowired
    protected EntityManager em;


    /**
     * @param aUserId
     * @return
     */
    @Override
    public SsUser getUser(String aUserId) {

//       // Query query = null;
//
        List<SsUser> retList = null;
//
//        try {
//
//            String hqlStr = " From SsUser where userId = :userid ";
//           // query =  sessionFactory.openSession().createQuery(hqlStr);
//
//           // query.setParameter("userid",aUserId);
//
//           // retList = query.list();
//
//
//            if(retList == null || retList.size() <= 0 )
//            {
//                return  null;
//            }
//
//
//        }catch (Exception ex)
//        {
//            ex.printStackTrace();
//        }
//
//        return retList.get(0);


        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<SsUser> criteria = builder.createQuery(SsUser.class);
        Root<SsUser> ssUserRoot = criteria.from(SsUser.class);

        Path<String> useridPath = ssUserRoot.get("userId");


        criteria.where(builder.equal(useridPath, aUserId));


        TypedQuery<SsUser> query = em.createQuery(criteria);

        retList = query.getResultList();

        if (retList == null || retList.size() <= 0) {
            return null;
        }

        return retList.get(0);

    }

    @Override
    public Query testSql(String aSql) {
        return null;
    }
}
