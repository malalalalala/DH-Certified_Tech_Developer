package com.example.Clase25asincronicaMedicamentos.service;


import com.example.Clase25asincronicaMedicamentos.dao.IDao;
import com.example.Clase25asincronicaMedicamentos.model.Medicamento;

import java.sql.SQLException;

public class MedicamentoService {
    //Atributos
    private IDao<Medicamento> medicamentoDao;

    public MedicamentoService(IDao<Medicamento> medicamentoDao) {
        this.medicamentoDao = medicamentoDao;
    }

    //Operaciones
    public Medicamento guardar(Medicamento medicamento) {
     return medicamentoDao.guardar(medicamento);
    }

    public Medicamento buscar(Integer id)  {
        return medicamentoDao.buscar(id);
    }

}
