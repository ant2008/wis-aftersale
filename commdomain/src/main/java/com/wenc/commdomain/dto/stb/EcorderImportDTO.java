package com.wenc.commdomain.dto.stb;

import com.wenc.commdomain.pojo.stb.TbEcorderD;
import com.wenc.commdomain.pojo.stb.TbEcorderH;

import java.util.List;

/**
 * Transdata wiht ecorder head and list.
 *
 * @author w.li
 * @date 2019-11-18
 */
public class EcorderImportDTO {

    private TbEcorderH ecorderH;
    private List<TbEcorderD> ecorderDList;

    public TbEcorderH getEcorderH() {
        return ecorderH;
    }

    public void setEcorderH(TbEcorderH ecorderH) {
        this.ecorderH = ecorderH;
    }

    public List<TbEcorderD> getEcorderDList() {
        return ecorderDList;
    }

    public void setEcorderDList(List<TbEcorderD> ecorderDList) {
        this.ecorderDList = ecorderDList;
    }
}
