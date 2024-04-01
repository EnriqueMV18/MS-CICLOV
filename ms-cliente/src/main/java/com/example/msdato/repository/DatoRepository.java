package com.example.msdato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.msdato.entity.Dato;

public interface DatoRepository extends JpaRepository<Dato, Integer> {
}
