package com.example.Clase34AsincEscuelaAlumnoHQL.repository;

import com.example.Clase34AsincEscuelaAlumnoHQL.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
public interface AlumnoRepository extends JpaRepository<Alumno,Long> {


    @Query("SELECT a FROM Alumno a where a.nombre = ?1")
    Optional <Alumno> buscarAlumno(String nombre);


}
