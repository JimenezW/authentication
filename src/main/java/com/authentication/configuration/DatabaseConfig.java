package com.authentication.configuration;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class DatabaseConfig {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseConfig.class);

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void validateConnection() {
        try (Connection connection = DataSourceUtils.getConnection(dataSource)) {
            if (connection.isValid(2)) {
                logger.info("Conexión a la base de datos exitosa.");
            } else {
                logger.error("La conexión a la base de datos no es válida.");
            }
        } catch (SQLException e) {
            logger.error("Error al intentar conectar a la base de datos: {}", e.getMessage());
        }
    }
}
