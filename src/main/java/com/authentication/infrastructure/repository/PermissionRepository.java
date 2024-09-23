package com.authentication.infrastructure.repository;

import com.authentication.domain.model.Permission;
import com.authentication.domain.repository.PermissionRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long>, PermissionRepositoryCustom {
}
