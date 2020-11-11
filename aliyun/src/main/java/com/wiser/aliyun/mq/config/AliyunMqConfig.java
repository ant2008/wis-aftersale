package com.wiser.aliyun.mq.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:aliyun-mq.properties"},ignoreResourceNotFound = false,encoding = "UTF-8")
public class AliyunMqConfig {

    @Value("${aliyun.mq.server.send.url}")
    private String sendUrl;

    public String getSendUrl() {
        return sendUrl;
    }

    public void setSendUrl(String sendUrl) {
        this.sendUrl = sendUrl;
    }
}
