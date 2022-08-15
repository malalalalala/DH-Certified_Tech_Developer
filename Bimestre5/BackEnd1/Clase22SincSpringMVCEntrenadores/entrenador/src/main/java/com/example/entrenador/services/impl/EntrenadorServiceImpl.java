package com.example.entrenador.services.impl;

import com.example.entrenador.modelo.Entrenador;
import com.example.entrenador.services.EntrenadorServices;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class EntrenadorServiceImpl implements EntrenadorServices {
    @Override
    public List<Entrenador> listarEntrenadores() {
        Entrenador entrenador1= new Entrenador("Juan");
        Entrenador entrenador2= new Entrenador("Laura");
        Entrenador entrenador3= new Entrenador("Cristian");

        return Arrays.asList(entrenador1,entrenador2,entrenador3);


    }


}
