package com.wenc.sys.service.impl;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.wenc.sys.dao.SsSerialnoRepository;
import com.wenc.sys.service.SerialnoService;
import com.wenc.commdomain.pojo.core.SsSerialno;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 系列号流水。
 *
 * @author b.v
 */
@Service
public class SerialnoServiceImpl implements SerialnoService {


    private Logger LOG = LoggerFactory.getLogger(SerialnoServiceImpl.class);


    @Autowired
    protected SsSerialnoRepository serialnoRepository;


    /**
     * 根据序号代码产生全系统唯一流水号。
     *
     * @param aSerialCode
     * @return
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public String getSerailNo(String aSerialCode) throws Exception {

        String retBillno = "";
        SsSerialno ssSerialno = null;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        Date currDate = null;
        Date serailDate = null;

        String tmpSerialNo = "";

        try {

            //先获取当前流水对象。

            ssSerialno = serialnoRepository.findSsSerialnoBySerialCode(aSerialCode);

            if (ssSerialno == null) {
                throw new Exception("无法获取有效序号对象!");
            }

            //判断日期是否是当天

            if (ssSerialno.getCurrDate() == null) {
                ssSerialno.setCurrDate(new Timestamp(System.currentTimeMillis()));
                ssSerialno.setSerialNo(1);

            } else {

                serailDate = ssSerialno.getCurrDate();
                currDate = new Date();


                //是当天的日期
                if (DateUtil.between(serailDate, currDate, DateUnit.DAY) == 0) {

                    ssSerialno.setSerialNo(ssSerialno.getSerialNo() + 1);
                } else {
                    ssSerialno.setCurrDate(new Timestamp(System.currentTimeMillis()));
                    //非当天从1开始
                    ssSerialno.setSerialNo(1);
                }


            }

            //重新设置

            serialnoRepository.save(ssSerialno);


            //返回流水信息。
            //形如:前缀+yyyyMMdd+000000001的形式。
            if (ssSerialno.getPreStr() != null && !ssSerialno.getPreStr().trim().equals("")) {
                retBillno = ssSerialno.getPreStr().trim();
            }

            //前缀+日期
            retBillno = retBillno + simpleDateFormat.format(ssSerialno.getCurrDate());

            //判断流水。
            tmpSerialNo = "000000000".substring(0, 9 - String.valueOf(ssSerialno.getSerialNo()).length())
                    + String.valueOf(ssSerialno.getSerialNo());


            retBillno = retBillno.trim() + tmpSerialNo.trim();


        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        }


        return retBillno;
    }

    /**
     * 生成纯粹流水号格式序号。
     *
     * @param aSerialCode
     * @return
     * @throws Exception
     */
    @Override
    public String getSerialNoWithPureNumber(String aSerialCode) throws Exception {


        String retBillno = "";
        SsSerialno ssSerialno = null;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        Date currDate = null;
        Date serailDate = null;

        String tmpSerialNo = "";

        try {

            //先获取当前流水对象。

            ssSerialno = serialnoRepository.findSsSerialnoBySerialCode(aSerialCode);

            if (ssSerialno == null) {
                throw new Exception("无法获取有效序号对象!");
            }

            //判断日期是否是当天

            if (ssSerialno.getCurrDate() == null) {
                ssSerialno.setCurrDate(new Timestamp(System.currentTimeMillis()));
                ssSerialno.setSerialNo(1);

            } else {

                serailDate = ssSerialno.getCurrDate();
                currDate = new Date();


                //是当天的日期

                ssSerialno.setSerialNo(ssSerialno.getSerialNo() + 1);
                ssSerialno.setCurrDate(new Timestamp(System.currentTimeMillis()));

//                if (DateUtil.between(serailDate, currDate, DateUnit.DAY) == 0) {
//
//                    ssSerialno.setSerialNo(ssSerialno.getSerialNo() + 1);
//                } else {
//                    ssSerialno.setCurrDate(new Timestamp(System.currentTimeMillis()));
//                    //非当天从1开始
//                    ssSerialno.setSerialNo(1);
//                }


            }

            //重新设置

            serialnoRepository.save(ssSerialno);


            //返回流水信息。
            //形如:前缀+yyyyMMdd+000000001的形式。
            if (ssSerialno.getPreStr() != null && !ssSerialno.getPreStr().trim().equals("")) {
                retBillno = ssSerialno.getPreStr().trim();
            }


            //判断流水。
            tmpSerialNo = "00000000000000000".substring(0, 17 - String.valueOf(ssSerialno.getSerialNo()).length())
                    + String.valueOf(ssSerialno.getSerialNo());


            retBillno = retBillno.trim() + tmpSerialNo.trim();


        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        }


        return retBillno;
    }

