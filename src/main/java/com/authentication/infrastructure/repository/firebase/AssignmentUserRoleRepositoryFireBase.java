package com.authentication.infrastructure.repository.firebase;

import com.authentication.domain.model.AssignmentUserRole;
import com.authentication.infrastructure.repository.AssignmentUserRoleRepository;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AssignmentUserRoleRepositoryFireBase implements AssignmentUserRoleRepository {
    private final DatabaseReference databaseReference;

    public AssignmentUserRoleRepositoryFireBase() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        this.databaseReference = firebaseDatabase.getReference("AssignmentUserRole");
    }

    @Override
    public Optional<AssignmentUserRole> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public AssignmentUserRole save(AssignmentUserRole entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<AssignmentUserRole> findAll() {
        return List.of();
    }

    @Override
    public Page<AssignmentUserRole> findAllByCriteria(Object criteria, Pageable pageable) {
        return null;
    }
}
