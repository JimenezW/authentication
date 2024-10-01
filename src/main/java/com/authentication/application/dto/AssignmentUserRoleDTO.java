package com.authentication.application.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;

@JsonDeserialize
@Getter
@Setter
public class AssignmentUserRoleDTO extends  BaseDTO {

    private Long roleId;
    private Long userId;

    private ApplicationMDTO application;
    private RoleDTO role;

}
