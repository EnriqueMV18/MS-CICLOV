package com.example.mspedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mspedido.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
