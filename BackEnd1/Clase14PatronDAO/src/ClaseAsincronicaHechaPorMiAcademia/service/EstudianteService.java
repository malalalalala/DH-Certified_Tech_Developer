package ClaseAsincronicaHechaPorMiAcademia.service;

import ClaseAsincronicaHechaPorMiAcademia.dao.IDao;
import ClaseAsincronicaHechaPorMiAcademia.dao.impl.EstudianteDaoH2;
import ClaseAsincronicaHechaPorMiAcademia.model.Estudiante;

import java.util.List;

//creo el servicio con getters y setters
public class EstudianteService {
    private IDao<Estudiante> estudianteIDao;

    public EstudianteService(IDao<Estudiante> estudianteIDao) {
        this.estudianteIDao = estudianteIDao;
    }

    public IDao<Estudiante> getEstudianteIDao() {
        return estudianteIDao;
    }

    public void setEstudianteIDao(IDao<Estudiante> estudianteIDao) {
        this.estudianteIDao = estudianteIDao;
    }

    public Estudiante guardarEstudiante(Estudiante e){
        //delegarle la responsabilidad de guardar al DAO
        return  estudianteIDao.guardar(e);
    }

    public void eliminarEstudiante(Long id){
        //delegarle la responsabilidad de eliminar al DAO
        estudianteIDao.eliminar(id);
    }

    public Estudiante buscarEstudiante(Long id){
        //delegarle la responsabilidad de buscar al DAO
        return estudianteIDao.buscar(id);
    }

    public List<Estudiante> buscarTodos(){
        //delegarle la responsabilidad de buscarTodos al DAO
        return estudianteIDao.buscarTodos();
    }

}
