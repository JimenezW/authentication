package com.authentication.application.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;

@JsonDeserialize
@Getter
@Setter
public class AccessApplicationDTO extends BaseDTO {

    private String clave;
    private Long applicationId;
    private String title;
    private String description;

    private ApplicationMDTO application;


}
