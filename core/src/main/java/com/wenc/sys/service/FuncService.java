package com.wenc.sys.service;

import com.wenc.commdomain.pojo.core.SsFuncD;
import com.wenc.core.model.FuncChkModel;

import java.util.List;

/**
 * @author li.w
 */
public interface FuncService {

    /**
     * 按功能号获取审核明细列表
     * @param aFuncNo 功能号
     * @return
     */
    List<SsFuncD>  getFuncDs(String aFuncNo);

    /**
     * 按照权限模型进行保存
     * @param aFuncChkModel
     * @throws Exception
     */
    void saveFuncDs(FuncChkModel aFuncChkModel) throws Exception;
}
