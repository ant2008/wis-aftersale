package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.VFuncRight;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface VFuncRightRepository extends CrudRepository<VFuncRight, Long> {


    @Query("from VFuncRight a where a.userId = :userid  and a.funcNo=:funcno ")
    List<VFuncRight> getVFuncRightsByUserIdAndFuncNo(@Param("userid") String aUserid, @Param("funcno") String aFuncNo);


    /**
     * 根据用户ID返回权限列表(只返回激活和状态正常部分)
     *
     * @param aUserId
     * @return
     */
    @Query("from VFuncRight v where  v.userId = :userid and ( v.funcState = 1 and v.funcActive = 1 and v.rfuncStatus = 1 ) order by v.menuorder asc")
    List<VFuncRight> getVFuncRightsByUserId(@Param("userid") String aUserId);


    /**
     * 按用户ID和功能号返回生效可用的菜单权限
     *
     * @param aUserid
     * @param aFuncNo
     * @return
     */
    @Query("from VFuncRight a where a.userId = :userid  and a.funcNo=:funcno and a.funcActive = 1 and a.funcState = 1 and a.rfuncStatus = 1")
    VFuncRight getUseVFuncRightsByUserIdAndFuncNo(@Param("userid") String aUserid, @Param("funcno") String aFuncNo);


}
