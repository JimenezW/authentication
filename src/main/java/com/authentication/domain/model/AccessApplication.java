package com.authentication.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccessApplication extends BaseModel {

    private String clave;

    private Long applicationId;

    private String title;

    private String description;

    private Application application;

}
