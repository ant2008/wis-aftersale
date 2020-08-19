package com.wenc.commdomain.dto.dsb;

import com.wenc.commdomain.pojo.dsb.TbSupplyOrderD;
import com.wenc.commdomain.pojo.dsb.TbSupplyOrderH;

import java.util.List;

/**
 *  供货商订单传输对象。
 */
public class SupplyOrderDTO {

    private TbSupplyOrderH tbSupplyOrderH;
    private List<TbSupplyOrderD> tbSupplyOrderDList;

    public TbSupplyOrderH getTbSupplyOrderH() {
        return tbSupplyOrderH;
    }

    public void setTbSupplyOrderH(TbSupplyOrderH tbSupplyOrderH) {
        this.tbSupplyOrderH = tbSupplyOrderH;
    }

    public List<TbSupplyOrderD> getTbSupplyOrderDList() {
        return tbSupplyOrderDList;
    }

    public void setTbSupplyOrderDList(List<TbSupplyOrderD> tbSupplyOrderDList) {
        this.tbSupplyOrderDList = tbSupplyOrderDList;
    }
}
