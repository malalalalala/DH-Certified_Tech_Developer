package poo.varela;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Servicio> servicios;
    private String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.servicios = new ArrayList<>();
    }

    public void mostrarServicios() {
        System.out.println("\n----------------------- " + nombre + " -----------------------");
        for (Servicio oferta : servicios) {
            System.out.println(oferta.toString() + "\n");
        }
    }

    public void agregar(Servicio oferta) {
        this.servicios.add(oferta);
    }
}
