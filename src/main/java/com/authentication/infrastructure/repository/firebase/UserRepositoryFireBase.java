package com.authentication.infrastructure.repository.firebase;

import com.authentication.domain.model.User;
import com.authentication.infrastructure.repository.UserRepository;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryFireBase implements UserRepository {

    private final DatabaseReference databaseReference;

    public UserRepositoryFireBase() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        this.databaseReference = firebaseDatabase.getReference("roles");
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public User save(User entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public Page<User> findAllByCriteria(Object criteria, Pageable pageable) {
        return null;
    }
}
