package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.SsFuncH;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SsFuncHRepository extends CrudRepository<SsFuncH, Long> {


    /**
     * 根据父类代码获取权限
     *
     * @param aParentNo
     * @return
     */
    @Query("from SsFuncH s where s.parentNo = :parentno and s.actr = 1 order by s.funcOrder")
    List<SsFuncH> getSsFuncHByParentNo(@Param("parentno") String aParentNo);
}
