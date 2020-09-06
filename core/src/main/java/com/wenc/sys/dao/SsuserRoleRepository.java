package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.SsUserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SsuserRoleRepository extends CrudRepository<SsUserRole, Long> {

    @Query("From SsUserRole a where a.userId = :userid")
    List<SsUserRole> getRoleList(@Param("userid") String aUserId);


    /**
     * 获取用户ID下的角色。
     *
     * @param aUserId
     * @param aTenantId
     * @return
     */
    List<SsUserRole> findSsUserRolesByUserIdAndTenantId(String aUserId, String aTenantId);

}
