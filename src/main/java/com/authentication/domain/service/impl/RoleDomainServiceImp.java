package com.authentication.domain.service.impl;

import com.authentication.domain.model.Role;
import com.authentication.domain.service.RoleDomainService;
import com.authentication.infrastructure.repository.mysql.RoleRepositoryMySql;

import org.springframework.stereotype.Service;

@Service
public class RoleDomainServiceImp extends BaseRepoServiceImpl<Role,Long> implements RoleDomainService {
    protected final RoleRepositoryMySql roleRepository;

    public RoleDomainServiceImp(RoleRepositoryMySql repository){
        super(repository);
        roleRepository = repository;
    }
}
