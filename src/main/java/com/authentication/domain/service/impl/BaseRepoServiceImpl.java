package com.authentication.domain.service.impl;

import com.authentication.common.utils.ObjectCopier;
import com.authentication.domain.model.BaseEntity;
import com.authentication.domain.service.BaseRepoService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class BaseRepoServiceImpl<T extends BaseEntity, ID> implements BaseRepoService<T, ID> {
    protected final JpaRepository<T, ID> repository;

    public BaseRepoServiceImpl(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(ID id) {

        T entity = findById(id).orElseThrow(() -> new EntityNotFoundException("Entity with id " + id.toString() + " not found"));
        entity.setActive(false);
        repository.save(entity);
    }

    @Override
    public List<T> filterPagination(int pageNumber, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() : Sort.by(sortField).descending();
        Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
        return repository.findAll(pageable).getContent();
    }

    @Override
    public T update(ID id, T updatedEntity) {

        T existingEntity = findById(id).orElseThrow(() -> new EntityNotFoundException("Entity with id " + id.toString() + " not found"));

        ObjectCopier<T> copier = new ObjectCopier<>();
        copier.copyProperties(updatedEntity, existingEntity);

        return repository.save(existingEntity);
    }
}
