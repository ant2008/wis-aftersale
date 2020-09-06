package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.VRoleFuncd;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface VRoleFuncdRepository extends CrudRepository<VRoleFuncd, Long> {

    @Query("from VRoleFuncd a where a.userId = :userid  and a.funcNo=:funcno and a.roleRight = :level ")
    List<VRoleFuncd> getVRoleFuncdsByUserIdAndFuncNoAndRoleRight(@Param("userid") String aUserId, @Param("funcno") String aFuncNo, @Param("level") String aLevel);


    /**
     * 返回tenant下的角色列表。
     *
     * @param aUserId
     * @param aFuncNo
     * @param aLevel
     * @param aTenantId
     * @return
     */
    List<VRoleFuncd> getVRoleFuncdsByUserIdAndFuncNoAndRoleRightAndAndTenantId(String aUserId, String aFuncNo, String aLevel, String aTenantId);



    List<VRoleFuncd>   getVRoleFuncdsByUserIdAndFuncNo(String aUserId,String aFuncNo);

}
