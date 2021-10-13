package com.wenc.front.controller.bsys;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.wenc.commdomain.pojo.core.*;
import com.wenc.commdomain.vo.bsys.VbRoleFuncH;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.BaseRetModel;
import com.wenc.core.util.GsonHelper;
import com.wenc.sys.service.RoleFuncService;
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
 * 角色权限设置。
 *
 * @author w.z
 */

@Api("角色权限设置")
@RestController
@RequestMapping("MRoleFunc")
public class RoleFuncController extends AbstractBaseSingleController<SsRoleFuncH, VbRoleFuncH> {


    @Autowired
    private RoleFuncService roleFuncService;


    public RoleFuncController() {
        super();
    }

    /**
     * 获取角色下审核列表信息。
     *
     * @param session
     * @param request
     * @param response
     * @param aRoleId
     * @param aFuncNo
     * @return
     */
    @ApiOperation("获取用户角色下功能的审核权限列表")
    @RequestMapping(value = "GetRoleFuncDs", method = RequestMethod.GET)
    public BaseRetModel<SsRoleFuncD> getRoleFuncDs(HttpSession session,
                                                   HttpServletRequest request,
                                                   HttpServletResponse response,
                                                   @RequestParam String aRoleId,
                                                   @RequestParam String aFuncNo) {
        BaseRetModel<SsRoleFuncD> retModel = new BaseRetModel<>();
        List<SsRoleFuncD> ssRoleFuncDS = null;

        try {
            ssRoleFuncDS = roleFuncService.getRoleFuncds(getLoginTenantId(), aRoleId, aFuncNo);


        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setDataList(ssRoleFuncDS);

        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;

    }


    /**
     * 返回菜单审核权限列表。
     *
     * @param session
     * @param request
     * @param response
     * @param aFuncNo
     * @return
     */
    @ApiOperation("获取功能菜单审核列表")
    @RequestMapping(value = "GetFuncDs", method = RequestMethod.GET)
    public BaseRetModel<SsFuncD> getFuncDs(HttpSession session,
                                           HttpServletRequest request,
                                           HttpServletResponse response,
                                           @RequestParam String aFuncNo) {
        BaseRetModel<SsFuncD> retModel = new BaseRetModel<>();
        List<SsFuncD> ssFuncDS = null;

        try {
            ssFuncDS = roleFuncService.getFuncDs(aFuncNo);


        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setDataList(ssFuncDS);

        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;
    }


    /**
     * 保存角色下菜单功能审核权限列表。
     *
     * @param session
     * @param request
     * @param response
     * @param aRoleId
     * @param aFuncNo
     * @param aRoleListJson
     * @return
     */
    @ApiOperation("提交保存角色下菜单审核列表")
    @RequestMapping(value = "SaveRoleFuncDS", method = RequestMethod.POST)
    public BaseRetModel saveRoleFuncDs(HttpSession session,
                                       HttpServletRequest request,
                                       HttpServletResponse response,
                                       @RequestParam String aRoleId,
                                       @RequestParam String aFuncNo,
                                       @RequestParam String aRoleListJson) {
        BaseRetModel retModel = new BaseRetModel<>();

        Gson gson = GsonHelper.getGsonAll();

        List<SsFuncD> ssFuncDS = null;


        try {

            ssFuncDS = gson.fromJson(aRoleListJson, new TypeToken<List<SsFuncD>>() {
            }.getType());

            if (ssFuncDS == null || ssFuncDS.size() <= 0) {
                throw new Exception("转换Gson泛型错误!");
            }


            //进行保存
            roleFuncService.saveFuncDs(getLoginTenantId(), aRoleId, aFuncNo, ssFuncDS, getLoginUserId());


        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;
    }


    /**
     * 获取当前功能审核级别。
     *
     * @param session
     * @param request
     * @param response
     * @param aIdx
     * @return
     */
    @RequestMapping(value = "GetFuncChk",method = RequestMethod.GET)
    public BaseRetModel getFuncChk(HttpSession session,
                                   HttpServletRequest request,
                                   HttpServletResponse response,
                                   @RequestParam String aIdx)
    {

        BaseRetModel retModel = new BaseRetModel<>();

        Gson gson = GsonHelper.getGsonAll();

        VbRoleFuncH vbRoleFuncH = null;

        List<SsRoleFuncD> ssRoleFuncDS = null;

        List<VbFuncD> vbFuncDS = null;

        try
        {
            if(aIdx.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERROR);
                retModel.setMsg("无法获取当前行索引号");
                return retModel;

            }

            vbRoleFuncH = voService.findById(VbRoleFuncH.class,Long.valueOf(aIdx));

            if(vbRoleFuncH == null)
            {
                retModel.setCode(BaseConstant.ERROR);
                retModel.setMsg("无法获取角色权限信息!");
                return retModel;
            }

            //获取标准审核清单。
            vbFuncDS = roleFuncService.getVbFuncds(vbRoleFuncH.getFuncNo());

            if(vbFuncDS == null || vbFuncDS.size() <= 0 )
            {
                 throw  new Exception("当前功能尚未设置审核!");
            }

            //获取当前用户下审核清单。
            ssRoleFuncDS = roleFuncService.getRoleFuncds(vbRoleFuncH.getRoleId(),vbRoleFuncH.getFuncNo());


            retModel.setDataList(ssRoleFuncDS);
            retModel.setData(vbFuncDS);


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
     * 提交相应的审核事件。
     * @param session
     * @param request
     * @param response
     * @param aIdx
     * @return
     */
    @RequestMapping(value = "PostFuncChk",method = RequestMethod.POST)
    public BaseRetModel saveFuncChk(HttpSession session,
                                   HttpServletRequest request,
                                   HttpServletResponse response,
                                   @RequestParam String aIdx,
                                    @RequestParam String aJsonStr)
    {

        BaseRetModel retModel = new BaseRetModel<>();

        Gson gson = GsonHelper.getGsonAll();

        VbRoleFuncH vbRoleFuncH = null;

        List<VbFuncD> vbFuncDS = null;

        List<SsRoleFuncD> ssRoleFuncDS = null;

        try
        {
            if(aIdx.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_211);
                retModel.setMsg("无法获取当前行索引号");
                return retModel;

            }

            if(aJsonStr.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_212);
                retModel.setMsg("审核权限为空，不允许保存!");
                return retModel;
            }

            vbRoleFuncH = voService.findById(VbRoleFuncH.class,Long.valueOf(aIdx));

            if(vbRoleFuncH == null)
            {
                retModel.setCode(BaseConstant.ERROR);
                retModel.setMsg("无法获取角色权限信息!");
                return retModel;
            }

            //获取标准审核清单。
            vbFuncDS = gson.fromJson(aJsonStr,new TypeToken<List<VbFuncD>>(){}.getType());

            if(vbFuncDS == null || vbFuncDS.size() <= 0 )
            {
                throw  new Exception("转化权限对象错误!");
            }

            //进行保存。

            roleFuncService.saveRoleFuncChk(vbFuncDS,vbRoleFuncH);


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
