package com.authentication.domain.service.impl;

import com.authentication.domain.model.Role;
import com.authentication.domain.service.RoleRepoService;
import com.authentication.infrastructure.repository.RoleRepository;

import org.springframework.stereotype.Service;

@Service
public class RoleRepoServiceImp extends BaseRepoServiceImpl<Role,Long> implements RoleRepoService {
    protected final RoleRepository roleRepository;

    public RoleRepoServiceImp(RoleRepository repository){
        super(repository);
        roleRepository = repository;
    }
}
