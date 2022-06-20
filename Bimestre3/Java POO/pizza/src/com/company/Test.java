package com.company;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Simple muzzarella = FactoryPizza.crearSimple("muzzarella", "pizza de queso", 700, false);
        Simple especial = FactoryPizza.crearSimple("especial", "pizza con jamón", 850, false);
        Simple anana = FactoryPizza.crearSimple("anana", "pizza de semidulce", 950, false);

        Set<Simple> listaDeIngredientesCombinadaLoca = new HashSet<>();
        listaDeIngredientesCombinadaLoca.add(especial);
        listaDeIngredientesCombinadaLoca.add(anana);

        Combinada combinadaLoca = FactoryPizza.crearCombinada("Loca", "mitad especial y mitad ananá", listaDeIngredientesCombinadaLoca);

        Pizzeria pizzeria = new Pizzeria();

        pizzeria.agregarPizza(muzzarella);
        pizzeria.agregarPizza(especial);
        pizzeria.agregarPizza(anana);
        pizzeria.agregarPizza(combinadaLoca);

        pizzeria.mostrarPizza();


//Pizza combinada loca, que es mitad especial y mitad ananá, cuyo cálculo de precio nos debería arrojar 900 pesos.
    }
}
