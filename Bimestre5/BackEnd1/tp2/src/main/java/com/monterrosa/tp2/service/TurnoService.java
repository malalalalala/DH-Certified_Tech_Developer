package com.monterrosa.tp2.service;

import com.monterrosa.tp2.dao.IDao;
import com.monterrosa.tp2.model.Turno;

import java.util.List;

public class TurnoService {

    private IDao<Turno> turnoIDao;

    public TurnoService(IDao<Turno> turnoIDao) {
        this.turnoIDao = turnoIDao;
    }

    public Turno guardar (Turno turno){
        return turnoIDao.guardar(turno);
    }

    public Turno buscar (Integer id){
        return turnoIDao.buscar(id);
    }

    public List<Turno> buscarTodos (){
        return turnoIDao.buscarTodos();
    }

    public Turno actualizar(Turno turno){return turnoIDao.actualizar(turno);}

    public void eliminar(Integer id){
        turnoIDao.eliminar(id);
    }
}
