package com.wenc.front.controller.matdata;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wenc.commdomain.pojo.core.SsTenant;
import com.wenc.commdomain.pojo.core.SsUser;
import com.wenc.commdomain.pojo.dsb.TbSalesman;
import com.wenc.commdomain.pojo.matdata.TsOrgcode;
import com.wenc.commdomain.pojo.sys.TsPos;
import com.wenc.commdomain.vo.bsys.RoleVO;
import com.wenc.commdomain.vo.bsys.TenantRolesVO;
import com.wenc.commdomain.vo.bsys.UserOrgVO;
import com.wenc.commdomain.vo.bsys.UserPosVO;
import com.wenc.commdomain.vo.matdata.VbUser;
import com.wenc.commdomain.vo.matdata.VbUserRole;
import com.wenc.commonservice.matdata.service.UserService;
import com.wenc.commonservice.sys.service.TenantService;
import com.wenc.commonservice.sys.service.UserOrgService;
import com.wenc.commonservice.sys.service.UserPosService;
import com.wenc.commonservice.sys.service.UserRoleService;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.BaseRetMdModel;
import com.wenc.core.model.BaseRetModel;
import com.wenc.core.util.GsonHelper;
import com.wenc.sys.service.RoleService;
import com.wiser.hw.sms.service.impl.HwSmsServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 用户管理。
 *
 * @author b.v
 */
@Api("用户管理")
@RestController
@RequestMapping("MUser")
public class UserManagerController extends AbstractBaseSingleController<SsUser, VbUser> {

    @Autowired
    private UserService userService;

    @Autowired
    protected TenantService tenantService;


    @Autowired
    protected UserRoleService userRoleService;

    @Autowired
    protected UserPosService userPosService;

    @Autowired
    protected UserOrgService userOrgService;








    public UserManagerController() {
        super();
    }


    @Override
    public void InitCreate(VbUser aModel) throws Exception {

        try {
             tenantService.verifyTenantUserNum(getLoginTenantId());
            aModel.setState(1);
            aModel.setCreateUser(getLoginUserId());

        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }


    }




    @RequestMapping(value = "RetsetPwd",method = RequestMethod.POST)
    public BaseRetModel<String> resetPwd(HttpSession session,
                                         HttpServletRequest request,
                                         HttpServletResponse response,
                                         @RequestParam String aOldPwd,
                                         @RequestParam String aNewPwd,
                                         @RequestParam String aConfirmPwd)
    {
        BaseRetModel baseRetModel = new BaseRetModel();

        String oldPwdMd5 = "";


        SsUser ssUser = null;


        try
        {

            if(aOldPwd.trim().equals(""))
            {
                 baseRetModel.setCode(BaseConstant.ERR_CODE_220);
                 baseRetModel.setMsg("旧密码不允许为空,不允许修改!");
                 return baseRetModel;
            }


            if(aNewPwd.trim().equals(""))
            {
                baseRetModel.setCode(BaseConstant.ERR_CODE_214);
                baseRetModel.setMsg("新密码不允许为空,不允许修改!");
                return baseRetModel;
            }


            if(aConfirmPwd.trim().equals(""))
            {
                baseRetModel.setCode(BaseConstant.ERR_CODE_215);
                baseRetModel.setMsg("确认密码不允许为空,不允许修改!");
                return baseRetModel;
            }


            ssUser = userService.getUserByUserId(getLoginUserId());

            if(ssUser == null)
            {
                throw new Exception("系统不存在当前用户!");
            }


            oldPwdMd5 = SecureUtil.md5(aOldPwd);

            if(!ssUser.getUserPass().trim().equals(oldPwdMd5))
            {
                baseRetModel.setCode(BaseConstant.ERR_CODE_215);
                baseRetModel.setMsg("旧密码不正确,不允许修改!");
                return baseRetModel;
            }


            if(!aNewPwd.trim().equals(aConfirmPwd.trim()))
            {
                baseRetModel.setCode(BaseConstant.ERR_CODE_220);
                baseRetModel.setMsg("新密码与确认密码不匹配,请重新输入!");
                return baseRetModel;
            }





            userService.resetPwd(getLoginUserId(),aNewPwd);




        }catch (Exception ex)
        {
             baseRetModel.setCode(BaseConstant.ERROR);
             baseRetModel.setMsg(ex.getMessage());
             return baseRetModel;
        }


        baseRetModel.setCode(BaseConstant.SUCESS);
        baseRetModel.setMsg(BaseConstant.SUCCESS_MSG);
        return baseRetModel;


    }


