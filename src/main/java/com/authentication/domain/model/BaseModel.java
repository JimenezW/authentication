package com.authentication.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class BaseModel {

    private Long id;
    private LocalDateTime createDate = LocalDateTime.now();
    private LocalDateTime updateDate = LocalDateTime.now();
    private boolean active = false;

    public BaseModel() {
        this.active = true;
    }

    public void onCreate() {
        this.createDate = LocalDateTime.now();
        this.active = true;
    }

    public void onUpdate() {
        this.updateDate = LocalDateTime.now();
    }
}
