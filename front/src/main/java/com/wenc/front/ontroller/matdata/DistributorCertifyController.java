package com.wenc.front.controller.matdata;

import cn.hutool.core.bean.BeanUtil;
import com.wenc.commdomain.pojo.matdata.TbAccountCertify;
import com.wenc.commdomain.vo.matdata.AccountCertifyVO;
import com.wenc.commonservice.matdata.service.AccountCertifyService;
import com.wenc.commonservice.sys.config.UploadFileConfig;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.BaseRetModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 分销商controller
 * todo:待测试
 */
@Api("分销商服务")
@RequestMapping("MDistribCertify")
@RestController
public class DistributorCertifyController extends AbstractBaseSingleController<TbAccountCertify,TbAccountCertify> {
    private Logger LOG = LoggerFactory.getLogger(DistributorCertifyController.class);

    @Autowired
    private AccountCertifyService accountCertifyService;

    private static String CERITIFY_TYPE="1";

    @Autowired
    private UploadFileConfig uploadFileConfig;


    public DistributorCertifyController() {
        super();
    }


    /**
     * 供应商认证材料提交
     *
     * @param session
     * @param request
     * @param response
     * @param aCompanyName
     * @param aCompanyAddress
     * @param aCompanyLicenceNo
     * @param aLegalName
     * @param aLegalIdCard
     * @param aLegalMobileNo
     * @param aCompanyLicencePic
     * @param aLegralIdCardPicFront
     * @param aLegralIdCardPicBack
     * @return
     *
     * todo:待测试
     */
    @ApiOperation(value = "ApplyCertify",notes = "分销商资质提交")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "aCompanyName", value = "公司名称", required = true),
            @ApiImplicitParam(name = "aCompanyAddress", value = "公司地址", required = true),
            @ApiImplicitParam(name = "aCompanyLicenceNo", value = "经营许可证号", required = true),
            @ApiImplicitParam(name = "aLegalName", value = "法人姓名", required = true),
            @ApiImplicitParam(name = "aLegalIdCard", value = "法人身份证", required = true),
            @ApiImplicitParam(name = "aLegalMobileNo", value = "法人手机号", required = true),
            @ApiImplicitParam(name = "aCompanyLicencePic", value = "许可证图片", required = false),
            @ApiImplicitParam(name = "aLegralIdCardPicFront", value = "身份证图片前", required = false),
            @ApiImplicitParam(name = "aLegralIdCardPicBack", value = "身份证图片后", required = false)

    })
    @RequestMapping(value = "ApplyCertify", method = RequestMethod.POST)
    public BaseRetModel<AccountCertifyVO> applyCertify(HttpSession session,
                                                       HttpServletRequest request,
                                                       HttpServletResponse response,
                                                       @RequestParam String aCompanyName,
                                                       @RequestParam String aCompanyAddress,
                                                       @RequestParam String aCompanyLicenceNo,
                                                       @RequestParam String aLegalName,
                                                       @RequestParam String aLegalIdCard,
                                                       @RequestParam String aLegalMobileNo,
                                                       @RequestParam String aCompanyLicencePic,
                                                       @RequestParam String aLegralIdCardPicFront,
                                                       @RequestParam String aLegralIdCardPicBack)
    {
        BaseRetModel<AccountCertifyVO> retModel = new BaseRetModel<>();

        AccountCertifyVO accountCertifyVO = null;

        try
        {

            if(aCompanyName == null || aCompanyName.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_201);
                retModel.setMsg("公司名称不允许为空!");
                return retModel;
            }

            if(aCompanyAddress == null || aCompanyAddress.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_202);
                retModel.setMsg("公司地址不允许为空!");
                return retModel;
            }

            if(aCompanyLicenceNo == null || aCompanyLicenceNo.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_203);
                retModel.setMsg("公司经营许可证不允许为空!");
                return retModel;
            }

            if(aLegalName == null || aLegalName.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_204);
                retModel.setMsg("公司法人不允许为空!");
                return retModel;
            }

            if(aLegalIdCard == null || aLegalIdCard.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_205);
                retModel.setMsg("法人身份证不允许为空!");
                return retModel;
            }

            if(aLegalMobileNo == null || aLegalMobileNo.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_206);
                retModel.setMsg("法人手机号不允许为空!");
                return retModel;
            }

            if(aCompanyLicencePic == null || aCompanyLicencePic.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_207);
                retModel.setMsg("营业执照照片不允许为空!");
                return retModel;
            }

            if(aLegralIdCardPicFront == null || aLegralIdCardPicFront.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_208);
                retModel.setMsg("法人身份证照片(正面)不允许为空!");
                return retModel;
            }

            if(aLegralIdCardPicBack == null || aLegralIdCardPicBack.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_209);
                retModel.setMsg("法人身份证照片(背面)不允许为空!");
                return retModel;
            }

            accountCertifyVO = accountCertifyService.addAccountCertify(getLoginTenantId(),
                    getLoginUserId(),
                    CERITIFY_TYPE,
                    aCompanyName,
                    aCompanyAddress,
                    aCompanyLicenceNo,
                    aLegalName,
                    aLegalIdCard,
                    aLegalMobileNo,
                    aCompanyLicencePic,
                    aLegralIdCardPicFront,
                    aLegralIdCardPicBack);


            retModel.setData(accountCertifyVO);


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
     * 获取分销商资质
     * todo:逻辑待完善
     * @param session
     * @param request
     * @param response
     * @return
     */
    @ApiOperation(value = "GetDistribCertify",notes = "获取分销商认证")
    @RequestMapping(value = "GetDistribCertify", method = RequestMethod.GET)
    public BaseRetModel<AccountCertifyVO> getDistribCertify(HttpSession session,
                                                           HttpServletRequest request,
                                                           HttpServletResponse response)
    {
        BaseRetModel<AccountCertifyVO> retModel = new BaseRetModel<>();

        AccountCertifyVO accountCertifyVO = null;

        TbAccountCertify tbAccountCertify = null;

        try
        {

            tbAccountCertify = accountCertifyService.getAccountCertify(getLoginTenantId(),CERITIFY_TYPE);

            if(tbAccountCertify != null)
            {
                accountCertifyVO = new AccountCertifyVO();
                BeanUtil.copyProperties(tbAccountCertify,accountCertifyVO);
                retModel.setData(accountCertifyVO);
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


    /**
     * 提交公司许可证图片
     * todo:待测试
     * @param session
     * @param request
     * @param response
     * @param aPicFile
     * @return
     */
    @ApiOperation(value = "CommitCompanyLicencePic",notes = "提交公司许可证图片")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "aPicFile",value = "提交相片流",required = true)
    })
    @RequestMapping(value = "CommitPic", method = RequestMethod.POST)
    public BaseRetModel<String> commitCompanyLicencePic(HttpSession session,
                                                        HttpServletRequest request,
                                                        HttpServletResponse response,
                                                        @RequestParam MultipartFile aPicFile
    )
    {
        BaseRetModel<String> retModel = new BaseRetModel<>();

        String fileName = "business_licence";
        String filePath = "";



        String saveFilePath = "";

        String retFilePath = "";

        try
        {


            if(aPicFile == null)
            {
                retModel.setCode(BaseConstant.ERR_CODE_201);
                retModel.setMsg("无法获取图片信息!");
                return retModel;
            }

            //filePath = session.getServletContext().getRealPath(path);

            //获取配置对象中的预设目录
            filePath = uploadFileConfig.getCertifyUploadDir();


            //组成新的路径
            saveFilePath = filePath+uploadFileConfig.getDistributorCertify();
            //返回文件名称。
            retFilePath =  accountCertifyService.savePic(getLoginTenantId(),saveFilePath,fileName,aPicFile);
            retModel.setData(retFilePath);



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
     * 提交身份证前图片
     * todo:待测试
     * @param session
     * @param request
     * @param response
     * @param aPicFile
     * @return
     */
    @ApiOperation(value = "CommitIdCardPicFront",notes = "提交身份证前图片")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "aPicFile",value = "图片流",required = true)
    })
    @RequestMapping(value = "CommitIdCardPicFront", method = RequestMethod.POST)
    public BaseRetModel<String> commitIdCardPicFront(HttpSession session,
                                                     HttpServletRequest request,
                                                     HttpServletResponse response,
                                                     @RequestParam MultipartFile aPicFile
    )
    {
        BaseRetModel<String> retModel = new BaseRetModel<>();

        String fileName = "idcard_front";
        String filePath = "";


        String path =  "/upload/certify/";

        String saveFilePath = "";

        String retFilePath = "";

        try
        {


            if(aPicFile == null)
            {
                retModel.setCode(BaseConstant.ERR_CODE_201);
                retModel.setMsg("无法获取图片信息!");
                return retModel;
            }

            filePath = session.getServletContext().getRealPath(path);

            //组成新的路径
            saveFilePath = filePath+uploadFileConfig.getDistributorCertify();
            retFilePath =  accountCertifyService.savePic(getLoginTenantId(),saveFilePath,fileName,aPicFile);
            retModel.setData(retFilePath);



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
     * 提交身份证前图片
     * todo:待测试
     * @param session
     * @param request
     * @param response
     * @param aPicFile
     * @return
     */
    @ApiOperation(value = "CommitIdCardPicBack",notes = "提交身份证后图片")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "aPicFile",value = "图片流",required = true)
    })
    @RequestMapping(value = "CommitIdCardPicBack", method = RequestMethod.POST)
    public BaseRetModel<String> commitIdCardPicBack(HttpSession session,
                                                    HttpServletRequest request,
                                                    HttpServletResponse response,
                                                    @RequestParam MultipartFile aPicFile
    )
    {
        BaseRetModel<String> retModel = new BaseRetModel<>();

        String fileName = "idcard_back";
        String filePath = "";


        String path =  "/upload/certify/";

        String saveFilePath = "";

        String retFilePath = "";

        try
        {


            if(aPicFile == null)
            {
                retModel.setCode(BaseConstant.ERR_CODE_201);
                retModel.setMsg("无法获取图片信息!");
                return retModel;
            }

            filePath = uploadFileConfig.getCertifyUploadDir();

            //组成新的路径
            saveFilePath = filePath+uploadFileConfig.getDistributorCertify();
            retFilePath =  accountCertifyService.savePic(getLoginTenantId(),saveFilePath,fileName,aPicFile);
            retModel.setData(retFilePath);



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
