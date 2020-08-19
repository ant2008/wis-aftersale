package com.wenc.commdomain.dto.dsb;

import com.wenc.commdomain.pojo.dsb.TbDistributeOrderD;
import com.wenc.commdomain.pojo.dsb.TbDistributeOrderH;

import java.util.List;

public class DistributeOrderDTO {

     private TbDistributeOrderH tbDistributeOrderH;
     private List<TbDistributeOrderD> tbDistributeOrderDList;

    public TbDistributeOrderH getTbDistributeOrderH() {
        return tbDistributeOrderH;
    }

    public void setTbDistributeOrderH(TbDistributeOrderH tbDistributeOrderH) {
        this.tbDistributeOrderH = tbDistributeOrderH;
    }

    public List<TbDistributeOrderD> getTbDistributeOrderDList() {
        return tbDistributeOrderDList;
    }

    public void setTbDistributeOrderDList(List<TbDistributeOrderD> tbDistributeOrderDList) {
        this.tbDistributeOrderDList = tbDistributeOrderDList;
    }
}
