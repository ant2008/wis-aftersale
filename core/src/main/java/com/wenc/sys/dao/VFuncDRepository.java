package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.VbFuncD;
import com.wenc.core.dao.BaseRepository;

import java.util.List;

public interface VFuncDRepository extends BaseRepository<VbFuncD,Long> {

    /**
     * 获取功能号下所有审核权限。
     *
     * @param aFuncNo
     * @return
     */
    List<VbFuncD> findVbFuncDSByFuncNo(String aFuncNo);
}
