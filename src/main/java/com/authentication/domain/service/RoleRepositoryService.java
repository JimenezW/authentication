package com.authentication.domain.service;

import com.authentication.domain.model.Role;
import com.authentication.infrastructure.repository.RoleRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class RoleRepositoryService {

    private  final RoleRepository _roleRepository;


    @Transactional
    public Role createRole(Role role) {
        return _roleRepository.save(role);
    }

    public Optional<Role> getRoleById(Long id) {
        return _roleRepository.findById(id);
    }

    public List<Role> getAllRoles() {
        return _roleRepository.findAll();
    }

    @Transactional
    public void deleteRole(Long id) {
        _roleRepository.deleteById(id);
    }
}
