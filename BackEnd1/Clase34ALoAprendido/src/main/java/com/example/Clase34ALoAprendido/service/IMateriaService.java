package com.example.Clase34ALoAprendido.service;

import com.example.Clase34ALoAprendido.model.MateriaDTO;
import org.springframework.stereotype.Service;

import java.util.Set;
//@Service
public interface IMateriaService {
    void crearMateria(MateriaDTO estudianteDTO);
    MateriaDTO leerMateria(Long id);
    void modificarMateria(MateriaDTO estudianteDTO);
    void eliminarMateria(Long id);
    Set<MateriaDTO> obtenerTodos();
}
