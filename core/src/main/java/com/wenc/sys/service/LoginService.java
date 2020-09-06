package com.wenc.sys.service;

import com.wenc.commdomain.pojo.core.SsUser;

public interface LoginService {

    /**
     * 按用户ID和密码对用户进行校验
     *
     * @param aUserID
     * @param aPwd
     * @return
     */
    SsUser validate(String aUserID, String aPwd);


    /**
     * 按MD5后的密码进行校验。
     *
     * @param aUserID
     * @param aPwd
     * @return
     */
    SsUser validateByMd5Pwd(String aUserID, String aPwd);


    /**
     * 根据用户名密码获取token
     *
     * @param aUserId
     * @param aPwd
     * @return
     */
    String getToken(String aUserId, String aPwd) throws Exception;


    /**
     * 根据用户名获取token.
     *
     * @param aUserId
     * @return
     */
    String getToken(String aUserId) throws Exception;


    /**
     * 获取tenant Token
     *
     * @param aUserId
     * @param aTenant
     * @return
     */
    String getTenantToken(String aUserId, String aTenant) throws Exception;


}
