package com.authentication.infrastructure.repository.mysql.jpaEntity;

import com.authentication.domain.model.mysql.AccessApplicationMySql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jpaAccessApplicationMySql extends JpaRepository<AccessApplicationMySql, Long> {
}
