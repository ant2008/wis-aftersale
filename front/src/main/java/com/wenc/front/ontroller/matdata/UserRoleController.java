package com.wenc.front.controller.matdata;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wenc.commdomain.pojo.core.SsFuncD;
import com.wenc.commdomain.pojo.core.SsRole;
import com.wenc.commdomain.pojo.core.SsUserRole;
import com.wenc.commdomain.vo.matdata.VbUserRole;
import com.wenc.commonservice.sys.service.UserRoleService;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.BaseRetModel;
import com.wenc.core.util.GsonHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * 用户角色设置
 *
 * @author w.z
 */
@Api("用户角色设置")
public class UserRoleController extends AbstractBaseSingleController<SsUserRole, VbUserRole> {


    @Autowired
    private UserRoleService userRoleService;


    public UserRoleController() {
        super();
    }


    /**
     * 获取所有角色
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @ApiOperation("获取所有角色")
    @RequestMapping(value = "GetAllRoles", method = RequestMethod.GET)
    public BaseRetModel<SsRole> getRoles(HttpSession session,
                                         HttpServletRequest request,
                                         HttpServletResponse response) {
        BaseRetModel<SsRole> retModel = new BaseRetModel<>();
        List<SsRole> ssRoles = null;

        try {
            ssRoles = userRoleService.getRoles(getLoginTenantId());


        } catch (Exception ex) {

            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;

        }

        retModel.setDataList(ssRoles);

        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;

    }


    /**
     * 获取用户角色
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @ApiOperation("获取用户具备角色")
    @RequestMapping(value = "getUserRoles", method = RequestMethod.GET)
    public BaseRetModel<SsUserRole> getUserRoles(HttpSession session,
                                                 HttpServletRequest request,
                                                 HttpServletResponse response) {

        BaseRetModel<SsUserRole> retModel = new BaseRetModel<>();
        List<SsUserRole> ssUserRoles = null;

        try {
            ssUserRoles = userRoleService.getUserRoles(getLoginTenantId(), getLoginUserId());


        } catch (Exception ex) {

            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;

        }

        retModel.setDataList(ssUserRoles);

        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;

    }


    /**
     * 保存用户角色列表。
     *
     * @param session
     * @param request
     * @param response
     * @param aRolesJson
     * @return
     */
    @ApiOperation("提交保存用户角色")
    @RequestMapping(value = "SaveUserRoles", method = RequestMethod.POST)
    public BaseRetModel saveRoleFuncDs(HttpSession session,
                                       HttpServletRequest request,
                                       HttpServletResponse response,
                                       @RequestParam String aUserId,
                                       @RequestParam String aRolesJson) {
        BaseRetModel retModel = new BaseRetModel<>();

        Gson gson = GsonHelper.getGsonAll();

        List<SsRole> ssRoles = null;


        try {

            if (aRolesJson.trim().equals("")) {
                throw new Exception("保存角色不允许为空!");
            }


            ssRoles = gson.fromJson(aRolesJson, new TypeToken<List<SsRole>>() {
            }.getType());

            if (ssRoles == null || ssRoles.size() <= 0) {
                throw new Exception("转换Gson泛型错误!");
            }


            //进行保存
            userRoleService.saveUserRoles(getLoginTenantId(), ssRoles, aUserId);


        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        return retModel;
    }


}
