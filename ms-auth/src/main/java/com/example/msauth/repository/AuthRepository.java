package com.example.msauth.repository;

import com.example.msauth.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthRepository  extends JpaRepository<Auth, Integer> {
    Optional<Auth> findByUserName(String userName);
}
