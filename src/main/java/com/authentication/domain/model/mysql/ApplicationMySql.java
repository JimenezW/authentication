package com.authentication.domain.model.mysql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Application")
public class ApplicationMySql extends BaseEntityMySql {

    @Column(name = "clave", nullable = false, unique = true)
    private String clave;

    @Column(name = "description")
    private String description;
}
