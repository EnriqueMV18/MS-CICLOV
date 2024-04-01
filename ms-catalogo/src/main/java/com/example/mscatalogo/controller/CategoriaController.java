package com.example.mscatalogo.controller;

import com.example.mscatalogo.entity.Categoria;
import com.example.mscatalogo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping()
    public ResponseEntity<List<Categoria>>list(){
        return ResponseEntity.ok().body(categoriaService.listar());
    }
    @PostMapping()
    public ResponseEntity<Categoria>save(@RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriaService.guardar(categoria));
    }
    @PutMapping()
    public  ResponseEntity<Categoria>update(@RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriaService.actualizar(categoria));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Categoria>listById(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(categoriaService.buscarPorld(id).get());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Categoria>> eliminar(@PathVariable(required = true) Integer id){
        categoriaService.eliminarPorld(id);
        return ResponseEntity.ok(categoriaService.listar());

    }
}
