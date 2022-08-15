package com.example.clinicadental.service;

import com.example.clinicadental.repository.IDao;
import com.example.clinicadental.model.Turno;

import java.util.List;

public class TurnoService {

    private IDao<Turno> turnoDao;

    public TurnoService(IDao<Turno> turnoDao) {
        this.turnoDao = turnoDao;
    }

    public Turno guardar(Turno turno) {
        return turnoDao.guardar(turno);
    }

    public Turno buscar(Integer id) {
        return turnoDao.buscar(id);
    }

    public List<Turno> buscarTodos() {
        return turnoDao.buscarTodos();
    }

    public void eliminar(Integer id) {
        turnoDao.eliminar(id);
    }

    public Turno actualizar(Turno turno) {
        return turnoDao.actualizar(turno);
    }
}
