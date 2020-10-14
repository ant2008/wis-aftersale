package com.wiser.wx.ma.service;

import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;

/**
 * 小程序service
 * @author w.li
 * @date 2020-01-08
 */
public interface WxMiniAppService {

    /**
     * 小程序验证
     *
     * @param aCode
     * @return
     * @throws Exception
     */
    WxMaJscode2SessionResult wxCodeSession(String aCode) throws Exception;
}
