package com.company;

import java.util.Set;

public class FactoryPizza {
    public static Simple crearSimple(String nombre, String descripcion, double precioBase, boolean grande){
        return new Simple (nombre, descripcion, precioBase, grande);
    }

    public static Combinada crearCombinada(String nombre, String descripcion, Set<Simple> listaSimple) {
        return new Combinada(nombre, descripcion, listaSimple);
    }
}
