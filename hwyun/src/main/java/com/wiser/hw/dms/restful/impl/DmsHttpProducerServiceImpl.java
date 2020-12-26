package com.wiser.hw.dms.restful.impl;

import com.google.gson.Gson;
import com.wiser.hw.dms.restful.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.wiser.hw.dms.restful.ApiUtils.sendMessages;

@Service
public class DmsHttpProducerServiceImpl implements DmsHttpProducerService {

    private String endpointUrl = null;

    private static String serviceName = "dms";



    @Autowired
    private DmsHttpConfig dmsHttpConfig;

    @Override
    public void sendDms(String aTag, String aJson) throws Exception {

        SendMessageBody sendMessageBody = null;

        List<SendMessageBody> sendMessageBodies = null;
        SendMessage sendMessages = null;

        List<String> tags = null;

        String sendJson = null;

        Gson  gson = new Gson();

        HashMap<String,String> attribMap = null;

        try
        {
            endpointUrl = dmsHttpConfig.getDmsUrl();

            if (endpointUrl.endsWith("/"))
            {
                endpointUrl = endpointUrl + "v1.0/";
            }
            else
            {
                endpointUrl = endpointUrl + "/v1.0/";
            }

            if(aJson == null || aJson.trim().equals(""))
            {
                throw new Exception("无内容不允许发送!");
            }

            sendMessages = new SendMessage();

            sendMessageBodies = new ArrayList<>();
            sendMessageBody = new SendMessageBody();

            if(aTag != null)
            {
               tags = new ArrayList<>();
               tags.add(aTag);
               sendMessageBody.setTags(tags);
            }

            attribMap = new HashMap<>();

            attribMap.put("kts",String.valueOf(System.currentTimeMillis()));

            sendMessageBody.setBody(aJson);
            sendMessageBody.setAttributes(null);
            sendMessageBody.setDelayTime(Long.valueOf("60000"));
            sendMessageBody.setAttributes(attribMap);

            sendMessageBodies.add(sendMessageBody);

            sendMessages.setMessages(sendMessageBodies);
            sendMessages.setReturnId(true);


            sendJson = gson.toJson(sendMessages);


            sendMessages(sendJson,
                    dmsHttpConfig.getQueueId(),
                    dmsHttpConfig.getProjectId(),
                    endpointUrl,
                    serviceName,
                    dmsHttpConfig.getDmsRegion(),
                    dmsHttpConfig.getAk(),
                    dmsHttpConfig.getSk());


        }catch (Exception ex)
        {
            ex.printStackTrace();
            throw new Exception(ex.getMessage());
        }

    }
}
