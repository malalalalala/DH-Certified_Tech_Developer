package com.monterrosa.tp2.controller;

import com.monterrosa.tp2.dao.impl.OdontologoDaoH2;
import com.monterrosa.tp2.dao.impl.PacienteDaoH2;
import com.monterrosa.tp2.dao.impl.TurnoRepository;
import com.monterrosa.tp2.dto.turno.CreateTurnoDto;
import com.monterrosa.tp2.dto.turno.UpdateTurnoDto;
import com.monterrosa.tp2.model.Odontologo;
import com.monterrosa.tp2.model.Paciente;
import com.monterrosa.tp2.model.Turno;
import com.monterrosa.tp2.service.OdontologoService;
import com.monterrosa.tp2.service.PacienteService;
import com.monterrosa.tp2.service.TurnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    private final TurnoService turnoService = new TurnoService(new TurnoRepository());
    private final PacienteService pacienteService = new PacienteService(new PacienteDaoH2());
    private final OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @GetMapping
    public ResponseEntity<List<Turno>> buscarTodos(){
        return ResponseEntity.ok(turnoService.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<Turno> guardar(@RequestBody CreateTurnoDto turno){
        Paciente paciente = pacienteService.buscar(turno.getPacienteId());
        Odontologo odontologo = odontologoService.buscar(turno.getOdontologoId());
        if(paciente == null || odontologo == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        Turno turnoAGuardar = new Turno(paciente, odontologo, turno.getFecha());
        return ResponseEntity.ok(turnoService.guardar(turnoAGuardar)) ;
    }

    @DeleteMapping
    public ResponseEntity<String> eliminar(@RequestParam Integer id){
        ResponseEntity<String> response;
        if (turnoService.buscar(id) != null){
            turnoService.eliminar(id);
            response= ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        }else{
            response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @GetMapping(path = "/")
    public ResponseEntity<Turno> buscar(@RequestParam Integer id){
        Turno turno = turnoService.buscar(id);
        if (turno != null){
            return ResponseEntity.ok(turno);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PutMapping
    public ResponseEntity<Turno> actualizar(@RequestBody UpdateTurnoDto turno){
        ResponseEntity<Turno> response;
        Paciente paciente = pacienteService.buscar(turno.getPacienteId());
        Odontologo odontologo = odontologoService.buscar(turno.getOdontologoId());
        if(turno.getId() == null || paciente == null || odontologo == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        if (turno.getId() != null && turnoService.buscar(turno.getId()) != null){
            Turno turnoAGuardar = new Turno(turno.getId(), paciente, odontologo, turno.getFecha());
            response= ResponseEntity.ok(turnoService.actualizar(turnoAGuardar));
        }else{
            response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }
}
