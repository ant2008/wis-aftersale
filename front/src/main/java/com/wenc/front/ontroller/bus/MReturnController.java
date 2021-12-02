package com.wenc.front.controller.bus;

import com.wenc.commdomain.pojo.bus.TbReturnD;
import com.wenc.commdomain.pojo.bus.TbReturnH;
import com.wenc.commdomain.pojo.sys.TbStockD;
import com.wenc.commdomain.vo.bus.VbReturnD;
import com.wenc.commdomain.vo.bus.VbReturnH;
import com.wenc.commdomain.vo.matdata.ParasetVo;
import com.wenc.commonservice.bus.service.ReturnService;
import com.wenc.commonservice.sys.service.InventoyService;
import com.wenc.core.BaseConstant;
import com.wenc.core.annotation.BaseMasterDetailControllerAnnotation;
import com.wenc.core.controller.AbstractBaseMasterDetailController;
import com.wenc.core.model.BaseRetModel;
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

/**
 * 退货单处理
 */
@RestController
@RequestMapping("MReturn")
public class MReturnController extends AbstractBaseMasterDetailController<TbReturnH, TbReturnD, VbReturnH, VbReturnD> {

    @Autowired
    protected InventoyService inventoyService;

    @Autowired
    protected ReturnService returnService;


    @BaseMasterDetailControllerAnnotation(
            serialCode = "2306",
            keyColName = "returnNo"
    )
    public MReturnController() {
        super();
    }


    /**
     * 获取库存明细
     *
     * @param session
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "ListStockBatchno",method = RequestMethod.GET)
    public BaseRetModel<TbStockD> listStockBatchno(HttpSession session,
                                                   HttpServletRequest request,
                                                   HttpServletResponse response,
                                                   @RequestParam String depotId,
                                                   @RequestParam String itemId,
                                                   @RequestParam String searchKey)
    {
        BaseRetModel<TbStockD> retModel = new BaseRetModel<>();
        List<TbStockD>  tbStockDS = null;

        try
        {

            tbStockDS = inventoyService.getStockDs(getLoginTenantId(),depotId,itemId);

            retModel.setDataList(tbStockDS);


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
     * 审核处理逻辑
     * @param aMaster
     * @param session
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public boolean afterCheck(TbReturnH aMaster, HttpSession session, HttpServletRequest request) throws Exception {

        try
        {

         return    returnService.billCheck(getLoginTenantId(),aMaster.getReturnNo(),getLoginUserId());

        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    }


    @Override
    public VbReturnH initCreate(VbReturnH aMaster, HttpSession session, HttpServletRequest request) throws Exception {
        aMaster.setState(Byte.valueOf("0"));

        return aMaster;
    }
}
