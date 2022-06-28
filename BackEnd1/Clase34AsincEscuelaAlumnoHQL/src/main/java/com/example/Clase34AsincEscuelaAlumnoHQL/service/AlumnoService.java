package com.example.Clase34AsincEscuelaAlumnoHQL.service;

import com.example.Clase34AsincEscuelaAlumnoHQL.model.Alumno;
import com.example.Clase34AsincEscuelaAlumnoHQL.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AlumnoService implements IAlumnoService{

    @Autowired
    private AlumnoRepository alumnoRepository;

    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @Override
    public Alumno guardarAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }


    public Alumno buscarXNombre(String nombre) {
        //pregunta, en el video ponen .get(9 porque es optional pero a mi no me lo reconoce
        return alumnoRepository.buscarAlumno(nombre).get();
    }

}
