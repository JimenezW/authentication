package com.authentication.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AssignmentUserRole extends BaseModel {

    private Long roleId;

    private Long userId;

    private Application application;

}
