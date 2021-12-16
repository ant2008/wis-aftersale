package com.wenc.front.controller.bus;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.wenc.commdomain.dto.sal.CommitRetailSaleDTO;
import com.wenc.commdomain.pojo.bus.TbRetailsaleH;
import com.wenc.commdomain.pojo.bus.TbSaleHangupD;
import com.wenc.commdomain.pojo.bus.TbSaleHangupH;
import com.wenc.commdomain.pojo.core.SsCode;
import com.wenc.commdomain.vo.bus.*;
import com.wenc.commdomain.vo.matdata.ParasetVo;
import com.wenc.commdomain.vo.matdata.VbProduct;
import com.wenc.commdomain.vo.matdata.VbShopAssistant;
import com.wenc.commdomain.vo.shop.RetailSalePrtVO;
import com.wenc.commdomain.vo.sys.PayTypeVo;
import com.wenc.commonservice.bus.service.RetailSaleService;
import com.wenc.commonservice.matdata.service.ParasetService;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.dao.BaseRepository;
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
import java.util.ArrayList;
import java.util.List;

/**
 * 零售销售界面
 */
@RequestMapping("MSale")
@RestController
public class MSaleController extends AbstractBaseSingleController<TbRetailsaleH,TbRetailsaleH> {

    @Autowired
    private RetailSaleService retailSaleService;

    @Autowired
    private ParasetService parasetService;


