package com.authentication.domain.service.impl;

import com.authentication.domain.model.User;
import com.authentication.domain.service.UserDomainService;
import com.authentication.infrastructure.repository.UserRepository;

public class UserDomainServiceImpl extends BaseRepoServiceImpl<User, Long> implements UserDomainService {
    protected final UserRepository userRepository;

    public UserDomainServiceImpl(UserRepository repository){
        super(repository);
        userRepository = repository;
    }

}
