package com.authentication.domain.service.impl;

import com.authentication.domain.model.Role;
import com.authentication.domain.service.RoleDomainService;
import com.authentication.infrastructure.repository.RoleRepository;

import org.springframework.stereotype.Service;

@Service
public class RoleDomainServiceImp extends BaseRepoServiceImpl<Role,Long> implements RoleDomainService {
    protected final RoleRepository roleRepository;

    public RoleDomainServiceImp(RoleRepository repository){
        super(repository);
        roleRepository = repository;
    }
}
