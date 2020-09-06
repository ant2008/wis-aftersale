package com.wenc.sys.service;

/**
 * 唯一系列号服务。
 *
 * @author b.v
 */
public interface SerialnoService {


    /**
     * 根据序号代码产生全系统唯一流水号。
     *
     * @param aSerialCode
     * @return
     * @throws Exception
     */
    String getSerailNo(String aSerialCode) throws Exception;


    /**
     * 生成纯粹流水号格式序号。
     *
     * @param aSerialCode
     * @return
     * @throws Exception
     */
    String getSerialNoWithPureNumber(String aSerialCode) throws Exception;

    /**
     * 生成纯碎流水，并指定长度。
     *
     * @param aSerailCode
     * @param aLength
     * @return
     * @throws Exception
     */
    String getSerailNoWithPureNumber(String aSerailCode,int aLength) throws Exception;


    /**
     * 生成类似yyyymmdd0001格式的流水序号。
     * @param aSerialCode
     * @return
     * @throws Exception
     */
    String getYearMonDaySerialNo(String aSerialCode) throws Exception;


}
