package com.authentication.domain.service.impl;

import com.authentication.domain.model.AccessApplication;
import com.authentication.domain.service.AccessApplicationDomainService;
import com.authentication.infrastructure.repository.mysql.jpaEntity.jpaAccessApplicationMySql;
import org.springframework.stereotype.Service;

@Service
public class AccessApplicationDomainServiceImpl extends BaseRepoServiceImpl<AccessApplication, Long> implements AccessApplicationDomainService {
    protected final jpaAccessApplicationMySql accessRepository;

    public AccessApplicationDomainServiceImpl(jpaAccessApplicationMySql repository){
        super(repository);
        accessRepository = repository;
    }

}
