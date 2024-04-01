package com.example.mscliente.service;

import java.util.List;
import java.util.Optional;

import com.example.mscliente.entity.Dato;


public interface DatoService {
    List<Dato> listar();
    Dato guardar (Dato dato);
    Dato actualizar (Dato dato);
    Optional<Dato> buscarPorld(Integer id);
    void eliminarPorld(Integer id);


}
