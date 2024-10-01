package com.authentication.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {
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
    protected void onCreate() {
        createDate = LocalDateTime.now();
        active = true;
    }

    @PreUpdate
    protected void onUpdate() {
        updateDate = LocalDateTime.now();
    }
}
