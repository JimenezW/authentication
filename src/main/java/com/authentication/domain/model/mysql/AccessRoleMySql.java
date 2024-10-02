package com.authentication.domain.model.mysql;

import com.authentication.domain.model.AccessApplication;
import com.authentication.domain.model.Permission;
import com.authentication.domain.model.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "AccessRole")
public class AccessRoleMySql extends BaseEntityMySql {
    @Column(name = "roleId", nullable = false)
    private Long roleId;
    @Column(name = "permissionId", nullable = false)
    private Long permissionId;
    @Column(name = "accessApplicationId", nullable = false)
    private Long accessApplicationId;

    @ManyToOne
    @JoinColumn(name = "roleId", referencedColumnName = "id", insertable = false, updatable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "permissionId", referencedColumnName = "id", insertable = false, updatable = false)
    private Permission permision;

    @ManyToOne
    @JoinColumn(name = "accessApplicationId", referencedColumnName = "id", insertable = false, updatable = false)
    private AccessApplication accessApplication;
}
