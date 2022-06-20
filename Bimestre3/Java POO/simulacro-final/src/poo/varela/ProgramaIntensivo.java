package poo.varela;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica {

    private double bonificacion;
    private List<OfertaAcademica> cursos;

    public ProgramaIntensivo() {
        super("", "");
        this.bonificacion = 0;
        this.cursos = new ArrayList<>();
    }

    public ProgramaIntensivo(String nombre, String descripcion, double bonificacion) {
        super(nombre, descripcion);
        this.bonificacion = bonificacion;
        this.cursos = new ArrayList<>();
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public void setCursos(List<OfertaAcademica> cursos) {
        this.cursos = cursos;
    }

    @Override
    public double calcularPrecio() {
        double total = 0.0;
        for (OfertaAcademica curso : cursos) {
            total += curso.calcularPrecio();
        }
        return total * (1 - bonificacion);
    }

    public void agregar(OfertaAcademica curso) {
        this.cursos.add(curso);
    }

    @Override
    public String toString() {
        String cursosStr = "";
        for (OfertaAcademica curso : cursos) {
            cursosStr += curso.toString();
        }
        return "\n--Programa: " + getNombre() +
                "\n\tDescripción: " + getDescripcion() +
                "\n\tCursos: " + cursosStr +
                "\n--Precio total del programa:\t$ " + this.calcularPrecio();
    }
}
