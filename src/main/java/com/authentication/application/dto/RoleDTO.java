package com.authentication.application.dto;

import com.authentication.domain.model.Role;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;

@JsonDeserialize
@Getter
@Setter
public class RoleDTO extends BaseDTO{

    private String clave;

    private String description;

    // Método estático para mapear de Role a RoleDTO
    public static RoleDTO fromModel(Role role) {
        RoleDTO dto = new RoleDTO();
        dto.setId(role.getId()); // También mapear el ID
        dto.setClave(role.getClave());
        dto.setDescription(role.getDescription());
        dto.setCreateDate(role.getCreateDate());
        dto.setUpdateDate(role.getUpdateDate());
        dto.setActive(role.isActive());
        return dto;
    }

    // Método estático para mapear de RoleDTO a Role
    public static Role toModel(RoleDTO dto) {
        Role role = new Role();
        role.setId(dto.getId()); // También mapear el ID
        role.setClave(dto.getClave());
        role.setDescription(dto.getDescription());
        role.setCreateDate(dto.getCreateDate());
        role.setUpdateDate(dto.getUpdateDate());
        role.setActive(dto.isActive());
        return role;
    }

}
