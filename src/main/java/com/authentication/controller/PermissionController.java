package com.authentication.controller;

import com.authentication.application.dto.PermissionDTO;
import com.authentication.application.service.PermissionApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permissions")
public class PermissionController {

    protected final PermissionApplicationService aplicacionService;

    public PermissionController(PermissionApplicationService aplicacionService){
        this.aplicacionService = aplicacionService;
    }

    @PostMapping
    public PermissionDTO createRole(@RequestBody PermissionDTO dto) {
        return aplicacionService.create(dto);
    }

    @GetMapping("/{id}")
    public PermissionDTO getRoleById(@PathVariable Long id) {
        return aplicacionService.findById(id).orElseThrow(() -> new RuntimeException("Role not found"));
    }

    @GetMapping
    public List<PermissionDTO> getAllRoles() {
        return aplicacionService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Long id) {
        aplicacionService.deleteById(id);
    }

    @PutMapping
    public void updateRole(@RequestParam(required = true) Long id, @RequestBody PermissionDTO role){
        aplicacionService.update(id, role);
    }

    // Endpoint de paginación con filtro
    @GetMapping("/paginated")
    public ResponseEntity<List<PermissionDTO>> getPaginatedRoles(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(defaultValue = "id") String sortField,
            @RequestParam(defaultValue = "asc") String sortDirection) {

        // Invocamos el servicio de aplicación para obtener la lista paginada
        List<PermissionDTO> roles = aplicacionService.filterPagination(pageNumber, pageSize, sortField, sortDirection);
        return ResponseEntity.ok(roles);
    }

}
