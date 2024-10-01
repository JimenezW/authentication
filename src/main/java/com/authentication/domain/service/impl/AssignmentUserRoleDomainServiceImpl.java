package com.authentication.domain.service.impl;

import com.authentication.domain.model.AssignmentUserRole;
import com.authentication.domain.service.AssignmentUserRoleDomainService;
import com.authentication.infrastructure.repository.AssignmentUserRoleRepository;

public class AssignmentUserRoleDomainServiceImpl  extends BaseRepoServiceImpl<AssignmentUserRole, Long> implements AssignmentUserRoleDomainService {
    protected final AssignmentUserRoleRepository assignmentUserRoleRepository;

    public AssignmentUserRoleDomainServiceImpl(AssignmentUserRoleRepository repository){
        super(repository);
        assignmentUserRoleRepository = repository;
    }

}
