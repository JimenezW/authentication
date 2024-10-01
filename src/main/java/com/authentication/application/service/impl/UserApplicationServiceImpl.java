package com.authentication.application.service.impl;

import com.authentication.application.dto.UserDTO;
import com.authentication.application.service.RoleApplicationService;
import com.authentication.application.service.UserApplicationService;
import com.authentication.domain.model.User;
import com.authentication.domain.service.UserDomainService;
import org.springframework.stereotype.Service;

@Service
public class UserApplicationServiceImpl extends BaseApplicationServiceImpl<User, UserDTO, Long> implements UserApplicationService {

    protected final UserDomainService userDomainService;

    public UserApplicationServiceImpl(UserDomainService domainService){
        super(domainService);
        this.userDomainService = domainService;
    }

    @Override
    protected User mapDtoToEntity(UserDTO dto){return UserDTO.toModel(dto);}

    @Override
    protected UserDTO mapEntityToDto(User entity){return UserDTO.fromModel(entity);}
}
