package com.authentication.infrastructure.config;

import com.authentication.infrastructure.repository.firebase.RoleRepositoryFireBase;
import com.authentication.infrastructure.repository.mysql.RoleRepositoryMySql;
import com.authentication.infrastructure.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class RoleRepositoryConfig {

    @Autowired
    private RoleRepositoryMySql roleRepositoryMySql;

    @Autowired
    private RoleRepositoryFireBase roleRepositoryFireBase;

    @Autowired
    private Environment env;

    @Bean
    public RoleRepository roleRepository() {
        String activeProfile = env.getActiveProfiles()[0];

        if ("mysql".equalsIgnoreCase(activeProfile)) {
            return roleRepositoryMySql;
        } else if ("firebase".equalsIgnoreCase(activeProfile)) {
            return roleRepositoryFireBase;
        }

        throw new IllegalStateException("No valid profile found for database configuration.");
    }
}
