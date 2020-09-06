package com.wenc.sys.service.impl;

import com.wenc.commdomain.pojo.matdata.TsPrint;

import com.wenc.sys.dao.TsPrintRepository;
import com.wenc.sys.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 打印服务
 */
@Service
public class PrintServiceImpl implements PrintService {

    @Autowired
    protected TsPrintRepository tsPrintRepository;


    /**
     * 获取打印设置
     *
     * @param aFuncNo
     * @return
     */
    @Override
    public List<TsPrint> getPrintSetting(String aFuncNo) {
        try
        {
            return tsPrintRepository.getTsPrintsByFuncNo(aFuncNo);

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return  null;
    }



}
