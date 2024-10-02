package com.authentication.configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.io.FileInputStream;
import java.io.IOException;

@Configuration
@Profile("firebase")
public class FireBaseConfig {
    private static final Logger logger = LoggerFactory.getLogger(FireBaseConfig.class);

    @Bean
    public FirebaseApp firebaseApp() throws IOException {
        FileInputStream serviceAccount = new FileInputStream("src/main/resources/access-firebase.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://portafolio-bb170-default-rtdb.firebaseio.com")
                .build();


        return FirebaseApp.initializeApp(options);
    }

    @PostConstruct
    public void validateConnection(){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("ping");
        ref.setValue("pong", (error, ref1) -> {
            if (error != null) {
                logger.info("No se pudo escribir el valor: " + error.getMessage());
            } else {
                logger.info("No se pudo escribir el valor: " + error.getMessage());
            }
        });
    }

}
