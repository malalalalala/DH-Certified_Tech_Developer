package com.example.Clase34AsincEscuelaAlumnoHQL.repository;

import com.example.Clase34AsincEscuelaAlumnoHQL.model.Alumno;
import com.example.Clase34AsincEscuelaAlumnoHQL.model.Escuela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EscuelaRepository extends JpaRepository<Escuela,Long> {

        @Query("SELECT e FROM Escuela e where e.nombre = ?1")
        Optional<Escuela> buscarEscuelas(String direccion);
        }
