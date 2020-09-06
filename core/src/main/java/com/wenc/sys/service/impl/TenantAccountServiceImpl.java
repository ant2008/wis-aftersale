package com.wenc.sys.service.impl;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.wenc.commdomain.pojo.core.SsUser;
import com.wenc.commdomain.pojo.matdata.TsDepot;
import com.wenc.commdomain.pojo.matdata.TsOrgcode;
import com.wenc.commdomain.pojo.matdata.TsPriceGroup;
import com.wenc.commdomain.pojo.sys.TsPos;
import com.wenc.sys.dao.SsTenantRepository;
import com.wenc.sys.service.SerialnoService;
import com.wenc.sys.service.TenantAccountService;
import com.wenc.commdomain.pojo.core.SsTenant;
import com.wenc.sys.service.UserRightService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

/**
 * tenant 账户信息。
 *
 * @author b.v
 */
@Service
public class TenantAccountServiceImpl implements TenantAccountService {


    private Logger LOG = LoggerFactory.getLogger(TenantAccountServiceImpl.class);






    @Autowired
    private SsTenantRepository ssTenantRepository;










    /**
     * 获取tenant 的账户信息。
     *
     * @param aTenantId
     * @return
     */
    @Override
    public SsTenant getTenantAccount(String aTenantId) {

        SsTenant ssTenant = null;

        try {

            ssTenant = ssTenantRepository.findSsTenantByTenantId(aTenantId);


        } catch (Exception ex) {
            LOG.error("Get Tenant Error: {} ", ex.getMessage());
            ex.printStackTrace();
        }

        return ssTenant;
    }

    /**
     * 判断当前tenant 是否有效。
     *
     * @param aTenantId
     * @return
     */
    @Override
    public boolean ifValidTenantAccount(String aTenantId) {

        SsTenant ssTenant = null;

        Date endDate = null;

        try {

            ssTenant = getTenantAccount(aTenantId);

            if (ssTenant == null) {
                return false;
            }


            //判断状态。

            if (ssTenant.getState() == 2) {
                return false;
            }


            endDate = ssTenant.getEndDate();

            if (DateUtil.between(endDate, new Date(), DateUnit.DAY) >= 0) {
                return true;
            }


        } catch (Exception ex) {
            LOG.error("Judge Sstenant Valid Error: {}", ex.getMessage());
            ex.printStackTrace();
        }


        return false;
    }


}
