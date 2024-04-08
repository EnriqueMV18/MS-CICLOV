package com.example.msproducto.controller;

import com.example.msproducto.entity.Producto;
import com.example.msproducto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> listar() {
        return ResponseEntity.ok(productoService.listar());
    }

    @PostMapping
    public ResponseEntity<Producto> guardar(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.guardar(producto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> buscarPOrId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(productoService.buscarPorId(id).get());
    }

    @PutMapping
    public ResponseEntity<Producto> actualizar(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.actualizar(producto));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Producto>> eliminar(@PathVariable(required = true) Integer id) {
        productoService.eliminar(id);
        return ResponseEntity.ok(productoService.listar());
    }
}
