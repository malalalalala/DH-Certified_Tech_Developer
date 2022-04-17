public abstract class Examen {
    private Alumno alumno;
    private String titulo;
    private String enunciado;
    private double nota;
    private static final double NOTA_MINIMA_APROBACION=4;

    public Examen(Alumno alumno, String titulo, String enunciado, double nota) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public boolean examenAprobado(){
        return this.nota>NOTA_MINIMA_APROBACION;
    }
}
