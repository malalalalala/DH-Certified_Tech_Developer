public class Empleado extends Persona{
    private double sueldo;
    private double descuento;
    private String legajo;

    public Empleado(String nombre, String dni, String legajo) {
        super(nombre,dni);
        this.sueldo = 30000;
        this.legajo = legajo;
    }
}