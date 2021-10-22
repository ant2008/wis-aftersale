package com.wenc.front.controller.matdata;

import com.wenc.commdomain.pojo.matdata.TbVendor;
import com.wenc.core.controller.AbstractBaseSingleController;
import com.wenc.core.model.SearchConModel;
import com.wenc.core.util.SearchConBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 供应商管理
 */
@RestController
@RequestMapping("MVendor")
public class VendorController extends AbstractBaseSingleController<TbVendor,TbVendor> {
    public VendorController() {
        super();
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
                    .colName("vendorId").operaSign("=").colValue(aWhere).relationShip("or").buildSearchCon();

            searchConModels.add(searchConModel);

            searchConModel=SearchConBuilder.newInstance()
                    .colName("vendorSubno").operaSign("like").colValue(tmpWhere).relationShip("or").buildSearchCon();

            searchConModels.add(searchConModel);

            searchConModel = SearchConBuilder.newInstance()
                    .colName("vendorName").operaSign("like").colValue(tmpWhere).relationShip("or").buildSearchCon();
            searchConModels.add(searchConModel);


        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }



}
