package com.example.clinicadental.service;




import com.example.clinicadental.repository.DomicilioRepository;
import com.example.clinicadental.repository.IDao;
import com.example.clinicadental.model.Paciente;
import com.example.clinicadental.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service

public class PacienteService {

   // private IDao<Paciente> pacienteIDao;
   private PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    //    public PacienteService(IDao<Paciente> pacienteIDao) {
//        this.pacienteIDao = pacienteIDao;
//    }

    public Paciente guardar(Paciente p) {
        p.setFechaIngreso(new Date());
        return pacienteRepository.save(p);
    }

    public Paciente buscar(Integer id) {
        Paciente paciente=null;
        Optional<Paciente> optionalPaciente=pacienteRepository.findById(id);
        if (optionalPaciente.isPresent()){
            paciente=optionalPaciente.get();
        }
        return  paciente;
    }

    public List<Paciente> buscarTodos() {
        return pacienteRepository.findAll();
    }

    public void eliminar(Integer id) {
        pacienteRepository.deleteById(id);
    }

    public Paciente actualizar(Paciente p) {
        return pacienteRepository.save(p);
    }
}
