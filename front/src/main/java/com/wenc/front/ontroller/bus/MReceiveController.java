package com.wenc.front.controller.bus;

import com.wenc.commdomain.pojo.bus.TbReceiveD;
import com.wenc.commdomain.pojo.bus.TbReceiveH;
import com.wenc.commdomain.vo.bus.VbReceiveD;
import com.wenc.commdomain.vo.bus.VbReceiveH;
import com.wenc.commonservice.bus.service.ReceiveService;
import com.wenc.core.annotation.BaseMasterDetailControllerAnnotation;
import com.wenc.core.controller.AbstractBaseMasterDetailController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;

/**
 * 入库单controller
 *
 * @author li.w
 */
@RestController
@RequestMapping("MReceive")
public class MReceiveController extends AbstractBaseMasterDetailController<TbReceiveH, TbReceiveD, VbReceiveH, VbReceiveD> {

    @Autowired
    protected ReceiveService receiveService;




    @BaseMasterDetailControllerAnnotation(
            serialCode = "2303",
            keyColName = "receiveNo"
    )
    public MReceiveController() {
        super();
    }

    @Override
    public VbReceiveH initCreate(VbReceiveH aMaster, HttpSession session, HttpServletRequest request) throws Exception {

        aMaster.setReceiveType(Byte.valueOf("3"));
        aMaster.setReceiveUserId(getLoginUserId());
        aMaster.setBuyerId(getLoginUserId());
        aMaster.setReceiveDate(new Timestamp(System.currentTimeMillis()));

        return aMaster;
    }

    /**
     * 审核service
     * @param aMaster
     * @param session
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public boolean afterCheck(TbReceiveH aMaster, HttpSession session, HttpServletRequest request) throws Exception {

        try {
            receiveService.billCheck(getLoginTenantId(), aMaster.getReceiveNo(),getLoginUserId());
        }catch (Exception ex)
        {
            throw new Exception(ex.getMessage());
        }

        return true;
    }

}
