package com.authentication.domain.model.mysql;

import com.authentication.domain.model.Application;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "AssignmentUserRole")
public class AssignmentUserRoleMySql extends  BaseEntityMySql {

    @Column(name = "roleId", nullable = false)
    private Long roleId;

    @Column(name = "userId", nullable = false)
    private Long userId;

    @JoinColumn(name = "roleId", referencedColumnName = "id", insertable = false, updatable = false)
    private Application application;
}
