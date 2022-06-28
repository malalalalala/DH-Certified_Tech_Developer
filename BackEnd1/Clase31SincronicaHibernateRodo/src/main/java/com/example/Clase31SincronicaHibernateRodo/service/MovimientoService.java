package com.example.Clase31SincronicaHibernateRodo.service;

import com.example.Clase31SincronicaHibernateRodo.model.Movimiento;
import com.example.Clase31SincronicaHibernateRodo.repository.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovimientoService implements IMovimientoService{
    @Autowired
    private MovimientoRepository movimientoRepository;

    @Override
    public Movimiento guardarMovimiento(Movimiento movimiento) {
        return movimientoRepository.save(movimiento);
    }

    @Override
    public List<Movimiento> listarMovimientos() {
        return movimientoRepository.findAll();
    }
}
