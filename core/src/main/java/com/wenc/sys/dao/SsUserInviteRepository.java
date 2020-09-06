package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.SsUserInvite;
import com.wenc.core.dao.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 用户邀请表。
 *
 * @author w.z
 */
public interface SsUserInviteRepository extends BaseRepository<SsUserInvite,Long> {

    /**
     * 获取相应的邀请记录。
     *
     * @param aTenantId
     * @param aUserId
     * @param aInviteType
     * @param aInviteUser
     * @return
     */
    @Query("select a from SsUserInvite  a  " +
            "where a.tenantId = ?1 and a.userId = ?2 and a.inviteType = ?3 and a.inviteUser = ?4 and a.inviteCode = ?5 and a.state = 0 ")
    SsUserInvite getSsUserInvite(String aTenantId,String aUserId,String aInviteType,String aInviteUser,String aInviteCode );


    /**
     * 获取邀请记录
     * @param aCode
     * @return
     */
    List<SsUserInvite> getSsUserInvitesByInviteCode(String aCode);





}
