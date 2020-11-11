package com.wiser.aliyun.mq.service.impl;

import cn.hutool.http.HttpUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wiser.aliyun.mq.config.AliyunMqConfig;
import com.wiser.aliyun.mq.dto.WiserMqRetDTO;
import com.wiser.aliyun.mq.service.AliMqService;
import me.chanjar.weixin.common.util.json.GsonHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AliMqServiceImpl implements AliMqService {


    @Autowired
    private AliyunMqConfig aliyunMqConfig;

    /**
     * 向部署在内网的MQ接口发送信息。
     *
     * @param aTag
     * @param aJson
     * @return
     * @throws Exception
     */
    @Override
    public WiserMqRetDTO sendMQ(String aTag, String aJson) throws Exception {

        Map<String,Object> paramMaps = new HashMap<>();

        String retStr = "";

        WiserMqRetDTO<String> wiserMqRetDTO = null;

        Gson gson = new Gson();

        try
        {
            paramMaps.put("aTags",aTag);
            paramMaps.put("aJson",aJson);

            retStr = HttpUtil.post(aliyunMqConfig.getSendUrl(),paramMaps);

            if(retStr != null && !retStr.trim().equals(""))
            {
                wiserMqRetDTO = gson.fromJson(retStr,new TypeToken<WiserMqRetDTO<String>>(){}.getType());

                if(wiserMqRetDTO != null)
                {
                    return wiserMqRetDTO;
                }
            }


        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }

        return null;
    }
}
