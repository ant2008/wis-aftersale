package com.wenc.core.service.impl;

import com.wenc.sys.dao.SsFuncDRepository;
import com.wenc.sys.dao.SsRoleFuncDRepository;
import com.wenc.sys.dao.SsuserRoleRepository;
import com.wenc.sys.service.BillChkRecService;
import com.wenc.sys.service.UserRightService;
import com.wenc.commdomain.pojo.core.SsBillChk;
import com.wenc.commdomain.pojo.core.SsFuncD;
import com.wenc.commdomain.pojo.core.SsUserRole;
import com.wenc.core.service.ChkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ChkServiceImpl implements ChkService {

    private Logger LOG = LoggerFactory.getLogger(ChkServiceImpl.class);


    @Autowired
    private SsuserRoleRepository ssuserRoleRepository;

    @Autowired
    private SsFuncDRepository funcDRepository;


    @Autowired
    private SsRoleFuncDRepository ssRoleFuncDRepository;


    @Autowired
    private UserRightService userRightService;


    @Autowired
    protected BillChkRecService billChkRecService;


    @Override
    public List<SsUserRole> getUserRoleList(String aUserid) {
        List<SsUserRole> retList = null;
        retList = ssuserRoleRepository.getRoleList(aUserid);
        return retList;
    }

    @Override
    public List<SsFuncD> getFuncdList(String aFuncno) {
        List<SsFuncD> retList = null;
        retList = funcDRepository.getFuncList(aFuncno.trim());
        return retList;
    }

    @Override
    public boolean getRoleRight(String aUserid, String aFuncno, int aLevel, String aTenantId) {
        return userRightService.getRoleFuncd(aUserid, aFuncno, String.valueOf(aLevel), aTenantId);
    }

    @Override
    public boolean getRoleRight(String aUserId, String aFuncNo, int aLevel) {
        return userRightService.getRoleFuncd(aUserId,aFuncNo,String.valueOf(aLevel));
    }

    /**
     * 获取审核记录
     *
     * @param aBillNo
     * @return
     */
    @Override
    public List<SsBillChk> getBillChkRec(String aBillNo, String aBillType, String aTenantId) {

        List<SsBillChk> ssBillChks = null;

        try {

            ssBillChks = billChkRecService.getAllBillChkRecs(aBillNo, aBillType, aTenantId);

        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            ex.printStackTrace();
        }

        return ssBillChks;

    }

    /**
     * 获取单据否决记录。
     *
     * @param aBillNo
     * @param aBillType
     * @param aTenantId
     * @return
     */
    @Override
    public List<SsBillChk> getBillNotChkRec(String aBillNo, String aBillType, String aTenantId) {

        List<SsBillChk> ssBillChks = null;

        try {

            ssBillChks = billChkRecService.getAllBillNotChkRecs(aBillNo, aBillType, aTenantId);

        } catch (Exception ex) {
            LOG.error(ex.getMessage());
            ex.printStackTrace();
        }

        return ssBillChks;
    }

    /**
     * 增加审核记录
     *
     * @param aBillNo
     * @param aBillType
     * @param aTenantId
     * @param aChkBit
     * @param aMemo
     */
    @Override
    public void addBillChkRec(String aBillNo,
                              String aBillType,
                              String aTenantId,
                              int aChkBit,
                              int aChkLevel,
                              String aMemo,
                              String aRejectMemo,
                              String aUserId) throws Exception {

        SsBillChk ssBillChk = null;


        try {

            billChkRecService.addBillChkRec(aBillNo, aBillType, aTenantId, aChkBit, aChkLevel, aMemo, aRejectMemo, aUserId);

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * 注册审核结果列表
     *
     * @param ssBillChks
     * @param aBillNo
     * @param aBillType
     * @param aTenantId
     * @param aChkBit
     * @param aChkLevel
     * @param aMemo
     * @param aRejectMemo
     * @param aUserId
     * @throws Exception
     */
    @Override
    public void registerBillChks(List<SsBillChk> ssBillChks, String aBillNo, String aBillType, String aTenantId, int aChkBit, int aChkLevel, String aMemo, String aRejectMemo, String aUserId) throws Exception {

        SsBillChk ssBillChk = null;

        try {

            if (ssBillChks == null) {
                throw new Exception("请先初始化列表");
            }


            ssBillChk = new SsBillChk();


            ssBillChk.setBillchkType(aBillType);
            ssBillChk.setBillchkNo(aBillNo);
            ssBillChk.setTenantId(aTenantId);
            ssBillChk.setBillchkBit(aChkBit);
            ssBillChk.setBillchkMemo(aMemo);
            ssBillChk.setBillchkRejmemo(aRejectMemo);
            ssBillChk.setBillchkAllbit(aChkLevel);
            ssBillChk.setExecDate(new Timestamp(System.currentTimeMillis()));
            ssBillChk.setCreateTime(new Timestamp(System.currentTimeMillis()));
            ssBillChk.setCreateUser(aUserId);


            ssBillChks.add(ssBillChk);

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * 批量保存审核记录。
     *
     * @param ssBillChks
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addBillChks(List<SsBillChk> ssBillChks) throws Exception {

        try {

            billChkRecService.addBillChkRecords(ssBillChks);

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
