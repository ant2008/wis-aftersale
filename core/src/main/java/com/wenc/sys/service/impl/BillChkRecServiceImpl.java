package com.wenc.sys.service.impl;

import com.wenc.sys.dao.SsBillChkRepository;
import com.wenc.sys.service.BillChkRecService;
import com.wenc.commdomain.pojo.core.SsBillChk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Service
public class BillChkRecServiceImpl implements BillChkRecService {


    private Logger LOG = LoggerFactory.getLogger(BillChkRecServiceImpl.class);


    @Autowired
    private SsBillChkRepository ssBillChkRepository;

    /**
     * 获取所有审核记录
     *
     * @param aBillNo
     * @return
     */
    @Override
    public List<SsBillChk> getAllBillChkRecs(String aBillNo, String aBillType, String aTenantId) {

        List<SsBillChk> ssBillChks = null;

        try {

            ssBillChks = ssBillChkRepository.getBillChkRecs(aBillNo, aBillType, aTenantId);


        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error("get Bill Chk error : {} ", ex.getMessage());

        }

        return ssBillChks;
    }

    /**
     * 获取否决记录。
     *
     * @param aBillNo
     * @param aBillType
     * @param aTenantId
     * @return
     */
    @Override
    public List<SsBillChk> getAllBillNotChkRecs(String aBillNo, String aBillType, String aTenantId) {
        List<SsBillChk> ssBillChks = null;

        try {

            ssBillChks = ssBillChkRepository.getBillNotChkRecs(aBillNo, aBillType, aTenantId);


        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error("get Bill Not Chk error : {} ", ex.getMessage());

        }

        return ssBillChks;
    }

    /**
     * 增加审核记录。
     *
     * @param aBillNo
     * @param aBillType
     * @param aTenantId
     * @param aChkBit
     * @param aMemo
     * @param aUserId
     * @throws Exception
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


            ssBillChkRepository.save(ssBillChk);


        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * 批量增加审核记录
     *
     * @param ssBillChks
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addBillChkRecords(List<SsBillChk> ssBillChks) throws Exception {

        try {
            ssBillChkRepository.saveAll(ssBillChks);

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
