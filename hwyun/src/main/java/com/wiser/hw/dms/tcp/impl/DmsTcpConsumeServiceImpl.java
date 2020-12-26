package com.wiser.hw.dms.tcp.impl;

import com.cloud.sdk.ServiceException;
import com.huawei.dms.client.consume.DmsConsumer;
import com.huawei.dms.client.consume.DmsConsumerImpl;
import com.huawei.dms.client.entity.DmsConsumeResult;
import com.huawei.dms.protocol.consume.entity.DmsCommitItem;
import com.huawei.dms.protocol.consume.entity.DmsCommitRequest;
import com.huawei.dms.protocol.consume.entity.DmsCommitResult;
import com.wiser.hw.dms.restful.DmsResponseMessage;
import com.wiser.hw.dms.tcp.DmsTcpConsumeService;
import com.wiser.hw.dms.tcp.config.DmsTcpConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DmsTcpConsumeServiceImpl implements DmsTcpConsumeService {

    private Logger LOG = LoggerFactory.getLogger(DmsTcpProducerMessageImpl.class);

    @Autowired
    private DmsTcpConfig dmsTcpConfig;

    @Override
    public List<DmsConsumeResult> consumeDmsMessage(String aTag) throws Exception {

        DmsConsumer consumer = null;
        List<DmsConsumeResult>  dmsConsumeResults = null;
        DmsCommitRequest commitRequest = null;
        List<DmsCommitItem> dmsCommitItems = null;
        DmsCommitResult commitResult = null;

        try{

            LOG.info("start to dms tcp consume msg.");

            //1、创建并启动消费实例
            consumer = new DmsConsumerImpl();
            consumer.start();

            //2、消费消息
             dmsConsumeResults = consumer.consume(dmsTcpConfig.getDmsQueueId(),
                     dmsTcpConfig.getDmsQueueGroupId());

            if (dmsConsumeResults == null || dmsConsumeResults.size() == 0)
            {
                LOG.info("dms tcp consume no message.");
                return null;
            }

            //3、构建确认请求
            commitRequest = new DmsCommitRequest();
             dmsCommitItems = new ArrayList<>();

            for (DmsConsumeResult record : dmsConsumeResults)
            {
                LOG.info("Tcp dms commit item handler is {}",record.getHandler());
                DmsCommitItem commitItem = new DmsCommitItem();
                //确认时需要回填对应消息handler
                commitItem.setHandler(record.getHandler());
                //设置消息处理状态: true or false
                commitItem.setStatus(true);
                //如果是重投，需要设置为true
                //commitItem.setRedeliver(true);
                dmsCommitItems.add(commitItem);
            }
            //一次可确认多条消息
            commitRequest.setMessage(dmsCommitItems);

            //4、确认消息
            commitResult = consumer.commit(dmsTcpConfig.getDmsQueueId(),
                    dmsTcpConfig.getDmsQueueGroupId(),
                    commitRequest);
            // 确认状态统计： succeed：m条，fail：n条
           LOG.info("succeed:{},fail:{}",commitResult.getSuccess(),commitResult.getFail());

            //5、停止消费
            consumer.stop();


        }catch (ServiceException ex)
        {
            throw new Exception(ex.getMessage());
        }

        return dmsConsumeResults;

    }
}
