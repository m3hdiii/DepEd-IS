package com.deped.service;

import com.deped.repository.utils.Range;

import java.util.List;

public interface BaseService<T> {
    T create(T entity);

    Boolean update(T entity);

    List<T> fetchAll();

    List<T> fetchByRange(Range range);

    T fetchById(Object id);

    Boolean remove(T... entities);
}
