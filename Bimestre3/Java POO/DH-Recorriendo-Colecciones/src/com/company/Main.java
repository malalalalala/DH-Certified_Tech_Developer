package com.company;

import java.time.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    List nombres = new ArrayList();

        nombres.add("Juan");
        nombres.add("Mario");
        nombres.add("Carlos");
        nombres.add("Diego");
        nombres.add("Marcelo");
        nombres.add("Marcelo");

        for(int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i) + " impresion for");
        }

        int i = 0;
        boolean encontrado = false;
        while( i < nombres.size() && !encontrado)
        {
            if(nombres.get(i) == "Carlos")
                encontrado = true;
            System.out.println(nombres.get(i) +" impresion while");
            i++;
        }


        System.out.println("usando iterator");
        Iterator iterator = nombres.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next() +" impresion iterador");
        }

        System.out.println("usando for each");
        for(Object nombre: nombres){
            System.out.println(nombre);
        }


    }
}
