package com.authentication.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiHome {

    private static final Logger log = LoggerFactory.getLogger(apiHome.class);

    @GetMapping("/")
    public String api(){
        log.info("Accediendo a la API home");
        return "api-online authentication";
    }

}
