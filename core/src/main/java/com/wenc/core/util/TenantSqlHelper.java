package com.wenc.core.util;

public class TenantSqlHelper {


    /**
     * 判断是否存在tenant_id字段
     *
     * @param aSql
     * @return
     */
    public static boolean ifExistTenantId(String aSql) {

        if (aSql == null || aSql.trim().equals("")) {
            return false;
        }

        if (aSql.trim().toLowerCase().indexOf("tenantid =") > 0) {
            return true;
        }

        return false;
    }
}
