package com.wiser.wx.pay.request;

import cn.hutool.core.util.StrUtil;
import com.github.binarywang.wxpay.bean.request.BaseWxPayRequest;
import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.constant.WxPayConstants;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.util.SignUtils;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.commons.lang3.StringUtils;

@XStreamAlias("xml")
public class WxPayCallRequest {


    @XStreamAlias("appId")
    private String appId;

    @XStreamAlias("timeStamp")
    private String wxTimeStamp;

    @XStreamAlias("nonceStr")
    private String nonceStr;

    @XStreamAlias("signType")
    private String signType;

    @XStreamAlias("paySign")
    private String paySign;

    @XStreamAlias("package")
    private String packAge;




//        if ("NATIVE".equals(this.getTradeType()) && StringUtils.isBlank(this.getProductId())) {
//            throw new WxPayException("当trade_type是'NATIVE'时，需指定非空的product_id值");
//        }


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getWxTimeStamp() {
        return wxTimeStamp;
    }

    public void setWxTimeStamp(String wxTimeStamp) {
        this.wxTimeStamp = wxTimeStamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }

    public void checkAndSign(WxPayConfig config) throws WxPayException {



        if(config == null)
        {
            throw new WxPayException("请先设置基础配置");
        }

        if(this.getPackAge() == null)
        {
            throw new WxPayException("请先设置prePayId");
        }




        this.setAppId(config.getAppId());
        this.setSignType(WxPayConstants.SignType.MD5);

        if (StringUtils.isBlank(this.getSignType())) {
            if (config.getSignType() != null && !WxPayConstants.SignType.ALL_SIGN_TYPES.contains(config.getSignType())) {
                throw new WxPayException("非法的signType配置：" + config.getSignType() + "，请检查配置！");
            }

            this.setSignType(StringUtils.trimToNull(config.getSignType()));
        } else if (!WxPayConstants.SignType.ALL_SIGN_TYPES.contains(this.getSignType())) {
            throw new WxPayException("非法的sign_type参数：" + this.getSignType());
        }

        if (StringUtils.isBlank(this.getNonceStr())) {

            this.setWxTimeStamp(String.valueOf(System.currentTimeMillis()));
            this.setNonceStr(String.valueOf(System.currentTimeMillis()));
        }

        this.setPaySign(SignUtils.createSign(this, this.getSignType(), config.getMchKey(), null));



    }


    public String getPackAge() {
        return packAge;
    }

    public void setPackAge(String packAge) {
        this.packAge = packAge;
    }


    public String buildPageAge(String aPrePayId)
    {
          String  preffix = "prepay_id=";

          if(aPrePayId == null || aPrePayId.trim().equals(""))
          {
              return null;
          }

          this.setPackAge(preffix.trim()+aPrePayId.trim());

          return getPackAge();
    }

}
