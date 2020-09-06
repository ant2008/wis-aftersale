package com.wenc.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:funcexclude.properties"},ignoreResourceNotFound = false,encoding = "UTF-8")
public class FuncExcludeConfig {


    @Value("${excludefuncs}")
    protected String[] excludeFuncArray;

    @Value("${notAutoTenants}")
    protected String[] notAutoTenantsFuncArr;


    public String[] getNotAutoTenantsFuncArr() {
        return notAutoTenantsFuncArr;
    }

    public void setNotAutoTenantsFuncArr(String[] notAutoTenantsFuncArr) {
        this.notAutoTenantsFuncArr = notAutoTenantsFuncArr;
    }

    public String[] getExcludeFuncArray() {
        return excludeFuncArray;
    }

    public void setExcludeFuncArray(String[] excludeFuncArray) {
        this.excludeFuncArray = excludeFuncArray;
    }
}
