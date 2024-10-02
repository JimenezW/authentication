package com.authentication.domain.service.impl;

import com.authentication.domain.model.Application;
import com.authentication.domain.service.ApplicationDomainService;
import com.authentication.infrastructure.repository.mysql.jpaEntity.jpaApplicationMySql;
import org.springframework.stereotype.Service;

@Service
public class ApplicationDomainServiceImpl extends BaseRepoServiceImpl<Application, Long> implements ApplicationDomainService {
    protected jpaApplicationMySql applicationRepository;

    public ApplicationDomainServiceImpl(jpaApplicationMySql repository){
        super(repository);
        applicationRepository = repository;
    }

}
