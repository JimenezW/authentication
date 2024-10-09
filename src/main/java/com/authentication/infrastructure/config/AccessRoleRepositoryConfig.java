package com.authentication.infrastructure.config;

import com.authentication.domain.model.mysql.AccessRoleMySql;
import com.authentication.infrastructure.repository.AccessRoleRepository;
import com.authentication.infrastructure.repository.RoleRepository;
import com.authentication.infrastructure.repository.firebase.AccessRoleRepositoryFireBase;
import com.authentication.infrastructure.repository.mysql.AccessRoleRepositoryMySql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AccessRoleRepositoryConfig {

    @Autowired
    private AccessRoleRepositoryMySql accessRoleMySql;

    @Autowired
    private AccessRoleRepositoryFireBase roleRepositoryFireBase;

    @Autowired
    private Environment env;

    @Bean
    public AccessRoleRepository roleRepository() {
        String activeProfile = env.getActiveProfiles()[0];

        if ("mysql".equalsIgnoreCase(activeProfile)) {
            return accessRoleMySql;
        } else if ("firebase".equalsIgnoreCase(activeProfile)) {
            return roleRepositoryFireBase;
        }

        throw new IllegalStateException("No valid profile found for database configuration.");
    }

}
