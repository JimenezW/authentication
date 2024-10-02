package com.authentication.infrastructure.repository.mysql.jpaEntity;

import com.authentication.domain.model.mysql.AccessRoleMySql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jpaAccessRoleMySql extends JpaRepository<AccessRoleMySql, Long> {
}
