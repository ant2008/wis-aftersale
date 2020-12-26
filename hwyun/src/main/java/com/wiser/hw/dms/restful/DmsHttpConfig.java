package com.wiser.hw.dms.restful;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:dms-service-config.properties"},ignoreResourceNotFound = false,encoding = "UTF-8")
public class DmsHttpConfig {

    @Value("${dms.service.endpoint.url}")
    private String dmsUrl;

    @Value("${dms.service.region}")
    private String dmsRegion;

    @Value("${dms.service.projectId}")
    private String projectId;

    @Value("${dms.service.ak}")
    private String ak;

    @Value("${dms.service.sk}")
    private String sk;

    @Value("${dms.service.queueId}")
    private String queueId;

    @Value("${dms.service.queueGroupId}")
    private String  queueGroupId;

    public String getQueueGroupId() {
        return queueGroupId;
    }

    public void setQueueGroupId(String queueGroupId) {
        this.queueGroupId = queueGroupId;
    }

    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public String getDmsUrl() {
        return dmsUrl;
    }

    public void setDmsUrl(String dmsUrl) {
        this.dmsUrl = dmsUrl;
    }

    public String getDmsRegion() {
        return dmsRegion;
    }

    public void setDmsRegion(String dmsRegion) {
        this.dmsRegion = dmsRegion;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }
}
