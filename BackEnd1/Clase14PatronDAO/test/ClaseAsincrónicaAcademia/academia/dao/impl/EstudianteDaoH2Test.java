package ClaseAsincrónicaAcademia.academia.dao.impl;

import ClaseAsincrónicaAcademia.academia.dao.IDao;
import ClaseAsincrónicaAcademia.academia.model.Estudiante;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class EstudianteDaoH2Test{
    private  static IDao<Estudiante> estudianteDao = new EstudianteDaoH2();

    @BeforeClass
    public static void cargarEstudiantes() {
        estudianteDao.guardar(new Estudiante(1L, "EstudianteUno", "ApellidoUno"));
        estudianteDao.guardar(new Estudiante(2L, "EstudianteDos", "ApellidoDos"));
        estudianteDao.guardar(new Estudiante(3L, "EstudianteTres", "ApellidoTres"));
        estudianteDao.guardar(new Estudiante(4L, "EstudianteCuatro", "ApellidoCuatro"));
    }

    @Test
    public  void guardarYBuscarEstudiantesTest() {
        estudianteDao.guardar(new Estudiante(5L, "Tomas", "Pereyra"));
        Estudiante estudiante = estudianteDao.buscar(5L);
        Assert.assertNotNull(estudiante);
        Assert.assertEquals(estudiante.getNombre(), "Tomas");

    }

    @Test
    public  void traerTodosLosEstudiantesTest() {
        List<Estudiante> estudiantes = estudianteDao.buscarTodos();
        Assert.assertTrue(estudiantes.size() > 0);
    }

    @Test
    public void eliminarEstudiantesTest() {
        estudianteDao.eliminar(1L);
        Assert.assertEquals(estudianteDao.buscar(1L),null);
        estudianteDao.eliminar(2L);
        Assert.assertEquals(estudianteDao.buscar(2L),null);
        estudianteDao.eliminar(3L);
        Assert.assertEquals(estudianteDao.buscar(3L),null);
        estudianteDao.eliminar(4L);
        Assert.assertEquals(estudianteDao.buscar(4L),null);
        estudianteDao.eliminar(5L);
        Assert.assertEquals(estudianteDao.buscar(5L),null);


    }

}