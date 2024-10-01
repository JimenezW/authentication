package com.authentication.infrastructure.repository;

import com.authentication.domain.model.AssignmentUserRole;
import com.authentication.domain.repository.AssignmentUserRoleRepositoryCustom;
import com.mysql.cj.log.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentUserRoleRepository extends JpaRepository <AssignmentUserRole, Long>, AssignmentUserRoleRepositoryCustom {
}
