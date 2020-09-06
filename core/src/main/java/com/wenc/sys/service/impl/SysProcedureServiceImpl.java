package com.wenc.sys.service.impl;

import com.wenc.sys.dao.VFuncRightRepository;
import com.wenc.sys.service.SysProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

@Transactional
@Service
public class SysProcedureServiceImpl implements SysProcedureService {

    @PersistenceContext
    private EntityManager em;


    @Autowired
    private VFuncRightRepository vFuncRightRepository;

    @Override
    public String getSerialNo(String aCode) {

        StoredProcedureQuery storedProcedureQuery = null;
        String serailno = "";

        try {

            storedProcedureQuery = em.createNamedStoredProcedureQuery("p_get_serialno");

            storedProcedureQuery.setParameter(0, aCode);
            storedProcedureQuery.setParameter(1, 1);
            storedProcedureQuery.execute();
            serailno = (String) storedProcedureQuery.getOutputParameterValue("aserialno");


        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return serailno;
    }

    @Override
    public String GetSubno(String aStr) {
        return null;
    }
}
