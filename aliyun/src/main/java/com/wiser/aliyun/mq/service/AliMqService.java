package com.wiser.aliyun.mq.service;

import com.wiser.aliyun.mq.dto.WiserMqRetDTO;

/**
 * 处理MQ相关处理。
 * @author w.li
 * @date  2020-1-16
 * @since 1.0
 *
 */
public interface AliMqService {

    /**
     * 向部署在内网的MQ接口发送信息。
     *
     * @param aTag
     * @param aJson
     * @return
     * @throws Exception
     */
    WiserMqRetDTO sendMQ(String aTag, String aJson) throws Exception;

}
