package com.authentication.domain.model.mysql;

import com.authentication.domain.model.Application;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "AccessApplication")
public class AccessApplicationMySql extends BaseEntityMySql {

    @Column(name = "clave", nullable = false, unique = true)
    private String clave;

    @Column(name = "applicationId", nullable = false)
    private Long applicationId; // Este campo es para el Foreign Key

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "applicationId", referencedColumnName = "id", insertable = false, updatable = false)
    private Application application;
}
