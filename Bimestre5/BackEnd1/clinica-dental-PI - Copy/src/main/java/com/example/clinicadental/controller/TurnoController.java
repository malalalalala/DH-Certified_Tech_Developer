package com.example.clinicadental.controller;


import com.example.clinicadental.model.Turno;
import com.example.clinicadental.repository.impl.OdontologoDaoH2;
import com.example.clinicadental.repository.impl.PacienteDaoH2;
import com.example.clinicadental.repository.impl.TurnoRepository;
import com.example.clinicadental.service.OdontologoService;
import com.example.clinicadental.service.PacienteService;
import com.example.clinicadental.service.TurnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    private TurnoService turnoService=new TurnoService(new TurnoRepository());

    private PacienteService pacienteService= new PacienteService(new PacienteDaoH2());

    private OdontologoService odontologoService=new OdontologoService(new OdontologoDaoH2());

    @GetMapping
    public ResponseEntity<List<Turno>> buscarTodos(){
        return ResponseEntity.ok(turnoService.buscarTodos());

    }

    @PostMapping
    public ResponseEntity<Turno> registrarTurno(@RequestBody Turno turno){
        ResponseEntity<Turno> respuesta;
        if (pacienteService.buscar(turno.getPaciente().getId())!=null && odontologoService
                .buscar(turno.getOdontologo().getId())!=null){
            respuesta=ResponseEntity.ok(turnoService.guardar(turno));
        }
        else{
            respuesta=ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return respuesta;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turno> buscarTurno(@PathVariable int id) {
        if (turnoService.buscar(id) != null) {
            return ResponseEntity.ok(turnoService.buscar(id));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping
    public ResponseEntity<Turno> actualizarTurno(@RequestBody Turno turno){
        ResponseEntity<Turno> respuesta;
        if (pacienteService.buscar(turno.getPaciente().getId())!=null && odontologoService
                .buscar(turno.getOdontologo().getId())!=null){
            respuesta=ResponseEntity.ok(turnoService.actualizar(turno));
        }
        else{
            respuesta=ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return respuesta;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarTurno(@PathVariable int id){
        if(turnoService.buscar(id)!=null){
            turnoService.eliminar(id);
            return ResponseEntity.ok("Se eliminó el turno con id="+id);
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se eliminó " +
                    "el turno con id="+id+" al no ser encontrado");
        }
    }


}

