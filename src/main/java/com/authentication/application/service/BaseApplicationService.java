package com.authentication.application.service;

import java.util.List;
import java.util.Optional;

public interface BaseApplicationService <T, ID> {

    T create(T dto);

    Optional<T> findById(ID id);

    List<T> findAll();

    void deleteById(ID id);

    List<T> filterPagination(int pageNumber, int pageSize, String sortField, String sortDirection);
}
