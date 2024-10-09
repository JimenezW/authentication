package com.authentication.infrastructure.repository.firebase;

import com.authentication.domain.model.AccessRole;
import com.authentication.infrastructure.repository.AccessRoleRepository;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public class AccessRoleRepositoryFireBase implements AccessRoleRepository {

    private final DatabaseReference databaseReference;

    public AccessRoleRepositoryFireBase() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        this.databaseReference = firebaseDatabase.getReference("accessRole");
    }

    @Override
    public Optional<AccessRole> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public AccessRole save(AccessRole entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<AccessRole> findAll() {
        return List.of();
    }

    @Override
    public Page<AccessRole> findAllByCriteria(Object criteria, Pageable pageable) {
        return null;
    }
}
