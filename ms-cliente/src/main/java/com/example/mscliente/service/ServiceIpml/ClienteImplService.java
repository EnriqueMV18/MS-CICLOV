package com.example.mscliente.service.ServiceIpml;

import com.example.mscliente.entity.Cliente;
import com.example.mscliente.repository.ClienteRepository;
import com.example.mscliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteImplService  implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> buscarPorld(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public void eliminarPorld(Integer id) {
        clienteRepository.deleteById(id);
    }
}
