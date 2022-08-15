package com.dh.clase23.service;

import com.dh.clase23.dominio.Odontologo;

import java.util.List;

public interface IOdontologoService {
    List<Odontologo> listarOdontologos();
    Odontologo buscarXId(int id);
    Odontologo actualizarOdontologo(Odontologo odontologo);
    void eliminarOdontologo(int id);
    Odontologo guardarOdontologo(Odontologo odontologo);
}
