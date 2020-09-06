package com.wenc.sys.service.impl;

import cn.hutool.crypto.SecureUtil;
import com.wenc.sys.dao.SsuserRepository;
import com.wenc.sys.service.LoginService;
import com.wenc.sys.service.TenantAccountService;
import com.wenc.sys.service.TokenService;
import com.wenc.commdomain.exception.TenantInvalidException;
import com.wenc.commdomain.pojo.core.SsUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {


    private Logger LOG = LoggerFactory.getLogger(LoginServiceImpl.class);


    @Autowired
    protected SsuserRepository ssuserRepository;

    @Autowired
    protected TokenService tokenService;


    @Autowired
    protected TenantAccountService tenantAccountService;


    /**
     * 按用户ID和密码对用户进行校验
     *
     * @param aUserID
     * @param aPwd
     * @return
     */
    @Override
    public SsUser validate(String aUserID, String aPwd) {
        String md5Pwd = "";

        try {

            if (aPwd == null) {
                return null;
            }

            if (aPwd.trim().equals("")) {
                md5Pwd = "";
            } else {
                md5Pwd = SecureUtil.md5(aPwd);
            }


            return ssuserRepository.validate(aUserID, md5Pwd);


        } catch (Exception ex) {

        }
        return null;
    }

    /**
     * 按MD5后的密码进行校验。
     *
     * @param aUserID
     * @param aPwd
     * @return
     */
    @Override
    public SsUser validateByMd5Pwd(String aUserID, String aPwd) {


        try {

            if (aPwd == null) {
                return null;
            }

            return ssuserRepository.validate(aUserID, aPwd);


        } catch (Exception ex) {

        }
        return null;
    }

    /**
     * 根据用户名密码获取token
     *
     * <p>在获取token时候判断用户的tenantid是否过期或者是否有效。</p>
     *
     * @param aUserId
     * @param aPwd
     * @return
     */
    @Override
    public String getToken(String aUserId, String aPwd) throws Exception {

        SsUser user = null;

        String token = "";

        try {


            token = tokenService.createToken(aUserId + "-" + aPwd);

            if (token == null || token.trim().equals("")) {
                LOG.debug("Can't not get the token");
                return null;
            }


        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        }

        return token;
    }

    /**
     * 根据用户名获取token.
     *
     * @param aUserId
     * @return
     */
    @Override
    public String getToken(String aUserId) {

        String token = "";

        try {


            token = tokenService.createToken(aUserId);

            if (token == null || token.trim().equals("")) {
                LOG.debug("Can't not get the token");
                return null;
            }


        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error(ex.getMessage());
        }

        return token;
    }

    /**
     * 获取tenant Token
     *
     * @param aUserId
     * @param aTenant
     * @return
     */
    @Override
    public String getTenantToken(String aUserId, String aTenant) throws Exception {

        String token = "";

        try {


            //判断tenantid 是否有效。
            if (tenantAccountService.ifValidTenantAccount(aTenant) == false) {
                throw new TenantInvalidException("当前账户已过期或被锁定!");
            }

            token = tokenService.createTenantToken(aUserId, aTenant);

            if (token == null || token.trim().equals("")) {
                LOG.debug("Can't not get the token");
                return null;
            }


        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        }

        return token;
    }
}
