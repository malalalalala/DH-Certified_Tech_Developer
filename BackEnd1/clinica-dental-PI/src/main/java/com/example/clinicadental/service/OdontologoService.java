package com.example.clinicadental.service;


import com.example.clinicadental.model.Paciente;
import com.example.clinicadental.repository.IDao;
import com.example.clinicadental.model.Odontologo;
import com.example.clinicadental.repository.OdontologoRepository;
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

    public void eliminar(Integer id) {
        odontologoRepository.deleteById(id);
    }

    public Odontologo actualizar(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }




}
