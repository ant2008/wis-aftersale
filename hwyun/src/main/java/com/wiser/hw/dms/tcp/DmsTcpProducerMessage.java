package com.wiser.hw.dms.tcp;

public interface DmsTcpProducerMessage {

    void sendDms(String aTag,String aJson) throws Exception;
}
