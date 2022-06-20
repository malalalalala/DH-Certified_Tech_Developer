package com.company;

public class Amarillo implements EstadoSemaforo {
    private Semaforo s;

    public Amarillo(Semaforo s){this.s = s;}

    @Override
    public void mostrarAviso() {
        System.out.println("El semáforo está en AMARILLO, prestá atención");
    }

    @Override
    public void cambiarEstado() {
        s.setEstado(new Rojo(s));
        System.out.println("El semáforo pasó de AMARILLO a ROJO, frená atrás de la senda peatonal");
    }
}
