package com.example.clinicadental.controller;

import com.example.clinicadental.exceptions.ResourceNotFoundException;
import com.example.clinicadental.exceptions.SQLIntegrityViolationException;
import com.example.clinicadental.model.Paciente;
import com.example.clinicadental.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> buscarPacientes(){
        return pacienteService.buscarTodos();
    }

    @PostMapping
    public Paciente registrar(@RequestBody Paciente paciente){
        return pacienteService.guardar(paciente);
    }



    @GetMapping("/{id}")
    public ResponseEntity<Paciente> buscarPorId(@PathVariable("id") Integer identificador){
        if (pacienteService.buscar(identificador) != null){
            return ResponseEntity.accepted().body(pacienteService.buscar(identificador));
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarPorId(@PathVariable("id") Integer identificador) throws ResourceNotFoundException, SQLIntegrityViolationException {

        pacienteService.eliminar(identificador);
            return ResponseEntity.status(HttpStatus.OK).body("Se eliminó el paciente con id="+identificador);


    }

    @PutMapping
    public ResponseEntity<Paciente> actualizar(@RequestBody Paciente paciente) throws ResourceNotFoundException {
        ResponseEntity response=null;
        if (pacienteService.buscar(paciente.getId())!=null && paciente.getId()!=null){
         pacienteService.actualizar(paciente);
           response=new ResponseEntity(pacienteService.actualizar(paciente),HttpStatus.OK);}
        else{

            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }





}
