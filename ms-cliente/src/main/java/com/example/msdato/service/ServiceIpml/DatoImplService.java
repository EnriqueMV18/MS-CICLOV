package com.example.msdato.service.ServiceIpml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msdato.entity.Dato;
import com.example.msdato.repository.DatoRepository;
import com.example.msdato.service.DatoService;

import java.util.List;
import java.util.Optional;

@Service
public class DatoImplService  implements DatoService {
    @Autowired
    private DatoRepository datoRepository;

    @Override
    public List<Dato> listar() {
        return datoRepository.findAll();
    }

    @Override
    public Dato guardar(Dato dato) {
        return datoRepository.save(dato);
    }

    @Override
    public Dato actualizar(Dato dato) {
        return datoRepository.save(dato);
    }

    @Override
    public Optional<Dato> buscarPorld(Integer id) {
        return datoRepository.findById(id);
    }

    @Override
    public void eliminarPorld(Integer id) {
        datoRepository.deleteById(id);
    }
}
