package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.SsCode;
import com.wenc.core.dao.BaseRepository;
import com.wenc.core.model.DictModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SsCodeRepository extends BaseRepository<SsCode, Long> {


    @Query("select new com.wenc.core.model.DictModel(a.descr,a.sysCode) from SsCode  a where a.parentCode = :aParentCode")
    List<DictModel> getSsCodeDict(@Param("aParentCode") String aParentCode);


    @Query("select a from SsCode a where a.parentCode = :pcode ")
    List<SsCode> getSsCodeByParentCode(@Param("pcode") String aParentCode);

    @Query("select a from SsCode  a where a.parentCode = :pcode and a.sysCode = :code ")
    SsCode getSsCodeByParentCodeAndSysCode(@Param("pcode") String aParentCode, @Param("code") String aCode);

    /**
     * 获取第一层的字典
     * @return
     */
    @Query("select a from SsCode a where a.parentCode = '0'")
    List<SsCode> getTopSsCodes();

    /**
     * 获取所有有效的数据字典。
     * @param aState
     * @return
     */
    @Query("select a from SsCode a where a.state = :pcode ")
    List<SsCode> getAllByState(@Param("pcode") int aState);

}
