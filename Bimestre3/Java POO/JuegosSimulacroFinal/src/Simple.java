public class Simple extends Habilidad{
    private double puntaje;
    public static final String HABILIDAD_SUPERIOR="Disparar";
    public static final double PORCENTAJE_INCREMENTO_HABILIDAD=10;

    public Simple(String nombre, String descripcion, double puntaje) {
        super(nombre, descripcion);
        this.puntaje = puntaje;
    }


    @Override
    public double calcularPuntaje() {
        if(super.getNombre().equals(HABILIDAD_SUPERIOR)){
            return this.puntaje*(1+PORCENTAJE_INCREMENTO_HABILIDAD/100);
        }
        return this.puntaje;
    }


    @Override
    public String toString() {
        return getNombre() + " tiene " +
                "puntaje=" + calcularPuntaje() +
                '}';
    }
}