    @Override
    public void beforeEdit(HttpSession session, HttpServletRequest request, SsUser aModel) throws Exception {

        try {

            if (aModel.getIfMasterUser() != null &&
                    aModel.getIfMasterUser().trim().equals("1")) {

                throw new Exception("不允许修改主账户");

            }
        }catch (Exception ex)
        {
              throw new Exception(ex.getMessage());
        }


    }

    @Override
    public void beforeCreate(HttpSession session, HttpServletRequest request, SsUser aModel) throws Exception {
        try {

            if (aModel.getIfMasterUser() != null &&
                    aModel.getIfMasterUser().trim().equals("1")) {

                throw new Exception("不允许增加主账户");

            }
        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    }

    /**
     * 列出用户角色信息。
     *
     * @param session
     * @param request
     * @param response
     * @param aUserId
     * @return
     */
    @RequestMapping(value = "ListUserRoles",method = RequestMethod.GET)
    public BaseRetMdModel<TenantRolesVO, VbUserRole> listUserRoles(HttpSession session,
                                                                 HttpServletRequest request,
                                                                 HttpServletResponse response,
                                                                   @RequestParam String aUserId)
    {
        BaseRetMdModel<TenantRolesVO, VbUserRole> retModel = new BaseRetMdModel<TenantRolesVO, VbUserRole>();

        List<TenantRolesVO> tenantRoles = null;
        List<VbUserRole> vbUserRoles = null;
        try
        {
            tenantRoles = tenantService.getTenantRoles(getLoginTenantId());

            vbUserRoles = userRoleService.listUserRoles(getLoginTenantId(),aUserId);

            retModel.setMasterList(tenantRoles);
            retModel.setDetailList(vbUserRoles);

        }catch (Exception ex)
        {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }

        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;

    }


    /**
     * 提交用户角色
     * @param session
     * @param request
     * @param response
     * @param aUserId
     * @param aUserRoles
     * @return
     */
    @RequestMapping(value = "CommitUserRoles",method = RequestMethod.POST)
    public BaseRetModel<VbUserRole> commitUserRoles(HttpSession session,
                                                       HttpServletRequest request,
                                                       HttpServletResponse response,
                                                       @RequestParam String aUserId,
                                                       @RequestParam String aUserRoles)
    {
        BaseRetModel<VbUserRole> retModel = new BaseRetModel<VbUserRole>();

        List<VbUserRole> vbUserRoles = null;

        List<VbUserRole> commitUserRoles = null;

        Gson gson = GsonHelper.getGsonAll();

        try
        {

            if(aUserRoles == null || aUserRoles.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_201);
                retModel.setMsg("请先设置用户需要使用角色");
                return retModel;
            }

            commitUserRoles = gson.fromJson(aUserRoles, new  TypeToken<List<VbUserRole>>(){}.getType());

            if(commitUserRoles == null || commitUserRoles.size() <= 0 )
            {
                retModel.setCode(BaseConstant.ERR_CODE_202);
                retModel.setMsg("转换对应角色错误!");
                return retModel;
            }


            vbUserRoles = userRoleService.commitUserRoles(getLoginTenantId(),aUserId,commitUserRoles);
            retModel.setDataList(vbUserRoles);

        }catch (Exception ex)
        {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }

        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;

    }


    /**
     * 列出用户管辖POS
     *
     * @param session
     * @param request
     * @param response
     * @param aUserId
     * @return
     */
    @RequestMapping(value = "ListUserPos",method = RequestMethod.GET)
    public BaseRetMdModel<TsPos, UserPosVO> listUserPos(HttpSession session,
                                                        HttpServletRequest request,
                                                        HttpServletResponse response,
                                                        @RequestParam String aUserId)
    {
        BaseRetMdModel<TsPos, UserPosVO> retModel = new BaseRetMdModel<TsPos, UserPosVO>();

        List<TsPos> tsPosList = null;
        List<UserPosVO> userPosVOS = null;
        try
        {
            tsPosList = userPosService.listAllPos(getLoginTenantId());

            userPosVOS = userPosService.getUserPos(getLoginTenantId(),aUserId);

            retModel.setMasterList(tsPosList);
            retModel.setDetailList(userPosVOS);

        }catch (Exception ex)
        {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }

        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;

    }





