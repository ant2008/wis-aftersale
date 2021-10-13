package com.wenc.front.controller.bsys;

import com.wenc.commdomain.pojo.matdata.TsDepot;
import com.wenc.commonservice.matdata.service.DepotService;
import com.wenc.core.controller.AbstractBaseSingleController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * test
 */
@RequestMapping("MDepot")
@RestController
public class DepotController extends AbstractBaseSingleController<TsDepot,TsDepot> {

    @Autowired
    private DepotService depotService;


    public DepotController() {
        super();
    }


    /**
     * 覆盖父类，处理主仓库只能有一个的问题。
     *
     * @param session
     * @param request
     * @param aModel
     * @throws Exception
     */
    @Override
    public void beforeEdit(HttpSession session, HttpServletRequest request, TsDepot aModel) throws Exception {

        List<TsDepot> tsDepots = null;

        try
        {
            //清除其他的主仓库设置。
            tsDepots = depotService.getWareHouses(getLoginTenantId());

            for (int i = 0; i < tsDepots.size(); i++) {
                 tsDepots.get(i).setFlag("0");
            }

            depotService.modDepots(tsDepots);

        }catch (Exception ex)
        {
             throw new Exception(ex.getMessage());
        }
    }
}
