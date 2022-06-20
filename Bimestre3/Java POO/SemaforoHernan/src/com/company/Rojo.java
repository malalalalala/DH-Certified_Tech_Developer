package com.company;

public class Rojo implements EstadoSemaforo {
    private Semaforo s;

    public Rojo(Semaforo s){this.s = s;}

    @Override
    public void mostrarAviso() {
        System.out.println("El semáforo está en ROJO, quedate mosca");
    }

    @Override
    public void cambiarEstado() {
        s.setEstado(new Verde(s));
        System.out.println("El semáforo cambió de ROJO a VERDE, esperá que terminen de cruzar les peatones antes de arrancar");
    }
}
