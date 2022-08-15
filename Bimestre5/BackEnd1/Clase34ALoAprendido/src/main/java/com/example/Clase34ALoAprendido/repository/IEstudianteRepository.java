package com.example.Clase34ALoAprendido.repository;

import com.example.Clase34ALoAprendido.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante,Long> {
}
