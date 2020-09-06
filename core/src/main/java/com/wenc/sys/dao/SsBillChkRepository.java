package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.SsBillChk;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 审核记录
 *
 * @author wz
 */
public interface SsBillChkRepository extends CrudRepository<SsBillChk, Long> {


    /**
     * 根据单号返回已经存在审核记录
     *
     * @param aBillNo
     * @param aBillType
     * @param aTenantId
     * @return
     */
    @Query(" select  a from SsBillChk a where a.billchkNo = ?1 and a.billchkType = ?2 and a.tenantId = ?3 and a.billchkBit = 1")
    List<SsBillChk> getBillChkRecs(String aBillNo, String aBillType, String aTenantId);


    /**
     * 按单号获取所有否决审核记录。
     *
     * @param aBillNo
     * @param aBillType
     * @param aTenantId
     * @return
     */
    @Query(" select  a from SsBillChk a where a.billchkNo = ?1 and a.billchkType = ?2 and a.tenantId = ?3 and a.billchkBit = 2")
    List<SsBillChk> getBillNotChkRecs(String aBillNo, String aBillType, String aTenantId);


}
