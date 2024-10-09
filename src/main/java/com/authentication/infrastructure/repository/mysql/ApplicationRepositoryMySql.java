package com.authentication.infrastructure.repository.mysql;

import com.authentication.domain.model.Application;
import com.authentication.infrastructure.repository.ApplicationRepository;
import com.authentication.infrastructure.repository.mysql.jpaEntity.jpaApplicationMySql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ApplicationRepositoryMySql implements ApplicationRepository {

    private final jpaApplicationMySql applicationMySql;

    public ApplicationRepositoryMySql(jpaApplicationMySql jpa){
        applicationMySql = jpa;
    }

    @Override
    public Optional<Application> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Application save(Application entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<Application> findAll() {
        return List.of();
    }

    @Override
    public Page<Application> findAllByCriteria(Object criteria, Pageable pageable) {
        return null;
    }



}
