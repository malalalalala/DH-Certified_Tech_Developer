public class Parcial extends Examen {
    private int numeroDeUnidad;
    private int numeroDeReintento;

   // private static final int UNIDAD_DE_REFERENCIA = 3;

    public Parcial(Alumno alumno, String titulo, String temaDeExamen, String enunciado, double nota, int numeroDeUnidad, int numeroDeReintento) {
        super(alumno, titulo, temaDeExamen, enunciado, nota);
        this.numeroDeUnidad = numeroDeUnidad;
        this.numeroDeReintento = numeroDeReintento;
    }


    public boolean sePuedeRecuperar(){
        if(this.numeroDeUnidad <= 3 && this.numeroDeReintento<3){
            return true;
        }
        if(this.numeroDeUnidad >3 && this.numeroDeReintento<2){
            return true;
        }
        return false;
        }
    }

    /*public void intentosRecuperatorio() {
        if (this.numeroDeUnidad <= UNIDAD_DE_REFERENCIA) {
            System.out.println("Tienes hasta 3 intentos para recuperar");
        } if (this.numeroDeUnidad > UNIDAD_DE_REFERENCIA) {
            System.out.println("Tienes 2 intentos para recuperar"); }
    }*/


