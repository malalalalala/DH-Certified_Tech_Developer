package service;

import dao.IDao;
import model.Odontologo;

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

    public Odontologo registrar(Odontologo odontologo){
        //delegarle la responsabilidad de guardar al DAO
        return  odontologoIDao.registrar(odontologo);
    }

    public List<Odontologo> listarTodos(){
        //delegarle la responsabilidad de listarTodos al DAO
        return odontologoIDao.listarTodos();
    }
}
