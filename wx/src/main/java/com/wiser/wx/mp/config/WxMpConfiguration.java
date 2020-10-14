package com.wiser.wx.mp.config;

import cn.hutool.core.lang.Console;
import com.binarywang.spring.starter.wxjava.mp.properties.WxMpProperties;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.config.WxMpConfigStorage;
import me.chanjar.weixin.mp.config.impl.WxMpDefaultConfigImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@Configuration
public class WxMpConfiguration {

    @Autowired
    private WxMpPropties wxMpProperties;

    @Bean
    public WxMpService wxMpService() {

        List<WxMpConfigStorage> configs = null;

        WxMpDefaultConfigImpl configStorage = null;

        WxMpService wxService = null;

        Map<String,WxMpConfigStorage> wxMpConfigStorageMap = null;


        try{

            configs = new ArrayList<>();

            configStorage = new WxMpDefaultConfigImpl();

            configStorage.setAppId(wxMpProperties.getAppId());
            configStorage.setSecret(wxMpProperties.getSecret());
            configStorage.setToken(wxMpProperties.getToken());
            configStorage.setAesKey(wxMpProperties.getAesKey());


            configs.add(configStorage);

            //生成wxservice

            wxService = new WxMpServiceImpl();

            wxMpConfigStorageMap =
                    configs
                    .stream()
                    .collect(Collectors.toMap(
                            WxMpConfigStorage::getAppId,v->v,(k,v)->v));

            if(wxMpConfigStorageMap == null ||
            wxMpConfigStorageMap.isEmpty())
            {
                Console.log("转化MAP对象为空!");
                return null;
            }

            wxService.setMultiConfigStorages(wxMpConfigStorageMap);




        }catch (Exception ex)
        {
           ex.printStackTrace();
        }
        return wxService;
    }
}
