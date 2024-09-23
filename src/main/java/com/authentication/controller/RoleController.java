package com.authentication.controller;

import com.authentication.application.dto.RoleDTO;
import com.authentication.application.service.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RoleController {
    private final RoleService _roleService;

    public RoleController(RoleService roleService) {
        _roleService = roleService;
    }

    @GetMapping
    public ResponseEntity<RoleDTO> test(){
        return ResponseEntity.ok(_roleService.createRole());
    }
}
