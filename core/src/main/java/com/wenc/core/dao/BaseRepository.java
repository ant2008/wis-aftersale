package com.wenc.core.dao;

import org.springframework.data.repository.CrudRepository;

/**
 * 基础repository
 * @param <T>
 * @param <ID>
 */
public interface BaseRepository<T,ID> extends CrudRepository<T,ID> {
}
