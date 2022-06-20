package com.example.Clase25asincronicaMedicamentos.controller;

import com.example.Clase25asincronicaMedicamentos.dao.impl.MedicamentoDaoH2;
import com.example.Clase25asincronicaMedicamentos.model.Medicamento;
import com.example.Clase25asincronicaMedicamentos.service.MedicamentoService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    private MedicamentoService medicamentoService=new MedicamentoService(new MedicamentoDaoH2());

    @PostMapping("/registrar")
    public Medicamento guardar(@RequestBody Medicamento medicamento) {
        return medicamentoService.guardar(medicamento);
    }

    @GetMapping("/{id}")
    public Medicamento buscar(@PathVariable("id") Integer identificador)  {
        return medicamentoService.buscar(identificador);
    }
}
