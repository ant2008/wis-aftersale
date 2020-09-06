package com.wenc.sys.service;

import com.wenc.commdomain.pojo.matdata.TsPrint;

import java.util.List;

public interface PrintService {

    /**
     * 获取打印设置
     * @param aFuncNo
     * @return
     */
    List<TsPrint>  getPrintSetting(String aFuncNo);

}
