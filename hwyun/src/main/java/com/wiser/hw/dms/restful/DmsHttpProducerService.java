package com.wiser.hw.dms.restful;

import org.springframework.stereotype.Service;

@Service
public interface DmsHttpProducerService {


    void sendDms(String aTag,String aJson) throws Exception;
}
