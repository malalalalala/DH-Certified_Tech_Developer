package com.example.Clase34AsincEscuelaAlumnoHQL.service;

import com.example.Clase34AsincEscuelaAlumnoHQL.model.Alumno;

import java.util.List;

public interface IAlumnoService {

    Alumno guardarAlumno(Alumno alumno);
    List<Alumno> listarAlumnos();


}
