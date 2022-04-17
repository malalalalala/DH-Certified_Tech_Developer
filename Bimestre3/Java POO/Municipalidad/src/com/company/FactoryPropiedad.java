package com.company;

import java.util.Set;

public class FactoryPropiedad {

    public static Casa crearCasa(String calle, int numero, double baseImpuesto) throws PropiedadException {
        if(numero <= 0){
            throw new PropiedadException("el numero debe ser mayor a 0");
        }
        return new Casa(calle, numero, baseImpuesto);
    }


        public static BarrioCerrado crearBarrioCerrado (String calle,int numero, int multiplicador, Set<
        Casa > listaDeCasas){
            return new BarrioCerrado(calle, numero, multiplicador, listaDeCasas);

        }


    }


