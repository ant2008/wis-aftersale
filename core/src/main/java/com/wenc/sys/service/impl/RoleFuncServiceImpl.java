package com.wenc.sys.service.impl;

import com.wenc.commdomain.pojo.core.SsFuncD;
import com.wenc.commdomain.pojo.core.SsRoleFuncD;
import com.wenc.commdomain.pojo.core.VRoleFuncd;
import com.wenc.commdomain.pojo.core.VbFuncD;
import com.wenc.commdomain.vo.bsys.VbRoleFuncH;
import com.wenc.sys.dao.*;
import com.wenc.sys.service.RoleFuncService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class RoleFuncServiceImpl implements RoleFuncService {

    @Autowired
    protected SsRoleFuncHRepository ssRoleFuncHRepository;

    @Autowired
    protected SsRoleFuncDRepository ssRoleFuncDRepository;


    @Autowired
    protected SsFuncDRepository ssFuncDRepository;

    @Autowired
    protected VRoleFuncdRepository vRoleFuncdRepository;

    @Autowired
    protected VFuncDRepository vFuncDRepository;




    private Logger LOG = LoggerFactory.getLogger(RoleFuncServiceImpl.class);


    /**
     * 获取角色下菜单功能审核级别。
     *
     * @param aTenantId
     * @param aRoleId
     * @param aFuncNo
     * @return
     */
    @Override
    public List<SsRoleFuncD> getRoleFuncds(String aTenantId, String aRoleId, String aFuncNo) {


        try {

            return ssRoleFuncDRepository.getRoleFuncDList(aFuncNo, aRoleId, aTenantId);

        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error(ex.getMessage());
        }

        return null;
    }

    /**
     * 获取功能菜单审核级别。
     *
     * @param aFuncNo
     * @return
     */
    @Override
    public List<SsFuncD> getFuncDs(String aFuncNo) {
        try {

            return ssFuncDRepository.getFuncList(aFuncNo);

        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error(ex.getMessage());
        }

        return null;
    }

    /**
     * 保存角色审核权限明细。
     *
     * @param aTenantId
     * @param aRoleId
     * @param aSsFuncDS
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveFuncDs(String aTenantId,
                           String aRoleId,
                           String aFuncNo,
                           List<SsFuncD> aSsFuncDS,
                           String aUserId) throws Exception {

        SsFuncD ssFuncD = null;

        List<SsRoleFuncD> ssRoleFuncDS = null;
        SsRoleFuncD ssRoleFuncD = null;

        try {

            ssRoleFuncDS = getRoleFuncds(aTenantId, aRoleId, aFuncNo);

            //如果存在则进行删除
            if (ssRoleFuncDS != null && ssRoleFuncDS.size() > 0) {
                ssRoleFuncDRepository.deleteAll(ssRoleFuncDS);
            }


            ssRoleFuncDS = new ArrayList<>();


            for (int i = 0; i < aSsFuncDS.size(); i++) {

                ssFuncD = aSsFuncDS.get(i);

                if (ssFuncD != null) {
                    ssRoleFuncD = new SsRoleFuncD();

                    ssRoleFuncD.setRoleId(aRoleId);
                    ssRoleFuncD.setTenantId(aTenantId);
                    ssRoleFuncD.setFuncNo(aFuncNo);

                    ssRoleFuncD.setActr(ssFuncD.getActr());
                    ssRoleFuncD.setDescr(ssFuncD.getDescr());
                    ssRoleFuncD.setUserPost(ssFuncD.getUserPost());
                    ssRoleFuncD.setState(ssFuncD.getState());
                    ssRoleFuncD.setRoleRight(ssFuncD.getUserRight());
                    ssRoleFuncD.setCreateTime(new Timestamp(System.currentTimeMillis()));
                    ssRoleFuncD.setCreateUser(aUserId);

                    ssRoleFuncDS.add(ssRoleFuncD);

                }

            }


            //进行保存。
            saveRoleFuncDS(aTenantId, aRoleId, aFuncNo, ssRoleFuncDS);


        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * 保存角色审核权限明细。
     *
     * @param aTenantId
     * @param aRoleId
     * @param aSsRoleFuncDS
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveRoleFuncDS(String aTenantId, String aRoleId, String aFuncNo, List<SsRoleFuncD> aSsRoleFuncDS) throws Exception {


        SsRoleFuncD ssRoleFuncD = null;

        try {

            for (int i = 0; i < aSsRoleFuncDS.size(); i++) {

                ssRoleFuncD = aSsRoleFuncDS.get(i);

                ssRoleFuncD.setTenantId(aTenantId);
                ssRoleFuncD.setRoleId(aRoleId);

                aSsRoleFuncDS.set(i, ssRoleFuncD);
            }

            ssRoleFuncDRepository.saveAll(aSsRoleFuncDS);


        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * 获取当前角色下，当前功能的审核权限。
     *
     * @param aRoleId
     * @param aFuncNo
     * @return
     */
    @Override
    public List<SsRoleFuncD> getRoleFuncds(String aRoleId, String aFuncNo) {

        return  ssRoleFuncDRepository.getSsRoleFuncDSByRoleIdAndFuncNo(aRoleId,aFuncNo);

    }

    /**
     * 获取当前功能标准审核清单
     *
     * @param aFuncNo
     * @return
     */
    @Override
    public List<VbFuncD> getVbFuncds(String aFuncNo) {

        return vFuncDRepository.findVbFuncDSByFuncNo(aFuncNo);
    }

    /**
     * 根据选择的审核级，进行保存。
     *
     * @param vbFuncDS
     * @param vbRoleFuncH
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveRoleFuncChk(List<VbFuncD> vbFuncDS, VbRoleFuncH vbRoleFuncH) throws Exception {

        List<SsRoleFuncD> oldSsRoleFuncDs = null;

        List<SsRoleFuncD> newSsRoleFuncDs = null;

        VbFuncD vbFuncD = null;
        SsRoleFuncD ssRoleFuncD = null;

        try
        {

            if(vbRoleFuncH == null)
            {
                throw new Exception("无法获取当前权限功能信息!");
            }

            if(vbFuncDS == null || vbFuncDS.size() <= 0 )
            {
                 throw new Exception("审核权限列表不允许为空!");
            }

            //先获取原来的权限列表。
            oldSsRoleFuncDs = ssRoleFuncDRepository.getSsRoleFuncDSByRoleIdAndFuncNo(vbRoleFuncH.getRoleId(),vbRoleFuncH.getFuncNo());

            if(oldSsRoleFuncDs != null &&
               oldSsRoleFuncDs.size() > 0 )
            {
                  ssRoleFuncDRepository.deleteAll(oldSsRoleFuncDs);
            }

            newSsRoleFuncDs = new ArrayList<>();
            //循环生成新的审核级别。
            for (int i = 0; i < vbFuncDS.size(); i++) {

                   vbFuncD = vbFuncDS.get(i);

                   if(vbFuncD != null)
                   {
                         ssRoleFuncD = new SsRoleFuncD();

                         ssRoleFuncD.setRoleId(vbRoleFuncH.getRoleId());
                         ssRoleFuncD.setFuncNo(vbRoleFuncH.getFuncNo());
                         ssRoleFuncD.setTenantId("");
                         ssRoleFuncD.setActr(1);
                         ssRoleFuncD.setDescr(vbFuncD.getDescr());
                         ssRoleFuncD.setRoleRight(vbFuncD.getUserRight());
                         ssRoleFuncD.setState(1);

                         ssRoleFuncD.setCreateUser("sys");
                         ssRoleFuncD.setCreateTime(new Timestamp(System.currentTimeMillis()));

                         newSsRoleFuncDs.add(ssRoleFuncD);
                   }
            }

            ssRoleFuncDRepository.saveAll(newSsRoleFuncDs);


        }catch (Exception ex)
        {
             throw new Exception(ex.getMessage());
        }
    }
}
