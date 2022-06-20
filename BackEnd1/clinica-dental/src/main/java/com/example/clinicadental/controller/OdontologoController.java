package com.example.clinicadental.controller;

import com.example.clinicadental.repository.impl.OdontologoDaoH2;
import com.example.clinicadental.model.Odontologo;
import com.example.clinicadental.service.OdontologoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    private OdontologoService odontologoService=new OdontologoService(new OdontologoDaoH2());

//    @GetMapping("/{id}")
//    public ResponseEntity <Odontologo> buscarPorId(@PathVariable("id") Integer identificador){
//        return odontologoService.buscar(identificador);
//    }

//    @GetMapping
//    public List<Odontologo> buscarOdontologos(){
//        return odontologoService.buscarTodos();
//    }


    @GetMapping("/{id}")
    public ResponseEntity<Odontologo> buscar(@PathVariable Integer id){
        Odontologo odontologo = odontologoService.buscar(id);
        if(odontologo !=null){
            return ResponseEntity.ok(odontologo);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

//    @DeleteMapping("/id")
//    ResponseEntity<String> response;
//        if (service.buscar(id) != null){
//                service.eliminar(id);
//                response= ResponseEntity.status(HttpStatus.OK).body("Eliminado");
//                }else{
//                response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//                }
//                return response;

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id){
        ResponseEntity<String> response;
        if (odontologoService.buscar(id) != null){
            odontologoService.eliminar(id);
            response = ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        }else{
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).body("Registro no se encuentra en la base de datos");
        }
        return response;

    }


    @GetMapping
    public ResponseEntity<List<Odontologo>> buscarTodos(){
        return ResponseEntity.ok(odontologoService.buscarTodos());
    }


    @PostMapping
    public ResponseEntity<Odontologo> guardar(@RequestBody Odontologo odontologo){
        return ResponseEntity.ok(odontologoService.guardar(odontologo));
    }

    @PutMapping
    public ResponseEntity<Odontologo> actualizar(@RequestBody Odontologo odontologo){
        return ResponseEntity.ok(odontologoService.actualizar(odontologo));
    }

}


//    Buscar odontólogos por id
//PATH: /odontologos/{id}    Método : GET
//        Registrar un nuevo odontólogo
//        PATH: /odontologos          Metodo: POST
//        Actualizar los datos de un odontólogo ya registrado
//        PATH : /odontologos         Método : PUT
//        Eliminar un odontólogo por id
//        PATH: /odontologos/{id}    Metodo: DELETE
//        Listar todos los odontologos
//        PATH: /odontologos  Método : GET

