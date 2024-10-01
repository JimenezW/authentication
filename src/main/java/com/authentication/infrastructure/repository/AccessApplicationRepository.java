package com.authentication.infrastructure.repository;

import com.authentication.domain.model.AccessApplication;
import com.authentication.domain.repository.AccessApplicationRepositoryCustom;
import com.authentication.domain.repository.AccessRoleRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessApplicationRepository extends JpaRepository<AccessApplication, Long>, AccessApplicationRepositoryCustom {
}
