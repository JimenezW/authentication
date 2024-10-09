package com.authentication.domain.service.impl;

import com.authentication.domain.model.Role;
import com.authentication.domain.service.RoleDomainService;
import com.authentication.infrastructure.repository.RoleRepository;
import com.authentication.infrastructure.repository.mysql.RoleRepositoryMySql;

import org.springframework.stereotype.Service;

@Service
public class RoleDomainServiceImp extends BaseRepoServiceImpl<Role,Long> implements RoleDomainService {
    protected final RoleRepository accessRoleRepository;

    public RoleDomainServiceImp(RoleRepository repository){
        super(repository);
        this.accessRoleRepository = repository;
    }
}
