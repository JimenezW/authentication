package com.authentication.domain.service.impl;

import com.authentication.domain.model.AssignmentUserRole;
import com.authentication.domain.service.AssignmentUserRoleDomainService;
import com.authentication.infrastructure.repository.mysql.jpaEntity.jpaAssignmentUserRoleMySql;

public class AssignmentUserRoleDomainServiceImpl  extends BaseRepoServiceImpl<AssignmentUserRole, Long> implements AssignmentUserRoleDomainService {
    protected final jpaAssignmentUserRoleMySql assignmentUserRoleRepository;

    public AssignmentUserRoleDomainServiceImpl(jpaAssignmentUserRoleMySql repository){
        super(repository);
        assignmentUserRoleRepository = repository;
    }

}
