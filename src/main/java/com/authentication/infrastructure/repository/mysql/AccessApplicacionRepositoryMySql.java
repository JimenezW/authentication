package com.authentication.infrastructure.repository.mysql;

import com.authentication.domain.model.AccessApplication;
import com.authentication.domain.model.mysql.AccessApplicationMySql;
import com.authentication.infrastructure.repository.AccessApplicationRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AccessApplicacionRepositoryMySql implements AccessApplicationRepository {

    private final AccessApplicationMySql jpaAccessApplication;

    public AccessApplicacionRepositoryMySql(AccessApplicationMySql jpa){
        jpaAccessApplication = jpa;
    }

    @Override
    public Optional<AccessApplication> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public AccessApplication save(AccessApplication entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<AccessApplication> findAll() {
        return List.of();
    }

    @Override
    public Page<AccessApplication> findAllByCriteria(Object criteria, Pageable pageable) {
        return null;
    }
}
