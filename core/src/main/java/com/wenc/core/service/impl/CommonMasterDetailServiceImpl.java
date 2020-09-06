package com.wenc.core.service.impl;

import com.wenc.commdomain.pojo.core.SsBillChk;
import com.wenc.core.dao.BaseDao;
import com.wenc.core.service.ChkService;
import com.wenc.core.service.CommonMasterDetailService;
import com.wenc.core.service.GenericBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CommonMasterDetailServiceImpl<M, D> implements CommonMasterDetailService<M, D> {


    @Autowired
    private GenericBaseService<M> mService;

    @Autowired
    private GenericBaseService<D> dService;

    @Autowired
    private ChkService chkService;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void insert(M aM, List<D> dList) throws Exception {
        try {

            mService.insert(aM);
            dService.insert(dList);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void update(M aM, List<D> dList) throws Exception {

        try {
            mService.update(aM);
            dService.update(dList);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(M aM, List<D> dList) throws Exception {

        try {
            mService.delete(aM);
            dService.delete(dList);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * 修改并保存审核记录。
     *
     * @param aM
     * @param aBillNo
     * @param aBillType
     * @param aTenantId
     * @param aChkBit
     * @param aChkLevel
     * @param aMemo
     * @param aRejectMemo
     * @param aUserId
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveCheckAndRecord(M aM, String aBillNo, String aBillType,
                                   String aTenantId, int aChkBit, int aChkLevel,
                                   String aMemo, String aRejectMemo, String aUserId) throws Exception {

        try {

            mService.update(aM);
            chkService.addBillChkRec(aBillNo, aBillType, aTenantId, aChkBit, aChkLevel, aMemo, aRejectMemo, aUserId);

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * 修改并增加审核记录
     *
     * @param aM
     * @param ssBillChks
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateAndAddChkRecords(M aM, List<SsBillChk> ssBillChks) throws Exception {

        try {
            mService.update(aM);
            chkService.addBillChks(ssBillChks);

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
