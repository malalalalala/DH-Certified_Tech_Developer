package ResueltoClase;

public class Contratado extends Empleado{
    private final static double importePorHora=7;
    private final static double relacionImpuesto=0.14;
    private final static int HORAS_TRABAJO_X_DIA=8;

    public Contratado(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);

    }

    @Override
    double calcularSueldo(int dias) {
                return HORAS_TRABAJO_X_DIA*dias*importePorHora*(1-relacionImpuesto);
    }
}
