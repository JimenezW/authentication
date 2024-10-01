package com.authentication.application.dto;

import com.authentication.domain.model.Permission;
import com.authentication.domain.model.Role;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;

@JsonDeserialize
@Getter
@Setter
public class PermissionDTO extends BaseDTO{
    private String clave;

    private String description;

    // Método estático para mapear de Role a RoleDTO
    public static PermissionDTO fromModel(Permission entity) {
        PermissionDTO dto = new PermissionDTO();
        dto.setId(entity.getId()); // También mapear el ID
        dto.setClave(entity.getClave());
        dto.setDescription(entity.getDescription());
        dto.setCreateDate(entity.getCreateDate());
        dto.setUpdateDate(entity.getUpdateDate());
        dto.setActive(entity.isActive());
        return dto;
    }

    // Método estático para mapear de RoleDTO a Role
    public static Permission toModel(PermissionDTO dto) {
        Permission entity = new Permission();
        entity.setId(dto.getId()); // También mapear el ID
        entity.setClave(dto.getClave());
        entity.setDescription(dto.getDescription());
        entity.setCreateDate(dto.getCreateDate());
        entity.setUpdateDate(dto.getUpdateDate());
        entity.setActive(dto.isActive());
        return entity;
    }
}
