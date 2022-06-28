package com.example.Clase34ALoAprendido.service;

import com.example.Clase34ALoAprendido.model.CursadaDTO;

import java.util.Set;

public interface ICursadaService {
    void crearCursada(CursadaDTO cursadaDTO);
    CursadaDTO leerCursada(Long id);
    void modificarCursada(CursadaDTO cursadaDTO);
    void eliminarCursada(Long id);
    Set<CursadaDTO> obtenerTodos();
}
