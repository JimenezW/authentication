package com.authentication.domain.service.impl;

import com.authentication.domain.model.Permission;
import com.authentication.domain.service.PermissionDomainService;
import com.authentication.infrastructure.repository.mysql.jpaEntity.jpaPermissionMySql;
import org.springframework.stereotype.Service;

@Service
public class PermissionDomainServiceImpl extends BaseRepoServiceImpl<Permission,Long> implements PermissionDomainService {

    protected final jpaPermissionMySql permissionRepository;

    public PermissionDomainServiceImpl(jpaPermissionMySql repository){
        super(repository);
        permissionRepository = repository;
    }

}
