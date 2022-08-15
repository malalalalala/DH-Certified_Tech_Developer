package com.example.Clase34ALoAprendido.service;

import com.example.Clase34ALoAprendido.model.CursadaDTO;
import org.springframework.stereotype.Service;

import java.util.Set;
//@Service

public interface ICursadaService {
    void crearCursada(CursadaDTO cursadaDTO);
    CursadaDTO leerCursada(Long id);
    void modificarCursada(CursadaDTO cursadaDTO);
    void eliminarCursada(Long id);
    Set<CursadaDTO> obtenerTodos();
}