    /**
     * 生成纯碎流水，并指定长度。
     *
     * <p>modify:修改bug，不管是否当天都按流水增加</p>
     * @param aSerailCode
     * @param aLength
     * @return
     * @throws Exception
     */
    @Override
    public String getSerailNoWithPureNumber(String aSerailCode, int aLength) throws Exception {
        String retBillno = "";
        SsSerialno ssSerialno = null;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        Date currDate = null;
        Date serailDate = null;

        String tmpSerialNo = "";

        try {

            //先获取当前流水对象。

            ssSerialno = serialnoRepository.findSsSerialnoBySerialCode(aSerailCode);

            if (ssSerialno == null) {
                throw new Exception("无法获取有效序号对象!");
            }

            //判断日期是否是当天

            if (ssSerialno.getCurrDate() == null) {
                ssSerialno.setCurrDate(new Timestamp(System.currentTimeMillis()));
                ssSerialno.setSerialNo(1);

            } else {

                serailDate = ssSerialno.getCurrDate();
                currDate = new Date();


                ssSerialno.setSerialNo(ssSerialno.getSerialNo() + 1);
                ssSerialno.setCurrDate(new Timestamp(System.currentTimeMillis()));

//                //是当天的日期
//                if (DateUtil.between(serailDate, currDate, DateUnit.DAY) == 0) {
//
//                    ssSerialno.setSerialNo(ssSerialno.getSerialNo() + 1);
//                } else {
//                    ssSerialno.setCurrDate(new Timestamp(System.currentTimeMillis()));
//                    //非当天从1开始
//                    ssSerialno.setSerialNo(1);
//                }


            }

            //重新设置

            serialnoRepository.save(ssSerialno);


            //返回流水信息。
            //形如:前缀+yyyyMMdd+000000001的形式。
            if (ssSerialno.getPreStr() != null && !ssSerialno.getPreStr().trim().equals("")) {
                retBillno = ssSerialno.getPreStr().trim();
            }


            //判断流水。
            tmpSerialNo = "00000000000000000".substring(0, aLength - String.valueOf(ssSerialno.getSerialNo()).length())
                    + String.valueOf(ssSerialno.getSerialNo());


            retBillno = retBillno.trim() + tmpSerialNo.trim();


        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        }


        return retBillno;
    }

    /**
     * 生成类似yyyymmdd0001格式的流水序号。
     *
     * @param aSerialCode
     * @return
     * @throws Exception
     */
    @Override
    public String getYearMonDaySerialNo(String aSerialCode) throws Exception {
        String retBillno = "";
        SsSerialno ssSerialno = null;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

        Date currDate = null;
        Date serailDate = null;

        String tmpSerialNo = "";

        String tmpDateStr = "";

        try {

            //先获取当前流水对象。

            ssSerialno = serialnoRepository.findSsSerialnoBySerialCode(aSerialCode);

            if (ssSerialno == null) {
                throw new Exception("无法获取有效序号对象!");
            }

            //获取当天日期形式。
            tmpDateStr = simpleDateFormat.format(new Date());

            //判断日期是否是当天

            if (ssSerialno.getCurrDate() == null) {
                ssSerialno.setCurrDate(new Timestamp(System.currentTimeMillis()));
                ssSerialno.setSerialNo(1);

            } else {

                serailDate = ssSerialno.getCurrDate();
                currDate = new Date();


                //是当天的日期
                if (DateUtil.between(serailDate, currDate, DateUnit.DAY) == 0) {

                    ssSerialno.setSerialNo(ssSerialno.getSerialNo() + 1);
                } else {
                    ssSerialno.setCurrDate(new Timestamp(System.currentTimeMillis()));
                    //非当天从1开始
                    ssSerialno.setSerialNo(1);
                }


            }

            //重新设置

            serialnoRepository.save(ssSerialno);


            //返回流水信息。
            //形如:前缀+yyyyMMdd+000000001的形式。
            if (ssSerialno.getPreStr() != null && !ssSerialno.getPreStr().trim().equals("")) {
                retBillno = ssSerialno.getPreStr().trim();
            }


            //判断流水。
            tmpSerialNo = "0000".substring(0, 4 - String.valueOf(ssSerialno.getSerialNo()).length())
                    + String.valueOf(ssSerialno.getSerialNo());


            retBillno = retBillno.trim() + tmpDateStr.trim() +  tmpSerialNo.trim();


        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        }


        return retBillno;
    }
}
