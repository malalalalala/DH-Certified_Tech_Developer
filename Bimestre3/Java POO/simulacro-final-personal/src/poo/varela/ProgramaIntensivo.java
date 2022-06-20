package poo.varela;

public class ProgramaIntensivo extends CompositeOfertasAcademicas {

    private double bonificacion;

    public ProgramaIntensivo() {
        super("", "");
        this.bonificacion = 0;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularPrecio() {
        double total = 0.0;
        for (OfertaAcademica curso : getCursos()) {
            total += curso.calcularPrecio();
        }
        return total * (1 - bonificacion);
    }

    @Override
    public String toString() {
        String cursosStr = "";
        for (OfertaAcademica curso : getCursos()) {
            cursosStr += curso.toString();
        }
        return "\n--Programa: " + getNombre() +
                "\n\tDescripción: " + getDescripcion() +
                "\n\tCursos: " + cursosStr +
                "\n--Precio total del programa:\t$ " + this.calcularPrecio();
    }
}
