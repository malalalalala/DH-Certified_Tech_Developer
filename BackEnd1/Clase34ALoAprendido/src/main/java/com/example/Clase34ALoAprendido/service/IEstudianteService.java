package com.example.Clase34ALoAprendido.service;

import com.example.Clase34ALoAprendido.model.EstudianteDTO;
import org.springframework.stereotype.Service;

import java.util.Set;

//@Service
public interface IEstudianteService {
    void crearEstudiante(EstudianteDTO estudianteDTO);
    EstudianteDTO leerEstudiante(Long id);
    void modificarEstudiante(EstudianteDTO estudianteDTO);
    void eliminarEstudiante(Long id);
    Set<EstudianteDTO> obtenerTodos();
}
