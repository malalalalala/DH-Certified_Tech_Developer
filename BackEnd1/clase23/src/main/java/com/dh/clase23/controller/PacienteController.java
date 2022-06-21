package com.dh.clase23.controller;

import com.dh.clase23.dominio.Paciente;
import com.dh.clase23.service.IPacienteServiceInterface;
import com.dh.clase23.service.PacienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//usamos @Controller cuando tenemos vistas
@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    private PacienteServiceImpl pacienteService;

    @Autowired
    public void setPacienteService(PacienteServiceImpl pacienteService) {
        this.pacienteService = pacienteService;
    }




    @GetMapping
    public List<Paciente> traerPacientes(){
        return pacienteService.listarPacientes();
    }
    @PostMapping
    public Paciente registrarNuevoPaciente(@RequestBody Paciente paciente){
        return pacienteService.guardarPaciente(paciente);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Paciente> buscarPaciente(@PathVariable int id){
        if (pacienteService.buscarPacienteXId(id)!=null){
            return ResponseEntity.ok(pacienteService.buscarPacienteXId(id));
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @PutMapping
    public ResponseEntity<Paciente> actualizarPaciente(@RequestBody Paciente paciente){
        if (pacienteService.buscarPacienteXId(paciente.getId())!=null){
            return ResponseEntity.ok(pacienteService.actualizarPaciente(paciente));
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarPaciente(@PathVariable int id){
        if (pacienteService.buscarPacienteXId(id)!=null){
            pacienteService.eliminarPaciente(id);
            return ResponseEntity.ok("Se eliminó al paciente con Id="+id);
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


    /*
    @GetMapping("/paciente")
    public String traerPacienteXEmail(Model model, @RequestParam("email") String email){
        //buscar al paciente con el correo ingresando por parametro
        Paciente paciente=pacienteService.buscarXEmail(email);
        model.addAttribute("nombre",paciente.getNombre());
        model.addAttribute("apellido",paciente.getApellido());
        return "paciente";
    }
     */
}
