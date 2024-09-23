package com.authentication.domain.repository;

import java.util.List;
import java.util.Optional;

public interface BaseRepository <T, ID> {
    Optional<T> findById(ID id);
    T save(T entity);
    void deleteById(ID id);
    List<T> findAll();

}
