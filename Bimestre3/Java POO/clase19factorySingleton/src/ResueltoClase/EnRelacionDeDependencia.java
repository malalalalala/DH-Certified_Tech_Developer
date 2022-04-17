package ResueltoClase;

public class EnRelacionDeDependencia extends Empleado{
private final static double sueldoMensual=1000;


    public EnRelacionDeDependencia(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
           }

    @Override
    double calcularSueldo(int dias) {
        return sueldoMensual/30*dias;
    }
}
