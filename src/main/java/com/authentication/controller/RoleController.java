package com.authentication.controller;

import com.authentication.application.dto.RoleDTO;
import com.authentication.application.service.RoleApplicationService;
import com.authentication.application.service.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    protected final RoleApplicationService roleService;

    public RoleController(RoleApplicationService service) {
        roleService = service;
    }

    @PostMapping
    public RoleDTO createRole(@RequestBody RoleDTO roleDTO) {
        return roleService.create(roleDTO);
    }

    @GetMapping("/{id}")
    public RoleDTO getRoleById(@PathVariable Long id) {
        return roleService.findById(id).orElseThrow(() -> new RuntimeException("Role not found"));
    }

    @GetMapping
    public List<RoleDTO> getAllRoles() {
        return roleService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Long id) {
        roleService.deleteById(id);
    }
}
