package com.authentication.application.dto;

import com.authentication.domain.model.User;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;

@JsonDeserialize
@Getter
@Setter
public class UserDTO extends BaseDTO {

    private String userName;

    private String lastName;

    private String password;

    private String email;

    // Método estático para mapear de Role a RoleDTO
    public static UserDTO fromModel(User entity) {
        UserDTO dto = new UserDTO();
        dto.setId(entity.getId());
        dto.setCreateDate(entity.getCreateDate());
        dto.setUpdateDate(entity.getUpdateDate());
        dto.setActive(entity.isActive());
        return dto;
    }

    // Método estático para mapear de RoleDTO a Role
    public static User toModel(UserDTO dto) {
        User entity = new User();
        entity.setId(dto.getId());
        entity.setCreateDate(dto.getCreateDate());
        entity.setUpdateDate(dto.getUpdateDate());
        entity.setActive(dto.isActive());
        return entity;
    }

}
