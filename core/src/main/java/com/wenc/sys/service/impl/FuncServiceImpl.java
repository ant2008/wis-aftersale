package com.wenc.sys.service.impl;

import com.wenc.commdomain.pojo.core.SsFuncD;
import com.wenc.core.model.FuncChkModel;
import com.wenc.sys.dao.SsFuncDRepository;
import com.wenc.sys.dao.SsFuncHRepository;
import com.wenc.sys.service.FuncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * 权限设置相关Service
 *
 * @author li.w
 */
@Service
public class FuncServiceImpl implements FuncService {

    @Autowired
    private SsFuncDRepository ssFuncDRepository;

    @Autowired
    private SsFuncHRepository ssFuncHRepository;


    /**
     * 按功能号获取审核明细列表
     *
     * @param aFuncNo 功能号
     * @return
     */
    @Override
    public List<SsFuncD> getFuncDs(String aFuncNo) {
        return ssFuncDRepository.getFuncList(aFuncNo);
    }

    /**
     * 按照权限模型进行保存
     *
     * @param aFuncChkModel
     * @throws Exception
     */
    @Override
    public void saveFuncDs(FuncChkModel aFuncChkModel) throws Exception {

        List<SsFuncD> ssFuncDS = null;

        SsFuncD ssFuncD = null;

        try {

            ssFuncDS = getFuncDs(aFuncChkModel.getFuncNo());

            //新增加
            if (ssFuncDS == null || ssFuncDS.size() <= 0) {
                ssFuncDS = new ArrayList<>();

                if (aFuncChkModel != null) {
                    ssFuncD = new SsFuncD();

                    ssFuncD.setFuncNo(aFuncChkModel.getFuncNo());
                    ssFuncD.setCreateUser("sys");
                    ssFuncD.setCreateTime(new Timestamp(System.currentTimeMillis()));

                    if (aFuncChkModel.getChkBit1() != null &&
                            aFuncChkModel.getChkBit1().trim().equals("1")) {
                        ssFuncD.setDescr("一级审核");
                        ssFuncD.setState(1);
                        ssFuncD.setActr(1);
                        ssFuncD.setUserRight("1");
                        ssFuncD.setFuncId("1");
                    }else if (aFuncChkModel.getChkBit2() != null &&
                            aFuncChkModel.getChkBit2().trim().equals("2")) {
                        ssFuncD.setDescr("二级审核");
                        ssFuncD.setState(1);
                        ssFuncD.setActr(1);
                        ssFuncD.setUserRight("2");
                        ssFuncD.setFuncId("2");
                    }else if (aFuncChkModel.getChkBit3() != null &&
                            aFuncChkModel.getChkBit3().trim().equals("3")) {
                        ssFuncD.setDescr("三级审核");
                        ssFuncD.setState(1);
                        ssFuncD.setActr(1);
                        ssFuncD.setUserRight("3");
                        ssFuncD.setFuncId("3");
                    }else if (aFuncChkModel.getChkBit4() != null &&
                            aFuncChkModel.getChkBit4().trim().equals("4")) {
                        ssFuncD.setDescr("四级审核");
                        ssFuncD.setState(1);
                        ssFuncD.setActr(1);
                        ssFuncD.setUserRight("4");
                        ssFuncD.setFuncId("4");
                    }

                    ssFuncDS.add(ssFuncD);

                    //保存
                    ssFuncDRepository.saveAll(ssFuncDS);

                }


            } else {
                //修改
                if (aFuncChkModel != null) {
                    for (int i = 0; i < ssFuncDS.size(); i++) {


                        ssFuncD = ssFuncDS.get(i);

                        ssFuncD.setCreateTime(new Timestamp(System.currentTimeMillis()));

                        if (aFuncChkModel.getChkBit1() != null) {

                            if (aFuncChkModel.getChkBit1().trim().equals("1")) {
                                ssFuncD.setUserRight("1");
                                ssFuncD.setFuncId("1");
                            } else {
                                ssFuncD.setUserRight("0");
                                ssFuncD.setFuncId("0");
                            }
                        }else if (aFuncChkModel.getChkBit2() != null ) {

                            if (aFuncChkModel.getChkBit2().trim().equals("1")) {
                                ssFuncD.setUserRight("1");
                                ssFuncD.setFuncId("1");
                            } else {
                                ssFuncD.setUserRight("0");
                                ssFuncD.setFuncId("0");
                            }
                        }else if (aFuncChkModel.getChkBit3() != null) {
                            if (aFuncChkModel.getChkBit3().trim().equals("1")) {
                                ssFuncD.setUserRight("1");
                                ssFuncD.setFuncId("1");
                            } else {
                                ssFuncD.setUserRight("0");
                                ssFuncD.setFuncId("0");
                            }
                        }else if (aFuncChkModel.getChkBit4() != null ) {
                            if (aFuncChkModel.getChkBit4().trim().equals("1")) {
                                ssFuncD.setUserRight("1");
                                ssFuncD.setFuncId("1");
                            } else {
                                ssFuncD.setUserRight("0");
                                ssFuncD.setFuncId("0");
                            }
                        }


                       ssFuncDRepository.save(ssFuncD);

                    }



                }

            }

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

    }
}

