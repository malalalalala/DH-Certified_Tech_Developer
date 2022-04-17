package com.company;
import java.util.Set;

public class Combinada extends Pizza {
    private Set<Simple> listaSimple;

    public Combinada(String nombre, String descripcion, Set<Simple> listaSimple) {
        super(nombre, descripcion);
        this.listaSimple = listaSimple;
    }

    @Override
    public double calcularPrecio() {
        double subTotal= 0;
        for (Simple i: listaSimple) {
            subTotal += i.calcularPrecio();
        }
        //int cantidadTotal = listaSimple.size();//
        return subTotal / listaSimple.size();
    }

    @Override
    public String toString () {
        return "Nombre: " + super.getNombre() + "Precio: " + this.calcularPrecio();
    }
}
