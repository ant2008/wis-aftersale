package com.wenc.sys.service;

import com.wenc.commdomain.pojo.core.SsBillChk;

import java.util.List;

/**
 * 单据审核记录
 */
public interface BillChkRecService {

    /**
     * 获取所有审核记录
     *
     * @param aBillNo
     * @return
     */
    List<SsBillChk> getAllBillChkRecs(String aBillNo, String aBillType, String aTenantId);


    /**
     * 获取否决记录。
     *
     * @param aBillNo
     * @param aBillType
     * @param aTenantId
     * @return
     */
    List<SsBillChk> getAllBillNotChkRecs(String aBillNo, String aBillType, String aTenantId);


    /**
     * 增加审核记录。
     *
     * @param aBillNo
     * @param aBillType
     * @param aTenantId
     * @param aChkBit
     * @param aMemo
     * @param aUserId
     * @throws Exception
     */
    void addBillChkRec(String aBillNo,
                       String aBillType,
                       String aTenantId,
                       int aChkBit,
                       int aChkLevel,
                       String aMemo,
                       String aRejectMemo,
                       String aUserId) throws Exception;


    /**
     * 批量增加审核记录
     *
     * @param ssBillChks
     * @throws Exception
     */
    void addBillChkRecords(List<SsBillChk> ssBillChks) throws Exception;
}
