package com.wenc.core.controller;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ReflectUtil;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.wenc.commdomain.pojo.matdata.TsPrint;
import com.wenc.core.config.FuncExcludeConfig;
import com.wenc.sys.service.PrintService;
import com.wenc.sys.service.TokenService;
import com.wenc.core.BaseConstant;
import com.wenc.core.model.*;
import com.wenc.core.service.GenericBaseService;
import com.wenc.core.util.GsonHelper;
import com.wenc.core.util.PageQueryHelper;
import io.swagger.annotations.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 单页面的基类.
 *
 * @param <T> POJO
 * @param <V> VO
 * @author w.z
 */
//todo:需要逐个方法进行测试是否可允许，并考虑单表情况下，DO,VO的关系。


@RestController
public abstract class AbstractBaseSingleController<T, V> {


    private static String Field_State = "state";


    private static String Field_CreateTime = "createTime";
    private static String Field_CreateUser = "createUser";


    private static String Field_TenantId = "tenantId";


    private final static Logger LOG = LoggerFactory.getLogger(AbstractBaseSingleController.class);


    @Autowired
    protected GenericBaseService<T> doService;

    @Autowired
    protected GenericBaseService<V> voService;

    @Autowired
    protected TokenService tokenService;

    @Autowired
    protected PrintService printService;

    @Autowired
    protected FuncExcludeConfig funcExcludeConfig;


    private String searchClassName;

    private String controllerName;


    /**
     * 构造函数确保具备注解使用的类名
     */
    public AbstractBaseSingleController() {


        try {

            RequestMapping rm = this.getClass().getAnnotation(RequestMapping.class);

            if (rm.value() != null && rm.value()[0] != null) {
                setControllerName(rm.value()[0].trim());
            } else {
                LOG.error("请使用注解方式定义Controller相应参数");
                return;
            }

//            Constructor oConstructor = this.getClass().getDeclaredConstructors()[0];
//
//            if(oConstructor.getAnnotation(BaseContollerAnnotation.class) != null) {
//
//                BaseContollerAnnotation baseContollerAnnotation = (BaseContollerAnnotation) oConstructor
//                        .getAnnotation(BaseContollerAnnotation.class);
//
//                if (baseContollerAnnotation.searchClass() != null &&
//                        !baseContollerAnnotation.searchClass().getName().trim().equals("") &&
//                        !baseContollerAnnotation.searchClass().getName().trim().equals("java.lang.Object")) {
//
//                    setSearchClassName(baseContollerAnnotation.searchClass().getName());
//
//                }
//            }else
//            {
//                  LOG.error("无法获取需要的泛型设置!");
//            }


            setSearchClassName(getClazzV().getName());

            LOG.debug(this.getSearchClassName());


        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error(ex.getMessage());
        }
    }


    public String getSearchClassName() {
        return searchClassName;
    }

    public void setSearchClassName(String searchClassName) {
        this.searchClassName = searchClassName;
    }

    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

