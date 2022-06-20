package poo.varela;

public class Carrera extends CompositeOfertasAcademicas {

    private double precioBase;

    public Carrera() {
        super("", "");
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public double calcularPrecio() {
        double total = 0.0;
        for (OfertaAcademica curso : getCursos()) {
            total += curso.calcularPrecio();
        }
        return total + precioBase;
    }

    // OPCION 1:
    @Override
    public void agregar(OfertaAcademica oferta) throws Exception {
        try {
            if (((Curso)oferta).getCargaHorariaMensual() < 10) {
                throw new CarreraCargaHorariaCursoException("El curso no puede tener menos de 10 hs de carga mensual");
            }
        } catch(ClassCastException err) {
            System.err.println("No se puede castear porque no es un Curso");
        }
        super.agregar(oferta);
    }

    // OPCION 2:
//    @Override
//    public void agregar(OfertaAcademica oferta) throws Exception {
//        Curso curso = null;
//        try {
//            curso = (Curso)oferta;
//        } catch(Exception err) {
//            System.err.println(err.getMessage());
//        }
//        if (curso != null) {
//            if (curso.getCargaHorariaMensual() < 10) {
//                throw new CarreraCargaHorariaCursoException("El curso no puede tener menos de 10 hs de carga mensual");
//            }
//        }
//        super.agregar(oferta);
    }

    @Override
    public String toString() {
        String cursosStr = "";
        for (OfertaAcademica curso : getCursos()) {
            cursosStr += curso.toString();
        }
        return "\n--Carrera: " + getNombre() +
                "\n\tDescripción: " + getDescripcion() +
                "\n\tCursos y talleres: " + cursosStr +
                "\n--Precio total de la carrera:\t$ " + this.calcularPrecio();
    }
}
