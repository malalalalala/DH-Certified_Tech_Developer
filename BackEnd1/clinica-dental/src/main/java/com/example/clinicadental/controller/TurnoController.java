package com.example.clinicadental.controller;

import com.example.clinicadental.repository.impl.TurnoDAO;
import com.example.clinicadental.model.Turno;
import com.example.clinicadental.service.TurnoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    private TurnoService turnoService=new TurnoService(new TurnoDAO());

    @GetMapping
    public ResponseEntity<List<Turno>> buscarTodos(){
        return ResponseEntity.ok(turnoService.buscarTodos());
    }

    public  ResponseEntity <Turno> registarrTurno(Turno turno){
        return ResponseEntity.ok(turnoService.guardar(turno));
    }
}
