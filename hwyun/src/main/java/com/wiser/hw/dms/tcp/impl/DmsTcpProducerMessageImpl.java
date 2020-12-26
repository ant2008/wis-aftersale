package com.wiser.hw.dms.tcp.impl;

import cn.hutool.core.lang.Console;
import com.cloud.sdk.ServiceException;
import com.huawei.dms.client.entity.DmsMessage;
import com.huawei.dms.client.produce.DmsProducer;
import com.huawei.dms.client.produce.DmsProducerImpl;
import com.huawei.dms.protocol.produce.DmsProduceResult;
import com.wiser.hw.dms.tcp.DmsTcpConsumeService;
import com.wiser.hw.dms.tcp.DmsTcpProducerMessage;
import com.wiser.hw.dms.tcp.config.DmsTcpConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * DMS tcp 模式
 * @author w.li
 * @date 2020-1-14
 * @since 1.0
 */
@Service
public class DmsTcpProducerMessageImpl implements DmsTcpProducerMessage {

    private Logger LOG = LoggerFactory.getLogger(DmsTcpProducerMessageImpl.class);

    @Autowired
    private DmsTcpConfig dmsTcpConfig;


    @Override
    public void sendDms(String aTag, String aJson) throws Exception {

        DmsProducer producer = null;
        List<DmsMessage> dmsMessageList = null;

        DmsMessage dmsMessage = null;

        List<DmsProduceResult> result = null;
        List<String> dmsTags = null;

        try
        {

            LOG.info("start to dms tcp produce msg.");
            Console.log("start to dms tcp produce msg.");
            //1、创建producer，并启动
            producer = new DmsProducerImpl();
            producer.start();

            //2、构建消息

            dmsMessageList = new ArrayList<>();
            dmsTags = new ArrayList<>();

            dmsMessage = new DmsMessage();

            //设置tag
            dmsTags.add(aTag);

            //设置消息内容
            LOG.info("send dms message content:{}",aJson);
            dmsMessage.setBody(aJson.getBytes());
            dmsMessage.setTags(dmsTags);

            dmsMessageList.add(dmsMessage);

            //3、发送消息
            result = producer.produce(dmsTcpConfig.getDmsQueueId(), dmsMessageList);

                result.forEach(r ->
                {
                    Console.log("send tcp dms return-state:{},errCode:{},errMsg:{}",
                            r.getState(),r.getErrorCode(),r.getError());
                    LOG.debug("send tcp dms return-state:{},errCode:{},errMsg:{}",
                            r.getState(),r.getErrorCode(),r.getError());
                });


            //4、停止生产
            producer.stop();

        }catch (ServiceException ex)
        {
            throw new Exception(ex.getMessage());
        }
    }
}
