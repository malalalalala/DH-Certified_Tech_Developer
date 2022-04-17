public class Producto implements Presupuestable{
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularPrecioFinal() {
        return this.precio;
    }
}
