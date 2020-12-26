package com.wiser.hw.dms.restful.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.wiser.hw.dms.restful.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.wiser.hw.dms.restful.ApiUtils.*;

@Service
public class DmsHttpConsumerServiceImpl implements DmsHttpConsumerService {

    private String endpointUrl = null;

    private static String serviceName = "dms";

    private static int DMS_MESSAGE_LIMIT = 5;


    @Autowired
    private DmsHttpConfig dmsHttpConfig;

    @Autowired
    private DmsHttpProducerService dmsHttpProducerService;

    @Override
    public ResponseMessage consumerMessage(String aTag) throws Exception {

        ResponseMessage consumeMessagesResMsg = null;

         ArrayList<String> handlerIds = null;

        Gson gson = new Gson();

        List<DmsResponseMessage> dmsResponseMessageList= null;


        try{

            endpointUrl = dmsHttpConfig.getDmsUrl();

            if (endpointUrl.endsWith("/"))
            {
                endpointUrl = endpointUrl + "v1.0/";
            }
            else
            {
                endpointUrl = endpointUrl + "/v1.0/";
            }

            consumeMessagesResMsg = consumeMessages(dmsHttpConfig.getQueueId(),
                    dmsHttpConfig.getQueueGroupId(),
                    DMS_MESSAGE_LIMIT,
                    dmsHttpConfig.getProjectId(),
                    endpointUrl,
                    serviceName,
                    dmsHttpConfig.getDmsRegion(),
                    dmsHttpConfig.getAk(),
                    dmsHttpConfig.getSk(),
                    aTag);


            handlerIds = parseHandlerIds(consumeMessagesResMsg);

            if(handlerIds!= null) {
                System.out.println("已消费信息:" + handlerIds.get(0));
            }

            //Acknowledge Message
            if (handlerIds.size() > 0)
            {

                acknowledgeMessages(handlerIds,
                        dmsHttpConfig.getQueueGroupId(),
                        dmsHttpConfig.getQueueId(),
                        dmsHttpConfig.getProjectId(),
                        endpointUrl,
                        serviceName,
                        dmsHttpConfig.getDmsRegion(),
                        dmsHttpConfig.getAk(),
                        dmsHttpConfig.getSk());



                //转化成需要对象。

                dmsResponseMessageList = gson.fromJson(consumeMessagesResMsg.getBody(),
                        new TypeToken<List<DmsResponseMessage>>(){}.getType());


                System.out.println("转化对象个数:"+dmsResponseMessageList.size());

            }



        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }

        return consumeMessagesResMsg;
    }

    @Override
    public List<DmsResponseMessage> consumeDmsMessage(String aTag) throws Exception {


        ResponseMessage consumeMessagesResMsg = null;

        ArrayList<String> handlerIds = null;

        Gson gson = new Gson();

        List<DmsResponseMessage> dmsResponseMessageList= null;


        try{

            endpointUrl = dmsHttpConfig.getDmsUrl();

            if (endpointUrl.endsWith("/"))
            {
                endpointUrl = endpointUrl + "v1.0/";
            }
            else
            {
                endpointUrl = endpointUrl + "/v1.0/";
            }

            consumeMessagesResMsg = consumeMessages(dmsHttpConfig.getQueueId(),
                    dmsHttpConfig.getQueueGroupId(),
                    DMS_MESSAGE_LIMIT,
                    dmsHttpConfig.getProjectId(),
                    endpointUrl,
                    serviceName,
                    dmsHttpConfig.getDmsRegion(),
                    dmsHttpConfig.getAk(),
                    dmsHttpConfig.getSk(),
                    aTag);


            handlerIds = parseHandlerIds(consumeMessagesResMsg);

            if(handlerIds!= null && handlerIds.size() > 0 ) {
                System.out.println("已消费信息:" + handlerIds.get(0));
            }

            //Acknowledge Message
            if (handlerIds!= null && handlerIds.size() > 0)
            {

                acknowledgeMessages(handlerIds,
                        dmsHttpConfig.getQueueGroupId(),
                        dmsHttpConfig.getQueueId(),
                        dmsHttpConfig.getProjectId(),
                        endpointUrl,
                        serviceName,
                        dmsHttpConfig.getDmsRegion(),
                        dmsHttpConfig.getAk(),
                        dmsHttpConfig.getSk());



                //转化成需要对象。

                dmsResponseMessageList = gson.fromJson(consumeMessagesResMsg.getBody(),
                        new TypeToken<List<DmsResponseMessage>>(){}.getType());


                System.out.println("转化对象个数:"+dmsResponseMessageList.size());

            }



        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }

        return dmsResponseMessageList;
    }


    //@Scheduled(cron = "0 0/2 * * * ? ")
    @Override
    public void testConsumeDmsMessage() throws Exception {

        List<DmsResponseMessage> dmsResponseMessageList = null;

        try{

            System.out.println("开始进行作业......");

            dmsResponseMessageList =   consumeDmsMessage("KTS-PAYMENT");

            if(dmsResponseMessageList != null && dmsResponseMessageList.size() > 0)
            {
                for (int i = 0; i < dmsResponseMessageList.size(); i++) {
                    System.out.println("检索信息为:["+i+"]="+dmsResponseMessageList.get(i).getMessage().getBody());

                    if(dmsResponseMessageList.get(i).getMessage().getBody().trim().equals("Query"))
                    {
                        System.out.println("进行数据库查询操作!");
                        dmsHttpProducerService.sendDms("HYYS-KTS-PAYMENT","This is a test");

                    }
                }

            }else
            {
                System.out.println("本次无消费信息!");
            }

            System.out.println("作业结束!");

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
