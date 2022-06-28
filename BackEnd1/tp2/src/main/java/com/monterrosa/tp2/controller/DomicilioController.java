package com.monterrosa.tp2.controller;

import com.monterrosa.tp2.dao.impl.DomicilioDaoH2;
import com.monterrosa.tp2.model.Domicilio;
import com.monterrosa.tp2.service.DomicilioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController {
    private final DomicilioService domicilioService = new DomicilioService(new DomicilioDaoH2());

    @PostMapping
    public ResponseEntity<Domicilio> guardar(@RequestBody Domicilio domicilio){
        return ResponseEntity.ok(domicilioService.guardar(domicilio)) ;
    }

    @DeleteMapping
    public ResponseEntity<String> eliminar(@RequestParam Integer id){
        ResponseEntity<String> response;
        if (domicilioService.buscar(id) != null){
            domicilioService.eliminar(id);
            response= ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        }else{
            response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @GetMapping(path = "/")
    public ResponseEntity<Domicilio> buscar(@RequestParam Integer id){
        Domicilio domicilio = domicilioService.buscar(id);
        if (domicilio != null){
            return ResponseEntity.ok(domicilio);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Domicilio>> buscarTodos(){
        return ResponseEntity.ok(domicilioService.buscarTodos());
    }

    @PutMapping
    public ResponseEntity<Domicilio> actualizar(@RequestBody Domicilio domicilio){
        ResponseEntity<Domicilio> response;
        if (domicilio.getId() != null && domicilioService.buscar(domicilio.getId()) != null){
            response= ResponseEntity.ok(domicilioService.actualizar(domicilio));
        }else{
            response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

}
