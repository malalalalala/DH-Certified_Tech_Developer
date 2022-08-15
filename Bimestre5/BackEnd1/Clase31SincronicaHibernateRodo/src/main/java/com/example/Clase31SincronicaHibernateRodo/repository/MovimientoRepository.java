package com.example.Clase31SincronicaHibernateRodo.repository;

import com.example.Clase31SincronicaHibernateRodo.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoRepository extends JpaRepository<Movimiento,Long> {
}
