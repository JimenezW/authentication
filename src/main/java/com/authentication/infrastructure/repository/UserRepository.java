package com.authentication.infrastructure.repository;

import com.authentication.domain.model.User;
import com.authentication.domain.repository.UserRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>, UserRepositoryCustom {
}
