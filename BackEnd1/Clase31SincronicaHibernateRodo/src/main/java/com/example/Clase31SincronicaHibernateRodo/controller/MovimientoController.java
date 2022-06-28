package com.example.Clase31SincronicaHibernateRodo.controller;

import com.example.Clase31SincronicaHibernateRodo.model.Movimiento;
import com.example.Clase31SincronicaHibernateRodo.service.IMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimientos")
public class MovimientoController {
    @Autowired
    //tambien se puede hacer con movimiento service
    private IMovimientoService movimientoService;

    @GetMapping
    public ResponseEntity<List<Movimiento>> listarTodosLosMovimientos(){
        return ResponseEntity.ok(movimientoService.listarMovimientos());
    }

    @PostMapping
    public ResponseEntity<Movimiento> guardarMovimiento(@RequestBody Movimiento movimiento){
        return ResponseEntity.ok(movimientoService.guardarMovimiento(movimiento));
    }
}
