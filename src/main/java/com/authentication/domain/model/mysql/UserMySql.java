package com.authentication.domain.model.mysql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "User")
public class UserMySql extends BaseEntityMySql {

    @Column(name = "UserName", nullable = false, unique = true)
    private String userName;

    @Column(name = "Last_dame", nullable = false, unique = true)
    private String lastName;

    @Column(name = "Password", nullable = false, unique = true)
    private String password;

    @Column(name = "Email", nullable = false, unique = true)
    private String email;

}
