package com.authentication.application.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@JsonDeserialize
@Getter
@Setter
public abstract class BaseDTO {

    @Schema(hidden = true)
    private Long id;

    @Schema(hidden = true)
    private LocalDateTime createDate;

    @Schema(hidden = true)
    private LocalDateTime updateDate;

    @Schema(hidden = true)
    private boolean active = true;
}
