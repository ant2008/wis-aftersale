package com.wenc.sys.service;

import com.wenc.commdomain.pojo.core.SsFuncD;
import com.wenc.commdomain.pojo.core.SsRoleFuncD;
import com.wenc.commdomain.pojo.core.VRoleFuncd;
import com.wenc.commdomain.pojo.core.VbFuncD;
import com.wenc.commdomain.vo.bsys.VbRoleFuncH;

import java.util.List;

/**
 * 角色权限service.
 *
 * @author w.z
 */
public interface RoleFuncService {


    /**
     * 获取角色下菜单功能审核级别。
     *
     * @param aTenantId
     * @param aRoleId
     * @param aFuncNo
     * @return
     */
    List<SsRoleFuncD> getRoleFuncds(String aTenantId, String aRoleId, String aFuncNo);


    /**
     * 获取功能菜单审核级别。
     *
     * @param aFuncNo
     * @return
     */
    List<SsFuncD> getFuncDs(String aFuncNo);


    /**
     * 保存角色审核权限明细。
     *
     * @param aTenantId
     * @param aRoleId
     * @param aSsFuncDS
     * @throws Exception
     */
    void saveFuncDs(String aTenantId, String aRoleId, String aFuncNo, List<SsFuncD> aSsFuncDS, String aUserId) throws Exception;


    /**
     * 保存角色审核权限明细。
     *
     * @param aTenantId
     * @param aRoleId
     * @param aSsRoleFuncDS
     * @throws Exception
     */
    void saveRoleFuncDS(String aTenantId, String aRoleId, String aFuncNo, List<SsRoleFuncD> aSsRoleFuncDS) throws Exception;


    /**
     * 获取当前角色下，当前功能的审核权限。
     * @param aRoleId
     * @param aFuncNo
     * @return
     */
    List<SsRoleFuncD> getRoleFuncds(String aRoleId,String aFuncNo);


    /**
     * 获取当前功能标准审核清单
     * @param aFuncNo
     * @return
     */
    List<VbFuncD> getVbFuncds(String aFuncNo);


    /**
     * 根据选择的审核级，进行保存。
     *
     * @param vbFuncDS
     * @param vbRoleFuncH
     * @throws Exception
     */
    void saveRoleFuncChk(List<VbFuncD> vbFuncDS, VbRoleFuncH vbRoleFuncH) throws Exception;


}
