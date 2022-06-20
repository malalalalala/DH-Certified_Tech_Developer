package com.example.entrenador.controler;

import com.example.entrenador.modelo.Entrenador;
import com.example.entrenador.services.EntrenadorServices;
import com.example.entrenador.services.impl.EntrenadorServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//con esto le digo que es un controller
@RestController
@RequestMapping("entrenador")
public class EntrenadorController {
    private EntrenadorServices entrenadorService=new EntrenadorServiceImpl();

    //este método es para que lo escuche desde la vista
    @GetMapping
    public List<Entrenador> getEntrenadores(){
        return entrenadorService.listarEntrenadores();
    }

}
