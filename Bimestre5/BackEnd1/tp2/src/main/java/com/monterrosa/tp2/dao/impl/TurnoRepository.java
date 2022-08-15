package com.monterrosa.tp2.dao.impl;

import com.monterrosa.tp2.dao.IDao;
import com.monterrosa.tp2.model.Odontologo;
import com.monterrosa.tp2.model.Paciente;
import com.monterrosa.tp2.model.Turno;
import com.monterrosa.tp2.service.OdontologoService;
import com.monterrosa.tp2.service.PacienteService;

import java.util.ArrayList;
import java.util.List;

public class TurnoRepository implements IDao<Turno> {

    private List<Turno> turnos = new ArrayList<>();
    private final PacienteService pacienteService = new PacienteService(new PacienteDaoH2());
    private final OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @Override
    public Turno guardar(Turno turno) {
        if(turnos.size() == 0) turno.setId(1);
        if(turnos.size()>0){
           Integer lastIndex = turnos.get(turnos.size() - 1).getId();
           turno.setId(lastIndex + 1);
        }
        turnos.add(turno);
        return turno;
    }

    @Override
    public Turno buscar(Integer id) {
        for (Turno turno: turnos){
            if(turno.getId().equals(id)){
                return turno;
            }
        }
        return null;
    }

    @Override
    public void eliminar(Integer id) {
        Turno turno = buscar(id);
        turnos.remove(turno);
    }

    @Override
    public List<Turno> buscarTodos() {
        return turnos;
    }

    @Override
    public Turno actualizar(Turno turno) {
        int index = 0;
        for (int i = 0; i < turnos.size(); i++) {
            if (turnos.get(i).getId().equals(turno.getId())) {
                index = i;
            }
        }
        Odontologo odontologoActualizado = odontologoService.actualizar(turno.getOdontologo());
        Paciente pacienteActualizado = pacienteService.actualizar(turno.getPaciente());
        turno.setOdontologo(odontologoActualizado);
        turno.setPaciente(pacienteActualizado);
        turnos.set(index, turno);
        return turno;
    }
}
