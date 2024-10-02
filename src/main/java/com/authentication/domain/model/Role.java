package com.authentication.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Role extends BaseModel {
    private String clave;
    private String description;
}
