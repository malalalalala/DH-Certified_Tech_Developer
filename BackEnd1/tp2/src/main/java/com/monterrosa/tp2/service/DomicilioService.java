package com.monterrosa.tp2.service;

import com.monterrosa.tp2.dao.IDao;
import com.monterrosa.tp2.model.Domicilio;

import java.util.List;

public class DomicilioService {
    private final IDao<Domicilio> domicilioDao;

    public DomicilioService(IDao<Domicilio> domicilioDao) {
        this.domicilioDao = domicilioDao;
    }
    public Domicilio guardar(Domicilio d){
        domicilioDao.guardar(d);
        return d;
    }
    public Domicilio buscar(Integer id){
        return domicilioDao.buscar(id);
    }
    public List<Domicilio> buscarTodos(){
        return domicilioDao.buscarTodos();
    }
    public void eliminar(Integer id){
        domicilioDao.eliminar(id);
    }
    public Domicilio actualizar(Domicilio domicilio) { return domicilioDao.actualizar(domicilio);}

}
