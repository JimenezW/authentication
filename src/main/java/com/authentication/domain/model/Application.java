package com.authentication.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Application extends BaseModel {

    private String clave;

    private String description;
}
