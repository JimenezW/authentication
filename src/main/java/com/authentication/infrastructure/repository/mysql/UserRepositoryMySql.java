package com.authentication.infrastructure.repository.mysql;

import com.authentication.domain.model.User;
import com.authentication.infrastructure.repository.UserRepository;
import com.authentication.infrastructure.repository.mysql.jpaEntity.jpaUserMySql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryMySql implements UserRepository {

    private final jpaUserMySql jpaUser;

    public UserRepositoryMySql(jpaUserMySql jpa){
        jpaUser = jpa;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public User save(User entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public Page<User> findAllByCriteria(Object criteria, Pageable pageable) {
        return null;
    }
}
