package com.example.Clase34ALoAprendido.service;

import com.example.Clase34ALoAprendido.model.EstudianteDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EstudianteServiceTest {

    @Autowired
    private  IEstudianteService estudianteService;



    @Test
    void crearEstudiante() {

        EstudianteDTO estudianteDTO=new EstudianteDTO();
        estudianteDTO.setNombre("Laura");
        estudianteDTO.setApellido("Ramos");
        estudianteService.crearEstudiante(estudianteDTO);

        EstudianteDTO estudianteLaura= estudianteService.leerEstudiante(1L);

        assertTrue(estudianteLaura!=null);
    }

//    @Test
//    void leerEstudiante() {
//    }
//
//    @Test
//    void modificarEstudiante() {
//    }
//
//    @Test
//    void eliminarEstudiante() {
//    }
//
//    @Test
//    void obtenerTodos() {
//    }
}