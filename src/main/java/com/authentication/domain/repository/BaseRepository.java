package com.authentication.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BaseRepository <T, ID> {
    Optional<T> findById(ID id);
    T save(T entity);
    void deleteById(ID id);
    List<T> findAll();
    Page<T> findAllByCriteria(Object criteria, Pageable pageable);
}
