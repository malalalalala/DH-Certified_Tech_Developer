package com.dh.clase23.controller;

import com.dh.clase23.dominio.Odontologo;
import com.dh.clase23.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    private IOdontologoService odontologoService;

    @Autowired
    public OdontologoController(IOdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }

    @GetMapping("/{id}")
    public Odontologo buscarOdontologoXId(@PathVariable int id ){
        return odontologoService.buscarXId(id);
    }

    /*
    @GetMapping
    public String traerOdontologoXId(Model model, @RequestParam("id") int id){
        Odontologo odontologo=odontologoService.buscarXId(id);
        model.addAttribute("matricula",odontologo.getMatricula());
        return "odontologo";
    }

     */
}
