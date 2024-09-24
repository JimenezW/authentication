package com.authentication.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "AccessApplication")
public class AccessApplication extends BaseEntity {

    @Column(name = "clave", nullable = false, unique = true)
    private String clave;

    @Column(name = "application_id", nullable = false)
    private Long applicationId; // Este campo es para el Foreign Key

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "application_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Application application;

}
