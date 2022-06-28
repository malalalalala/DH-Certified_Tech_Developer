package com.example.Clase34ALoAprendido.service;

import com.example.Clase34ALoAprendido.model.Estudiante;
import com.example.Clase34ALoAprendido.model.EstudianteDTO;
import com.example.Clase34ALoAprendido.repository.IEstudianteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

//Si pongo service me salta un error
@Service
public class EstudianteService implements IEstudianteService{

    @Autowired
    private IEstudianteRepository estudianteRepository;

    @Autowired
    ObjectMapper mapper;



    @Override
    public void crearEstudiante(EstudianteDTO estudianteDTO) {
        //debemos transformar en estudianteDTO a Estudiante que es lo que recibe el repository

        //el convert se encarga de asignar las propiedades que se llaman iguales y va asignando valores
//        Estudiante estudiante=mapper.convertValue(estudianteDTO,Estudiante.class);
//        estudianteRepository.save(estudiante);
        guardarEstudiante(estudianteDTO);

    }

    @Override
    public EstudianteDTO leerEstudiante(Long id) {

        //optional nos permite preguntar si el objeto tiene o no contenido

       Optional<Estudiante> estudiante= estudianteRepository.findById(id);
       EstudianteDTO estudianteDTO=null;
        if (estudiante.isPresent()){
            estudianteDTO=mapper.convertValue(estudiante,EstudianteDTO.class);

        }
        return estudianteDTO;
    }

    private  void guardarEstudiante(EstudianteDTO estudianteDTO){
        Estudiante estudiante=mapper.convertValue(estudianteDTO,Estudiante.class);
        estudianteRepository.save(estudiante);

    }

    @Override
    public void modificarEstudiante(EstudianteDTO estudianteDTO) {
        guardarEstudiante(estudianteDTO);
    }

    @Override
    public void eliminarEstudiante(Long id) {

        estudianteRepository.deleteById(id);

    }

    @Override
    public Set<EstudianteDTO> obtenerTodos() {

        List<Estudiante> estudiantes= estudianteRepository.findAll();
        Set<EstudianteDTO> estudiantesDTO=new HashSet<>();

        for (Estudiante estudiante:estudiantes
             ) {
            estudiantesDTO.add(mapper.convertValue(estudiante,EstudianteDTO.class));

        }
        return estudiantesDTO;
    }
}
