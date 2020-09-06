package com.wenc.core.service;

import com.wenc.core.model.SelectDictModel;

import java.util.List;

public interface DictConvertService<T> {

    /**
     * 转化成select类型List接口
     * @param aList
     * @return
     */
     List<SelectDictModel> convertSelectDicts(List<T> aList);
}
