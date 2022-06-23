package com.example.C32S.controller;

import com.example.C32S.dto.RestarCantidadDTO;
import com.example.C32S.model.Producto;
import com.example.C32S.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    //Se inyecta la dependencia
    @Autowired
    private ProductoService productoService;


    @PostMapping("/productos")
    public Producto guardar(@RequestBody Producto producto){
        return productoService.crearProducto(producto);
    }

    @GetMapping("/productos")
    public List<Producto> obtenerProductos(){
        return productoService.obtenerProductos();
    }

    @GetMapping("/productosEnStock")
    public List<Producto> productosEnStock(){
        return productoService.enStock();
    }

    @DeleteMapping("/productos/{id}")
        public void eliminarPorId(@PathVariable Long id) {
        productoService.elminarElProducto(id);
    }

    @PatchMapping("/productos/{id}")
    public ResponseEntity<Producto> restarCantidadPorId(@PathVariable Long id , @RequestBody RestarCantidadDTO restarcantidad){
        return productoService.restarCantidadPorId(id, restarcantidad);
    }


}
