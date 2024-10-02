package com.authentication.infrastructure.repository.mysql.jpaEntity;

import com.authentication.domain.model.mysql.RoleMySql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jpaRoleMySql extends JpaRepository<RoleMySql, Long> {
}
