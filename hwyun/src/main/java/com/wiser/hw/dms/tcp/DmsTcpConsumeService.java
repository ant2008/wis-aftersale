package com.wiser.hw.dms.tcp;

import com.huawei.dms.client.entity.DmsConsumeResult;
import com.wiser.hw.dms.restful.DmsResponseMessage;

import java.util.List;

public interface DmsTcpConsumeService {

    List<DmsConsumeResult> consumeDmsMessage(String aTag) throws Exception;
}