    /**
     * 用于进行翻页查询使用。
     *
     * <p>notes:调整,不使用map格式，而是SearchConModel对象的list模式。 </p>
     *
     * @param session
     * @param request
     * @param response
     * @param aPage
     * @param aSize
     * @param aConMapJson json格式: [{'colname':'itemno','opat':'=','colValue':'sss','rela':'and','colType':''}]
     * @return
     */
    @ApiOperation(value = "翻页查询", notes = "通用翻页查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "aPage", value = "页数(从1开始)"),
            @ApiImplicitParam(name = "aSize", value = "每页行数"),
            @ApiImplicitParam(name = "aConMapJson",
                    value = "查询",
                    example = "json格式: [{'colname':'itemno','opat':'=','colValue':'sss','rela':'and','colType':''}]")
    })
    @RequestMapping(value = "PageQuery", method = {RequestMethod.POST, RequestMethod.GET})
    public BaseRetModel<V> pageQuery(HttpSession session,
                                     HttpServletRequest request,
                                     HttpServletResponse response,
                                     @RequestParam int aPage,
                                     @RequestParam int aSize,
                                     @RequestParam String aConMapJson) {

        BaseRetModel<V> baseRetModel = new BaseRetModel<>();

        List<V> retList = null;


        String hqlStr = "";

        PageModel<V> pageModel = null;

        Object[] paramValues = null;


        int totalPages = 0;
        int totalRows = 0;

        String pageCountStr = "";

        int realStartRows = 0;


        List<SearchConModel> searchConModels = null;


        Gson gson = GsonHelper.getGsonAll();


        SearchConModel defaultSearchConModel = null;

        try {

            //判断用户权限


            if (aPage <= 0) {
                throw new Exception("页数从1开始,输入页数错误!");
            }

            if (aConMapJson == null || aConMapJson.trim().equals("")) {
                throw new Exception("查询条件不允许为空!");
            }


            //处理输入条件。
            searchConModels = gson.fromJson(aConMapJson.trim(), new TypeToken<List<SearchConModel>>() {
            }.getType());


            if (searchConModels == null) {
                throw new Exception("转化查询对象错误!");
            }

            //如果为空则进行全部查询。
            if(searchConModels.size() <=0)
            {

                 defaultSearchConModel = new SearchConModel();

                 defaultSearchConModel.setColName("idx");
                 defaultSearchConModel.setOpat(">");
                 defaultSearchConModel.setColValue(Long.valueOf("0"));
                 searchConModels.add(defaultSearchConModel);
            }



            if (getSearchClassName() != null && !getSearchClassName().trim().equals("")) {
                hqlStr = PageQueryHelper.builderQuerySql(getSearchClassName(), searchConModels);

                //进行子类事件调用，可以进行子类覆盖。
                hqlStr = processPageQuery(getSearchClassName(),hqlStr,searchConModels);

            } else {
                // hqlStr = PageQueryHelper.builderQuerySql(genericBaseService.getClazzT().getName(),conModelMap);

                baseRetModel.setCode(BaseConstant.ERROR);
                baseRetModel.setMsg("Please Set SerchAnnonce Class !");
                return baseRetModel;

            }


            if (hqlStr == null || hqlStr.trim().equals("")) {
                throw new Exception("无法获取查询需要SQL语句!");
            }


            paramValues = PageQueryHelper.builderQueryParams(searchConModels);


            //获取总页数
            pageCountStr = PageQueryHelper.builderQueryCount(hqlStr, searchConModels);
            if (pageCountStr == null || pageCountStr.trim().equals("")) {
                throw new Exception("无法获取查询的总页数语句!");
            }

            totalRows = voService.pageCount(pageCountStr, paramValues);


            //计算开始行数。
            realStartRows = (aPage - 1) * aSize;


            //建立查询的倒叙
            hqlStr = buildPageQueryOrderClause(hqlStr);

            retList = voService.pageQuery(hqlStr, realStartRows, aSize, paramValues);


            pageModel = new PageModel<>();

            pageModel.setPageNumber(aPage);
            pageModel.setPageSize(aSize);
            pageModel.setPageDatas(retList);
            pageModel.setTotalRows(totalRows);

            //计算总页数。
            if (aSize != 0) {
                totalPages = (totalRows + aSize - 1) / aSize;
            }
            pageModel.setTotalPages(totalPages);


            baseRetModel.setPage(pageModel);


        } catch (Exception ex) {
            baseRetModel.setCode(BaseConstant.ERROR);
            baseRetModel.setMsg(ex.getMessage());
            return baseRetModel;
        }

        baseRetModel.setCode(BaseConstant.SUCESS);
        return baseRetModel;

    }


    /**
     * 加入可增加倒叙的函数。
     *
     * @param aHqlStr
     * @return
     */
    public  String buildPageQueryOrderClause(String aHqlStr)
    {
        return  PageQueryHelper.buildPageQueryOrderClause(aHqlStr);
    }


    /**
     * 前置查询事件
     * <p>提供给子类进行覆盖修改查询条件</p>
     * @param aSearchClassName
     * @param aHqlStr
     * @param searchConModels
     * @return
     */
   public String processPageQuery(String aSearchClassName,String aHqlStr,List<SearchConModel> searchConModels)
    {
         return aHqlStr;
    }


    /**
     * 进行快速查询,具体查询语句需要在子类中进行覆盖生成。
     * @param session
     * @param request
     * @param response
     * @param aPage
     * @param aSize
     * @param aWhere
     * @return
     */
    @RequestMapping(value = "QuickQuery",method = {RequestMethod.POST,RequestMethod.GET})
    public BaseRetModel<V> quickQuery(HttpSession session,
                                     HttpServletRequest request,
                                     HttpServletResponse response,
                                     @RequestParam int aPage,
                                     @RequestParam int aSize,
                                     @RequestParam String aWhere)
    {


        BaseRetModel<V> baseRetModel = new BaseRetModel<>();

        List<V> retList = null;


        String hqlStr = "";

        PageModel<V> pageModel = null;

        Object[] paramValues = null;


        int totalPages = 0;
        int totalRows = 0;

        String pageCountStr = "";

        int realStartRows = 0;


        List<SearchConModel> searchConModels = null;


        Gson gson = GsonHelper.getGsonAll();


        SearchConModel defaultSearchConModel = null;

        try {

            //判断用户权限


            if (aPage <= 0) {
                throw new Exception("页数从1开始,输入页数错误!");
            }

            if(aSize <=0)
            {
                aSize = 20;
            }

            //处理输入条件。
            searchConModels = new ArrayList<>();
            //可提供子类覆盖。
            buildQuickCons(searchConModels,aWhere);


            //如果为空则进行全部查询。
            if(searchConModels.size() <=0)
            {

                defaultSearchConModel = new SearchConModel();

                defaultSearchConModel.setColName("idx");
                defaultSearchConModel.setOpat(">");
                defaultSearchConModel.setColValue(Long.valueOf("0"));
                searchConModels.add(defaultSearchConModel);
            }


            if (getSearchClassName() != null && !getSearchClassName().trim().equals("")) {
                hqlStr = PageQueryHelper.builderQuerySql(getSearchClassName(), searchConModels);
            } else {
                // hqlStr = PageQueryHelper.builderQuerySql(genericBaseService.getClazzT().getName(),conModelMap);

                baseRetModel.setCode(BaseConstant.ERROR);
                baseRetModel.setMsg("Please Set SerchAnnonce Class !");
                return baseRetModel;

            }

            if (hqlStr == null || hqlStr.trim().equals("")) {
                throw new Exception("无法获取查询需要SQL语句!");
            }


            paramValues = PageQueryHelper.builderQueryParams(searchConModels);


            //获取总页数
            pageCountStr = PageQueryHelper.builderQueryCount(hqlStr, searchConModels);
            if (pageCountStr == null || pageCountStr.trim().equals("")) {
                throw new Exception("无法获取查询的总页数语句!");
            }

            totalRows = doService.pageCount(pageCountStr, paramValues);


            //计算开始行数。
            realStartRows = (aPage - 1) * aSize;


            retList = voService.pageQuery(hqlStr, realStartRows, aSize, paramValues);


            pageModel = new PageModel<>();

            pageModel.setPageNumber(aPage);
            pageModel.setPageSize(aSize);
            pageModel.setPageDatas(retList);
            pageModel.setTotalRows(totalRows);

            //计算总页数。
            if (aSize != 0) {
                totalPages = (totalRows + aSize - 1) / aSize;
            }
            pageModel.setTotalPages(totalPages);


            baseRetModel.setPage(pageModel);


        } catch (Exception ex) {
            baseRetModel.setCode(BaseConstant.ERROR);
            baseRetModel.setMsg(ex.getMessage());
            return baseRetModel;
        }

        baseRetModel.setCode(BaseConstant.SUCESS);
        return baseRetModel;

    }

    /**
     * 提供给子类进行覆盖组件查询需要条件
     *
     * @param searchConModels
     * @param aWhere
     */
    public  void buildQuickCons(List<SearchConModel> searchConModels,String aWhere)
    {
         return;
    }




    /**
     * 导出Excel格式。
     *
     * @param aJsonData
     * @param session
     * @param request
     * @param response
     * @return todo:待丰富和完善
     */

    @ApiOperation("导出Excel格式")
    @RequestMapping(value = "ExportExcel", method = RequestMethod.POST)
    @ResponseBody
    public BaseRetModel exportExcel(@RequestBody String aJsonData, HttpSession session,
                                    HttpServletRequest request, HttpServletResponse response) {
        BaseRetModel retModel = new BaseRetModel();

        String excelFileAttribute = this.getControllerName() + "_exp_excel";
        HSSFWorkbook wk = null;
        Gson gson = new Gson();

        //ExpexcelModelT<LinkedHashMap> expexcelModel = null;

        ExcelModelT<LinkedTreeMap> expexcelModel = null;

        try {

            LOG.info("aJsonData=" + aJsonData);

            //expexcelModel = gson.fromJson(aJsonData, ExpexcelModelT.class);

            expexcelModel = gson.fromJson(aJsonData, new TypeToken<ExcelModelT<LinkedTreeMap>>() {
            }.getType());


            //    FileHelper.SavePoiToFile(goodsService.ExportExcel(),"test.xls");


            wk = (HSSFWorkbook) voService.ExportExcel(expexcelModel);
            //将获得EXCEL放入session中
            session.setAttribute(excelFileAttribute, wk);


        } catch (Exception ex) {
            ex.printStackTrace();
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg("导出错误!" + ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    /**
     * 导出所有数据的EXCEL格式。
     *
     * @param aJsonData
     * @param session
     * @param request
     * @param response
     * @return
     */
    //todo:待细化和优化
    @RequestMapping(value = "ExportExcelAll", method = RequestMethod.POST)
    @ResponseBody
    public BaseRetModel exportExcelAll(@RequestBody String aJsonData, HttpSession session,
                                       HttpServletRequest request, HttpServletResponse response) {
        BaseRetModel retModel = new BaseRetModel();

        String excelFileAttribute = this.getControllerName() + "_expexcel";
        HSSFWorkbook wk = null;
        Gson gson = new Gson();

        //ExpexcelModelT<LinkedHashMap> expexcelModel = null;

        ExcelModelT<LinkedTreeMap> expexcelModel = null;


        try {

            LOG.info("aJsonData=" + aJsonData);

            //查询所有数据，然后转成LinkedHashMap.


            //expexcelModel = gson.fromJson(aJsonData, ExpexcelModelT.class);

            expexcelModel = gson.fromJson(aJsonData, new TypeToken<ExcelModelT<LinkedTreeMap>>() {
            }.getType());


            //    FileHelper.SavePoiToFile(goodsService.ExportExcel(),"test.xls");


            wk = (HSSFWorkbook) voService.ExportExcel(expexcelModel);
            //将获得EXCEL放入session中
            session.setAttribute(excelFileAttribute, wk);


        } catch (Exception ex) {
            ex.printStackTrace();
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg("导出错误!" + ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    /**
     * 获取需要导出的数据。
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    //获取需要导出的所有数据。
    @RequestMapping(value = "GetExportAllData", method = RequestMethod.POST)
    @ResponseBody
    public BaseRetModel getExportAllData(HttpSession session,
                                         HttpServletRequest request, HttpServletResponse response) {
        BaseRetModel retModel = new BaseRetModel();

//        T t = null;
//        Class<T> clz = null;
//
        String hqlStr = "";

        try {

            //clz = (Class<T>) Class.forName(this.getPojoClassName());


            retModel.setData(this.voService.findAll());


        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;

    }


    /**
     * 下载EXCEL文件
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    //todo:待优化和细化
    @RequestMapping(value = "DownExcel", method = RequestMethod.POST)
    @ResponseBody
    public BaseRetModel downExcel(HttpSession session,
                                  HttpServletRequest request, HttpServletResponse response) {
        BaseRetModel retModel = new BaseRetModel();
        String excelFileAttribute = this.getControllerName() + "_expexcel";
        HSSFWorkbook wk = null;

        try {

            wk = (HSSFWorkbook) session.getAttribute(excelFileAttribute);

            if (wk == null) {
                retModel.setCode(BaseConstant.ERROR);
                retModel.setMsg("无法获取相应的文件内容");
                return retModel;
            }

            //通过Response把数据以Excel格式保存
            response.reset();
            response.setContentType("application/msexcel;charset=UTF-8");

            response.addHeader("Content-Disposition", "attachment;filename=\""
                    + new String((this.getControllerName() + ".xls").getBytes("GBK"),
                    "ISO8859_1") + "\"");


            OutputStream out = response.getOutputStream();
            wk.write(out);
            out.flush();
            out.close();


        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;

    }


    /**
     * 获取编辑的对象
     *
     * @param session
     * @param request
     * @param id
     * @return
     * @deprecated 前后端模式下，获取详细数据只需要一个服务接口。不再提供针对修改的EDIT
     */
    @ApiIgnore
    @Deprecated
    @ResponseBody
    @RequestMapping(value = "/Edit/{id}", method = RequestMethod.GET)
    public BaseRetModel<V> edit(HttpSession session, HttpServletRequest request, @PathVariable int id) {

        BaseRetModel<V> baseRetModel = new BaseRetModel<>();
        Object obj = null;
        V modelV = null;

        Class<V> clz = null;


        try {


            clz = getClazzV();

            LOG.debug(clz.getSimpleName());


            obj = voService.findById(clz, Long.valueOf(String.valueOf(id)));

            if (obj == null) {
                baseRetModel.setCode(BaseConstant.ERROR);
                baseRetModel.setMsg("无法获取[" + id + "]对象!");
                return baseRetModel;
            }

            modelV = (V) obj;

            if (modelV == null) {
                baseRetModel.setCode(BaseConstant.ERROR);
                baseRetModel.setMsg("转换对象错误!");
                return baseRetModel;
            }

            baseRetModel.setData(modelV);

        } catch (Exception ex) {
            baseRetModel.setMsg(ex.getMessage());
            baseRetModel.setCode(BaseConstant.ERROR);
            return baseRetModel;
        }


        baseRetModel.setCode(BaseConstant.SUCESS);
        return baseRetModel;

    }


    /**
     * 获取明细对象()
     *
     * @param session
     * @param request
     * @param id
     * @return
     */

    @ApiOperation("获取明细对象")
    @ApiImplicitParam(name = "id", value = "行记录号")
    @ResponseBody
    @RequestMapping(value = "/Detail/{id}", method = RequestMethod.GET)
    public BaseRetModel<V> detail(HttpSession session, HttpServletRequest request,

                                @ApiParam("行号ID")  @PathVariable int id) {

        BaseRetModel<V> baseRetModel = new BaseRetModel<>();
        Object obj = null;
        V modelV = null;

        try {

            obj = voService.findById(getClazzV(), Long.valueOf(String.valueOf(id)));

            if (obj == null) {
                baseRetModel.setCode(BaseConstant.ERROR);
                baseRetModel.setMsg("无法获取[" + id + "]对象!");
                return baseRetModel;
            }

            modelV = (V) obj;

            if (modelV == null) {
                baseRetModel.setCode(BaseConstant.ERROR);
                baseRetModel.setMsg("转换对象错误!");
                return baseRetModel;
            }

            baseRetModel.setData(modelV);

        } catch (Exception ex) {
            baseRetModel.setMsg(ex.getMessage());
            baseRetModel.setCode(BaseConstant.ERROR);
            return baseRetModel;
        }


        baseRetModel.setCode(BaseConstant.SUCESS);
        return baseRetModel;

    }


    /**
     * 创建方法
     *
     * @param session
     * @param request
     * @return
     */

    @ApiOperation(value = "新增创建获取接口", notes = "调用此接口可以获取新增前带初始化数值的对象")
    @ResponseBody
    @RequestMapping(value = "/Create", method = RequestMethod.POST)
    public BaseRetModel<V> Create(HttpSession session, HttpServletRequest request) {
        V modelV = null;
        Class<?> cls = null;

        BaseRetModel<V> baseRetModel = new BaseRetModel<>();

        try {

            //动态创建T
            //todo:此处待考虑是否使用searchClassName.
            modelV = (V) Class.forName(getSearchClassName()).newInstance();

            InitCreate(modelV);

            //mav.setViewName("UserMt/Details");

            if (modelV != null) {
                baseRetModel.setData(modelV);
            }
        } catch (Exception ex) {
            baseRetModel.setCode(BaseConstant.ERROR);
            baseRetModel.setMsg(ex.getMessage());
            ex.printStackTrace();
            return baseRetModel;
        }

        baseRetModel.setCode(BaseConstant.SUCESS);
        return baseRetModel;
    }


    /**
     * 提供给子类覆盖使用创建初始化方法。
     *
     * @param aModel
     * @return
     */
    public void InitCreate(V aModel) throws Exception {
    }


    /**
     * 保存编辑对象
     *
     * @param session
     * @param request
     * @param aJsonRequest
     * @return
     */

    @ApiOperation(value = "修改提交接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "aJsonRequest", value = "修改对象JSON字符串", example = "详细格式针对每个不同接口不同")
    })
    @Transactional(rollbackFor = Exception.class)
    @ResponseBody
    @RequestMapping(value = "/EditPost", method = RequestMethod.POST)
    public BaseRetModel<V> editPost(HttpSession session,
                                    HttpServletRequest request,
                                    @RequestParam String aJsonRequest) {

        BaseRetModel<V> baseRetModel = new BaseRetModel<>();

        T modelT = null;

        V modelV = null;

        Long tmpIdx = null;

        //保存到DAO
        try {

            //转换泛型到实际保存数据库类型
            modelT = convertModelT(aJsonRequest);
            //保存前事件
            beforeEdit(session, request, modelT);
            //自动赋值
            autoSetBillInfo(session, request, modelT);
            //修改
            doService.update(modelT);
            //修改后事件。
            afterEdit(session, request, modelT);


        } catch (Exception ex) {
            baseRetModel.setCode(BaseConstant.ERROR);
            baseRetModel.setMsg(ex.getMessage());
            ex.printStackTrace();
            return baseRetModel;
        }


        baseRetModel.setMsg(BaseConstant.SUCCESS_MSG);
        baseRetModel.setCode(BaseConstant.SUCESS);

        //modify:为让前段修改后具备相应的数据，因此修改.  bruce 2018-01-29.
        tmpIdx = (Long) ReflectUtil.getFieldValue(modelT,"idx");
        modelV = voService.findById(getClazzV(),tmpIdx);
        baseRetModel.setData(modelV);
        return baseRetModel;
    }


    /**
     * 提供给子类修改覆盖前置方法
     *
     * @param session
     * @param request
     * @param aModel
     * @throws Exception
     */
    public void beforeEdit(HttpSession session, HttpServletRequest request, T aModel) throws Exception {

    }


    /**
     * <p>Description:此方法用于在Edit提交数据库后调用,可在子类中覆盖。 </p>
     *
     * @param session
     * @param request
     * @param aModel
     * @return
     * @author:B.B
     * @date:
     * @version:1.0
     */
    public void afterEdit(HttpSession session, HttpServletRequest request, T aModel) throws Exception {
    }


    /**
     * 保存事件
     *
     * <p>调整:为方便前端处理,保存后，返回前端的是VO . b.v 2019-05-23</p>
     * @param session
     * @param request
     * @param aJsonRequest
     * @return
     */
    @ApiOperation(value = "增加提交数据库", notes = "此方法用于提交新增对象到数据库。")
    @Transactional(rollbackFor = Exception.class)
    @ResponseBody
    @RequestMapping(value = "/CreatePost", method = RequestMethod.POST)
    public BaseRetModel<V> createPost(HttpSession session,
                                      HttpServletRequest request,
                                      @ApiParam("保存对象的json格式") @RequestParam String aJsonRequest) {

        BaseRetModel<V> baseRetModel = new BaseRetModel<>();

        T modelT = null;

        V modelV = null;

        Long tmpIdx = null;


        //保存到DAO
        try {

            //转换json到泛型T。
            modelT = convertModelT(aJsonRequest);
            //调用前置创建事件。
            beforeCreate(session, request, modelT);
            //自动赋值
            autoSetBillInfo(session, request, modelT);
            //插入DB
            doService.insert(modelT);
            //后置事件。
            afterCreate(session, request, modelT);


        } catch (Exception ex) {
            baseRetModel.setCode(BaseConstant.ERROR);
            baseRetModel.setMsg(ex.getMessage());
            ex.printStackTrace();
            return baseRetModel;
        }


        baseRetModel.setMsg(BaseConstant.SUCCESS_MSG);
        baseRetModel.setCode(BaseConstant.SUCESS);


        //modify:为让前段修改后具备相应的数据，因此修改.  bruce 2018-01-29.
        //modify:返回前端vo  b.v 2019-05-23.

        tmpIdx = (Long) ReflectUtil.getFieldValue(modelT,"idx");

        modelV = voService.findById(getClazzV(),tmpIdx);

        baseRetModel.setData(modelV);
        return baseRetModel;
    }


    /**
     * 提供给子类修改覆盖前置方法
     *
     * @param session
     * @param request
     * @param aModel
     * @throws Exception
     */
    public void beforeCreate(HttpSession session, HttpServletRequest request, T aModel) throws Exception {

    }


    /**
     * <p>Description:此方法用于在Create提交数据库后调用,可在子类中覆盖。 </p>
     *
     * @param session
     * @param request
     * @param aModel
     * @return
     * @author:B.B
     * @date:
     * @version:1.0
     */
    public void afterCreate(HttpSession session, HttpServletRequest request, T aModel) throws Exception {
    }


    /**
     * 自动赋值单据相应字段。
     *
     * @param session
     * @param request
     * @param aModel
     * @return
     * @throws Exception
     */
    public void autoSetBillInfo(HttpSession session, HttpServletRequest request, T aModel) throws Exception {

        //设置日期格式。
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        String userId = "";

        Field createTimeField = null;
        Field createUserField = null;
        Field tenantIdField = null;
        Field stateField = null;
        Field chkbitField = null;



        long excludeFound = 0;

        try {

            userId = getLoginUserId();


            //创建日期
            if (ReflectUtil.hasField(aModel.getClass(), Field_CreateTime)) {
                createTimeField = ReflectUtil.getField(aModel.getClass(), Field_CreateTime);

                if (createTimeField.getType().getName().trim().equals("java.sql.Timestamp")) {
                    ReflectUtil.setFieldValue(aModel, createTimeField, new Timestamp(System.currentTimeMillis()));
                } else {
                    ReflectUtil.setFieldValue(aModel, createTimeField, new Date());
                }
            }

            //创建人
            if (ReflectUtil.hasField(aModel.getClass(), Field_CreateUser)) {
                createUserField = ReflectUtil.getField(aModel.getClass(), Field_CreateUser);
                ReflectUtil.setFieldValue(aModel, createUserField, getLoginUserId());

            }


            //tenantid
            //modify:通过配置设置不需要自动设置tenant_id的白名单。 w.li 2019-09-21

            if (ReflectUtil.hasField(aModel.getClass(), Field_TenantId)) {

                String funcNo = this.getControllerName();

                excludeFound = Arrays.stream(funcExcludeConfig.getNotAutoTenantsFuncArr()).filter(o->o.trim().equals(funcNo.trim())).count();

                //如果没有需要屏蔽的部分
                if(excludeFound <= 0 )
                {
                    tenantIdField = ReflectUtil.getField(aModel.getClass(), Field_TenantId);
                    ReflectUtil.setFieldValue(aModel, tenantIdField, getLoginTenantId());
                }


            }


            //默认状态数值。
            if (ReflectUtil.hasField(aModel.getClass(), Field_State)) {
                stateField = ReflectUtil.getField(aModel.getClass(), Field_State);

                if(ReflectUtil.getFieldsValue(stateField)==null) {

                    if (stateField.getType().getName().trim().equals("java.lang.Integer")) {
                        ReflectUtil.setFieldValue(aModel, stateField, 0);
                    } else {
                        ReflectUtil.setFieldValue(aModel, stateField, Byte.parseByte("0"));
                    }
                }

            }


        } catch (Exception ex) {
            LOG.error("CreatePost Error: {}", ex.getMessage());
            throw new Exception(ex.getMessage());
        }

    }


    /**
     * 提供可覆盖的转化json方式。
     * ps:必须确保需要提交的字段，在VO中都涵盖。
     *
     * @param aJsonStr
     * @return
     * @throws Exception
     */
    public T convertModelT(String aJsonStr) throws Exception {
        V modelV = null;
        Gson gson = null;

        T modelT = null;


        try {

            gson = GsonHelper.getGsonAll();

            //先转换成v泛型
            modelV = gson.fromJson(aJsonStr, getClazzV());

            //最后转变成t泛型
            modelT = getClazzT().newInstance();
            BeanUtil.copyProperties(modelV, modelT);


        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

        return modelT;
    }


    /**
     * 获取t泛型的实际类
     *
     * @return
     */
    public Class<T> getClazzT() {

        Class<T> clazzT = null;
        try {


            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
            clazzT = (Class<T>) pt.getActualTypeArguments()[0];

            LOG.debug("classT Name:[" + clazzT.getSimpleName() + "]");
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return clazzT;

    }


    /**
     * 获取v泛型的实际类
     *
     * @return
     */
    public Class<V> getClazzV() {

        Class<V> clazzV = null;
        try {


            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
            clazzV = (Class<V>) pt.getActualTypeArguments()[1];

            LOG.debug("classT Name:[" + clazzV.getSimpleName() + "]");
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return clazzV;

    }


    /**
     * 获取已经登录用户ID。
     *
     * @return
     */
    protected String getLoginUserId() {
        String token = "";

        String userId = "";

        try {
            if (SecurityUtils.getSubject() == null ||
                    SecurityUtils.getSubject().getPrincipal() == null) {
                return null;
            }

            token = (String) SecurityUtils.getSubject().getPrincipal();


            if (token == null || token.trim().equals("")) {
                return null;
            }


            userId = tokenService.parseTokenKey(token);


        } catch (Exception ex) {
            LOG.error("Get LoginUserId Error : {} ", ex.getMessage());
        }

        return userId;

    }


    /**
     * 获取登陆后的tenantId.
     *
     * @return
     */
    protected String getLoginTenantId() {
        String token = "";

        String tenantId = "";

        try {
            if (SecurityUtils.getSubject() == null ||
                    SecurityUtils.getSubject().getPrincipal() == null) {
                return null;
            }

            token = (String) SecurityUtils.getSubject().getPrincipal();


            if (token == null || token.trim().equals("")) {
                return null;
            }


            tenantId = tokenService.parseTokenTenant(token);


        } catch (Exception ex) {
            LOG.error("Get TenantId Error : {} ", ex.getMessage());
        }

        return tenantId;

    }


    /**
     * 获取打印设置
     * @param session
     * @param request
     * @return
     */
    @RequestMapping(value = "/Print", method = RequestMethod.GET)
    public BaseRetModel<TsPrint> printPreview(HttpSession session,
                                              HttpServletRequest request,
                                             @ApiParam("功能号") @RequestParam String aFuncNo)
    {
        BaseRetModel<TsPrint> baseRetModel = new BaseRetModel<>();

        List<TsPrint> tsPrints = null;
        try
        {

            if(aFuncNo.trim().equals(""))
            {
                baseRetModel.setMsg("权限功能号不允许为空!");
                baseRetModel.setCode(BaseConstant.ERROR);
                return baseRetModel;
            }


            tsPrints = printService.getPrintSetting(aFuncNo);


            baseRetModel.setDataList(tsPrints);



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




    @RequestMapping(value = "/PostPrint", method = RequestMethod.POST)
    public BaseRetModel<V> printPreview(HttpSession session,
                                              HttpServletRequest request,
                                              @RequestParam String aPrtIdx,
                                              @RequestParam String aDataIdx)
    {
        BaseRetModel<V> baseRetModel = new BaseRetModel<>();

        try{



        }catch (Exception ex)
        {
            baseRetModel.setMsg(ex.getMessage());
            baseRetModel.setCode(BaseConstant.ERROR);
            return baseRetModel;
        }


        baseRetModel.setMsg(BaseConstant.SUCCESS_MSG);
        baseRetModel.setCode(BaseConstant.SUCESS);
        return baseRetModel;


    }




}
