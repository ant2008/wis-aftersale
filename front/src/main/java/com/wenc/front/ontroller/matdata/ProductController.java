package com.wenc.front.controller.matdata;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.google.gson.Gson;
import com.wenc.commdomain.dto.mat.TbProductDescribeRequstDto;
import com.wenc.commdomain.pojo.matdata.TbProductDescription;
import com.wenc.commonservice.config.CommonUploadImageConfig;
import com.wenc.commonservice.constant.BaseServiceConstant;
import com.wenc.commonservice.matdata.service.ProductService;
import com.wenc.commonservice.sys.service.UploadFileService;
import com.wenc.core.exception.ServiceException;
import com.wenc.core.model.SearchConModel;
import com.wenc.core.util.ChineseHelper;
import com.wenc.core.util.GsonHelper;
import com.wenc.core.util.SearchConBuilder;
import com.wenc.sys.dao.SsuserDao;
import com.wenc.sys.dao.SsuserRepository;
import com.wenc.commdomain.pojo.core.SsUser;
import com.wenc.commdomain.pojo.matdata.TbProduct;
import com.wenc.commdomain.vo.matdata.VbProduct;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.BaseRetModel;
import com.wenc.core.service.GenericBaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品信息CRUD
 */

@Api("商品信息管理")
@RequestMapping("MGoods")
@RestController
public class ProductController extends AbstractBaseSingleController<TbProduct, VbProduct> {


    @Autowired
    private GenericBaseService<TbProduct> tbProductGenericBaseService;


    @Autowired
    private SsuserRepository ssuserRepository;


    @Autowired
    private SsuserDao ssuserDao;

    @Autowired
    private ProductService productService;

    @Autowired
    private UploadFileService uploadFileService;

    @Autowired
    private CommonUploadImageConfig commonUploadImageConfig;


    public ProductController() {

        super();
    }


    @Override
    public void beforeCreate(HttpSession session, HttpServletRequest request, TbProduct aModel) throws Exception {

        //设置助记符
        if(aModel.getItemSubno() == null || aModel.getItemSubno().trim().equals(""))
        {
            if(aModel.getItemName() != null) {
                if (aModel.getItemName().trim().length() > 10) {
                    aModel.setItemSubno(ChineseHelper.getAllFirstLetter(aModel.getItemName()).substring(1, 10));
                } else {
                    aModel.setItemSubno(ChineseHelper.getAllFirstLetter(aModel.getItemName()));
                }
            }
        }
    }

    @Override
    public void beforeEdit(HttpSession session, HttpServletRequest request, TbProduct aModel) throws Exception {
        aModel.setDepartCode("01");
        //设置助记符
        if(aModel.getItemSubno() == null || aModel.getItemSubno().trim().equals(""))
        {
            if(aModel.getItemName() != null) {
                if (aModel.getItemName().trim().length() > 10) {
                    aModel.setItemSubno(ChineseHelper.getAllFirstLetter(aModel.getItemName()).substring(1, 10));
                } else {
                    aModel.setItemSubno(ChineseHelper.getAllFirstLetter(aModel.getItemName()));
                }
            }
        }
    }

    @Override
    public void InitCreate(VbProduct aModel) throws Exception {

        aModel.setState(Byte.valueOf("0"));
        aModel.setPurStatus("1");
        aModel.setSaleStatus("1");
        aModel.setPrdAttrib("0");
        aModel.setManageType("2");
        aModel.setItemUnit("73");
        aModel.setMinUnit("73");
        aModel.setChkUnit("73");
        aModel.setChkTosale(1);
        aModel.setSaleTomin(1);



    }

    /**
     * 新增商品后，自动增加到价格组价格中。
     * ps:商品修改只更改默认价格组
     * @param session
     * @param request
     * @param aModel
     * @throws Exception
     */
    @Override
    public void afterCreate(HttpSession session, HttpServletRequest request, TbProduct aModel) throws Exception {

        try
        {
           productService.saveProductPriceToDefaPriceGroup(getLoginTenantId(),aModel);

        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }

    }


