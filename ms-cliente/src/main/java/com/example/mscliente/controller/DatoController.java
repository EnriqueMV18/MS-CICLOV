package com.example.mscliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.mscliente.entity.Dato;
import com.example.mscliente.service.DatoService;

import java.util.List;

@RestController
@RequestMapping("/datos")
public class DatoController {
    @Autowired
    private DatoService datoService;

    @GetMapping()
    public ResponseEntity<List<Dato>> list() {
        return ResponseEntity.ok().body(datoService.listar());
    }

    @PostMapping()
    public ResponseEntity<Dato> save(@RequestBody Dato dato) {
        return ResponseEntity.ok(datoService.guardar(dato));
    }

    @PutMapping()
    public ResponseEntity<Dato> update(@RequestBody Dato dato) {
        return ResponseEntity.ok(datoService.actualizar(dato));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dato> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(datoService.buscarPorld(id).get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Dato>> eliminar(@PathVariable(required = true) Integer id) {
        datoService.eliminarPorld(id);
        return ResponseEntity.ok(datoService.listar());
    }
}
