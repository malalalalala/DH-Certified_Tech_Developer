package com.example.clinicadental.service;


import com.example.clinicadental.exceptions.ResourceNotFoundException;
import com.example.clinicadental.exceptions.SQLIntegrityViolationException;
import com.example.clinicadental.model.Odontologo;
import com.example.clinicadental.repository.OdontologoRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OdontologoService {


    private OdontologoRepository odontologoRepository;

    public OdontologoService(OdontologoRepository odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }

    public Odontologo guardar(Odontologo odontologo){
        //delegarle la responsabilidad de guardar al Repository
        return  odontologoRepository.save(odontologo);
    }

    public Odontologo buscar(Integer id) {
//        return odontologoRepository.findById(id).get();
        Odontologo odontologo=null;
        Optional<Odontologo> optionalPaciente=odontologoRepository.findById(id);
        if (optionalPaciente.isPresent()){
            odontologo=optionalPaciente.get();
        }
        return  odontologo;
    }
    public List<Odontologo> buscarTodos(){
        //delegarle la responsabilidad de listarTodos al Repository
        return odontologoRepository.findAll();
    }

    public void eliminar(Integer id) throws ResourceNotFoundException, SQLIntegrityViolationException {
//        odontologoRepository.deleteById(id);
//        if (this.buscar(id)==null){
//            throw new ResourceNotFoundException("No se eliminó el odontólogo con id="+id+" al no ser encontrado en la base de datos...");
//
//        }else {
//            odontologoRepository.deleteById(id);
//        }

        try {  if (this.buscar(id)==null)
            throw new ResourceNotFoundException("No se eliminó el odontólogo con id="+id+" ya que no existe en la base de datos");
        odontologoRepository.deleteById(id);    }

        catch (DataIntegrityViolationException e){
            throw new SQLIntegrityViolationException("El odontólogo tiene turno asignado, primero elimine el turno");
        }
    }

    public Odontologo actualizar(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }




}
