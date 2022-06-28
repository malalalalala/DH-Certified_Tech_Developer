package com.monterrosa.tp2.controller;

import com.monterrosa.tp2.dao.impl.PacienteDaoH2;
import com.monterrosa.tp2.model.Paciente;
import com.monterrosa.tp2.service.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    private final PacienteService service = new PacienteService(new PacienteDaoH2());

    @PostMapping
    public ResponseEntity<Paciente> guardar(@RequestBody Paciente paciente){
        return ResponseEntity.ok(service.guardar(paciente)) ;
    }

    @DeleteMapping
    public ResponseEntity<String> eliminar(@RequestParam Integer id){
        ResponseEntity<String> response;
        if (service.buscar(id) != null){
            service.eliminar(id);
            response= ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        }else{
            response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @GetMapping(path = "/")
    public ResponseEntity<Paciente> buscar(@RequestParam Integer id){
        Paciente paciente = service.buscar(id);
        if (paciente != null){
            return ResponseEntity.ok(paciente);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> buscarTodos(){
        return ResponseEntity.ok(service.buscarTodos());
    }

    @PutMapping
    public ResponseEntity<Paciente> actualizar(@RequestBody Paciente paciente){
        ResponseEntity<Paciente> response;
        if (paciente.getId() != null && service.buscar(paciente.getId()) != null){
            response= ResponseEntity.ok(service.actualizar(paciente));
        }else{
            response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

}
