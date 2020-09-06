package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.SsTenant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author b.v
 */
public interface SsTenantRepository extends CrudRepository<SsTenant, Long> {


    /**
     * 按TenantId获取账户信息。
     *
     * @param aTenantId
     * @return
     */
    SsTenant findSsTenantByTenantId(String aTenantId);


    /**
     * 获取存在同样的名称tenant
     *
     * @param aTenantName
     * @param aState
     * @return
     */
    SsTenant findSsTenantByTenantNameAndState(String aTenantName,int aState);


    /**
     * 获取所有有效租户
     *
     * @param aState
     * @return
     */
    @Query("select a from SsTenant a where a.state = ?1 and a.tenantId not in ('T000','T001')")
    List<SsTenant> getAllValidTenants(int aState);


    /**
     * 获取默认推荐分销租户
     *
     * @param aDefaDistrib
     * @return
     */
    SsTenant getByIfRecommendDistrib(String aDefaDistrib);


}
