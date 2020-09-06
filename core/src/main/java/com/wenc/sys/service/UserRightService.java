package com.wenc.sys.service;


import com.wenc.commdomain.pojo.core.VFuncRight;
import com.wenc.core.model.MenuModel;
import com.wenc.core.model.VueRouterModel;

import java.util.List;

/**
 * the service for function control
 *
 * @author bruce
 * @date 2019.4.19
 */
public interface UserRightService {

    /**
     * get the function list for detail
     *
     * @param aUserid 用户id
     * @param aFuncno 功能号
     * @param aLevel  级别
     * @return
     */
    boolean getRoleFuncd(String aUserid, String aFuncno, String aLevel);


    /**
     * 获取tenant下的角色明细。
     *
     * @param aUserid
     * @param aFuncno
     * @param aLevel
     * @param aTenantId
     * @return
     */
    boolean getRoleFuncd(String aUserid, String aFuncno, String aLevel, String aTenantId);


    /**
     * 按用户ID构建树形菜单
     *
     * @param aUserId
     * @return
     */
    List<MenuModel> buildMenuTree(String aUserId);


    /**
     * 从List中获取funcno权限对象。
     *
     * @param aFuncNo
     * @param aList
     * @return
     */
    VFuncRight getVFuncRightFromList(String aFuncNo, List<VFuncRight> aList);


    /**
     * 根据用户ID和功能号获取权限对象。
     *
     * @param aUserId
     * @param aFuncNo
     * @return
     */
    VFuncRight getFuncRight(String aUserId, String aFuncNo);


    /**
     * 建立前台使用的router数据结构。
     *
     * @param aUserId
     * @return
     */
    List<VueRouterModel> buildRouter(String aUserId);


    /**
     * 根据用户获取ID
     *
     * @param aUserId
     * @return
     */
    List<VueRouterModel> getRouter(String aUserId);


    /**
     * 按用户获取可使用菜单权限
     *
     * @param aUserId
     * @return
     */
    List<VFuncRight> getUserFunc(String aUserId);


    /**
     * 获取用户权限获取头部权限。
     *
     * @param aUserId 用户ID
     * @param aFuncno 功能号
     * @return
     */
    VFuncRight getFuncByUseridAndFuncno(String aUserId, String aFuncno);


    /**
     * 检查是否具备某项功能操作。
     *
     * @param aUserId
     * @param aFuncNo
     * @return
     */
    boolean checkUserRightByUserIdAndFuncno(String aUserId, String aFuncNo, String aCmd);


}
