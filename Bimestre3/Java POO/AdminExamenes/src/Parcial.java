public class Parcial extends Examen{
    private int numeroUnidad;
    private int numeroReintentos;

    public Parcial(Alumno alumno, String titulo, String enunciado, double nota, int numeroUnidad, int numeroReintentos) {
        super(alumno, titulo, enunciado, nota);
        this.numeroUnidad = numeroUnidad;
        this.numeroReintentos = numeroReintentos;
    }

    public boolean esPosibleSeguirRecuperando(){
        if(this.numeroUnidad<=3&&this.numeroReintentos<=3){
            return true;
        }else if(this.numeroReintentos<=2){
            return true;
        }
        return false;
    }
    public void recuperar(){
        this.numeroReintentos++;
    }

}
