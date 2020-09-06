package com.wenc.core.service;

import com.wenc.commdomain.pojo.core.SsBillChk;

import java.util.List;

public interface CommonMasterDetailService<M, D> {

    /**
     * 批量增加
     *
     * @param aM
     * @param dList
     * @throws Exception
     */
    void insert(M aM, List<D> dList) throws Exception;


    /**
     * 主从表批量修改
     *
     * @param aM
     * @param dList
     * @throws Exception
     */
    void update(M aM, List<D> dList) throws Exception;


    /**
     * 批量删除
     *
     * @param aM
     * @param dList
     * @throws Exception
     */
    void delete(M aM, List<D> dList) throws Exception;


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
    void saveCheckAndRecord(M aM,
                            String aBillNo,
                            String aBillType,
                            String aTenantId,
                            int aChkBit,
                            int aChkLevel,
                            String aMemo,
                            String aRejectMemo,
                            String aUserId) throws Exception;


    /**
     * 修改并增加审核记录
     *
     * @param aM
     * @param ssBillChks
     * @throws Exception
     */
    void updateAndAddChkRecords(M aM,
                                List<SsBillChk> ssBillChks) throws Exception;

}
