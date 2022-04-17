package poo.varela;

public class ServicioSimple extends Servicio {

    private double precio;
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return (getNombre().equals("Colocación") ? precio * 1.1 : precio);
    }

    @Override
    public String toString() {
        return  "Servicio: " + getNombre() +
                "\n\t\tDescripción: " + getDescripcion() +
                "\n\t\tPrecio: $ " +  calcularPrecio() + "\n";
    }
}
