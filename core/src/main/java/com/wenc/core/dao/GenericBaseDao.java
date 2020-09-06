package com.wenc.core.dao;

import com.wenc.core.model.SearchConModel;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import java.util.Map;

@NoRepositoryBean
public interface GenericBaseDao<T, ID> extends PagingAndSortingRepository<T, ID>, JpaSpecificationExecutor<T> {

    Page<T> pageQuery(int aPage, int aSize, Map<String, SearchConModel> aParams);
}
