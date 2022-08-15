package com.jpa.Clase31SincronicaHibernate.repository;

import com.jpa.Clase31SincronicaHibernate.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

//primer argumento es la clase y el segundo el tipo de dato del id

public interface IMovimientoRepository extends JpaRepository<Movimiento,Long> {
//

}
