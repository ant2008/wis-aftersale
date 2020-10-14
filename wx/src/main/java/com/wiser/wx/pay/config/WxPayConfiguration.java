package com.wiser.wx.pay.config;

import cn.hutool.core.util.StrUtil;
import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.constant.WxPayConstants;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.service.impl.WxPayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 自动装载wxpayService
 *
 * @author w.li
 * @date 2019-1-07
 *
 * @since 1.0
 */
@Configuration
@Component
public class WxPayConfiguration {

    @Autowired
    private WxPayProperties wxPayProperties;

    @Bean
    public WxPayService  wxPayService()
    {
        WxPayService wxPayService = null;
        WxPayConfig  wxPayConfig = null;

        try{

            wxPayConfig = new WxPayConfig();

            wxPayConfig.setAppId(wxPayProperties.getAppId());
            wxPayConfig.setMchId(wxPayProperties.getMchId());
            wxPayConfig.setMchKey(wxPayProperties.getMchKey());
            if(!StrUtil.isBlank(wxPayProperties.getSubAppId())) {
                wxPayConfig.setSubAppId(wxPayProperties.getSubAppId());
            }

            if(!StrUtil.isBlank(wxPayProperties.getSubMchId()))
            {
                wxPayConfig.setSubMchId(wxPayProperties.getSubMchId());
            }

            if(!StrUtil.isBlank(wxPayProperties.getKeyPath())) {
                wxPayConfig.setKeyPath(wxPayProperties.getKeyPath());
            }


            wxPayConfig.setSignType(WxPayConstants.SignType.MD5);

            //启动沙箱
            wxPayConfig.setUseSandboxEnv(false);

            wxPayService = new WxPayServiceImpl();

            wxPayService.setConfig(wxPayConfig);

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return wxPayService;

    }

}
