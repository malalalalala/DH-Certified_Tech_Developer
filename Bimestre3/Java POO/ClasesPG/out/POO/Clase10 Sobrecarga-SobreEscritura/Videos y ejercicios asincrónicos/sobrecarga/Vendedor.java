public class Vendedor extends Empleado{
    private int comision;
    private double importeVentas;

    public Vendedor(String nombre, String legajo) {

        super(nombre, legajo);
        this.comision=2;
        this.importeVentas=5000;
    }

    @Override
    public double calcularSueldo(){
        return sueldo-descuento+importeVentas/100*comision;
    }

    @Override
    public double calcularSueldo(double premio){
        return calcularSueldo()+premio;
    }
}
