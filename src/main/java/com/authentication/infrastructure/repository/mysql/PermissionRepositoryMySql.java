package com.authentication.infrastructure.repository.mysql;

import com.authentication.domain.model.Permission;
import com.authentication.infrastructure.repository.PermissionRepository;
import com.authentication.infrastructure.repository.mysql.jpaEntity.jpaPermissionMySql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PermissionRepositoryMySql implements PermissionRepository {

    private final jpaPermissionMySql permissionMySql;

    public PermissionRepositoryMySql(jpaPermissionMySql jpa){
        permissionMySql = jpa;
    }

    @Override
    public Optional<Permission> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Permission save(Permission entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<Permission> findAll() {
        return List.of();
    }

    @Override
    public Page<Permission> findAllByCriteria(Object criteria, Pageable pageable) {
        return null;
    }
}
