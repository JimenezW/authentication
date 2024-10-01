package com.authentication.domain.service;

import java.util.List;
import java.util.Optional;

public interface BaseRepoService<T, ID> {
    T save(T entity);

    Optional<T> findById(ID id);

    List<T> findAll();

    void deleteById(ID id);

    List<T> filterPagination(int pageNumber, int pageSize, String sortField, String sortDirection);

    T update(ID id, T entity);
}
