package com.wiser.wx.ma.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.hutool.core.util.StrUtil;
import com.wenc.core.exception.ServiceException;
import com.wenc.core.util.LogHelper;
import com.wiser.wx.ma.service.WxMiniAppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WxMiniAppServiceImpl implements WxMiniAppService {


    private Logger LOG = LoggerFactory.getLogger(WxMiniAppServiceImpl.class);

    @Autowired
    private WxMaService wxMaService;

    /**
     * 小程序验证
     *
     * @param aCode
     * @return
     * @throws Exception
     */
    @Override
    public WxMaJscode2SessionResult wxCodeSession(String aCode) throws Exception {

        WxMaJscode2SessionResult jscode2SessionResult = null;
        try
        {

            if (StrUtil.isBlank(aCode)) {
                return null;
            }
            jscode2SessionResult = wxMaService.getUserService().getSessionInfo(aCode);

            if(jscode2SessionResult == null)
            {
                throw new ServiceException("获取code session为空!");
            }

            if(jscode2SessionResult.getOpenid() == null)
            {
                throw new ServiceException("获取OpenId为空!");
            }

            LogHelper.debug(LOG,
                    "Get Wx Miniapp CodeSession openId is:{},SessionKey is:{},UnionId is: {}"
                    ,jscode2SessionResult.getOpenid()
            ,jscode2SessionResult.getSessionKey()
            ,jscode2SessionResult.getUnionid());

            return jscode2SessionResult;


        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    }
}
