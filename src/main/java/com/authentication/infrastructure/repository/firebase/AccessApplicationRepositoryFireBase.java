package com.authentication.infrastructure.repository.firebase;

import com.authentication.domain.model.AccessApplication;
import com.authentication.infrastructure.repository.AccessApplicationRepository;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AccessApplicationRepositoryFireBase implements AccessApplicationRepository {

    private final DatabaseReference databaseReference;

    public AccessApplicationRepositoryFireBase() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        this.databaseReference = firebaseDatabase.getReference("AccessApplication");
    }

    @Override
    public Optional<AccessApplication> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public AccessApplication save(AccessApplication entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<AccessApplication> findAll() {
        return List.of();
    }

    @Override
    public Page<AccessApplication> findAllByCriteria(Object criteria, Pageable pageable) {
        return null;
    }
}
