package com.authentication.application.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;

@JsonDeserialize
@Getter
@Setter
public class ApplicationMDTO extends BaseDTO {

    private String clave;

    private String description;

}
