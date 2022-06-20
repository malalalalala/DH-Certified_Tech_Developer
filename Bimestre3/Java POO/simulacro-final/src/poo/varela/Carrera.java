package poo.varela;

import java.util.ArrayList;
import java.util.List;

public class Carrera extends OfertaAcademica {

    private double precioBase;
    private List<OfertaAcademica> cursos;

    public Carrera() {
        super("", "");
        this.cursos = new ArrayList<>();
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
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
        return total + precioBase;
    }

    public void agregar(Curso curso) throws Exception {
        if (curso.getCargaHorariaMensual() < 10) {
            throw new Exception("El curso no puede tener menos de 10 hs de carga mensual");
        }
        this.cursos.add(curso);
    }

    public void agregar(OfertaAcademica oferta) {
        this.cursos.add(oferta);
    }

    @Override
    public String toString() {
        String cursosStr = "";
        for (OfertaAcademica curso : cursos) {
            cursosStr += curso.toString();
        }
        return "\n--Carrera: " + getNombre() +
                "\n\tDescripción: " + getDescripcion() +
                "\n\tCursos y talleres: " + cursosStr +
                "\n--Precio total de la carrera:\t$ " + this.calcularPrecio();
    }
}
