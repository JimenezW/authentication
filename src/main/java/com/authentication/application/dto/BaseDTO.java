package com.authentication.application.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@JsonDeserialize
@Getter
@Setter
public abstract class BaseDTO {

    private Long id;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    private boolean active = true;
}
