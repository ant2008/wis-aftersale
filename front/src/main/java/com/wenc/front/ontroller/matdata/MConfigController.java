package com.wenc.front.controller.matdata;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wenc.commdomain.pojo.sys.TsParaset;
import com.wenc.commdomain.vo.bsys.TenantRolesVO;
import com.wenc.commdomain.vo.matdata.ParasetVo;
import com.wenc.commdomain.vo.matdata.VbUserRole;
import com.wenc.commonservice.matdata.service.ParasetService;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.BaseRetMdModel;
import com.wenc.core.model.BaseRetModel;
import com.wenc.core.util.GsonHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 系统配置 controller.
 */
@RequestMapping("MConfig")
@RestController
public class MConfigController extends AbstractBaseSingleController<TsParaset,TsParaset> {

    @Autowired
    private ParasetService parasetService;


    public MConfigController() {
        super();
    }


    /**
     * 获取当前租户下设置选择项目
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "ListParaset",method = RequestMethod.GET)
    public BaseRetModel<Map<String,ParasetVo>> listParaset(HttpSession session,
                                                 HttpServletRequest request,
                                                 HttpServletResponse response)
    {
        BaseRetModel<Map<String,ParasetVo>> retModel = new BaseRetModel<>();

        List<ParasetVo>  parasetVos = null;

        Map<String,ParasetVo> parasetVoMap = null;

        try
        {

            parasetVos = parasetService.listTenantParasets(getLoginTenantId());

            //转成map
            if(parasetVos != null && parasetVos.size() > 0 )
            {
              parasetVoMap =   parasetVos.stream().collect(Collectors.toMap(ParasetVo::getParaCode,parasetVo -> parasetVo));
            }


            retModel.setData(parasetVoMap);

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
     * 提交保存信息。
     *
     * @param session
     * @param request
     * @param response
     * @param aCommitJsonStr
     * @return
     */
    @RequestMapping(value = "CommitParaset",method = RequestMethod.POST)
    public BaseRetModel<Map<String,ParasetVo>> commitParaset(HttpSession session,
                                                             HttpServletRequest request,
                                                             HttpServletResponse response,
                                                             @RequestParam String aCommitJsonStr)
    {
          Map<String,ParasetVo>  parasetVoMap = null;
          Gson gson = GsonHelper.getGsonAll();
          BaseRetModel<Map<String,ParasetVo>> retModel = new BaseRetModel<>();

          try
          {
              if(aCommitJsonStr.trim().equals(""))
              {
                  retModel.setCode(BaseConstant.ERR_CODE_201);
                  retModel.setMsg("提交数据为空!");
                  return retModel;
              }

              parasetVoMap = gson.fromJson(aCommitJsonStr,new TypeToken<Map<String,ParasetVo>>(){}.getType());

              if(parasetVoMap == null)
              {
                  retModel.setCode(BaseConstant.ERR_CODE_202);
                  retModel.setMsg("转换提交对象错误!");
                  return retModel;
              }


              parasetService.saveTenantParasets(getLoginTenantId(),parasetVoMap);

              retModel.setData(parasetVoMap);

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
