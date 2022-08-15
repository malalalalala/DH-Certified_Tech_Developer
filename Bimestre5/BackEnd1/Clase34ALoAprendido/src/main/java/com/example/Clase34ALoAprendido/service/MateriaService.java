package com.example.Clase34ALoAprendido.service;

import com.example.Clase34ALoAprendido.model.Materia;
import com.example.Clase34ALoAprendido.model.MateriaDTO;
import com.example.Clase34ALoAprendido.model.MateriaDTO;
import com.example.Clase34ALoAprendido.repository.IMateriaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class MateriaService implements IMateriaService{
    @Autowired
    private IMateriaRepository materiaRepository;

    @Autowired
    ObjectMapper mapper;

    private  void guardarMateria(MateriaDTO materiaDTO){
        Materia materia=mapper.convertValue(materiaDTO,Materia.class);
        materiaRepository.save(materia);

    }


    @Override
    public void crearMateria(MateriaDTO materiaDTO) {
        guardarMateria(materiaDTO);
    }

    @Override
    public MateriaDTO leerMateria(Long id) {
        Optional<Materia> materia= materiaRepository.findById(id);
        MateriaDTO materiaDTO=null;
        if (materia.isPresent()){
            materiaDTO=mapper.convertValue(materia,MateriaDTO.class);

        }
        return materiaDTO;
    }

    @Override
    public void modificarMateria(MateriaDTO materiaDTO) {

            guardarMateria(materiaDTO);

    }

    @Override
    public void eliminarMateria(Long id) {
        materiaRepository.deleteById(id);

    }

    @Override
    public Set<MateriaDTO> obtenerTodos() {
        List<Materia> materias= materiaRepository.findAll();
        Set<MateriaDTO> materiasDTO=new HashSet<>();

        for (Materia materia:materias
        ) {
            materiasDTO.add(mapper.convertValue(materia,MateriaDTO.class));

        }
        return materiasDTO;
    
    }
}
