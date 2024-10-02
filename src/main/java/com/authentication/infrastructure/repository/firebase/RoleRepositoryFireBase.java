package com.authentication.infrastructure.repository.firebase;

import com.authentication.domain.model.Role;
import com.authentication.infrastructure.repository.RoleRepository;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RoleRepositoryFireBase implements RoleRepository {
    private final DatabaseReference databaseReference;

    public RoleRepositoryFireBase() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        this.databaseReference = firebaseDatabase.getReference("roles");
    }

    @Override
    public Optional<Role> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Role save(Role entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<Role> findAll() {
        return List.of();
    }

    @Override
    public Page<Role> findAllByCriteria(Object criteria, Pageable pageable) {
        return null;
    }

}
