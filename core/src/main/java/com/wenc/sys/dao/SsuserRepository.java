package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.SsUser;
import com.wenc.core.model.DictModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SsuserRepository extends CrudRepository<SsUser, Long> {


    /**
     * 按用户ID获取用户信息
     *
     * @param aUserid
     * @return
     */
    @Query("select t from SsUser t where t.userId=:userid")
    SsUser findSsUserByUserId(@Param("userid") String aUserid);


    /**
     * 按用户ID和密码对用户进行校验
     *
     * @param aUserID
     * @param aMd5Pwd
     * @return
     */
    @Query("select t from SsUser t where t.userId=:userid and t.userPass = :pwd ")
    SsUser validate(@Param("userid") String aUserID, @Param("pwd") String aMd5Pwd);


    /**
     * 根据tenantid获取用户信息。
     *
     * @param aUserId
     * @param aTenantId
     * @return
     */
    SsUser findSsUserByUserIdAndTenantId(String aUserId, String aTenantId);


    /**
     * 获取
     * @param aTenantId
     * @return
     */
    @Query(" select new com.wenc.core.model.DictModel(a.userName,a.userId) from SsUser  a where a.tenantId = ?1 ")
    List<DictModel>  getUserDict(String aTenantId);


    /**
     * 按手机获取用户。
     * @param aTelNo
     * @return
     */
    SsUser  getSsUserByMobileno(String aTelNo);


    /**
     * 获取租户下用户列表。
     *
     * @param aTenantId
     * @param aState
     * @return
     */
    List<SsUser> getSsUsersByTenantIdAndState(String aTenantId,int aState);


    /**
     *
     * @param aTenantId
     * @return
     */
    @Query("select a from SsUser a where a.tenantId = ?1 and a.ifMasterUser = '1' ")
    SsUser getTenantDefaultUser(String aTenantId);


}
