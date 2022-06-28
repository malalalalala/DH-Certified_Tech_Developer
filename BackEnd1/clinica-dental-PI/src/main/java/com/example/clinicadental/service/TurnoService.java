package com.example.clinicadental.service;

import com.example.clinicadental.model.Paciente;
import com.example.clinicadental.repository.IDao;
import com.example.clinicadental.model.Turno;
import com.example.clinicadental.repository.PacienteRepository;
import com.example.clinicadental.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TurnoService {

//    private IDao<Turno> turnoDao;
private TurnoRepository turnoRepository;


    public TurnoService(TurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }

//    public TurnoService(IDao<Turno> turnoDao) {
//        this.turnoDao = turnoDao;
//    }

    public Turno guardar(Turno turno) {
        turno.setFecha(new Date());
        return turnoRepository.save(turno);
    }

    public Turno buscar(Integer id) {
        Turno turno=null;
        Optional<Turno> optionalTurno=turnoRepository.findById(id);
        if (optionalTurno.isPresent()){
            turno=optionalTurno.get();
        }
        return  turno;
    }

    public List<Turno> buscarTodos() {
        return turnoRepository.findAll();
    }

    public void eliminar(Integer id) {
        turnoRepository.deleteById(id);
    }

    public Turno actualizar(Turno turno) {
        return turnoRepository.save(turno);
    }
}
