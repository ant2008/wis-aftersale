package com.wenc.sys.service;

import com.wenc.commdomain.pojo.core.SsTenant;

/**
 * tenant 账户service.
 *
 * @author b.v
 */
public interface TenantAccountService {

    /**
     * 获取tenant 的账户信息。
     *
     * @param aTenantId
     * @return
     */
    SsTenant getTenantAccount(String aTenantId);


    /**
     * 判断当前tenant 是否有效。
     *
     * @param aTenantId
     * @return
     */
    boolean ifValidTenantAccount(String aTenantId);





}
