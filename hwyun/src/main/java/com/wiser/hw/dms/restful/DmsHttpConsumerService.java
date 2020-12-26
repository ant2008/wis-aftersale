package com.wiser.hw.dms.restful;

import java.util.List;

public interface DmsHttpConsumerService {

     ResponseMessage consumerMessage(String aTag) throws Exception;


     List<DmsResponseMessage> consumeDmsMessage(String aTag) throws Exception;


     void testConsumeDmsMessage() throws Exception;
}
