package com.authentication.domain.service.impl;

import com.authentication.domain.model.User;
import com.authentication.domain.service.UserDomainService;
import com.authentication.infrastructure.repository.mysql.jpaEntity.jpaUserMySql;
import org.springframework.stereotype.Service;

@Service
public class UserDomainServiceImpl extends BaseRepoServiceImpl<User, Long> implements UserDomainService {
    protected final jpaUserMySql userRepository;

    public UserDomainServiceImpl(jpaUserMySql repository){
        super(repository);
        userRepository = repository;
    }

}
