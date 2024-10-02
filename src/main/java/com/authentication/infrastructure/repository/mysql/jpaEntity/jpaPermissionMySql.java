package com.authentication.infrastructure.repository.mysql.jpaEntity;

import com.authentication.domain.model.mysql.PermissionMySql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jpaPermissionMySql extends JpaRepository<PermissionMySql, Long> {
}
