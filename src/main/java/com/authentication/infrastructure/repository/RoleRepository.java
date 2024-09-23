package com.authentication.infrastructure.repository;

import com.authentication.domain.repository.RoleRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.authentication.domain.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>, RoleRepositoryCustom {
}
