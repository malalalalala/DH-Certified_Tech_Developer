package com.example.Clase31SincronicaHibernateRodo.service;

import com.example.Clase31SincronicaHibernateRodo.model.Movimiento;

import java.util.List;

public interface IMovimientoService {
    Movimiento guardarMovimiento(Movimiento movimiento);
    List<Movimiento> listarMovimientos();
}