    /**
     * 修改商品后，自动修改更新到价格组中。
     *
     * @param session
     * @param request
     * @param aModel
     * @throws Exception
     */
    @Override
    public void afterEdit(HttpSession session, HttpServletRequest request, TbProduct aModel) throws Exception {
        try
        {
            productService.saveProductPriceToDefaPriceGroup(getLoginTenantId(),aModel);

        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    }

    @ApiIgnore
    @RequestMapping(value = "/TestQuery", method = RequestMethod.GET)
    public BaseRetModel<TbProduct> testQuery(HttpSession session, HttpServletRequest request) {

        BaseRetModel<TbProduct> retModel = new BaseRetModel<>();

        List<TbProduct> retList = null;

        int pageCount = 0;

        try {

            pageCount = tbProductGenericBaseService.pageCount(" select count(*) from TbProduct where itemSubno like ?1 ", "amxl%");


            retModel.setMsg(String.valueOf(pageCount));


        } catch (Exception ex) {
            ex.printStackTrace();

            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    @ApiIgnore
    @RequestMapping(value = "/TestQueryUser", method = RequestMethod.GET)
    public BaseRetModel<SsUser> testQueryUser(HttpSession session, HttpServletRequest request) {

        BaseRetModel<SsUser> retModel = new BaseRetModel<>();


        int pageCount = 0;

        SsUser ssUser = null;


        try {


            ssUser = ssuserRepository.findSsUserByUserIdAndTenantId("168", "T001");

            retModel.setData(ssUser);


        } catch (Exception ex) {
            ex.printStackTrace();

            retModel.setCode(BaseConstant.ERROR);
            retModel.setMsg(ex.getMessage());
            return retModel;
        }


        retModel.setCode(BaseConstant.SUCESS);
        return retModel;
    }


    @Override
    public void buildQuickCons(List<SearchConModel> searchConModels, String aWhere) {
        String tmpWhere = "";

        SearchConModel searchConModel = null;

        try{

            if(aWhere == null || aWhere.trim().equals(""))
            {
                tmpWhere = "%%";
            }else {
                tmpWhere = aWhere+"%";
            }

            //按商品名、助记符、或者编码、条码查询
            searchConModel = SearchConBuilder.newInstance()
                    .colName("itemId").operaSign("=").colValue(aWhere).relationShip("or").buildSearchCon();

            searchConModels.add(searchConModel);

            searchConModel=SearchConBuilder.newInstance()
                    .colName("itemName").operaSign("like").colValue(tmpWhere).relationShip("or").buildSearchCon();

            searchConModels.add(searchConModel);

            searchConModel = SearchConBuilder.newInstance()
                    .colName("itemSubno").operaSign("like").colValue(tmpWhere).relationShip("or").buildSearchCon();
            searchConModels.add(searchConModel);


        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }


    /**
     * 提供给进行排班商品的输入查询使用。
     *
     * @param session
     * @param request
     * @param response
     * @param aPage
     * @param aSize
     * @param aWhere
     * @return
     */
    @ApiOperation("排班商品快速查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "aPage",value = "当前页",required = true,paramType = "body",dataType = "int"),
            @ApiImplicitParam(name = "aSize",value = "翻页数",required = true,paramType = "body",dataType = "int"),
            @ApiImplicitParam(name = "aWhere",value = "查询内容",required = true,paramType = "body",dataType = "String")
    })
    @RequestMapping(value = "ScheduleProductQuickQuery",method = {RequestMethod.POST,RequestMethod.GET})
    public BaseRetModel<VbProduct> ScheduleProductQuickQuery(HttpSession session,
                                      HttpServletRequest request,
                                      HttpServletResponse response,
                                      @RequestParam int aPage,
                                      @RequestParam int aSize,
                                      @RequestParam String aWhere)
    {
        BaseRetModel<VbProduct> retModel = new BaseRetModel<>();


        List<VbProduct> vbProducts = null;

        List<SearchConModel> searchConModels = null;

        SearchConModel searchConModel= null;

        String tmpWhere = "";


        String queryJson = "";

        Gson gson = GsonHelper.getGsonAll();

        try
        {

            //组建翻页查询模式。
            //"json格式: [{'colname':'itemno','opat':'=','colValue':'sss','rela':'and','colType':''}]")

            searchConModels = new ArrayList<>();

            if(aWhere == null || aWhere.trim().equals(""))
            {
                tmpWhere = "%%";

                searchConModel = SearchConBuilder.newInstance()
                        .colName("prdAttrib").operaSign("=").colValue("6").buildSearchCon();

                searchConModels.add(searchConModel);

                searchConModel = SearchConBuilder.newInstance()
                        .colName("itemName").operaSign("like").colValue(tmpWhere).buildSearchCon();

                searchConModels.add(searchConModel);


            }else
            {
                tmpWhere = "%"+aWhere+"%";


                SearchConBuilder.clearSearchConList();


                SearchConBuilder.newInstance()
                        .colName("itemId").operaSign("=").colValue(aWhere).relationShip("or").leftBracket("(")
                        .addToList();

                SearchConBuilder.newInstance()
                        .colName("itemName").operaSign("like").colValue(tmpWhere).relationShip("or")
                        .addToList();

                SearchConBuilder.newInstance()
                        .colName("itemSubno").operaSign("like").colValue(tmpWhere).rightBracket(")").relationShip("and")
                        .addToList();


                SearchConBuilder.newInstance()
                        .colName("prdAttrib").operaSign("=").colValue("6").addToList();



                searchConModels = SearchConBuilder.buildSearchConList();

            }


            queryJson = gson.toJson(searchConModels);


            retModel = pageQuery(session,request,response,aPage,aSize,queryJson);


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
     * 提交商品信息。
     *
     * @param session
     * @param request
     * @param response
     * @param aType
     * @param aPicName
     * @param aPicFile
     * @return
     */
    @RequestMapping(value = "/CommitImg/{aType}/{aPicName}/", method = RequestMethod.POST)
    public BaseRetModel<String> commitPic(HttpSession session,
                                          HttpServletRequest request,
                                          HttpServletResponse response,
                                          @PathVariable(name = "aType",required = true) String aType,
                                          @PathVariable(name = "aPicName",required = true) String aPicName,
                                          @RequestParam MultipartFile aPicFile)
    {


        BaseRetModel<String> retModel = new BaseRetModel<>();

        String saveFilePath = "";

        String retFilePath = "";

        String imageUrl = "";


        try
        {


            if(aPicFile == null)
            {
                retModel.setCode(BaseConstant.ERR_CODE_201);
                retModel.setMsg("无法获取图片信息!");
                return retModel;
            }

            if(StrUtil.isBlank(aType))
            {
                return retModel.err(BaseConstant.ERR_CODE_203,"图片类型不允许为空!");
            }



            if(aPicName == null || aPicName.trim().equals(""))
            {
                return  retModel.err(BaseConstant.ERR_CODE_204,"指定需要保存的图片信息");
            }

            //针对不同类型进行不同处理
            if(aType.trim().equals(BaseServiceConstant.Upload_Img_Type_Defa))
            {
                imageUrl = commonUploadImageConfig.getDefaImgPathUrl();
                saveFilePath = commonUploadImageConfig.getDefaImgUploadPath();

            }else
            {
                throw new ServiceException(BaseConstant.ERR_CODE_201,"暂时尚未支持此类图片上传!");
            }




            if(imageUrl == null || imageUrl.trim().equals(""))
            {
                return retModel.err(BaseConstant.ERR_CODE_207,"获取图片地址错误!");
            }





            // filePath = session.getServletContext().getRealPath(path);

            //filePath = uploadFileConfig.getProductUploadDir();

            //组成新的路径


            retFilePath =  uploadFileService
                    .saveItemPic(saveFilePath,aPicName,getLoginTenantId(),aPicFile);

            //返回前端带URL连接的地址。
            retModel.setData(imageUrl+retFilePath);



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
     * 修改商品图片地址。
     *
     * @param session
     * @param request
     * @param response
     * @param aIdx
     * @param aImgUrl
     * @return
     */
    @RequestMapping(value = "ModifyMasterImage",method = RequestMethod.POST)
    public BaseRetModel<VbProduct> modifyMasterImage(HttpSession session,
                                          HttpServletRequest request,
                                          HttpServletResponse response,
                                          @RequestParam String aIdx,
                                          @RequestParam String aImgUrl)
    {
        BaseRetModel<VbProduct> retModel = new BaseRetModel<>();
        VbProduct vbProduct = null;

        if(StrUtil.isBlank(aIdx))
        {
            return retModel.err(BaseConstant.ERR_CODE_201,"商品索引不允许为空!");
        }

        if(StrUtil.isBlank(aImgUrl))
        {
            return retModel.err(BaseConstant.ERR_CODE_202,"图片地址不允许为空!");
        }

       vbProduct = productService.modProductMasterImage(Long.valueOf(aIdx),aImgUrl);

        return retModel.ok(vbProduct);
    }


    /**
     * 获取商品描述
     * @param session
     * @param request
     * @param response
     * @param aProductIdx
     * @return
     */
    @RequestMapping("GetProductDescribeDetail")
    public BaseRetModel<TbProductDescription> getProductDescribeDetail(HttpSession session,
                                                                HttpServletRequest request,
                                                                HttpServletResponse response,
                                                                @RequestParam String aProductIdx)
    {
        BaseRetModel<TbProductDescription> retModel = new BaseRetModel<>();
        TbProductDescription tbProductDescription = null;
        TbProduct tbProduct = null;

        if(StrUtil.isBlank(aProductIdx))
        {
            return retModel.err(BaseConstant.ERR_CODE_201,"商品索引不允许为空!");
        }


        tbProduct =  productService.getProductById(Long.valueOf(aProductIdx));

        if(tbProduct == null)
        {
            return retModel.ok(tbProductDescription);
        }

       tbProductDescription= productService.getProductDescription(getLoginTenantId(),tbProduct.getItemId());

        return retModel.ok(tbProductDescription);
    }


    /**
     * 修改商品描述
     * @param session
     * @param request
     * @param response
     * @param aProductIdx
     * @return
     */
    @RequestMapping("ModProductDescribe")
    public BaseRetModel<TbProductDescription> modProductDescribe(HttpSession session,
                                                                       HttpServletRequest request,
                                                                       HttpServletResponse response,
                                                                       @RequestParam String aRequestJson)
    {
        BaseRetModel<TbProductDescription> retModel = new BaseRetModel<>();
        TbProductDescription tbProductDescription =null;
        TbProductDescribeRequstDto tbProductDescribeRequstDto = null;

        Gson gson = GsonHelper.getGsonAll();

        if(StrUtil.isBlank(aRequestJson))
        {
            return retModel.err(BaseConstant.ERR_CODE_201,"提交数据不允许为空!");
        }

        tbProductDescribeRequstDto = gson.fromJson(aRequestJson,TbProductDescribeRequstDto.class);

        if(ObjectUtil.isNull(tbProductDescribeRequstDto))
        {
            return retModel.err(BaseConstant.ERR_CODE_203,"转换对象错误!");
        }


       tbProductDescription =  productService.saveProductDescribe(getLoginTenantId(),tbProductDescribeRequstDto);


        return retModel.ok(tbProductDescription);
    }



}
