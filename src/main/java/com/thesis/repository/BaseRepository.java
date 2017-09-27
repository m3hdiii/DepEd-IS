package com.thesis.repository;

import com.thesis.repository.utils.Range;

import java.util.List;

public interface BaseRepository<T> {

    T create(T entity);

    Boolean update(T entity);

    List<T> fetchAll();

    List<T> fetchByRange(Range range);

    T fetchById(Object id);

    Boolean remove(T... entities);
}
