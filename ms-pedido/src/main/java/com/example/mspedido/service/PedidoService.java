package com.example.mspedido.service;

import java.util.List;
import java.util.Optional;

import com.example.mspedido.entity.Pedido;

public interface PedidoService {
    public List<Pedido> listar();

    public Pedido guardar(Pedido pedido);

    public Optional<Pedido> buscarPorId(Integer id);

    public Pedido actualizar(Pedido pedido);

    public void eliminar(Integer id);
}
