package com.authentication.infrastructure.config;

import com.authentication.infrastructure.repository.AssignmentUserRoleRepository;
import com.authentication.infrastructure.repository.firebase.AssignmentUserRoleRepositoryFireBase;
import com.authentication.infrastructure.repository.mysql.AssignmentUserRoleRepositoryMySql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AssiggnmentUserRoleRepositoryConfig {

    @Autowired
    private Environment env;

    @Autowired
    private AssignmentUserRoleRepositoryMySql assignmentUserRoleMySql;

    @Autowired
    private AssignmentUserRoleRepositoryFireBase roleRepositoryFireBase;

    @Bean
    public AssignmentUserRoleRepository repositoryConfig() {
        String activeProfile = env.getActiveProfiles()[0];

        if ("mysql".equalsIgnoreCase(activeProfile)) {
            return assignmentUserRoleMySql;
        } else if ("firebase".equalsIgnoreCase(activeProfile)) {
            return roleRepositoryFireBase;
        }

        throw new IllegalStateException("No valid profile found for database configuration.");
    }

}
