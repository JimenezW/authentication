package com.authentication.application.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;

@JsonDeserialize
@Getter
@Setter
public class AccessRoleDTO extends BaseDTO {

    private Long roleId;
    private Long permissionId;
    private Long accessApplicationId;
    private RoleDTO role;
    private PermissionDTO permission;
    private AccessApplicationDTO accessApplication;
}
