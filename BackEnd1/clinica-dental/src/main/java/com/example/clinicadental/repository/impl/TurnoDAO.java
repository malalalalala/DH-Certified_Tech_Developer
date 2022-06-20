package com.example.clinicadental.repository.impl;

import com.example.clinicadental.repository.IDao;
import com.example.clinicadental.model.Turno;

import java.util.ArrayList;
import java.util.List;

public class TurnoDAO implements IDao<Turno> {

    private List<Turno> turnos=new ArrayList<>();
    @Override
    public Turno guardar(Turno turno) {
        turnos.add(turno);
        return null;
    }

    @Override
    public Turno buscar(Integer id) {
        for (Turno turno:turnos
             ) { if (turno.getId().equals(id)){
                 return turno; }
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
        int index = -1;
        for (int i = 0; i < turnos.size(); i++) {
            if (turnos.get(i).getId().equals(turno.getId())) {
                index = i;
            }
        }
        turnos.set(index, turno);
        return turno;
    }

}
