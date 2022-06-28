package com.monterrosa.tp2.service;

import com.monterrosa.tp2.dao.IDao;
import com.monterrosa.tp2.model.Odontologo;

import java.util.List;

public class OdontologoService {
    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo guardar (Odontologo odontologo){
        return odontologoIDao.guardar(odontologo);
    }

    public Odontologo buscar (Integer id){
        return odontologoIDao.buscar(id);
    }

    public List<Odontologo> buscarTodos (){
        return odontologoIDao.buscarTodos();
    }

    public Odontologo actualizar(Odontologo odontologo){return odontologoIDao.actualizar(odontologo);}

    public void eliminar(Integer id){
        odontologoIDao.eliminar(id);
    }
}
