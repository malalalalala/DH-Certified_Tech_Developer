package com.example.clinicadental.service;




import com.example.clinicadental.repository.DomicilioRepository;
import com.example.clinicadental.repository.IDao;
import com.example.clinicadental.model.Domicilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Table;
import java.util.List;
@Service


public class DomicilioService {
//    private IDao<Domicilio> domicilioDao;
    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioService(DomicilioRepository domicilioRepository) {
        this.domicilioRepository = domicilioRepository;
    }

    public Domicilio guardar(Domicilio d){
//        domicilioDao.guardar(d);
//        return d;
       return domicilioRepository.save(d);
    }
    public Domicilio buscar(Integer id){
//        return domicilioDao.buscar(id);
        return domicilioRepository.findById(id).get();//
    }
    public List<Domicilio> buscarTodos(){
        return domicilioRepository.findAll();
    }
    public void eliminar(Integer id){
        domicilioRepository.deleteById(id);
    }

}
