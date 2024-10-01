package com.authentication.domain.service.impl;

import com.authentication.domain.model.AccessRole;
import com.authentication.domain.service.AccessRoleDomainService;
import com.authentication.infrastructure.repository.AccessRoleRepository;
import org.springframework.stereotype.Service;

@Service
public class AccessRoleDomainServiceImpl extends BaseRepoServiceImpl<AccessRole, Long> implements AccessRoleDomainService {
    protected final AccessRoleRepository accessRoleRepository;

    public AccessRoleDomainServiceImpl(AccessRoleRepository repository){
        super(repository);
        accessRoleRepository = repository;
    }

}
