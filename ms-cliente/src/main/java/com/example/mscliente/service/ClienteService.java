package com.example.mscliente.service;

import com.example.mscliente.entity.Cliente;


import java.util.List;
import java.util.Optional;


public interface ClienteService {
    List<Cliente> listar();
    Cliente guardar (Cliente cliente);
    Cliente actualizar (Cliente cliente);
    Optional<Cliente> buscarPorld(Integer id);
    void eliminarPorld(Integer id);


}
