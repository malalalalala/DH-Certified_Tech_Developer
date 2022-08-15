package com.monterrosa.tp2.controller;

import com.monterrosa.tp2.dao.impl.OdontologoDaoH2;
import com.monterrosa.tp2.model.Odontologo;
import com.monterrosa.tp2.service.OdontologoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    private final OdontologoService service = new OdontologoService(new OdontologoDaoH2());

    @PostMapping
    public ResponseEntity<Odontologo> guardar(@RequestBody Odontologo odontologo){
        return ResponseEntity.ok(service.guardar(odontologo)) ;
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
    public ResponseEntity<Odontologo> buscar(@RequestParam Integer id){
        Odontologo odontologo = service.buscar(id);
        if (odontologo != null){
            return ResponseEntity.ok(odontologo);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Odontologo>> buscarTodos(){
        return ResponseEntity.ok(service.buscarTodos());
    }

    @PutMapping
    public ResponseEntity<Odontologo> actualizar(@RequestBody Odontologo odontologo){
        ResponseEntity<Odontologo> response;
        if (odontologo.getId() != null && service.buscar(odontologo.getId()) != null){
            response= ResponseEntity.ok(service.actualizar(odontologo));
        }else{
            response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

}
