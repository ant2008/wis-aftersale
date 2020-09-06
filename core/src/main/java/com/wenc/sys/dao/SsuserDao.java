package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.SsUser;
import org.springframework.data.jpa.repository.Query;


public interface SsuserDao {

    /**
     * @param aUserId
     * @return
     */
    SsUser getUser(String aUserId);


    Query testSql(String aSql);


}
