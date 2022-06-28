package com.example.clinicadental.service;


import com.example.clinicadental.repository.IDao;
import com.example.clinicadental.model.Odontologo;

import java.util.List;

public class OdontologoService {

    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public IDao<Odontologo> getOdontologoIDao() {
        return odontologoIDao;
    }

    public void setOdontologoIDao(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo guardar(Odontologo odontologo){
        //delegarle la responsabilidad de guardar al Repository
        return  odontologoIDao.guardar(odontologo);
    }

    public Odontologo buscar(Integer id) {
        return odontologoIDao.buscar(id);
    }
    public List<Odontologo> buscarTodos(){
        //delegarle la responsabilidad de listarTodos al Repository
        return odontologoIDao.buscarTodos();
    }

    public void eliminar(Integer id) {
        odontologoIDao.eliminar(id);
    }

    public Odontologo actualizar(Odontologo odontologo) {
        return odontologoIDao.actualizar(odontologo);
    }




}
