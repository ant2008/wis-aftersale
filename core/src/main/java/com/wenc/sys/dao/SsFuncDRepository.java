package com.wenc.sys.dao;

import com.wenc.commdomain.pojo.core.SsFuncD;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SsFuncDRepository extends CrudRepository<SsFuncD, Long> {

    @Query("From SsFuncD a where a.funcNo = :funcno")
    List<SsFuncD> getFuncList(@Param("funcno") String aFuncNo);
}
