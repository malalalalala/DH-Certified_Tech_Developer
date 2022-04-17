package poo.varela;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Servicio {

    private double descuento;
    private List<Servicio> servicios;

    public Combo() {
        servicios = new ArrayList<>();
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void agregar(Servicio oferta) {
        this.servicios.add(oferta);
    }

    @Override
    public double calcularPrecio() {
        double total = 0.0;
        for (Servicio curso : servicios) {
            total += curso.calcularPrecio();
        }
        return total * (1 - descuento);
    }

    @Override
    public String toString() {
        String servicioStr = "";
        for (Servicio curso : servicios) {
            servicioStr += "\t* " + curso.toString();
        }
        return "----Combo: " + getNombre() +
                "\n\tDescripción: " + getDescripcion() +
                "\n\tServicios:\n" + servicioStr +
                "----Precio total del combo:\t$ " + this.calcularPrecio();
    }
}
