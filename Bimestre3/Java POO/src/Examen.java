
public abstract class Examen {
    private Alumno alumno;
    private String titulo;
    private String temaDeExamen;
    private String enunciado;
    private double nota;

    public Examen(Alumno alumno, String titulo, String temaDeExamen, String enunciado, double nota) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.temaDeExamen = temaDeExamen;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }



    public boolean estaAprobado(){
        return getNota() >= 4;
    }
}


