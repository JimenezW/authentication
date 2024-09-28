package com.authentication.infrastructure.repository;

import com.authentication.domain.model.AccessRole;
import com.authentication.domain.repository.AccessRoleRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessRoleRepository extends JpaRepository<AccessRole, Long>, AccessRoleRepositoryCustom {
}
