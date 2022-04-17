public class Empleado {
    private String nombre;
    private String legajo;
    protected double sueldo;
    protected double descuento;

    public Empleado(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldo=3000;
        this.descuento=500;
    }

    public double calcularSueldo(){
        return sueldo-descuento;

    }
    public double calcularSueldo(double premio){
        return calcularSueldo()+premio;
    }
}
