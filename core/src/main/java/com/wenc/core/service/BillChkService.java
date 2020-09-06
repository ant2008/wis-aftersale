package com.wenc.core.service;

import com.wenc.core.exception.BillChkException;

import java.util.List;

/**
 * 单据审核service
 */
public interface BillChkService {

    /**
     * 单据审核接口
     * @param aBillno
     * @param aUserid
     * @return
     * @throws Exception
     */
     boolean billCheck(String aTenantId,String aBillno,String aUserid) throws BillChkException;

    /**
     * 单据否决接口
     * @param aBillno
     * @param aUserid
     * @return
     * @throws Exception
     */
     boolean notBillCheck(String aTenantId,String aBillno,String aUserid) throws  BillChkException;


    /**
     * 获取单据主体
     *
     * @param aTenantId
     * @param aBillNo
     * @param <M>
     * @return
     */
     <M> M getBill(String aTenantId,String aBillNo);


    /**
     * 获取单据明细
     * @param aTenantId
     * @param aBillNo
     * @param <D>
     * @return
     */
     <D> List<D> getBillItems(String aTenantId,String aBillNo);

}
