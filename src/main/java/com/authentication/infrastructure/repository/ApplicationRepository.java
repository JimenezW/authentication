package com.authentication.infrastructure.repository;

import com.authentication.domain.model.ApplicationM;
import com.authentication.domain.repository.ApplicationRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<ApplicationM, Long>, ApplicationRepositoryCustom {
}
