package com.example.secure.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.secure.model.User;
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}