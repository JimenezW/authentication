package com.authentication.application.service.impl;

import com.authentication.application.service.BaseApplicationService;
import com.authentication.domain.service.BaseRepoService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class BaseApplicationServiceImpl<T, DTO, ID> implements BaseApplicationService<DTO, ID> {

    protected final BaseRepoService<T, ID> domainService;

    public BaseApplicationServiceImpl(BaseRepoService<T, ID> domainService) {
        this.domainService = domainService;
    }

    @Override
    public DTO create(DTO dto) {
        T entity = mapDtoToEntity(dto);
        T savedEntity = domainService.save(entity);
        return mapEntityToDto(savedEntity);
    }

    @Override
    public Optional<DTO> findById(ID id) {
        return domainService.findById(id).map(this::mapEntityToDto);
    }

    @Override
    public List<DTO> findAll() {
        return domainService.findAll().stream()
                .map(this::mapEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(ID id) {
        domainService.deleteById(id);
    }

    @Override
    public List<DTO> filterPagination(int pageNumber, int pageSize, String sortField, String sortDirection) {
        return domainService.filterPagination(pageNumber, pageSize, sortField, sortDirection).stream()
                .map(this::mapEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public DTO update(ID id, DTO dto) {

        T entity = mapDtoToEntity(dto);
        T updatedEntity = domainService.update(id, entity);

        return mapEntityToDto(updatedEntity);
    }

    // Métodos abstractos para mapear DTO <-> Entidad
    protected abstract T mapDtoToEntity(DTO dto);

    protected abstract DTO mapEntityToDto(T entity);

}
