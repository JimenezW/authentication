package com.authentication.application.service.impl;

import com.authentication.application.dto.RoleDTO;
import com.authentication.application.service.RoleService;
import com.authentication.domain.service.RoleRepositoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Component
public class RoleServiceImpl implements RoleService {

    private final RoleRepositoryService _roleService;

    @Override
    public RoleDTO createRole() {

        RoleDTO dto = new RoleDTO();
        dto.setClave("TEST");
        dto.setDescription("prueba");
        dto.setActive(Boolean.TRUE);

        return RoleDTO.fromModel(_roleService.createRole(RoleDTO.toModel(dto)));
    }
}
