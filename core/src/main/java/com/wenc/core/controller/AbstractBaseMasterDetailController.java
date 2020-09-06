package com.wenc.core.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ReflectUtil;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.wenc.commdomain.pojo.core.SsTenant;
import com.wenc.commdomain.pojo.matdata.TsOrgcode;
import com.wenc.commdomain.pojo.matdata.TsPrint;
import com.wenc.core.config.FuncExcludeConfig;
import com.wenc.sys.dao.SsTenantRepository;
import com.wenc.sys.service.PrintService;
import com.wenc.sys.service.SerialnoService;
import com.wenc.sys.service.TokenService;
import com.wenc.commdomain.pojo.core.SsBillChk;
import com.wenc.commdomain.pojo.core.SsFuncD;
import com.wenc.commdomain.pojo.core.SsUserRole;
import com.wenc.core.BaseConstant;
import com.wenc.core.annotation.BaseMasterDetailControllerAnnotation;
import com.wenc.core.model.*;
import com.wenc.core.service.ChkService;
import com.wenc.core.service.CommonMasterDetailService;
import com.wenc.core.service.GenericBaseService;
import com.wenc.core.util.GsonHelper;
import com.wenc.core.util.PageQueryHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


/**
 * 主从表的基类controller
 *
 * @param <M>  POJO MASTER
 * @param <D>  POJO Detail
 * @param <VM> VO master
 * @param <VD> VO detail
 * @author wz
 */

public class AbstractBaseMasterDetailController<M, D, VM, VD> {

    //状态方法名
    private static String Field_State = "state";

    private static String Field_ExecDate = "execDate";

    private static String Field_CreateTime = "createTime";
    private static String Field_CreateUser = "createUser";


    private static String Field_ChkBit = "chkBit";


    private static String Field_TenantId = "tenantId";


    private final static Logger LOG = LoggerFactory.getLogger(AbstractBaseSingleController.class);


    @Autowired
    protected GenericBaseService<M> mService;

    @Autowired
    protected GenericBaseService<D> dService;


    @Autowired
    protected GenericBaseService<VM> vmService;


    @Autowired
    protected GenericBaseService<VD> vdService;


    @Autowired
    protected CommonMasterDetailService<M, D> commonMasterDetailService;


    @Autowired
    protected ChkService chkService;


    @Autowired
    protected TokenService tokenService;


    @Autowired
    protected SerialnoService serialnoService;


    @Autowired
    protected PrintService printService;


    @Autowired
    protected SsTenantRepository ssTenantRepository;

    @Autowired
    protected FuncExcludeConfig funcExcludeConfig;


    private String searchClassName;

    private String controllerName;

    private String keyColName;

    private String serialCode;


    private String masterClassName;

    private String detailClassName;

    private String viewMasterClassName;

    private String viewDetailClassName;


