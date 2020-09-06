package com.wenc.core.service;

import com.wenc.core.model.DictModel;

import java.util.List;

public interface DictService {

    /**
     * 获取字典
     * @return
     */
    List<DictModel> getDicts();


    /**
     * 按父类获取字典
     * @param aParentCode
     * @return
     */
    List<DictModel> getDicts(String aParentCode);
}
