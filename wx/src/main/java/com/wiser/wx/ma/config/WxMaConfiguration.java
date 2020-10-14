package com.wiser.wx.ma.config;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.config.WxMaConfig;
import cn.binarywang.wx.miniapp.config.impl.WxMaDefaultConfigImpl;
import cn.hutool.core.lang.Console;
import me.chanjar.weixin.mp.config.WxMpConfigStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 初始化小程序service.
 * @author w.li
 * @date 2020-1-8
 */
@Configuration
public class WxMaConfiguration {


    @Autowired
    private WxMaProperties wxMaProperties;

    @Bean
    public WxMaService wxMaService()
    {


        WxMaDefaultConfigImpl wxMaDefaultConfig = null;

        WxMaService wxMaService = null;


        try{




            wxMaDefaultConfig = new WxMaDefaultConfigImpl();

            wxMaDefaultConfig.setAppid(wxMaProperties.getAppid());
            wxMaDefaultConfig.setSecret(wxMaProperties.getSecret());
            wxMaDefaultConfig.setAesKey(wxMaProperties.getAesKey());
            wxMaDefaultConfig.setAccessToken(wxMaProperties.getToken());
            wxMaDefaultConfig.setMsgDataFormat(wxMaProperties.getMsgDataFormat());


            wxMaService = new WxMaServiceImpl();

            wxMaService.setWxMaConfig(wxMaDefaultConfig);

            return wxMaService;

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }


        return null;

    }
}
