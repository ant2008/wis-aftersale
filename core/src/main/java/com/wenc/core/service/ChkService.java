package com.wenc.core.service;

import com.wenc.commdomain.pojo.core.SsBillChk;
import com.wenc.commdomain.pojo.core.SsFuncD;
import com.wenc.commdomain.pojo.core.SsUserRole;

import java.util.List;

public interface ChkService {

    /**
     * 获取角色列表
     *
     * @param aUserid
     * @return
     */
    List<SsUserRole> getUserRoleList(String aUserid);


    /**
     * 获取菜单审核权限
     *
     * @param aFuncno
     * @return
     */
    List<SsFuncD> getFuncdList(String aFuncno);


    /**
     * 获取角色具备审核权限级。
     *
     * @param aUserid
     * @param aFuncno
     * @param aLevel
     * @param aTenantId
     * @return
     */
    boolean getRoleRight(String aUserid, String aFuncno, int aLevel, String aTenantId);


    boolean getRoleRight(String aUserId,String aFuncNo,int aLevel);


    /**
     * 获取审核记录
     *
     * @param aBillNo
     * @return
     */
    List<SsBillChk> getBillChkRec(String aBillNo, String aBillType, String aTenantId);


    /**
     * 获取单据否决记录。
     *
     * @param aBillNo
     * @param aBillType
     * @param aTenantId
     * @return
     */
    List<SsBillChk> getBillNotChkRec(String aBillNo, String aBillType, String aTenantId);


    /**
     * 增加审核记录
     *
     * @param aBillNo
     * @param aBillType
     * @param aTenantId
     * @param aChkBit
     * @param aMemo
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
     * 注册审核结果列表
     *
     * @param ssBillChks
     * @param aBillNo
     * @param aBillType
     * @param aTenantId
     * @param aChkBit
     * @param aChkLevel
     * @param aMemo
     * @param aRejectMemo
     * @param aUserId
     * @throws Exception
     */
    void registerBillChks(List<SsBillChk> ssBillChks,
                          String aBillNo,
                          String aBillType,
                          String aTenantId,
                          int aChkBit,
                          int aChkLevel,
                          String aMemo,
                          String aRejectMemo,
                          String aUserId) throws Exception;


    /**
     * 批量保存审核记录。
     *
     * @param ssBillChks
     * @throws Exception
     */
    void addBillChks(List<SsBillChk> ssBillChks) throws Exception;

}
