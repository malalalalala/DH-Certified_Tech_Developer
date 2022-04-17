public class Final extends Examen implements Comparable{
    private double notaDelOral;
    private String descripcionDelTema;

    public Final(Alumno alumno, String titulo, String temaDeExamen, String enunciado, double nota, double notaDelOral, String descripcionDelTema) {
        super(alumno, titulo, temaDeExamen, enunciado, nota);
        this.notaDelOral = notaDelOral;
        this.descripcionDelTema = descripcionDelTema;
    }

    @Override
    public int compareTo(Object o) {
        double promedioEsteExamen = (super.getNota() + this.notaOral) / 2;
        Final examenComparable = (Final) o;
        double promedioComparable = (examenComparable.getNota() + examenComparable.notaOral) / 2;
        return promedioEsteExamen - promedioComparable;
    }

    @Override
    public int compareTo(Object o) {
        Final finalUno = (Final) o;
        int respuesta = 0;

        double promedioFinalUno = (finalUno.getNota() + finalUno.notaOral) / 2;
        double promedioFinalActual = (super.getNota() + this.notaOral) / 2;

        if (promedioFinalUno > promedioFinalActual) {
            respuesta = 1;
        }

        if (promedioFinalUno < promedioFinalActual) {
            respuesta = -1;
        }
        return respuesta;
    }
}
