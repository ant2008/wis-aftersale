package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.SsRole;
import com.wenc.core.dao.BaseRepository;
import com.wenc.core.model.DictModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 角色
 */
public interface SsRoleRepository extends BaseRepository<SsRole, Long> {

    /**
     * 获取所有角色列表。
     *
     * @param aTenantId
     * @return
     */
    List<SsRole> findSsRolesByTenantId(String aTenantId);


    /**
     * 获取角色字典。
     *
     * @return
     */
    @Query("select new com.wenc.core.model.DictModel(a.roleName,a.roleId) from SsRole  a ")
    List<DictModel> getSsRoleDicts();


    @Query(" select a from SsRole a where a.state = 1")
    List<SsRole> findAllRoles();
}
