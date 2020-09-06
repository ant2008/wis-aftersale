package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.SsRoleFuncD;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SsRoleFuncDRepository extends CrudRepository<SsRoleFuncD, Long> {


    /**
     * 获取用户权限下的审核明细。
     *
     * @param aFuncno
     * @param aRoleid
     * @return
     */
    @Query("from SsRoleFuncD a where  a.funcNo = :funcno and a.roleId =:roleid and a.tenantId = :tenantId ")
    List<SsRoleFuncD> getRoleFuncDList(@Param("funcno") String aFuncno, @Param("roleid") String aRoleid, @Param("tenantId") String aTenantId);



    List<SsRoleFuncD> getSsRoleFuncDSByRoleIdAndFuncNo(String aRoleId,String aFuncNo);
}
