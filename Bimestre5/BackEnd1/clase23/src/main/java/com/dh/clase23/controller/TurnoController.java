package com.dh.clase23.controller;

import com.dh.clase23.repository.PacienteDAOH2;
import com.dh.clase23.repository.TurnoDAO;
import com.dh.clase23.dominio.Turno;
import com.dh.clase23.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    private ITurnoService turnoService=new TurnoServiceImpl(new TurnoDAO());
    private IPacienteServiceInterface pacienteService= new PacienteServiceImpl(new PacienteDAOH2());
    @Autowired
    private IOdontologoService odontologoService;
    @GetMapping
    public ResponseEntity<List<Turno>> traerTurnos(){
        return ResponseEntity.ok(turnoService.listarTurnos());
    }
    @PostMapping
    public ResponseEntity<Turno> registrarTurno(@RequestBody Turno turno){
        ResponseEntity<Turno> respuesta;
        if (pacienteService.buscarPacienteXId(turno.getPaciente().getId())!=null && odontologoService
                .buscarXId(turno.getOdontologo().getId())!=null){
            respuesta=ResponseEntity.ok(turnoService.guardarTurno(turno));
        }
        else{
            respuesta=ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return respuesta;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Turno> buscarTurno(@PathVariable int id){
        if (turnoService.buscarTurnoXId(id)!=null){
            return ResponseEntity.ok(turnoService.buscarTurnoXId(id));
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @PutMapping
    public ResponseEntity<Turno> actualizarTurno(@RequestBody Turno turno){
        ResponseEntity<Turno> respuesta;
        if (pacienteService.buscarPacienteXId(turno.getPaciente().getId())!=null && odontologoService
                .buscarXId(turno.getOdontologo().getId())!=null){
            respuesta=ResponseEntity.ok(turnoService.actualizarTurno(turno));
        }
        else{
            respuesta=ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return respuesta;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarTurno(@PathVariable int id){
       if(turnoService.buscarTurnoXId(id)!=null){
           turnoService.eliminarTurno(id);
           return ResponseEntity.ok("Se eliminó el turno con id="+id);
       }
       else{
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se eliminó " +
                   "el turno con id="+id+" al no ser encontrado");
       }
    }
}
