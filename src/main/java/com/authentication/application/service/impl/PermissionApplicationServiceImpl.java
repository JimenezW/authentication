package com.authentication.application.service.impl;

import com.authentication.application.dto.PermissionDTO;
import com.authentication.application.service.PermissionApplicationService;
import com.authentication.domain.model.Permission;
import com.authentication.domain.service.PermissionDomainService;
import org.springframework.stereotype.Service;

@Service
public class PermissionApplicationServiceImpl extends BaseApplicationServiceImpl<Permission, PermissionDTO, Long> implements PermissionApplicationService {

    protected final PermissionDomainService permissionService;

    public PermissionApplicationServiceImpl(PermissionDomainService domainService){
            super(domainService);
        this.permissionService = domainService;
    }

    @Override
    protected Permission mapDtoToEntity(PermissionDTO dto) {
        return PermissionDTO.toModel(dto);
    }

    @Override
    protected PermissionDTO mapEntityToDto(Permission entity) {
        return PermissionDTO.fromModel(entity);
    }

}
