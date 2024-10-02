package com.authentication.infrastructure.repository.mysql;

import com.authentication.domain.model.Role;
import com.authentication.infrastructure.repository.RoleRepository;
import com.authentication.infrastructure.repository.mysql.jpaEntity.jpaRoleMySql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RoleRepositoryMySql implements RoleRepository {

    private final jpaRoleMySql jpaRole;

    public RoleRepositoryMySql(jpaRoleMySql jpaRole){

        this.jpaRole = jpaRole;
    }


    @Override
    public Optional<Role> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Role save(Role entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<Role> findAll() {
        return List.of();
    }

    @Override
    public Page<Role> findAllByCriteria(Object criteria, Pageable pageable) {
        return null;
    }
}
