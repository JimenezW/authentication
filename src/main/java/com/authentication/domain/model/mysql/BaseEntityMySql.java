package com.authentication.domain.model.mysql;

import com.authentication.domain.model.BaseModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class BaseEntityMySql extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date", nullable = false, updatable = false)
    private LocalDateTime createDate = LocalDateTime.now();

    @Column(name = "update_date", nullable = true)
    private LocalDateTime updateDate = LocalDateTime.now();

    @Column(name = "active", nullable = false)
    private boolean active = false;

    @PrePersist
    protected void onCreateMySQL() {
        super.onCreate();
    }

    @PreUpdate
    protected void onUpdateMySQL() {
        super.onUpdate();
    }
}
