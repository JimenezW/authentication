package com.authentication.controller;

import io.swagger.v3.oas.annotations.Hidden;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Hidden
@RestController
public class apiHome {

    private static final Logger log = LoggerFactory.getLogger(apiHome.class);

    @GetMapping("/")
    public String api(){
        log.info("Accediendo a la API home");
        return "api-online authentication";
    }

}
