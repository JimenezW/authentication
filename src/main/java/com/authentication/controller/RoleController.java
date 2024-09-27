package com.authentication.controller;

import com.authentication.application.dto.RoleDTO;
import com.authentication.application.service.RoleApplicationService;
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

    @PutMapping
    public void updateRole(@RequestParam(required = true) Long id, @RequestBody RoleDTO role){
        roleService.update(id, role);
    }

    // Endpoint de paginación con filtro
    @GetMapping("/paginated")
    public ResponseEntity<List<RoleDTO>> getPaginatedRoles(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(defaultValue = "id") String sortField,
            @RequestParam(defaultValue = "asc") String sortDirection) {

        // Invocamos el servicio de aplicación para obtener la lista paginada
        List<RoleDTO> roles = roleService.filterPagination(pageNumber, pageSize, sortField, sortDirection);
        return ResponseEntity.ok(roles);
    }

}
