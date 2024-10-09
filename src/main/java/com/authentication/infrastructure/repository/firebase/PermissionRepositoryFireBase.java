package com.authentication.infrastructure.repository.firebase;

import com.authentication.domain.model.Permission;
import com.authentication.infrastructure.repository.PermissionRepository;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PermissionRepositoryFireBase implements PermissionRepository {

    private final DatabaseReference databaseReference;

    public PermissionRepositoryFireBase() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        this.databaseReference = firebaseDatabase.getReference("roles");
    }

    @Override
    public Optional<Permission> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Permission save(Permission entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<Permission> findAll() {
        return List.of();
    }

    @Override
    public Page<Permission> findAllByCriteria(Object criteria, Pageable pageable) {
        return null;
    }
}
