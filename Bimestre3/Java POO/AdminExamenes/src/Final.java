public class Final extends Examen implements Comparable{
    private double notaOral;
    private String descripcionTemaOral;

    public Final(Alumno alumno, String titulo, String enunciado, double nota, double notaOral, String descripcionTemaOral) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionTemaOral = descripcionTemaOral;
    }

    public double getNotaOral() {
        return notaOral;
    }

//    @Override
//    public int compareTo(Object o) {
//        double notaPromedioExamenActual=(this.getNotaOral()+super.getNota())/2;
//        double notaPromedioExamenAComparar=((Final)o).getNotaOral()+((Final)o).getNota()/2;
//        return (int) (notaPromedioExamenActual-notaPromedioExamenAComparar);
//    }

    @Override
    public int compareTo(Object o) {
        Final aComparar = (Final) o;
        int respuesta = 0;
        if(((super.getNota() + this.notaOral) / 2)  > ((aComparar.getNota() + aComparar.getNotaOral()) / 2)){
            respuesta = 1;
        }
        if(((super.getNota() + this.notaOral) / 2)  < ((aComparar.getNota() + aComparar.getNotaOral()) / 2)){
            respuesta = -1;
        }
        return respuesta;
    }
}
