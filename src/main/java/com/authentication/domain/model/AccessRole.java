package com.authentication.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccessRole extends BaseModel {
    private Long roleId;
    private Long permissionId;
    private Long accessApplicationId;

    private Role role;
    private Permission permision;

    private AccessApplication accessApplication;
}
