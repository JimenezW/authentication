package com.authentication.domain.service.impl;

import com.authentication.domain.model.ApplicationM;
import com.authentication.domain.service.ApplicationDomainService;
import com.authentication.infrastructure.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

@Service
public class ApplicationDomainServiceImpl extends BaseRepoServiceImpl<ApplicationM, Long> implements ApplicationDomainService {
    protected ApplicationRepository applicationRepository;

    public ApplicationDomainServiceImpl(ApplicationRepository repository){
        super(repository);
        applicationRepository = repository;
    }

}
