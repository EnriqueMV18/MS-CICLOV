package com.example.mscliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mscliente.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
