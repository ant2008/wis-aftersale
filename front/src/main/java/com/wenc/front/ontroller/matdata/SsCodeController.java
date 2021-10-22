package com.wenc.front.controller.matdata;

import com.google.gson.Gson;
import com.wenc.commonservice.sys.service.SysCodeService;
import com.wenc.commdomain.pojo.core.SsCode;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.*;
import com.wenc.core.util.GsonHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.List;

@Api("数据字典")
@RequestMapping("Sscode")
@RestController
public class SsCodeController extends AbstractBaseSingleController<SsCode, SsCode> {

    @Autowired
    private SysCodeService sysCodeService;



    public SsCodeController() {
        super();
    }


    /**
     * @param session
     * @param request
     * @param response
     * @return
     */
    @ApiIgnore
    @RequestMapping(value = "GetSscode", method = RequestMethod.GET)
    private List<SsCode> getSscode(HttpSession session,
                                   HttpServletRequest request,
                                   HttpServletResponse response) {
        try {

            return sysCodeService.getSysCodes("0");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }


    /**
     * 获取所有系统字典。
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @ApiOperation("返回所有可使用字典对象")
    @RequestMapping(value = "GetSscodeDict", method = RequestMethod.GET)
    private List<DictModel> getSscodeDict(HttpSession session,
                                          HttpServletRequest request,
                                          HttpServletResponse response) {


        List<DictModel> retDict = null;

        try {

            retDict = sysCodeService.getDictModels("0");

            return retDict;

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }


    /**
     * 翻页获取数据字典对象。
     *
     * @param session
     * @param request
     * @param response
     * @param aPage
     * @return
     */
    @ApiOperation("翻页获取数据字典对象")
    @RequestMapping(value = "pageSscode", method = RequestMethod.GET)
    private BaseRetModel<SsCode> pageSscode(HttpSession session,
                                            HttpServletRequest request,
                                            HttpServletResponse response,
                                            @RequestParam int aPage) {
        LinkedHashMap<String, SearchConModel> linkedHashMap = null;
        SearchConModel searchConModel = null;
        BaseRetModel<SsCode> retModel = new BaseRetModel<>();

        Gson gson = GsonHelper.getGsonAll();


        try {

            linkedHashMap = new LinkedHashMap<>();

            searchConModel = new SearchConModel();
            searchConModel.setColName("parentCode");
            searchConModel.setOpat("=");
            searchConModel.setColValue("232");
            searchConModel.setRela("or");

            linkedHashMap.put("1", searchConModel);


            searchConModel = new SearchConModel();
            searchConModel.setColName("parentCode");
            searchConModel.setOpat("=");
            searchConModel.setColValue("231");
            linkedHashMap.put("2", searchConModel);


            retModel = pageQuery(session, request, response, aPage, 10, gson.toJson(linkedHashMap));


        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return retModel;
    }


    /**
     * 获取所有的数据字典
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @ApiOperation("获取所有数据字典对象")
    @RequestMapping(value = "GetAllSysCode", method = RequestMethod.GET)
    public BaseRetModel<SsCode> getAllSysCode(HttpSession session,
                                              HttpServletRequest request,
                                              HttpServletResponse response) {
        BaseRetModel<SsCode> retModel = new BaseRetModel<>();

        List<SsCode> retList = null;

        try {
            retList = sysCodeService.getAllSysCodes();
            retModel.setDataList(retList);
        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    /**
     * 获取第一层数据字典
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @ApiOperation("获取第一层数据字典")
    @RequestMapping(value = "GetTopSysCode", method = RequestMethod.GET)
    public BaseRetModel<SsCode> getTopSysCode(HttpSession session,
                                              HttpServletRequest request,
                                              HttpServletResponse response) {
        BaseRetModel<SsCode> retModel = new BaseRetModel<>();

        List<SsCode> retList = null;

        try {
            retList = sysCodeService.getTopSysCodes();
            retModel.setDataList(retList);
        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    /**
     * 获取角色字典
     * @param session
     * @param request
     * @param response
     * @return
     */
    @ApiOperation("获取角色字典")
    @RequestMapping(value = "GetRoleDict", method = RequestMethod.GET)
    public BaseRetModel<DictModel> getRoleDict(HttpSession session,
                                              HttpServletRequest request,
                                              HttpServletResponse response) {
        BaseRetModel<DictModel> retModel = new BaseRetModel<>();

        List<DictModel> retList = null;

        try {
            retList = sysCodeService.getRoleDict();

            retModel.setDataList(retList);
        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    /**
     * 获取用户字典
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "GetUserDict", method = RequestMethod.GET)
    public BaseRetModel<DictModel> getUserDict(HttpSession session,
                                               HttpServletRequest request,
                                               HttpServletResponse response) {
        BaseRetModel<DictModel> retModel = new BaseRetModel<>();

        List<DictModel> retList = null;

        try {
            retList = sysCodeService.getUserDict(getLoginTenantId());

            retModel.setDataList(retList);
        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    /**
     * 获取地区树形字典。
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "GetAllAreaDict", method = RequestMethod.GET)
    public BaseRetModel<CommDictModel> getAllAreaDict(HttpSession session,
                                                      HttpServletRequest request,
                                                      HttpServletResponse response) {
        BaseRetModel<CommDictModel> retModel = new BaseRetModel<>();

        List<CommDictModel> retList = null;

        try {
            retList = sysCodeService.getAllAreaDicts();

            retModel.setDataList(retList);
        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }





    @RequestMapping(value = "GetAreaTreeDict", method = RequestMethod.GET)
    public BaseRetModel<TreeDictModel> getAreaTreeDict(HttpSession session,
                                                       HttpServletRequest request,
                                                       HttpServletResponse response) {
        BaseRetModel<TreeDictModel> retModel = new BaseRetModel<>();

        List<TreeDictModel> retList = null;

        try {
            retList = sysCodeService.getAreaTreeDicts();

            retModel.setDataList(retList);
        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    /**
     * 获取地区字典
     * @param session
     * @param request
     * @param response
     * @param aParentCode
     * @return
     */
    @RequestMapping(value = "GetAreaDict", method = RequestMethod.GET)
    public BaseRetModel<TreeDictModel> getAreaDict(HttpSession session,
                                                   HttpServletRequest request,
                                                   HttpServletResponse response,
                                                   @RequestParam String aParentCode) {
        BaseRetModel<TreeDictModel> retModel = new BaseRetModel<>();

        List<TreeDictModel> retList = null;

        try {
            retList = sysCodeService.getAreaTreeDicts(aParentCode);
            retModel.setDataList(retList);
        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }




    @RequestMapping(value = "GetSyncAreaDict", method = RequestMethod.GET)
    public BaseRetModel<OpListDictModel> GetSyncAreaDict(HttpSession session,
                                                   HttpServletRequest request,
                                                   HttpServletResponse response,
                                                   @RequestParam String aParentCode) {
        BaseRetModel<OpListDictModel> retModel = new BaseRetModel<>();
        List<OpListDictModel> retList = null;


        try {
            retList = sysCodeService.getSyncAreaDicts(aParentCode);
            retModel.setDataList(retList);
        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }



    /**
     * 获取可用线上商铺列表。
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "GetEstoreDict",method = RequestMethod.GET)
    public  BaseRetModel<DictModel> getEstoreDict(HttpSession session,
                                                  HttpServletRequest request,
                                                  HttpServletResponse response)
    {
        BaseRetModel<DictModel> retModel = new BaseRetModel<>();

        List<DictModel> retList = null;



        try
        {

            retList = sysCodeService.getEstoreDict(getLoginTenantId());

            retModel.setDataList(retList);


        }catch (Exception ex)
        {
            retModel.setMsg(ex.getMessage());
            retModel.setCode(BaseConstant.ERROR);
            return retModel;
        }



        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    /**
     * 获取物流公司字典。
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "GetExpressDict",method = RequestMethod.GET)
    public  BaseRetModel<DictModel> getExpressDict(HttpSession session,
                                                  HttpServletRequest request,
                                                  HttpServletResponse response)
    {
        BaseRetModel<DictModel> retModel = new BaseRetModel<>();

        List<DictModel> retList = null;



        try
        {

            retList = sysCodeService.getExpressDicts(getLoginTenantId());

            retModel.setDataList(retList);


        }catch (Exception ex)
        {
            retModel.setMsg(ex.getMessage());
            retModel.setCode(BaseConstant.ERROR);
            return retModel;
        }



        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    /**
     * 获取组织机构字典
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "GetOrgDict",method = RequestMethod.GET)
    public  BaseRetModel<DictModel> getOrgDict(HttpSession session,
                                                  HttpServletRequest request,
                                                  HttpServletResponse response)
    {
        BaseRetModel<DictModel> retModel = new BaseRetModel<>();

        List<DictModel> retList = null;



        try
        {

            retList = sysCodeService.getOrgDicts(getLoginTenantId());

            retModel.setDataList(retList);


        }catch (Exception ex)
        {
            retModel.setMsg(ex.getMessage());
            retModel.setCode(BaseConstant.ERROR);
            return retModel;
        }



        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    /**
     * 获取单位设置字典
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "GetDepotDict",method = RequestMethod.GET)
    public  BaseRetModel<DictModel> getDepotDict(HttpSession session,
                                               HttpServletRequest request,
                                               HttpServletResponse response)
    {
        BaseRetModel<DictModel> retModel = new BaseRetModel<>();

        List<DictModel> retList = null;



        try
        {

            retList = sysCodeService.getDepotDicts(getLoginTenantId());

            retModel.setDataList(retList);


        }catch (Exception ex)
        {
            retModel.setMsg(ex.getMessage());
            retModel.setCode(BaseConstant.ERROR);
            return retModel;
        }



        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    /**
     * 获取价格分组字典
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "GetPriceGroupDict",method = RequestMethod.GET)
    public  BaseRetModel<DictModel> getPriceGroupDict(HttpSession session,
                                                 HttpServletRequest request,
                                                 HttpServletResponse response)
    {
        BaseRetModel<DictModel> retModel = new BaseRetModel<>();

        List<DictModel> retList = null;



        try
        {

            retList = sysCodeService.getPriceGroupDicts(getLoginTenantId());

            retModel.setDataList(retList);


        }catch (Exception ex)
        {
            retModel.setMsg(ex.getMessage());
            retModel.setCode(BaseConstant.ERROR);
            return retModel;
        }



        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    /**
     * 获取排程地点
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "GetScheduleSiteDict",method = RequestMethod.GET)
    public  BaseRetModel<DictModel> getScheduleSiteDict(HttpSession session,
                                                      HttpServletRequest request,
                                                      HttpServletResponse response)
    {
        BaseRetModel<DictModel> retModel = new BaseRetModel<>();

        List<DictModel> retList = null;



        try
        {

            retList = sysCodeService.getScheduleDicts(getLoginTenantId());

            retModel.setDataList(retList);


        }catch (Exception ex)
        {
            retModel.setMsg(ex.getMessage());
            retModel.setCode(BaseConstant.ERROR);
            return retModel;
        }



        retModel.setMsg(BaseConstant.SUCCESS_MSG);
        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    /**
     * 获取分类父类列表。
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "GetParentClass",method = RequestMethod.GET)
    public BaseRetModel<OpListDictModel> getParentClass(HttpSession session,
                                                       HttpServletRequest request,
                                                       HttpServletResponse response,
                                                       @RequestParam String aParentCode )
    {
        BaseRetModel<OpListDictModel> retModel = new BaseRetModel<>();

        List<OpListDictModel> opListDictModels = null;

        try
        {
            opListDictModels = sysCodeService.getTopClassByParent(aParentCode);
            retModel.setDataList(opListDictModels);
        }catch (Exception ex)
        {
            return retModel.err(BaseConstant.ERROR,ex.getMessage());
        }

        return retModel.ok(BaseConstant.SUCESS,BaseConstant.SUCCESS_MSG);
    }


    /**
     * 获取所有分类。
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "GetAllGlClass",method = RequestMethod.GET)
    public BaseRetModel<OpListDictModel> getAllGlClass(HttpSession session,
                                                        HttpServletRequest request,
                                                        HttpServletResponse response)
    {
        BaseRetModel<OpListDictModel> retModel = new BaseRetModel<>();

        List<OpListDictModel> opListDictModels = null;

        try
        {
            opListDictModels = sysCodeService.getAllGlClass();
            retModel.setDataList(opListDictModels);
        }catch (Exception ex)
        {
            return retModel.err(BaseConstant.ERROR,ex.getMessage());
        }

        return retModel.ok(BaseConstant.SUCESS,BaseConstant.SUCCESS_MSG);
    }



}
