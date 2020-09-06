package com.wenc.sys.service;

import javax.servlet.http.HttpSession;

public interface TokenService {

    /**
     * 按账号创建token
     *
     * @param aKey   账号
     * @param maxAge 最大失效时间
     * @return token
     */
    String createToken(String aKey, long maxAge);


    /**
     * 按tenant产生的token.
     *
     * @param aKey
     * @param aTenant
     * @param maxAge
     * @return
     */
    String createToken(String aKey, String aTenant, long maxAge);


    /**
     * 按tenant产生token.
     *
     * @param aKey
     * @param aTenant
     * @return
     */
    String createTenantToken(String aKey, String aTenant);

    /**
     * 创建token
     *
     * @param aKey 账号
     * @return token
     * @throws Exception
     */
    String createToken(String aKey) throws Exception;

    /**
     * 验证token
     *
     * @param aToken token
     * @param aKey   账号
     * @return true-通过 false-不通过
     * @throws Exception
     */
    boolean verifyToken(String aToken, String aKey) throws Exception;


    /**
     * 针对tenant产生的token验证。
     *
     * @param aToken
     * @param aKey
     * @param aTenant
     * @return
     * @throws Exception
     */
    boolean verifyToken(String aToken, String aKey, String aTenant) throws Exception;

    /**
     * 创建token
     *
     * @return token字符串
     * @throws Exception
     */
    String createToken() throws Exception;

    /**
     * 校验token
     *
     * @param aToken token
     * @return true-通过 false-不通过
     * @throws Exception
     */
    boolean verifyToken(String aToken) throws Exception;


    /**
     * 根据存储在session中的key校验token.
     *
     * @param session     session
     * @param aSessionKey session key
     * @param aToken      token 字符串
     * @return true-通过 false-不通过
     * @throws Exception
     */
    boolean verifyToken(HttpSession session, String aSessionKey, String aToken) throws Exception;


    /**
     * 根据token解析出key
     *
     * @param aToken
     * @return
     * @throws Exception
     */
    String parseTokenKey(String aToken) throws Exception;


    /**
     * @param aToken
     * @return
     * @throws Exception
     */
    String parseTokenTenant(String aToken) throws Exception;

}
