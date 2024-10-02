package com.authentication.domain.service.impl;

import com.authentication.domain.model.AccessRole;
import com.authentication.domain.service.AccessRoleDomainService;
import com.authentication.infrastructure.repository.mysql.jpaEntity.jpaAccessRoleMySql;
import org.springframework.stereotype.Service;

@Service
public class AccessRoleDomainServiceImpl extends BaseRepoServiceImpl<AccessRole, Long> implements AccessRoleDomainService {
    protected final jpaAccessRoleMySql accessRoleRepository;

    public AccessRoleDomainServiceImpl(jpaAccessRoleMySql repository){
        super(repository);
        accessRoleRepository = repository;
    }

}
