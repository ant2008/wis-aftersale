package com.wenc.front.controller.bsys;

import com.google.gson.Gson;
import com.wenc.commdomain.pojo.core.SsFuncD;
import com.wenc.commdomain.pojo.core.SsFuncH;
import com.wenc.commdomain.pojo.core.SsRoleFuncD;
import com.wenc.commdomain.pojo.core.VbFuncD;
import com.wenc.commdomain.vo.bsys.VbRoleFuncH;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.BaseRetModel;
import com.wenc.core.model.FuncChkModel;
import com.wenc.core.model.SearchConModel;
import com.wenc.core.util.GsonHelper;
import com.wenc.core.util.SearchConBuilder;
import com.wenc.sys.service.FuncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;

/**
 * 权限设置
 */
@RequestMapping("MFunc")
@RestController
public class FuncController extends AbstractBaseSingleController<SsFuncH,SsFuncH> {

    @Autowired
    protected FuncService funcService;

    public FuncController() {
        super();
    }

    @Override
    public void InitCreate(SsFuncH aModel) {
        aModel.setState(1);
        aModel.setCreateTime(new Timestamp(System.currentTimeMillis()));
        aModel.setCreateUser(getLoginUserId());
    }


    @Override
    public void buildQuickCons(List<SearchConModel> searchConModels, String aWhere) {

        SearchConModel searchConModel = null;
        String tmpWhere  = "";

        try
        {

            if(aWhere == null || aWhere.trim().equals(""))
            {
                 tmpWhere = "%%";
            }else
            {
                tmpWhere = aWhere.trim()+"%";
            }

            //组建查询。
            searchConModel =
                    SearchConBuilder
                    .newInstance()
                    .colName("funcNo")
                    .operaSign("=")
                    .colValue(aWhere)
                    .relationShip("or")
                    .buildSearchCon();

            searchConModels.add(searchConModel);

            searchConModel = SearchConBuilder
                            .newInstance()
                            .colName("descr")
                            .operaSign("like")
                            .colValue(tmpWhere)
                            .buildSearchCon();

             searchConModels.add(searchConModel);


        }catch (Exception ex)
        {
            ex.printStackTrace();
        }


    }


    /**
     * 获取审核明细权限
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



        List<SsFuncD> ssFuncDS = null;

        SsFuncH ssFuncH = null;

        try
        {
            if(aIdx.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERROR);
                retModel.setMsg("无法获取当前行索引号");
                return retModel;

            }

            ssFuncH = voService.findById(SsFuncH.class,Long.valueOf(aIdx));

            if(ssFuncH == null)
            {
                retModel.setCode(BaseConstant.ERROR);
                retModel.setMsg("无法获取权限信息!");
                return retModel;
            }

            //获取标准审核清单。
            ssFuncDS = funcService.getFuncDs(ssFuncH.getFuncNo());



            retModel.setDataList(ssFuncDS);
            retModel.setData(ssFuncH);


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
     * 保存提交的审核明细
     * @param session
     * @param request
     * @param response
     * @param aChkModel
     * @return
     */
    @RequestMapping(value = "PostFuncChk",method = RequestMethod.POST)
    public BaseRetModel postFuncChk(HttpSession session,
                                   HttpServletRequest request,
                                   HttpServletResponse response,
                                   @RequestParam String aChkModel)
    {
        BaseRetModel retModel = new BaseRetModel();

        Gson gson = GsonHelper.getGsonAll();

        FuncChkModel funcChkModel = null;




        try
        {
            if(aChkModel == null || aChkModel.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERROR);
                retModel.setMsg("传入对象错误!");
                return  retModel;
            }

            //构建保存对象,进行保存。
            funcChkModel = gson.fromJson(aChkModel,FuncChkModel.class);

            if(funcChkModel != null)
            {
                //进行保存
                funcService.saveFuncDs(funcChkModel);
            }

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
