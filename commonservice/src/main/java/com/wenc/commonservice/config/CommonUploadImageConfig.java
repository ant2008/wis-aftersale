package com.wenc.commonservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("wiser.upload")
public class CommonUploadImageConfig {

    //默认显示图片路径
    private String defaImgPathUrl;

    //默认上传图片路径
    private String defaImgUploadPath;

    public String getDefaImgUploadPath() {
        return defaImgUploadPath;
    }

    public void setDefaImgUploadPath(String defaImgUploadPath) {
        this.defaImgUploadPath = defaImgUploadPath;
    }

    public String getDefaImgPathUrl() {
        return defaImgPathUrl;
    }

    public void setDefaImgPathUrl(String defaImgPathUrl) {
        this.defaImgPathUrl = defaImgPathUrl;
    }
}
