package com.example.msdato.service;

import java.util.List;
import java.util.Optional;

import com.example.msdato.entity.Dato;


public interface DatoService {
    List<Dato> listar();
    Dato guardar (Dato dato);
    Dato actualizar (Dato dato);
    Optional<Dato> buscarPorld(Integer id);
    void eliminarPorld(Integer id);


}
