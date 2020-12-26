package com.wiser.hw.dms.tcp.controller;

import cn.hutool.core.util.StrUtil;
import com.huawei.dms.client.entity.DmsConsumeResult;
import com.wiser.hw.dms.tcp.DmsTcpConsumeService;
import com.wiser.hw.dms.tcp.DmsTcpProducerMessage;
import com.wiser.hw.dms.tcp.dto.DmsTcpRetDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("DmsTcp")
@RestController
public class DmsTcpController {

    @Autowired
    private DmsTcpConsumeService dmsTcpConsumeService;

    @Autowired
    private DmsTcpProducerMessage dmsTcpProducerMessage;


    /**
     * 提供给外面接口进行消费TAG.
     *
     * @param session
     * @param request
     * @param response
     * @param aTag
     * @return
     */
    @RequestMapping("ConsumeDmsTag")
    public DmsTcpRetDTO<String> consumeDmsTcp(HttpSession session,
                                              HttpServletRequest request,
                                              HttpServletResponse response,
                                              @RequestParam String aTag)
    {
        DmsTcpRetDTO<String> retDTO = new DmsTcpRetDTO<>();
        List<String> retJsonList = null;
        List<DmsConsumeResult> dmsConsumeResults = null;

        DmsConsumeResult dmsConsumeResult = null;


        try
        {
            if(StrUtil.isBlank(aTag))
            {
                return retDTO.err("201","aTag not allow null");
            }

           dmsConsumeResults =  dmsTcpConsumeService.consumeDmsMessage(aTag);

           if(dmsConsumeResults == null)
           {
                return retDTO.err("202","dms consumes is empty");
           }

           retJsonList = new ArrayList<>();

            for (int i = 0; i < dmsConsumeResults.size(); i++) {

                dmsConsumeResult = dmsConsumeResults.get(i);

                if(dmsConsumeResult != null)
                {
                      retJsonList.add(
                              new String(dmsConsumeResult.getMessage().getBody())
                      );
                }

            }

          retDTO.setDataList(retJsonList);

        }catch (Exception ex)
        {
            return retDTO.err("300",ex.getMessage());
        }

        return retDTO.ok("200","success");

    }





    @RequestMapping("TestProductDmsTcp")
    public DmsTcpRetDTO<String> testProduceDmsTcp(HttpSession session,
                                              HttpServletRequest request,
                                              HttpServletResponse response,
                                              @RequestParam  String aJsonStr)
    {
        DmsTcpRetDTO<String> retDTO = new DmsTcpRetDTO<>();


        try
        {
            if(StrUtil.isBlank(aJsonStr))
            {
                return retDTO.err("201","aJsonStr not allow null");
            }

            dmsTcpProducerMessage.sendDms("KTS-PAYMENT",aJsonStr);

        }catch (Exception ex)
        {
            ex.printStackTrace();
            return retDTO.err("300",ex.getMessage());
        }

        return retDTO.ok("200","success");
    }


}
