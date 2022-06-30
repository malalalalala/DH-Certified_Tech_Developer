package com.example.clinicadental.controller;

import com.example.clinicadental.repository.impl.PacienteDaoH2;
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
    public Paciente buscarPorId(@PathVariable("id") Integer identificador){
        return pacienteService.buscar(identificador);
    }

//    @DeleteMapping("/{id}")
//    public void eliminarPorId(@PathVariable("id") Integer identificador){
//        pacienteService.eliminar(identificador);
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarPorId(@PathVariable("id") Integer identificador){
        ResponseEntity response=null;
        if(pacienteService.buscar(identificador)==null){
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se eliminó " +
                    "el paciente con id="+identificador+" al no ser encontrado en la base de datos");
        }else {
            pacienteService.eliminar(identificador);
            response = ResponseEntity.status(HttpStatus.OK).body("Se eliminó el odontólogo con id="+identificador);
        }
        return response;
    }

    @PutMapping
    public ResponseEntity<Paciente> actualizar(@RequestBody Paciente paciente){
        ResponseEntity response=null;
        if (pacienteService.buscar(paciente.getId())!=null && paciente.getId()!=null){
         pacienteService.actualizar(paciente);
           response=new ResponseEntity(pacienteService.actualizar(paciente),HttpStatus.OK);}
        else{
//            pacienteService.actualizar(paciente);
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

//    @PutMapping
//    public  ResponseEntity<Paciente>actualizarPaciente(@RequestBody Paciente paciente){
//        ResponseEntity response=null;
//
//        if (pacienteService.buscar(paciente.getId())==null ){
//            response=new ResponseEntity(HttpStatus.NOT_FOUND);
//        }else {
//            pacienteService.actualizar(paciente);
//            response=new ResponseEntity(pacienteService.actualizar(paciente),HttpStatus.OK);
//        }
//
//        return response;
//    }

//    @PutMapping
//    public  ResponseEntity<Paciente>actualizarPaciente(@RequestBody Paciente paciente){
//        ResponseEntity response=null;
//
//        if (pacienteService.buscar(paciente.getId())!=null && paciente.getId()!=null){
//            pacienteService.actualizar(paciente);
//            response=new ResponseEntity(pacienteService.actualizar(paciente),HttpStatus.OK);
//        }else {
//            response=new ResponseEntity(HttpStatus.NOT_FOUND);
//
//        }
//
//        return response;
//    }



}
