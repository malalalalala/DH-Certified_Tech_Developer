package ClaseAsincronicaHechaPorMiAcademia;

import ClaseAsincronicaHechaPorMiAcademia.dao.impl.EstudianteDaoH2;
import ClaseAsincronicaHechaPorMiAcademia.model.Estudiante;
import ClaseAsincronicaHechaPorMiAcademia.service.EstudianteService;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante=new Estudiante(1L,"Laura","Ramos");
        Estudiante estudiante2=new Estudiante(2L,"Cielo","Agudelo");
        Estudiante estudiante3=new Estudiante(3L,"Carlos","Echavarria");

        EstudianteService estudianteService=new EstudianteService(new EstudianteDaoH2());

        estudianteService.guardarEstudiante(estudiante);
        estudianteService.guardarEstudiante(estudiante2);
        estudianteService.guardarEstudiante(estudiante3);

        estudianteService.eliminarEstudiante(1L);

        estudianteService.buscarTodos();
        estudianteService.buscarEstudiante(3L);

    }
}
