package com.authentication.infrastructure.repository.mysql;

import com.authentication.domain.model.AccessRole;
import com.authentication.infrastructure.repository.AccessRoleRepository;
import com.authentication.infrastructure.repository.mysql.jpaEntity.jpaAccessRoleMySql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AccessRoleRepositoryMySql implements AccessRoleRepository {

    private final jpaAccessRoleMySql jpaAccessRole;

    public AccessRoleRepositoryMySql(jpaAccessRoleMySql jpa){
        jpaAccessRole = jpa;
    }

    @Override
    public Optional<AccessRole> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public AccessRole save(AccessRole entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<AccessRole> findAll() {
        return List.of();
    }

    @Override
    public Page<AccessRole> findAllByCriteria(Object criteria, Pageable pageable) {
        return null;
    }
}