    /**
     * 收银前初始化动作。
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "InitSale", method = RequestMethod.GET)
    public BaseRetModel<RetailShopInfoVO> initSale(HttpSession session,
                                  HttpServletRequest request,
                                  HttpServletResponse response) {

        BaseRetModel<RetailShopInfoVO> retModel = new BaseRetModel<>();

        RetailShopInfoVO retailShopInfoVO = null;

        try {

            retailShopInfoVO = retailSaleService.initRetailInfo(getLoginTenantId(),getLoginUserId());

            if(retailShopInfoVO == null)
            {
                retModel.setCode(BaseConstant.ERR_CODE_201);
                retModel.setMsg("收银设置错误，不允许收银操作!");
                return retModel;
            }

            retModel.setData(retailShopInfoVO);
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
     * 收银打印初始化信息。
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "InitPrt", method = RequestMethod.GET)
    public BaseRetModel<RetailSalePrtVO> initPrt(HttpSession session,
                                                 HttpServletRequest request,
                                                 HttpServletResponse response)
    {
        BaseRetModel<RetailSalePrtVO> retModel = new BaseRetModel<>();

        RetailSalePrtVO retailSalePrtVO = null;

        List<ParasetVo>  parasetVos = null;
        ParasetVo parasetVo =null;

        try {


            parasetVos = parasetService.listTenantParasets(getLoginTenantId());

            if(parasetVos != null && parasetVos.size() >0)
            {
                retailSalePrtVO = new RetailSalePrtVO();


                for (int i = 0; i < parasetVos.size(); i++) {

                    parasetVo= parasetVos.get(i);

                    if(parasetVo != null)
                    {
                        //公司抬头信息。
                        if("tn_001".equals(parasetVo.getParaCode().trim()))
                        {
                            retailSalePrtVO.setPrtTitle(parasetVo.getParaDefa());
                        }

                        //页脚
                        if("tn_002".equals(parasetVo.getParaCode().trim()))
                        {
                            retailSalePrtVO.setPrtFooter(parasetVo.getParaDefa());
                        }

                        //备注
                        if("tn_003".equals(parasetVo.getParaCode().trim()))
                        {
                            retailSalePrtVO.setPrtMemo(parasetVo.getParaDefa());
                        }

                        //打印驱动模式
                        if("tn_005".equals(parasetVo.getParaCode().trim()))
                        {
                            retailSalePrtVO.setPrtDriverModel(parasetVo.getParaDefa());
                        }

                        //打印地址
                        if("tn_006".equals(parasetVo.getParaCode().trim()))
                        {
                            retailSalePrtVO.setPrtAddress(parasetVo.getParaDefa());
                        }

                        //打印电话
                        if("tn_007".equals(parasetVo.getParaCode().trim()))
                        {
                            retailSalePrtVO.setPrtTelno(parasetVo.getParaDefa());
                        }


                        //打印联系电话

                        //是否允许打印
                        if("tn_008".equals(parasetVo.getParaCode().trim()))
                        {
                            retailSalePrtVO.setAllowPrt(parasetVo.getParaDefa());
                        }


                    }


                }
            }

            retModel.setData(retailSalePrtVO);
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
     * 检索零售商品
     *
     * @param session
     * @param request
     * @param response
     * @param aSearchKey
     * @return
     */
    @RequestMapping(value = "SearchRetailProducts", method = RequestMethod.GET)
    public BaseRetModel<VbRetailsaleProduct> searchRetailProducts(HttpSession session,
                                                                  HttpServletRequest request,
                                                                  HttpServletResponse response,
                                                                  @RequestParam String aSearchKey,
                                                                  @RequestParam String aDepotId)
    {
        BaseRetModel<VbRetailsaleProduct> retModel = new BaseRetModel<>();

        List<VbRetailsaleProduct> vbRetailsaleProducts = null;

         try
         {
             if(aSearchKey.trim().equals(""))
             {
                 retModel.setCode(BaseConstant.ERR_CODE_201);
                 retModel.setMsg("请输入商品编码或者助记符!");
                 return retModel;
             }



             if(aDepotId.trim().equals("")) {
                 vbRetailsaleProducts = retailSaleService.searchRetailSaleProducts(getLoginTenantId(), aSearchKey);
             }else
             {
                 vbRetailsaleProducts = retailSaleService.searchRetailSaleProductsWithDepot(getLoginTenantId(),aSearchKey,aDepotId);
             }

             retModel.setDataList(vbRetailsaleProducts);

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
     * 获取所有可用的支付类型
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "ListPayTypes", method = RequestMethod.GET)
    public BaseRetModel<PayTypeVo> listPayTypes(HttpSession session,
                                                        HttpServletRequest request,
                                                        HttpServletResponse response)
    {
        BaseRetModel<PayTypeVo> retModel = new BaseRetModel<>();

        List<PayTypeVo> payTypeVos = null;

         try
         {

             payTypeVos = retailSaleService.getPayTypes(getLoginTenantId());

             retModel.setDataList(payTypeVos);


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
     * 提交相应的销售
     *
     * @param session
     * @param request
     * @param response
     * @param aCommitJson
     * @return
     */
    @RequestMapping(value = "CommitRetailSale",method = RequestMethod.POST)
    public BaseRetModel<String> commitRetailSale(HttpSession session,
                                                HttpServletRequest request,
                                                HttpServletResponse response,
                                                @RequestParam String aCommitJson)
    {
        BaseRetModel<String> retModel = new BaseRetModel();

        Gson gson = GsonHelper.getGsonAll();

        CommitRetailSaleDTO commitRetailSaleDTO = null;

        String retailSaleNo = "";

        try
        {
            if(aCommitJson.trim().equals(""))
            {
                retModel.setMsg("无内容不允许结算!");
                retModel.setCode(BaseConstant.ERR_CODE_300);
                return retModel;
            }

            commitRetailSaleDTO = gson.fromJson(aCommitJson,new TypeToken<CommitRetailSaleDTO>(){}.getType());

            if(commitRetailSaleDTO == null)
            {
                retModel.setMsg("转换结算对象错误!");
                retModel.setCode(BaseConstant.ERR_CODE_301);
                return retModel;
            }

            //提交进行保存。
            retailSaleNo = retailSaleService.commitRetailSales(getLoginTenantId(),commitRetailSaleDTO,getLoginUserId());

            retModel.setData(retailSaleNo);



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
     * 获零售销售明细
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "GetRetailSaleDetail",method = RequestMethod.GET)
    public BaseRetModel<RetailSaleDetailVO> getRetailSaleDetail(HttpSession session,
                                                                HttpServletRequest request,
                                                                HttpServletResponse response,
                                                                @RequestParam String aRetailSaleNo)
    {

        BaseRetModel<RetailSaleDetailVO> retModel = new BaseRetModel<>();

        RetailSaleDetailVO retailSaleDetailVO = null;

        try
        {

            if(aRetailSaleNo.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_300);
                retModel.setMsg("请输入销售单号");
                return retModel;
            }

            retailSaleDetailVO = retailSaleService.getRetailSaleDetail(getLoginTenantId(),aRetailSaleNo);
            retModel.setData(retailSaleDetailVO);


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
     * 提交保存前端挂单
     *
     * @param session
     * @param request
     * @param response
     * @param aCommitJson
     * @return
     */
    @RequestMapping(value = "CommitRetailHangup",method = RequestMethod.POST)
    public BaseRetModel<String> commitRetailHangup(HttpSession session,
                                                 HttpServletRequest request,
                                                 HttpServletResponse response,
                                                 @RequestParam String aCommitJson)
    {
        BaseRetModel<String> retModel = new BaseRetModel();

        Gson gson = GsonHelper.getGsonAll();

        CommitRetailSaleDTO commitRetailSaleDTO = null;

        String retailSaleNo = "";

        try
        {
            if(aCommitJson.trim().equals(""))
            {
                retModel.setMsg("无内容不允许进行挂单!");
                retModel.setCode(BaseConstant.ERR_CODE_300);
                return retModel;
            }

            commitRetailSaleDTO = gson.fromJson(aCommitJson,new TypeToken<CommitRetailSaleDTO>(){}.getType());

            if(commitRetailSaleDTO == null)
            {
                retModel.setMsg("转换结算对象错误!");
                retModel.setCode(BaseConstant.ERR_CODE_301);
                return retModel;
            }

            //提交进行保存。
            retailSaleNo = retailSaleService.commitHangup(getLoginTenantId(),commitRetailSaleDTO,getLoginUserId());

            retModel.setData(retailSaleNo);



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
     * 获取挂单List
     *
      * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "ListRetailHangup",method = RequestMethod.GET)
    public BaseRetModel<TbSaleHangupH> listRetailHangup(HttpSession session,
                                                        HttpServletRequest request,
                                                        HttpServletResponse response)
    {
        BaseRetModel<TbSaleHangupH> retModel = new BaseRetModel<>();
        List<TbSaleHangupH> saleHangupHList = null;
        try
        {
            saleHangupHList  = retailSaleService.getHangupList(getLoginTenantId(),getLoginUserId());

            retModel.setDataList(saleHangupHList);

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
     * 按单号获取明细
     *
     * @param session
     * @param request
     * @param response
     * @param aBillNo
     * @return
     */
    @RequestMapping(value = "GetRetailHangup",method = RequestMethod.GET)
    public BaseRetModel<SaleHangupVO> getRetailHangup(HttpSession session,
                                                      HttpServletRequest request,
                                                      HttpServletResponse response,
                                                      @RequestParam String aBillNo)
    {
        BaseRetModel<SaleHangupVO> retModel = new BaseRetModel<>();

        SaleHangupVO saleHangupVO = null;

        try
        {
            if(aBillNo.trim().equals(""))
            {
                retModel.setCode(BaseConstant.ERR_CODE_300);
                retModel.setMsg("请必须输入挂单号!");
                return retModel;
            }

            saleHangupVO = retailSaleService.getHangupDetail(getLoginTenantId(),getLoginUserId(),aBillNo);

            retModel.setData(saleHangupVO);


            //删除挂单信息
            retailSaleService.delSaleHangup(getLoginTenantId(),saleHangupVO.getSaleHangupNo());



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
     * 列出可拆零商品清单
     *
     * @param session
     * @param request
     * @param response
     * @param aItemId
     * @return
     */
    @RequestMapping(value = "ListRetailMinsale",method = RequestMethod.GET)
    public BaseRetModel<VbProduct> ListRetailMinsale(HttpSession session,
                                                     HttpServletRequest request,
                                                     HttpServletResponse response,
                                                     @RequestParam String aItemId)
    {
        BaseRetModel<VbProduct> retModel = new BaseRetModel<>();
        List<VbProduct> vbProducts = null;

        VbProduct  vbProduct = null;

        try
        {
            vbProduct = retailSaleService.getRetailMinSaleProduct(getLoginTenantId(),aItemId);

            if( vbProduct != null )
            {
                vbProducts = new ArrayList<>();
                vbProducts.add(vbProduct);
            }

            retModel.setDataList(vbProducts);

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
     * 获取最近销售的单头清单
     *
     * @param session
     * @param request
     * @param response
     * @param aWhere
     * @return
     */
    @RequestMapping(value = "ListLastRetailSales",method = RequestMethod.GET)
    public BaseRetModel<VbRetailsaleH> listLastRetailSales(HttpSession session,
                                                           HttpServletRequest request,
                                                           HttpServletResponse response,
                                                           @RequestParam String aWhere)
    {
        BaseRetModel<VbRetailsaleH> retModel = new BaseRetModel<>();
        List<VbRetailsaleH> vbRetailsaleHS = null;


        try
        {
            vbRetailsaleHS = retailSaleService.listLastSaleHS(getLoginTenantId(),aWhere);

            retModel.setDataList(vbRetailsaleHS);

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
     * 获取门店营业员。
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "ListShopAssistant",method = RequestMethod.GET)
    public BaseRetModel<VbShopAssistant> listShopAssistant(HttpSession session,
                                                           HttpServletRequest request,
                                                           HttpServletResponse response,
                                                           @RequestParam String aWhere)
    {
        BaseRetModel<VbShopAssistant> retModel = new BaseRetModel<>();
        List<VbShopAssistant> vbShopAssistants = null;


        try
        {
            vbShopAssistants = retailSaleService.listShopAssistant(getLoginTenantId(),aWhere);

            retModel.setDataList(vbShopAssistants);

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
     * 统计日销售
     * @param session
     * @param request
     * @param response
     * @param aShopId
     * @param aPosNo
     * @param aSaleManId
     * @return
     */
    @RequestMapping("StatSaleSum")
    public BaseRetModel<String> statSaleSum(HttpSession session,
                                             HttpServletRequest request,
                                             HttpServletResponse response,
                                             @RequestParam String aShopId,
                                             @RequestParam String aPosNo,
                                             @RequestParam String aSaleManId)
    {
        BaseRetModel<String> retModel = new BaseRetModel<>();

        try{

            retailSaleService.statSaleSum(getLoginTenantId(),aShopId,aPosNo,aSaleManId);

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
