package com.wenc.front.controller.glt;

import com.wenc.commdomain.pojo.glt.GlProduct;
import com.wenc.commdomain.pojo.glt.GlVendor;
import com.wenc.commonservice.glt.service.GlVendorService;
import com.wenc.core.BaseConstant;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.BaseRetModel;
import com.wenc.core.model.SearchConModel;
import com.wenc.core.util.SearchConBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("MGlvendor")
public class MGlvendorController extends AbstractBaseSingleController<GlVendor,GlVendor> {

    @Autowired
    protected GlVendorService glVendorService;

    public MGlvendorController() {
        super();
    }


    @RequestMapping(value = "ActiveWholeScope",method = RequestMethod.POST)
    public BaseRetModel<GlVendor> activeWholeScope(HttpSession session,
                                                    HttpServletRequest request,
                                                    HttpServletResponse response,
                                                    @RequestParam String  aVendorId)
    {
        BaseRetModel<GlVendor> retModel = new BaseRetModel<>();

        GlVendor glVendor = null;

        try
        {
            glVendor = glVendorService.getGlVendor(getLoginTenantId(),aVendorId);

            if(glVendor == null)
            {
                retModel.setCode(BaseConstant.ERR_CODE_201);
                retModel.setMsg("无法获取商品信息!");
                return retModel;
            }

            glVendor =  glVendorService.activeWholeScope(getLoginTenantId(),aVendorId,1,"1");

            retModel.setData(glVendor);

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



    @Override
    public void buildQuickCons(List<SearchConModel> searchConModels, String aWhere) {
        String tmpWhere = "";

        SearchConModel searchConModel = null;

        try{

            if(aWhere == null || aWhere.trim().equals(""))
            {
                tmpWhere = "%%";
            }else {
                tmpWhere = "%"+aWhere+"%";
            }

            //按商品名、助记符、或者编码、条码查询
            searchConModel = SearchConBuilder.newInstance()
                    .colName("vendorId").operaSign("=").colValue(aWhere).relationShip("or").leftBracket("(").buildSearchCon();

            searchConModels.add(searchConModel);

            searchConModel=SearchConBuilder.newInstance()
                    .colName("vendorSubno").operaSign("like").colValue(tmpWhere).relationShip("or").buildSearchCon();

            searchConModels.add(searchConModel);

            searchConModel = SearchConBuilder.newInstance()
                    .colName("vendorName").operaSign("like").colValue(tmpWhere).rightBracket(")").relationShip("and").buildSearchCon();
            searchConModels.add(searchConModel);


            searchConModel = SearchConBuilder.newInstance()
                    .colName("scopeFlag").operaSign("=").colValue("1").relationShip("and").buildSearchCon();
            searchConModels.add(searchConModel);


            searchConModel = SearchConBuilder.newInstance()
                    .colName("state").operaSign("=").colValue(1).buildSearchCon();
            searchConModels.add(searchConModel);


        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
