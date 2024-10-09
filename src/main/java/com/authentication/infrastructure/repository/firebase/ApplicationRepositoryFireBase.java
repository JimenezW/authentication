package com.authentication.infrastructure.repository.firebase;

import com.authentication.domain.model.Application;
import com.authentication.infrastructure.repository.ApplicationRepository;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public class ApplicationRepositoryFireBase implements ApplicationRepository {

    private final DatabaseReference databaseReference;

    public ApplicationRepositoryFireBase() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        this.databaseReference = firebaseDatabase.getReference("Application");
    }

    @Override
    public Optional<Application> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Application save(Application entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<Application> findAll() {
        return List.of();
    }

    @Override
    public Page<Application> findAllByCriteria(Object criteria, Pageable pageable) {
        return null;
    }
}
