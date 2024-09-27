package com.authentication.application.service.impl;

import com.authentication.application.dto.RoleDTO;
import com.authentication.application.service.RoleApplicationService;
import com.authentication.domain.model.Role;
import com.authentication.domain.service.RoleRepoService;
import org.springframework.stereotype.Service;

@Service
public class RoleApplicationServiceImp extends BaseApplicationServiceImpl<Role, RoleDTO, Long> implements RoleApplicationService {

    private final RoleRepoService roleService;

    public RoleApplicationServiceImp(RoleRepoService roleService) {
        super(roleService);
        this.roleService = roleService;
    }

    @Override
    protected Role mapDtoToEntity(RoleDTO dto) {
        return RoleDTO.toModel(dto);
    }

    @Override
    protected RoleDTO mapEntityToDto(Role entity) {
        return RoleDTO.fromModel(entity);
    }
}
