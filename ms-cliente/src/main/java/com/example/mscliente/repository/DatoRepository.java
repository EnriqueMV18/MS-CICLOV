package com.example.mscliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mscliente.entity.Dato;

public interface DatoRepository extends JpaRepository<Dato, Integer> {
}
