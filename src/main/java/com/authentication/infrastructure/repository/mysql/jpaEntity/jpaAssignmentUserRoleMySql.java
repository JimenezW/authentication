package com.authentication.infrastructure.repository.mysql.jpaEntity;

import com.authentication.domain.model.mysql.AssignmentUserRoleMySql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jpaAssignmentUserRoleMySql extends JpaRepository <AssignmentUserRoleMySql, Long> {
}
