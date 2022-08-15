package com.example.clinicadental.service;




import com.example.clinicadental.exceptions.ResourceNotFoundException;
import com.example.clinicadental.exceptions.SQLIntegrityViolationException;
import com.example.clinicadental.model.Paciente;
import com.example.clinicadental.repository.PacienteRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
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

    public Paciente buscar(Integer id)  {
        Paciente paciente=null;
        Optional<Paciente> optionalPaciente=pacienteRepository.findById(id);
        if (optionalPaciente.isPresent())
            paciente=optionalPaciente.get();
        return  paciente;
    }

    public List<Paciente> buscarTodos() {
        return pacienteRepository.findAll();
    }

    public void eliminar(Integer id) throws ResourceNotFoundException, SQLIntegrityViolationException {
        try{         if (this.buscar(id)==null)
            throw new ResourceNotFoundException("el paciente con id "+id+" no existe en la base de datos");
            pacienteRepository.deleteById(id);   }
        catch (DataIntegrityViolationException e){
            throw new SQLIntegrityViolationException("El paciente tiene turno asignado, primero elimine el turno");
        }

    }

    public Paciente actualizar(Paciente p) {
        return pacienteRepository.save(p);
    }
}
