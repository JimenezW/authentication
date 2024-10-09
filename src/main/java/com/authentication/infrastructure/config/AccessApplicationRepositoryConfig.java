package com.authentication.infrastructure.config;

import com.authentication.infrastructure.repository.AccessApplicationRepository;
import com.authentication.infrastructure.repository.RoleRepository;
import com.authentication.infrastructure.repository.firebase.AccessApplicationRepositoryFireBase;
import com.authentication.infrastructure.repository.mysql.AccessApplicacionRepositoryMySql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AccessApplicationRepositoryConfig {

    @Autowired
    private Environment env;

    @Autowired
    private AccessApplicacionRepositoryMySql applicacionRepositoryMySql;

    @Autowired
    private AccessApplicationRepositoryFireBase applicationRepositoryFireBase;

    @Bean
    public AccessApplicationRepository repositoryConfig() {
        String activeProfile = env.getActiveProfiles()[0];

        if ("mysql".equalsIgnoreCase(activeProfile)) {
            return applicacionRepositoryMySql;
        } else if ("firebase".equalsIgnoreCase(activeProfile)) {
            return applicationRepositoryFireBase;
        }

        throw new IllegalStateException("No valid profile found for database configuration.");
    }
}