    /**
     * 保存提交用户管辖POS
     *
     * @param session
     * @param request
     * @param response
     * @param aUserId
     * @param aUserPos
     * @return
     */
    @RequestMapping(value = "CommitUserPos",method = RequestMethod.POST)
    public BaseRetModel<UserPosVO> commitUserPos(HttpSession session,
                                                    HttpServletRequest request,
                                                    HttpServletResponse response,
                                                    @RequestParam String aUserId,
                                                    @RequestParam String aUserPos)
    {
        BaseRetModel<UserPosVO> retModel = new BaseRetModel<UserPosVO>();

        List<UserPosVO> userPosVOS = null;

        List<UserPosVO> commitUserPosVOS = null;

        Gson gson = GsonHelper.getGsonAll();

        try
        {

            if(aUserPos == null || aUserPos.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_201);
                retModel.setMsg("请先设置用户需要使用POS");
                return retModel;
            }

            commitUserPosVOS = gson.fromJson(aUserPos, new  TypeToken<List<UserPosVO>>(){}.getType());

            if(commitUserPosVOS == null || commitUserPosVOS.size() <= 0 )
            {
                retModel.setCode(BaseConstant.ERR_CODE_202);
                retModel.setMsg("转换对应POS错误!");
                return retModel;
            }


            userPosVOS = userPosService.saveUserPos(getLoginTenantId(),aUserId,commitUserPosVOS);
            retModel.setDataList(userPosVOS);

        }catch (Exception ex)
        {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }

        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;

    }



    /**
     * 列出用户管辖机构
     * @param session
     * @param request
     * @param response
     * @param aUserId
     * @return
     */
    @RequestMapping(value = "ListUserOrg",method = RequestMethod.GET)
    public BaseRetMdModel<TsOrgcode, UserOrgVO> listUserOrg(HttpSession session,
                                                            HttpServletRequest request,
                                                            HttpServletResponse response,
                                                            @RequestParam String aUserId)
    {
        BaseRetMdModel<TsOrgcode, UserOrgVO> retModel = new BaseRetMdModel<TsOrgcode, UserOrgVO>();

        List<TsOrgcode> tsOrgcodeList = null;
        List<UserOrgVO> userOrgVOS = null;
        try
        {
            tsOrgcodeList = userOrgService.listAllOrgCode(getLoginTenantId());

            userOrgVOS = userOrgService.getUserOrgList(getLoginTenantId(),aUserId);

            retModel.setMasterList(tsOrgcodeList);
            retModel.setDetailList(userOrgVOS);

        }catch (Exception ex)
        {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }

        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;

    }


    /**
     * 提交用户管辖机构
     *
     * @param session
     * @param request
     * @param response
     * @param aUserId
     * @param aUserOrg
     * @return
     */
    @RequestMapping(value = "CommitUserOrg",method = RequestMethod.POST)
    public BaseRetModel<UserOrgVO> commitUserOrg(HttpSession session,
                                                 HttpServletRequest request,
                                                 HttpServletResponse response,
                                                 @RequestParam String aUserId,
                                                 @RequestParam String aUserOrg)
    {
        BaseRetModel<UserOrgVO> retModel = new BaseRetModel<UserOrgVO>();

        List<UserOrgVO> userOrgVOS = null;

        List<UserOrgVO> commitUserOrgVOS = null;

        Gson gson = GsonHelper.getGsonAll();

        try
        {

            if(aUserOrg == null || aUserOrg.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_201);
                retModel.setMsg("请先设置用户需要使用机构");
                return retModel;
            }

            commitUserOrgVOS = gson.fromJson(aUserOrg, new  TypeToken<List<UserOrgVO>>(){}.getType());

            if(commitUserOrgVOS == null || commitUserOrgVOS.size() <= 0 )
            {
                retModel.setCode(BaseConstant.ERR_CODE_202);
                retModel.setMsg("转换对应机构错误!");
                return retModel;
            }


            userOrgVOS = userOrgService.saveUserOrgList(getLoginTenantId(),aUserId,commitUserOrgVOS);
            retModel.setDataList(userOrgVOS);

        }catch (Exception ex)
        {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }

        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;

    }


    /**
     * 激活用户信息。
     * @param session
     * @param request
     * @param response
     * @return
     */
    @ApiOperation("激活租户用户")
    @RequestMapping("ActiveTenantUser")
    public BaseRetModel<SsUser> activeTenantUser(HttpSession session,
                                               HttpServletRequest request,
                                               HttpServletResponse response,
                                               @RequestParam String aUserId)
    {
        BaseRetModel<SsUser> retModel = new BaseRetModel<>();

        SsUser ssUser =null;

        String initPwd = "";



        try
        {

            if(StrUtil.isBlank(aUserId))
            {
                return retModel.err(BaseConstant.ERR_CODE_201,"用户ID不允许为空!");
            }

           ssUser =  userService.getUser(getLoginTenantId(),aUserId);

            if (ssUser == null)
            {
                return retModel.err(BaseConstant.ERR_CODE_202,"无法获取租户信息!");
            }


            //设置初始密码。
            initPwd = ssUser.getMobileno().substring(5);

            userService.setUserPwd(getLoginTenantId(),ssUser.getUserId(),initPwd);

            //发送通知短信。

            retModel.setData(ssUser);

        }catch (Exception ex)
        {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }

        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;
    }


}
