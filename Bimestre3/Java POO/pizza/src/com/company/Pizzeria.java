package com.company;

import java.util.HashSet;
import java.util.Set;

public class Pizzeria {
    private Set<Pizza> listaDePizzas;

    public Pizzeria() {
        this.listaDePizzas=new HashSet<>();
    }

    public void mostrarPizza() {
        for (Pizza pizza : this.listaDePizzas) {
            System.out.println(pizza);

        }
        System.out.println("llegue aqui");
    }

    public void agregarPizza(Pizza pizza){
        this.listaDePizzas.add(pizza);
    }
}
