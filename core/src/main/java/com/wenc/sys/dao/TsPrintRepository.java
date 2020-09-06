package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.matdata.TsPrint;
import com.wenc.core.dao.BaseRepository;

import java.util.List;

public interface TsPrintRepository extends BaseRepository<TsPrint,Long> {

    /**
     * 获取打印设置
     * @param aFuncNo
     * @return
     */
    List<TsPrint> getTsPrintsByFuncNo(String aFuncNo);
}