    /**
     * 构造函数确保具备注解使用的类名
     */
    public AbstractBaseMasterDetailController() {


        try {

            RequestMapping rm = this.getClass().getAnnotation(RequestMapping.class);

            if (rm.value() != null && rm.value()[0] != null) {
                setControllerName(rm.value()[0].trim());
            } else {
                LOG.error("请使用注解方式定义Controller相应参数");
                return;
            }

            Constructor oConstructor = this.getClass().getDeclaredConstructors()[0];

            if (oConstructor.getAnnotation(BaseMasterDetailControllerAnnotation.class) != null) {

                BaseMasterDetailControllerAnnotation baseContollerAnnotation = (BaseMasterDetailControllerAnnotation) oConstructor
                        .getAnnotation(BaseMasterDetailControllerAnnotation.class);

                setSearchClassName(getClazzVM().getSimpleName());
                setKeyColName(baseContollerAnnotation.keyColName());
                setSerialCode(baseContollerAnnotation.serialCode());

                setMasterClassName(getClazzVM().getName());


            } else {
                LOG.error("无法获取需要的泛型设置!");
            }


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

    public String getKeyColName() {
        return keyColName;
    }

    public void setKeyColName(String keyColName) {
        this.keyColName = keyColName;
    }

    public String getMasterClassName() {
        return masterClassName;
    }

    public void setMasterClassName(String masterClassName) {
        this.masterClassName = masterClassName;
    }

    public String getDetailClassName() {
        return detailClassName;
    }

    public void setDetailClassName(String detailClassName) {
        this.detailClassName = detailClassName;
    }

    public String getViewMasterClassName() {
        return viewMasterClassName;
    }

    public void setViewMasterClassName(String viewMasterClassName) {
        this.viewMasterClassName = viewMasterClassName;
    }

    public String getViewDetailClassName() {
        return viewDetailClassName;
    }

    public void setViewDetailClassName(String viewDetailClassName) {
        this.viewDetailClassName = viewDetailClassName;
    }

    public String getSerialCode() {
        return serialCode;
    }

    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode;
    }

    /**
     * 用于进行翻页查询使用。
     *
     * @param session
     * @param request
     * @param response
     * @param aPage
     * @param aSize
     * @return
     */

    @ApiOperation("主从表翻页查询")
    @RequestMapping(value = "PageQuery", method = {RequestMethod.POST, RequestMethod.GET})
    public BaseRetModel<VM> pageQuery(HttpSession session,
                                      HttpServletRequest request,
                                      HttpServletResponse response,
                                      @ApiParam("查询页数(从1开始)") @RequestParam int aPage,
                                      @ApiParam("每页行数") @RequestParam int aSize,
                                      @ApiParam("查询条件json格式") @RequestParam String aConMapJson) {

        BaseRetModel<VM> baseRetModel = new BaseRetModel<>();

        List<VM> retList = null;


        String hqlStr = "";

        PageModel<VM> pageModel = null;

        Object[] paramValues = null;


        int totalPages = 0;
        int totalRows = 0;

        String pageCountStr = "";

        int realStartRows = 0;

        List<SearchConModel> searchConModels = null;


        Gson gson = GsonHelper.getGsonAll();


        try {

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

            //加入处理


            if (getSearchClassName() != null && !getSearchClassName().trim().equals("")) {
                hqlStr = PageQueryHelper.builderQuerySql(getSearchClassName(), searchConModels);


                //进行子类事件调用，可以进行子类覆盖。
                hqlStr = processPageQuery(getSearchClassName(),hqlStr,searchConModels);






            } else {

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

            totalRows = vmService.pageCount(pageCountStr, paramValues);


            //计算开始行数。
            realStartRows = (aPage - 1) * aSize;


            //建立查询的倒叙
            hqlStr = buildPageQueryOrderClause(hqlStr);

            retList = vmService.pageQuery(hqlStr, realStartRows, aSize, paramValues);


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
     * 提供子类进行覆盖
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
     * 用于对SQL语句进行后续加入order by 的处理。
     *
     * @param aHqlStr
     * @return
     */
    public  String buildPageQueryOrderClause(String aHqlStr)
    {
       return  PageQueryHelper.buildPageQueryOrderClause(aHqlStr);
    }


    /**
     * 导出excel
     *
     * @param aJsonData
     * @param session
     * @param request
     * @param response
     * @return
     */

    @ApiOperation(value = "导出excel")
    @RequestMapping(value = "ExportExcel", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public BaseRetModel exportExcel(@RequestBody String aJsonData, HttpSession session,
                                    HttpServletRequest request, HttpServletResponse response) {
        BaseRetModel retModel = new BaseRetModel();

        String excelFileAttribute = this.getControllerName() + "_exp_excel";
        HSSFWorkbook wk = null;
        Gson gson = GsonHelper.getGsonAll();

        //ExpexcelModelT<LinkedHashMap> expexcelModel = null;

        ExcelModelT<LinkedTreeMap> expexcelModel = null;

        try {

            LOG.info("aJsonData=" + aJsonData);


            expexcelModel = gson.fromJson(aJsonData, new TypeToken<ExcelModelT<LinkedTreeMap>>() {
            }.getType());


            wk = (HSSFWorkbook) mService.ExportExcel(expexcelModel);
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
     * @param aJsonData
     * @param session
     * @param request
     * @param response
     * @return
     */

    @ApiOperation(value = "导出excel所有数据")
    @RequestMapping(value = "ExportExcelAll", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public BaseRetModel exportExcelAll(@RequestBody String aJsonData, HttpSession session,
                                       HttpServletRequest request, HttpServletResponse response) {
        BaseRetModel retModel = new BaseRetModel();

        String excelFileAttribute = this.getControllerName() + "_expexcel";
        HSSFWorkbook wk = null;
        Gson gson = GsonHelper.getGsonAll();


        ExcelModelT<LinkedTreeMap> expexcelModel = null;


        try {

            LOG.info("aJsonData=" + aJsonData);

            //查询所有数据，然后转成LinkedHashMap.


            //expexcelModel = gson.fromJson(aJsonData, ExpexcelModelT.class);

            expexcelModel = gson.fromJson(aJsonData, new TypeToken<ExcelModelT<LinkedTreeMap>>() {
            }.getType());


            //    FileHelper.SavePoiToFile(goodsService.ExportExcel(),"test.xls");


            wk = (HSSFWorkbook) mService.ExportExcel(expexcelModel);
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
     * 获取需要导出的所有数据。
     *
     * @param session
     * @param request
     * @param response
     * @return
     */

    @ApiOperation(value = "获取导出的所有数据")
    @RequestMapping(value = "GetExportAllData",method = {RequestMethod.POST, RequestMethod.GET})
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


            retModel.setData(this.mService.findAll());


        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;

    }


    /**
     * 下载excel
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @ApiOperation("下载Excel")
    @RequestMapping(value = "DownExcel", method = {RequestMethod.POST, RequestMethod.GET})
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


    //============业务功能================


    /**
     * 返回主从表的单行明细
     *
     * @param session
     * @param request
     * @param id
     * @param redirectAttr
     * @return
     * @deprecated 废弃，用detail替代
     */
    @Deprecated
    @ApiOperation("获取主从表明细")
    @RequestMapping(value = "/Edit/{id}", method = RequestMethod.GET)
    public BaseRetMdModel edit(HttpSession session,
                               HttpServletRequest request,
                               @ApiParam("行记录索引号") @PathVariable int id,
                               RedirectAttributes redirectAttr) {

        VM viewMaster;
        List<VD> vdList;
        Object keyColValue;


        BaseRetMdModel<VM, VD> retModelMD = new BaseRetMdModel<VM, VD>();


        // Retrieve The Master Data.
        viewMaster = (VM) vmService.findById(getClazzVM(), Long.valueOf(String.valueOf(id)));


        if (viewMaster == null) {

            retModelMD.setCode(BaseConstant.ERR_CODE_201);
            retModelMD.setMsg("View Master Is Null!");
            return retModelMD;
        }

        // Retrieve Detail Data.
        // 1.get the master-detail table's key column value.
        keyColValue = ReflectUtil.getFieldValue(viewMaster, this.getKeyColName());


        // 2.get data from detail table using sql.
        vdList = (List<VD>) vdService.findListByName(getClazzVD(), this.getKeyColName(), keyColValue);

        // 3.put master-detail data into json model(retModelMDT).And return data
        // for website view page.
        if (viewMaster != null) {
            retModelMD.setData(viewMaster);
            retModelMD.setDetailList(vdList);
        }

        return retModelMD;
    }


    /**
     * 根据单号获取明细list
     *
     * @param session
     * @param request
     * @param <VD>
     * @return
     */

    @ApiOperation("获取明细表详细记录")
    @RequestMapping(value = "/GetGridDetail", method = RequestMethod.GET)
    @ResponseBody
    public <VD> BaseRetModel<VD> getGridDetail(HttpSession session,
                                               HttpServletRequest request,
                                               @ApiParam("按单号获取行记录明细") @RequestParam String aIdx,
                                               RedirectAttributes redirectAttr) {
        BaseRetModel<VD> retJsonModelT = new BaseRetModel<VD>();
        List<VD> detailVDS=null;
        Object keyColValue;

        String billno = "";


        try {

            VM vm = null;


            // Retrieve Detail Data.
            // 1.get the master-detail table's key column value.

            vm = vmService.findById(getClazzVM(), Long.valueOf(aIdx));

            if (vm == null) {
                retJsonModelT.setCode(BaseConstant.ERR_CODE_201);
                retJsonModelT.setMsg("View Master Is Null！");
                return retJsonModelT;
            }
            //获取单号
            keyColValue = ReflectUtil.getFieldValue(vm, this.getKeyColName());

            // 2.get data from detail table using sql.
            detailVDS = (List<VD>) vdService.findListByName(getClazzVD(), this.getKeyColName(), keyColValue);

            // 3.put master-detail data into json model(retModelMDT).And return data
            if (detailVDS == null) {
                retJsonModelT.setCode(BaseConstant.ERR_CODE_202);
                retJsonModelT.setMsg("View Detail Is Null！");
                return retJsonModelT;
            }

        }catch (Exception ex)
        {
            retJsonModelT.setMsg(ex.getMessage());
            retJsonModelT.setCode(BaseConstant.ERROR);
            return retJsonModelT;

        }


        retJsonModelT.setCode(BaseConstant.SUCESS);
        retJsonModelT.setDataList(detailVDS);

        return retJsonModelT;
    }


    /**
     * 创建需要新增对象
     *
     * @param session
     * @param request
     * @return
     * @throws Exception
     */
    @ApiOperation("新增")
    @ResponseBody
    @RequestMapping("/Create")
    public BaseRetMdModel<VM, VD> create(HttpSession session, HttpServletRequest request)
            throws Exception {


        VM master = null;


        BaseRetMdModel<VM, VD> retModelMDT = new BaseRetMdModel<VM, VD>();

        try {


            if (this.getMasterClassName() != null) {

                // 动态创建T
                master = (VM) Class.forName(this.getMasterClassName()).newInstance();
                master = initCreateAutoSetBillInfo(master, session, request);
                master = initCreate(master, session, request);


                if (master != null) {
                    retModelMDT.setData(master);
                }

            }

            retModelMDT.setCode(BaseConstant.SUCESS);
            return retModelMDT;


        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error(ex.getMessage());
            retModelMDT.setCode(BaseConstant.ERROR);
            retModelMDT.setMsg(ex.getMessage());
            return retModelMDT;
            //throw new Exception(ex.getMessage());
        }
    }

    /**
     * 初始化事件。
     *
     * @param aMaster
     * @param session
     * @param request
     * @return
     * @throws Exception
     */
    public VM initCreate(VM aMaster,
                              HttpSession session,
                              HttpServletRequest request) throws Exception {

        return aMaster;
    }


    /**
     * 自动设置字段事件
     *
     * @param aMaster
     * @param session
     * @param request
     * @return
     * @throws Exception
     */
    public  VM initCreateAutoSetBillInfo(VM aMaster, HttpSession session,
                                             HttpServletRequest request) throws Exception {

        //日期格式。
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        String userId = "";

        Field createTimeField = null;
        Field createUserField = null;
        Field stateField = null;
        Field tenantIdField = null;

        long excludeFound = 0;


        try {

            if (aMaster != null) {


                //创建日期
                if (ReflectUtil.hasField(aMaster.getClass(), Field_CreateTime)) {
                    createTimeField = ReflectUtil.getField(aMaster.getClass(), Field_CreateTime);

                    if (createTimeField.getType().getName().trim().equals("java.sql.Timestamp")) {
                        ReflectUtil.setFieldValue(aMaster, createTimeField, new Timestamp(System.currentTimeMillis()));
                    } else {
                        ReflectUtil.setFieldValue(aMaster, createTimeField, new Date());
                    }
                }

                //创建人
                if (ReflectUtil.hasField(aMaster.getClass(), Field_CreateUser)) {
                    createUserField = ReflectUtil.getField(aMaster.getClass(), Field_CreateUser);
                    ReflectUtil.setFieldValue(aMaster, createUserField, getLoginUserId());

                }


                //tenantid
                if (ReflectUtil.hasField(aMaster.getClass(), Field_TenantId)) {

                    String funcNo = this.getControllerName();

                    excludeFound = Arrays.stream(funcExcludeConfig.getNotAutoTenantsFuncArr()).filter(o->o.trim().equals(funcNo.trim())).count();

                    if(excludeFound <= 0 ) {

                        tenantIdField = ReflectUtil.getField(aMaster.getClass(), Field_TenantId);
                        ReflectUtil.setFieldValue(aMaster, tenantIdField, getLoginTenantId());
                    }
                }


                //默认状态数值。
                if (ReflectUtil.hasField(aMaster.getClass(), Field_State)) {
                    stateField = ReflectUtil.getField(aMaster.getClass(), Field_State);

                    if (stateField.getType().getName().trim().equals("java.lang.Integer")) {
                        ReflectUtil.setFieldValue(aMaster, stateField, 0);
                    } else {
                        ReflectUtil.setFieldValue(aMaster, stateField, Byte.parseByte("0"));
                    }

                }


            }
            return aMaster;
        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        }
    }


    /**
     * 根据传入的JSON数据，并保存到数据库中。
     *
     * @param session
     * @param request
     * @return
     * @throws Exception
     */
    @ApiOperation(value = "新增提交")
    @ResponseBody
    @RequestMapping(value = "/CreatePost", method = RequestMethod.POST)
    public BaseRetMdModel<M, D> createPost(@ApiParam("主表json格式") @RequestParam String aMasterJson,
                                           @ApiParam("子表json格式") @RequestParam String aDetailJson,
                                           HttpSession session,
                                           HttpServletRequest request) throws Exception {


        BaseRetMdModel<M, D> retModel = new BaseRetMdModel();

        M master;
        List<D> detailDS;

        Gson gson = null;


        //转化为提交对象。
        gson = GsonHelper.getGsonAll();


        //转化保存到数据库的数据类型为页面浏览模型
        master = convertMasterViewModelToDbModel(aMasterJson);
        detailDS = convertDetailViewModelToDbModel(aDetailJson);


        String billCode = "";


        try {

            //修改BeforeCreate返回的类型,不再返回类型
            if (beforeCreate(master, detailDS, session, request) == false) {
                retModel.setCode(BaseConstant.ERR_CODE_204);
                retModel.setMsg("前置事件逻辑错误!");
                return retModel;
            }

            //自动设置字段数据。
            if (autoSetBillInfo(master, detailDS, session, request) == false) {
                retModel.setCode(BaseConstant.ERR_CODE_205);
                retModel.setMsg("设置单据自动字段错误!");
                return retModel;
            }


            // 保存到DAO

            billCode = serialnoService.getSerailNo(this.getSerialCode());


            // 设置明细的单号字段数值
            // 1.从表设置
            for (int i = 0; i < detailDS.size(); i++) {
                //设置单号
                ReflectUtil.setFieldValue(detailDS.get(i), this.getKeyColName(), billCode);
                //设置tenantId
                if (ReflectUtil.hasField(detailDS.get(i).getClass(), Field_TenantId)) {
                    ReflectUtil.setFieldValue(detailDS.get(i), Field_TenantId, getLoginTenantId());
                }
            }

            // 2.主表设置

            ReflectUtil.setFieldValue(master, this.getKeyColName(), billCode);

            // 保存表数据到数据库
            // 1.主表
            // 2.从表


            commonMasterDetailService.insert(master, detailDS);

            if (afterCreate(master, detailDS, session, request) == false) {
                retModel.setCode(BaseConstant.ERR_CODE_210);
                retModel.setMsg("后置事件逻辑错误!");
                return retModel;
            }


        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            ex.printStackTrace();
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        retModel.setData(master);
        retModel.setDetailList(detailDS);
        return retModel;
    }

    /**
     * <p>Description: 提供方法可以给子类覆盖对主表对象进行类型转换 </p>
     *
     * @param aModel
     * @return
     * @author:admin
     * @date:
     * @version:1.0
     */

    public M convertMasterViewModelToDbModel(VM aModel) throws Exception {

        M modelM = null;

        try {


            if (aModel == null) {
                return null;
            }

            modelM = getClazzM().newInstance();


            BeanUtil.copyProperties(aModel, modelM);

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }


        return modelM;

    }


    /**
     * 按照JSON转化主类
     *
     * @param aJsonStr
     * @return
     * @throws Exception
     */
    public M convertMasterViewModelToDbModel(String aJsonStr) throws Exception {
        Gson gson = null;
        VM modelVM = null;

        try {

            if (aJsonStr == null || aJsonStr.trim().equals("")) {
                return null;
            }

            gson = GsonHelper.getGsonAll();

            modelVM = gson.fromJson(aJsonStr, getClazzVM());

            return convertMasterViewModelToDbModel(modelVM);


        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }


    }


    /**
     * <p>Description:可以提供方法给子类进行覆盖进行明细LIST类型转换 </p>
     *
     * @param aList
     * @return
     * @author:admin
     * @date:
     * @version:1.0
     */

    public List<D> convertDetailViewModelToDbModel(List<VD> aList) throws Exception {
        List<D> retList = null;
        D itemD = null;

        VD itemVD = null;

        try {

            if (aList == null) {
                return null;
            }

            retList = new ArrayList();

            for (int i = 0; i < aList.size(); i++) {


                itemVD = aList.get(i);

                itemD = getClazzD().newInstance();

                BeanUtil.copyProperties(itemVD, itemD);

                //item = (D) ConvertHelper.convertToSuper(aList.get(i), ConvertHelper.GetSuperClassByT(aList.get(i)));
                retList.add(itemD);
            }

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

        return retList;
    }


    /**
     * 按Json转化List
     *
     * @return
     * @throws Exception
     */
    public List<D> convertDetailViewModelToDbModel(String aJsonStr) throws Exception {

        VD modelVD = null;

        List<VD> vdList = null;

        Gson gson = null;

        try {

            if (aJsonStr == null || aJsonStr.trim().equals("")) {
                return null;
            }

            gson = GsonHelper.getGson();

            vdList = gson.fromJson(aJsonStr, new TypeToken<List<VD>>() {
            }.getType());

            return convertDetailViewModelToDbModel(vdList);

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }


    }

    /**
     * 创建前的前置事件.
     *
     * @param aMaster
     * @param aDetail
     * @param session
     * @param request
     * @return
     * @throws Exception
     * @modify:调整日期的格式。 bruce 2018-01-17.
     */
    public boolean beforeCreate(M aMaster, List<D> aDetail, HttpSession session,
                                HttpServletRequest request) throws Exception {
        return true;

    }

    /**
     * 自动设置单据相应字段。
     *
     * @param aMaster
     * @param aDetail
     * @param session
     * @param request
     * @return
     * @throws Exception
     */
    public boolean autoSetBillInfo(M aMaster, List<D> aDetail, HttpSession session,
                                   HttpServletRequest request) throws Exception {


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
            if (ReflectUtil.hasField(aMaster.getClass(), Field_CreateTime)) {
                createTimeField = ReflectUtil.getField(aMaster.getClass(), Field_CreateTime);

                if (createTimeField.getType().getName().trim().equals("java.sql.Timestamp")) {
                    ReflectUtil.setFieldValue(aMaster, createTimeField, new Timestamp(System.currentTimeMillis()));
                } else {
                    ReflectUtil.setFieldValue(aMaster, createTimeField, new Date());
                }
            }

            //创建人
            if (ReflectUtil.hasField(aMaster.getClass(), Field_CreateUser)) {
                createUserField = ReflectUtil.getField(aMaster.getClass(), Field_CreateUser);
                ReflectUtil.setFieldValue(aMaster, createUserField, getLoginUserId());

            }


            //tenantid
            if (ReflectUtil.hasField(aMaster.getClass(), Field_TenantId)) {
                String funcNo = this.getControllerName();

                excludeFound = Arrays.stream(funcExcludeConfig.getNotAutoTenantsFuncArr()).filter(o->o.trim().equals(funcNo.trim())).count();

                if(excludeFound <= 0 ) {

                    tenantIdField = ReflectUtil.getField(aMaster.getClass(), Field_TenantId);
                    ReflectUtil.setFieldValue(aMaster, tenantIdField, getLoginTenantId());
                }
            }


            //默认状态数值。
            if (ReflectUtil.hasField(aMaster.getClass(), Field_State)) {
                stateField = ReflectUtil.getField(aMaster.getClass(), Field_State);

                if (stateField.getType().getName().trim().equals("java.lang.Integer")) {
                    ReflectUtil.setFieldValue(aMaster, stateField, 0);
                } else {
                    ReflectUtil.setFieldValue(aMaster, stateField, Byte.parseByte("0"));
                }

            }


            //审核级别
            if (ReflectUtil.hasField(aMaster.getClass(), Field_ChkBit)) {
                chkbitField = ReflectUtil.getField(aMaster.getClass(), Field_ChkBit);

                if (stateField.getType().getName().trim().equals("java.lang.Integer")) {
                    ReflectUtil.setFieldValue(aMaster, chkbitField, 0);
                } else {
                    ReflectUtil.setFieldValue(aMaster, chkbitField, Byte.parseByte("0"));
                }

            }


            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error(ex.getMessage());
            throw new Exception(ex.getMessage());
        }
    }


    /**
     * 创建后的事件
     *
     * @param aMaster
     * @param aDetail
     * @param session
     * @param request
     * @return
     * @throws Exception
     */

    public boolean afterCreate(M aMaster, List<D> aDetail, HttpSession session,
                               HttpServletRequest request) throws Exception {
        return true;
    }

    /**
     * 修改获取明细
     *
     * @param session
     * @param request
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/Detail/{id}", method = RequestMethod.GET)
    public BaseRetMdModel<VM, VD> detail(
            HttpSession session,
            HttpServletRequest request,
            @ApiParam("行号索引")  @PathVariable int id
    ) {
        VM viewMaster;
        List<VD> viewDetail;
        Object keyColValue;

        BaseRetMdModel<VM, VD> retModelMD = new BaseRetMdModel<VM, VD>();

//        ModelAndView mav = new ModelAndView();
//
//        mav.setViewName(this.getControllerName().trim() + "/CRUD");

        // Retrieve The Master Data.
        viewMaster = (VM) vmService.findById(getClazzVM(), Long.valueOf(String.valueOf(id)));

        // Retrieve Detail Data.
        // 1.get the master-detail table's key column value.
        //keyColValue = ClassHelper.getColValue(this.getKeyColName(), master);
        keyColValue = ReflectUtil.getFieldValue(viewMaster, this.getKeyColName());


        // 2.get data from detail table using sql.
        //detail = (List<BD>) basemdService.FindDetailT(this.getDetialSql(), this.getKeyColName(), keyColValue);
        viewDetail = vdService.findListByName(getClazzVD(), this.getKeyColName(), keyColValue);


        // 3.put master-detail data into json model(retModelMDT).And return data
        // for website view page.
        if (viewMaster != null) {
            retModelMD.setData(viewMaster);
            retModelMD.setDetailList(viewDetail);
            //mav.addObject("obj", retModelMDT);
        }

        retModelMD.setCode(BaseConstant.SUCESS);
        return retModelMD;
    }





    @RequestMapping(value = "/Print", method = RequestMethod.GET)
    public BaseRetModel<TsPrint> printPreview(HttpSession session,
                                              HttpServletRequest request,
                                              @ApiParam("功能号") @RequestParam String aFuncNo)
    {
        BaseRetModel<TsPrint> baseRetModel = new BaseRetModel<>();

        List<TsPrint> tsPrints = null;

        SsTenant ssTenant = null;

        try
        {

            if(aFuncNo.trim().equals(""))
            {
                baseRetModel.setMsg("权限功能号不允许为空!");
                baseRetModel.setCode(BaseConstant.ERROR);
                return baseRetModel;
            }


            tsPrints = printService.getPrintSetting(aFuncNo);

            //获取默认公司抬头
            ssTenant = ssTenantRepository.findSsTenantByTenantId(getLoginTenantId());

            for (int i = 0; i < tsPrints.size(); i++) {

                if(tsPrints.get(i).getPrintTitle() == null || tsPrints.get(i).getPrintTitle().trim().equals(""))
                {
                    tsPrints.get(i).setPrintTitle(ssTenant.getTenantName().trim());
                }

            }


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


    /**
     * 修改提交
     *
     * @param aMasterJson
     * @param aDetailJson
     * @param session
     * @param request
     * @return
     * @throws Exception
     */

    @ApiOperation("修改提交")
    @ResponseBody
    @RequestMapping(value = "/EditPost", method = RequestMethod.POST)
    public BaseRetMdModel<M, D> editPost(@ApiParam("主表JSON格式") @RequestParam String aMasterJson,
                                         @ApiParam("子表JSON格式") @RequestParam String aDetailJson,
                                         HttpSession session,
                                         HttpServletRequest request) throws Exception {
        String billCode = "";

        M master = null;
        List<D> detailDS = null;

        BaseRetMdModel<M, D> retModel = new BaseRetMdModel<>();


        Gson gson = GsonHelper.getGsonAll();

        List<VD> vdList = null;

        // 保存到DAO
        try {


            //转化页面对象为保存数据库对象
            master = convertMasterViewModelToDbModel(aMasterJson);
            detailDS = convertDetailViewModelToDbModel(aDetailJson);


            // 获取主表单据号


            billCode = (String) ReflectUtil.getFieldValue(master, this.getKeyColName());


            // 设置明细的单号字段数值
            for (int i = 0; i < detailDS.size(); i++) {
                //设置单号
                ReflectUtil.setFieldValue(detailDS.get(i), this.getKeyColName(), billCode);
                //设置tenantId
                if (ReflectUtil.hasField(detailDS.get(i).getClass(), Field_TenantId)) {
                    ReflectUtil.setFieldValue(detailDS.get(i), Field_TenantId, getLoginTenantId());
                }
            }


            //前置部分挪到此处
            //Modify:前置修改事件返回类型更改.
            if (beforeEdit(master, detailDS, session, request) == false) {
                retModel.setCode(BaseConstant.ERR_CODE_211);
                retModel.setMsg("修改前置事件逻辑错误!");
                return retModel;
            }

            //设置相应的单据信息。
            if (autoSetBillInfo(master, detailDS, session, request) == false) {
                retModel.setCode(BaseConstant.ERR_CODE_212);
                retModel.setMsg("设置单据自动字段错误!");
                return retModel;
            }


            //修改明细数据(删除前端删除掉的明细)
            editGridItem(master, detailDS, billCode, session, request);

            // 保存表数据到数据库
            // 1.主表
            // 2.从表

            commonMasterDetailService.update(master, detailDS);


            if (afterEdit(master, detailDS, session, request) == false) {
                retModel.setCode(BaseConstant.ERR_CODE_213);
                retModel.setMsg("修改后置事件逻辑错误!");
                return retModel;
            }


        } catch (Exception ex) {
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            ex.printStackTrace();
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        retModel.setData(master);

        return retModel;
    }

    /**
     * 修改前的前置事件
     *
     * @param aMaster
     * @param aDetail
     * @param session
     * @param request
     * @return
     * @throws Exception
     */
    public boolean beforeEdit(M aMaster, List<D> aDetail, HttpSession session,
                              HttpServletRequest request) throws Exception {
        return true;

    }


    /**
     * 编辑Grid中的明细
     *
     * @param aMaster
     * @param aDetail
     * @param session
     * @param request
     * @return
     * @throws Exception
     */
    public void editGridItem(M aMaster, List<D> aDetail, String aBillno, HttpSession session, HttpServletRequest request) throws Exception {
        boolean foundFlag = false;

        List<D> aOldList = null;

        D oldItem = null;

        D newItem = null;

        D tmpItem = null;

        String hqlStr = "";


        Long oldIdx = null;
        Long newIdx = null;

        String hqlStr2 = "";

        String className = "";


        try {


            if (aDetail != null && aDetail.size() > 0) {


                className = aDetail.get(0).getClass().getSimpleName();


//                hqlStr = " From " + className + " Where  " + keyColName + " = :billno ";
//
//                hqlStr2 = " From " + className + " Where " + " idx = :id ";


                aOldList = dService.findListByName(getClazzD(),this.getKeyColName(), aBillno);

                if (aOldList != null && aOldList.size() > 0) {


                    //根据旧的记录，循环新的记录。
                    for (int i = 0; i < aOldList.size(); i++) {

                        oldItem = aOldList.get(i);
                        foundFlag = false;

                        //oldkeyStr = oldReturnD.getItemno().trim() + oldReturnD.getShipno().trim();

                        //获取旧的IDX。
                        // oldIdx = (Long) ClassHelper.getColValueByColName("idx", oldItem);
                        oldIdx = (Long) ReflectUtil.getFieldValue(oldItem, "idx");

                        //从新的list里面循环。
                        for (int j = 0; j < aDetail.size(); j++) {
                            newItem = aDetail.get(j);
                            //newkeyStr = newReturnD.getItemno().trim() + newReturnD.getShipno().trim();

                            newIdx = (Long) ReflectUtil.getFieldValue(newItem, "idx");


                            if (oldIdx > 0 && oldIdx.longValue() == newIdx.longValue()) {
                                foundFlag = true;
                                break;
                            }

                        }

                        //如果没匹配上,证明是删除了明细
                        //因此加入判断标准,如果idx不是0的，既代表存在原来的老记录,因此不进行删除。
                        if (!foundFlag) {
                            //如果在新的记录中这个商品的
                            //如果老的IDX在新的LIST中存在，则不删除此记录。
                            dService.delete(oldItem);

                        }
                    }
                }
            }

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }


    /**
     * 修改的后置事件
     *
     * @param aMaster
     * @param aDetail
     * @param session
     * @param request
     * @return
     * @throws Exception
     */
    public boolean afterEdit(M aMaster, List<D> aDetail, HttpSession session,
                             HttpServletRequest request) throws Exception {
        return true;
    }


    /**
     * 页面审核
     *
     * @param aIdx
     * @param session
     * @param request
     * @return
     * @throws Exception <p>modify:修改，修正审核中的小BUG。 2018-08-16.</p>
     *                   <p>modify:设置可以回滚整体审核模式。 w.z</p>
     */

    @Transactional(rollbackFor = Exception.class)
    @ApiOperation("审核提交")
    @ResponseBody
    @RequestMapping(value = "CheckPost", method = RequestMethod.POST)
    public BaseRetModel<VM> checkPost(@ApiParam("行记录索引") @RequestParam int aIdx,
                                             @ApiParam("审核原因") @RequestParam String aMemo,
                                             HttpSession session,
                                             HttpServletRequest request) throws Exception {
        M master;

        boolean isStatus = false;
        Field statusField = null;
        int status;


        List<SsUserRole> roleList = null;
        List<SsFuncD> funcdList = null;
        int chklevel = 0;
        int haveChkLevel = 0;
        int curChkLevel = 0;

        List<SsBillChk> chkedBillChks = null;
        List<SsBillChk> currentBillChks = null;


        String statusType = "";

        BaseRetModel<VM> retModel = new BaseRetModel<>();

        // 设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        String userId = "";

        String billNo = "";

        int startChkLevel = 0;

        VM vmMaster = null;


        try {


            //1.根据主表获取主表明细。
            //获取泛型类型。

            //获取主表
            master = (M) mService.findById(getClazzM(), Long.valueOf(String.valueOf(aIdx)));

            if (master == null) {
                retModel.setCode(BaseConstant.ERR_CODE_211);
                retModel.setMsg("无法获取主表信息!");
                return retModel;
            }

            //获取单据的单据号。
            if (ReflectUtil.hasField(master.getClass(), getKeyColName())) {
                billNo = String.valueOf(ReflectUtil.getFieldValue(master, getKeyColName()));

                if (billNo == null || billNo.trim().equals("")) {
                    throw new Exception("无法获取审核单据号!");
                }
            }


            //2.判断单头是否存在status字段,如果没有不允许审核。

            if (ReflectUtil.hasField(master.getClass(), Field_State)) {
                isStatus = true;
            }


            if (isStatus == false) {
                retModel.setCode(BaseConstant.ERR_CODE_300);
                retModel.setMsg("单据不存在审核字段,不允许使用审核功能!");
                return retModel;
            }

            //获取现有status字段的数值。
            status = Integer.parseInt(String.valueOf(ReflectUtil.getFieldValue(master, Field_State)));
            if (status == 1) {
                retModel.setCode(BaseConstant.ERR_CODE_301);
                retModel.setMsg("单据已审核,不允许重复审核！");
                return retModel;
            }

            if (status == 2) {
                retModel.setCode(BaseConstant.ERR_CODE_302);
                retModel.setMsg("单据已经作废,不允许重复审核!");
                return retModel;
            }

            //获取当前chkBit数值。
            if (ReflectUtil.hasField(master.getClass(), Field_ChkBit)) {
                if (ReflectUtil.getFieldValue(master, Field_ChkBit) == null) {
                    curChkLevel = 0;
                } else {
                    curChkLevel = Integer.parseInt(
                            String.valueOf(ReflectUtil.getFieldValue(master, Field_ChkBit)));
                }
            }


            //3.调用前置事件
            if (!beforeCheck(master, session, request)) {
                retModel.setCode(BaseConstant.ERR_CODE_302);
                retModel.setMsg("审核前置校验未能通过!");
                return retModel;
            }

            //4.获取登录用户信息
            userId = getLoginUserId();
            if (userId == null) {
                retModel.setCode(BaseConstant.ERR_CODE_303);
                retModel.setMsg("无法获取登录用户!");
                return retModel;
            }

            //获取角色对象
            roleList = chkService.getUserRoleList(userId.trim());

            //5.进行多级审核判断。作废单据必须由最后一级人员进行处理。
            funcdList = chkService.getFuncdList(getControllerName());

            //具备审核权限。
            if (funcdList != null && funcdList.size() > 0 ) {


                //用户具备的审核级
                chklevel = funcdList.size();


                //判断
                //ps:直接从已经审核后的级别审核起。
                startChkLevel = curChkLevel;
                currentBillChks = new ArrayList<>();

                for (int i = startChkLevel; i < chklevel; i++) {




                    if (!chkService.getRoleRight(userId, getControllerName(), i + 1)) {
                        retModel.setCode(BaseConstant.ERR_CODE_310);
                        retModel.setMsg(userId + "没有第[" + String.valueOf(i + 1) + "]级的审核权限!");
                        return retModel;
                    }

                    //如果当前级没审核，则进行审核。
                    //如果是最后一级，则生效单据。
                    if ((curChkLevel + 1) == chklevel) {
                        //增加审核记录
                        chkService.registerBillChks(currentBillChks,
                                billNo,
                                getSerialCode(), getLoginTenantId(), 1, chklevel, aMemo, "", userId);

                        //设置state数值
                        if (ReflectUtil.getField(master.getClass(), Field_State)
                                .getType()
                                .getName().trim().equals("java.lang.Integer")) {
                            ReflectUtil.setFieldValue(master, Field_State, Integer.parseInt("1"));
                        } else {
                            ReflectUtil.setFieldValue(master, Field_State, Byte.parseByte("1"));
                        }

                        //设置生效日期
                        if (ReflectUtil.getField(master.getClass(), Field_ExecDate)
                                .getType().getName().trim().equals("java.sql.Timestamp")) {
                            ReflectUtil.setFieldValue(master, Field_ExecDate, new Timestamp(System.currentTimeMillis()));
                        } else {
                            ReflectUtil.setFieldValue(master, Field_ExecDate, new Date());
                        }

                        //设置单据的当前审核级
                        ReflectUtil.setFieldValue(master, Field_ChkBit, chklevel);

                    } else if (curChkLevel == i) {
                        //增加审核记录
                        chkService.registerBillChks(currentBillChks,
                                billNo,
                                getSerialCode(), getLoginTenantId(), 1, i + 1, aMemo, "", userId);
                        //设置单据的当前审核级
                        ReflectUtil.setFieldValue(master, Field_ChkBit, i + 1);

                        curChkLevel = curChkLevel + 1;


                    } else {
                        continue;
                    }

                }

                //6.调用后置事件
                if (!afterCheck(master, session, request)) {
                    retModel.setCode(BaseConstant.ERR_CODE_300);
                    retModel.setMsg("审核单据过程校验未能通过");
                    return retModel;
                }


                //7.保存到DB
                if(currentBillChks != null && currentBillChks.size() > 0) {
                    commonMasterDetailService.updateAndAddChkRecords(master, currentBillChks);
                }

                checkAfterSave(master, session, request);


            }

            else {
                retModel.setCode(BaseConstant.ERR_CODE_300);
                retModel.setMsg("系统无设置相应审核权限,不允许审核单据!");
                return retModel;
            }


            //获取审核后的审核记录。
            chkedBillChks = chkService.getBillChkRec(billNo, getSerialCode(), getLoginTenantId());


            //8.返回前端

            vmMaster = vmService.findById(getClazzVM(),Long.valueOf(aIdx));

            retModel.setCode(BaseConstant.SUCESS);
            retModel.setMsg(BaseConstant.SUCCESS_MSG);
           // retModel.setDataList(chkedBillChks);
            retModel.setData(vmMaster);

            return retModel;

        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error(ex.getMessage());
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }
    }

    /**
     * <p>Description: the method can be called before check process start. If you return false,the check process
     * will termination </p>
     *
     * @param aMaster master-detial struct table.
     * @param session
     * @param request
     * @return
     * @author:admin
     * @date:
     * @version:1.0
     */
    public boolean beforeCheck(M aMaster, HttpSession session, HttpServletRequest request) throws Exception {

        return true;
    }

    /**
     * <p>Description: The method will be called before commit data to database.If you return false,will not commit to database. </p>
     *
     * @param aMaster
     * @param session
     * @param request
     * @return
     * @author:admin
     * @date:
     * @version:1.0
     */
    public boolean afterCheck(M aMaster, HttpSession session, HttpServletRequest request) throws Exception {
        return true;
    }


    /**
     * 此事件不会阻止DB保存。
     *
     * @param aMaster
     * @param session
     * @param request
     * @return
     * @throws Exception
     */
    public void checkAfterSave(M aMaster, HttpSession session, HttpServletRequest request) throws Exception {

    }


    /**
     * 页面否决事件
     *
     * @param aIdx
     * @param session
     * @param request
     * @return
     * @throws Exception
     */
    @ApiOperation("否决审核")
    @ResponseBody
    @RequestMapping(value = "UnCheckPost", method = RequestMethod.POST)
    public BaseRetModel<VM> unCheckPost(@ApiParam("行记录索引") @RequestParam int aIdx,
                                               @ApiParam("否决备注") @RequestParam String aMemo,
                                               HttpSession session,
                                               HttpServletRequest request) throws Exception {
        M master;

        boolean isStatus = false;
        Field statusField = null;
        int status;


        List<SsUserRole> roleList = null;
        List<SsFuncD> funcdList = null;
        int chklevel = 0;
        int haveChkLevel = 0;
        int curChkLevel = 0;

        List<SsBillChk> chkedBillChks = null;
        List<SsBillChk> currBillChks = null;


        String statusType = "";

        BaseRetModel<VM> retModel = new BaseRetModel<>();

        // 设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        String userId = "";

        String billNo = "";

        int startChkLevel = 0;

        VM vmMaster = null;

        try {


            //1.根据主表获取主表明细。
            //获取泛型类型。

            //获取主表
            master = (M) mService.findById(getClazzM(), Long.valueOf(String.valueOf(aIdx)));

            if (master == null) {
                retModel.setCode(BaseConstant.ERR_CODE_211);
                retModel.setMsg("无法获取主表信息!");
                return retModel;
            }

            //获取单据的单据号。
            if (ReflectUtil.hasField(master.getClass(), getKeyColName())) {
                billNo = String.valueOf(ReflectUtil.getFieldValue(master, getKeyColName()));

                if (billNo == null || billNo.trim().equals("")) {
                    throw new Exception("无法获取审核单据号!");
                }
            }


            //2.判断单头是否存在status字段,如果没有不允许审核。

            if (ReflectUtil.hasField(master.getClass(), Field_State)) {
                isStatus = true;
            }


            if (isStatus == false) {
                retModel.setCode(BaseConstant.ERR_CODE_300);
                retModel.setMsg("单据不存在审核字段,不允许使用审核功能!");
                return retModel;
            }

            //获取现有status字段的数值。
            status = Integer.parseInt(String.valueOf(ReflectUtil.getFieldValue(master, Field_State)));
            if (status == 1) {
                retModel.setCode(BaseConstant.ERR_CODE_301);
                retModel.setMsg("单据已审核,不允许作废！");
                return retModel;
            }

            if (status == 2) {
                retModel.setCode(BaseConstant.ERR_CODE_302);
                retModel.setMsg("单据已经作废,不允许重复审核!");
                return retModel;
            }

            //获取当前chkBit数值。
            if (ReflectUtil.hasField(master.getClass(), Field_ChkBit)) {
                if (ReflectUtil.getFieldValue(master, Field_ChkBit) == null) {
                    curChkLevel = 0;
                } else {
                    curChkLevel = Integer.parseInt(
                            String.valueOf(ReflectUtil.getFieldValue(master, Field_ChkBit)));
                }
            }


            //3.调用前置事件
            if (!beforeUnCheck(master, session, request)) {
                retModel.setCode(BaseConstant.ERR_CODE_302);
                retModel.setMsg("审核前置校验未能通过!");
                return retModel;
            }

            //4.获取登录用户信息
            userId = getLoginUserId();
            if (userId == null) {
                retModel.setCode(BaseConstant.ERR_CODE_303);
                retModel.setMsg("无法获取登录用户!");
                return retModel;
            }

            //获取角色对象
            roleList = chkService.getUserRoleList(userId.trim());

            //5.进行多级审核判断。作废单据必须由最后一级人员进行处理。
            funcdList = chkService.getFuncdList(getControllerName());

            //具备审核权限。
            if (funcdList != null) {


                //用户具备的审核级
                chklevel = funcdList.size();


                //判断
                startChkLevel = curChkLevel;
                currBillChks = new ArrayList<>();

                for (int i = startChkLevel; i < chklevel; i++) {


                    if (!chkService.getRoleRight(userId, getControllerName(), i + 1)) {
                        retModel.setCode(BaseConstant.ERR_CODE_310);
                        retModel.setMsg(userId + "没有" + String.valueOf(i + 1) + "的审核权限!");
                        return retModel;
                    }

                    //如果当前级没审核，则进行审核。
                    //如果是最后一级，则生效单据。
                    if (curChkLevel + 1 == chklevel) {
                        //增加审核记录
                        chkService.registerBillChks(currBillChks,
                                billNo,
                                getSerialCode(), getLoginTenantId(), 2, chklevel, "", aMemo, userId);

                        //设置state数值
                        if (ReflectUtil.getField(master.getClass(), Field_State)
                                .getType()
                                .getName().trim().equals("java.lang.Integer")) {
                            ReflectUtil.setFieldValue(master, Field_State, Integer.parseInt("2"));
                        } else {
                            ReflectUtil.setFieldValue(master, Field_State, Byte.parseByte("2"));
                        }

                        //设置生效日期
                        if (ReflectUtil.getField(master.getClass(), Field_ExecDate)
                                .getType().getName().trim().equals("java.sql.Timestamp")) {
                            ReflectUtil.setFieldValue(master, Field_ExecDate, new Timestamp(System.currentTimeMillis()));
                        } else {
                            ReflectUtil.setFieldValue(master, Field_ExecDate, new Date());
                        }

                        //设置单据的当前审核级
                        ReflectUtil.setFieldValue(master, Field_ChkBit, chklevel);

                    } else if (curChkLevel == i) {
                        //增加审核记录
                        chkService.registerBillChks(
                                currBillChks,
                                billNo,
                                getSerialCode(), getLoginTenantId(), 2, i + 1, "", aMemo, userId);
                        //设置单据的当前审核级
                        ReflectUtil.setFieldValue(master, Field_ChkBit, i + 1);

                        curChkLevel = curChkLevel + 1;


                    } else {
                        continue;
                    }

                }

                //6.调用后置事件
                if (!afterUnCheck(master, session, request)) {
                    retModel.setCode(BaseConstant.ERR_CODE_300);
                    retModel.setMsg("审核单据过程校验未能通过");
                    return retModel;
                }


                //7.保存到DB
                //mService.update(master);

                if(currBillChks != null &&
                        currBillChks.size() > 0 ) {
                    commonMasterDetailService.updateAndAddChkRecords(master, currBillChks);
                }

                checkAfterSave(master, session, request);


            } else {
                retModel.setCode(BaseConstant.ERR_CODE_300);
                retModel.setMsg("系统无设置相应审核权限,不允许审核单据!");
                return retModel;
            }


            //获取审核后的审核记录。
            chkedBillChks = chkService.getBillNotChkRec(billNo, getSerialCode(), getLoginTenantId());

            //获取最新状态
            vmMaster = vmService.findById(getClazzVM(),Long.valueOf(aIdx));



            //8.返回前端
            retModel.setCode(BaseConstant.SUCESS);
            retModel.setMsg(BaseConstant.SUCCESS_MSG);
            //retModel.setDataList(chkedBillChks);

            retModel.setData(vmMaster);

            return retModel;

        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error(ex.getMessage());
            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }

    }


    /**
     * 否决的前置事件
     *
     * @param aMaster
     * @param session
     * @param request
     * @return
     * @throws Exception
     */
    public boolean beforeUnCheck(M aMaster, HttpSession session, HttpServletRequest request) throws Exception {

        return true;
    }

    /**
     * 否决的后置事件     *
     *
     * @param aMaster
     * @param session
     * @param request
     * @return
     * @author:admin
     * @date:
     * @version:1.0
     */
    public boolean afterUnCheck(M aMaster, HttpSession session, HttpServletRequest request) throws Exception {
        return true;
    }


//    @ResponseBody
//    @RequestMapping("ShowCheck")
//    public RetJsonModel ShowCheck(@RequestParam String funcno, HttpSession session, HttpServletRequest request) {
//        List<SFunctionD> retList = null;
//        retList = checkService.getFuncdList(funcno.trim());
//        RetJsonModel retModel = new RetJsonModel();
//
//        retModel.setSuccess(true);
//        retModel.setData(retList);
//
//        return retModel;
//    }


    //============辅助方法===============

    public Class<M> getClazzM() {

        Class<M> clazzM = null;
        try {


            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
            clazzM = (Class<M>) pt.getActualTypeArguments()[0];

            LOG.debug("classM Name:[" + clazzM.getSimpleName() + "]");
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return clazzM;

    }


    /**
     * 获取v泛型的实际类
     *
     * @return
     */
    public Class<D> getClazzD() {

        Class<D> clazzV = null;
        try {


            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
            clazzV = (Class<D>) pt.getActualTypeArguments()[1];

            LOG.debug("classD Name:[" + clazzV.getSimpleName() + "]");
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return clazzV;

    }


    public Class<VM> getClazzVM() {

        Class<VM> clazzVM = null;
        try {


            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
            clazzVM = (Class<VM>) pt.getActualTypeArguments()[2];

            LOG.debug("classVM Name:[" + clazzVM.getSimpleName() + "]");
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return clazzVM;

    }


    public Class<VD> getClazzVD() {

        Class<VD> clazzVD = null;
        try {


            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
            clazzVD = (Class<VD>) pt.getActualTypeArguments()[3];

            LOG.debug("classVD Name:[" + clazzVD.getSimpleName() + "]");
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return clazzVD;

    }


//    public  M convertModelM(String aJsonStr) throws Exception
//    {
//        V modelV = null;
//        Gson gson = null;
//
//        T modelT = null;
//
//
//
//        try{
//
//            gson = GsonHelper.getGson();
//
//
//            //先转换成v泛型
//            modelV = gson.fromJson(aJsonStr,getClazzV());
//
//            //最后转变成t泛型
//            modelT = getClazzT().newInstance();
//            BeanUtil.copyProperties(modelV,modelT);
//
//
//
//
//        }catch (Exception ex)
//        {
//            throw  new Exception(ex.getMessage());
//        }
//
//        return modelT;
//    }


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

}
