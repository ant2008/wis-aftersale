package com.wenc.front.controller.matdata;

import com.wenc.commdomain.pojo.matdata.TsPriceGroup;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 价格组
 */
@RequestMapping("MPriceg")
@RestController
public class MPriceGroupController extends AbstractBaseSingleController<TsPriceGroup,TsPriceGroup> {

    public MPriceGroupController() {
        super();
    }


    @Override
    public void InitCreate(TsPriceGroup aModel) throws Exception {

        aModel.setParentCode("0");
    }

    @Override
    public void beforeCreate(HttpSession session, HttpServletRequest request, TsPriceGroup aModel) throws Exception {

        try {
            aModel.setParentCode("0");

            if (aModel.getIfDefa().trim().equals("1")) {

                 throw new Exception("默认价格组不允许增加或修改!");
            }
        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }

    }

    @Override
    public void beforeEdit(HttpSession session, HttpServletRequest request, TsPriceGroup aModel) throws Exception {
        try {
            aModel.setParentCode("0");

            if (aModel.getIfDefa().trim().equals("1")) {
                throw new Exception("默认价格组不允许增加或修改!");
            }
        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    }
}
