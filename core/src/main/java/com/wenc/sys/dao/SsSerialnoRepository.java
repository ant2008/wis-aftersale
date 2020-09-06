package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.SsSerialno;
import org.springframework.data.repository.CrudRepository;

/**
 * 获取序列号
 *
 * @author b.v
 */
public interface SsSerialnoRepository extends CrudRepository<SsSerialno, Long> {

    /**
     * 根据序号功能获取当前序列号
     *
     * <p>notes:序号不区分tenant_id</p>
     *
     * @param aSerialCode 序号
     * @return
     */
    SsSerialno findSsSerialnoBySerialCode(String aSerialCode);


}
