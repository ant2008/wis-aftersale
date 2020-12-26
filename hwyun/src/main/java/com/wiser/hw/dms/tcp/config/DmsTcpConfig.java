package com.wiser.hw.dms.tcp.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
@PropertySource(value = {"classpath:dms.client.properties"},ignoreResourceNotFound = false,encoding = "UTF-8")
public class DmsTcpConfig {

    @Value("${dms.tcp.service.queueId}")
    private String dmsQueueId;

    @Value("${dms.tcp.service.queueGroupId}")
    private String dmsQueueGroupId;

    public String getDmsQueueId() {
        return dmsQueueId;
    }

    public void setDmsQueueId(String dmsQueueId) {
        this.dmsQueueId = dmsQueueId;
    }

    public String getDmsQueueGroupId() {
        return dmsQueueGroupId;
    }

    public void setDmsQueueGroupId(String dmsQueueGroupId) {
        this.dmsQueueGroupId = dmsQueueGroupId;
    }



}
