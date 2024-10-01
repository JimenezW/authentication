package com.authentication.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "AssignmentUserRole")
public class AssignmentUserRole extends  BaseEntity{

    @Column(name = "roleId", nullable = false)
    private Long roleId;

    @Column(name = "userId", nullable = false)
    private Long userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId", referencedColumnName = "id", insertable = false, updatable = false)
    private ApplicationM application;


}
