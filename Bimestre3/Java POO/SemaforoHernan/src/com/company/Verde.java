package com.company;

public class Verde implements EstadoSemaforo {
    private Semaforo s;

    public Verde(Semaforo s){this.s = s;}

    @Override
    public void mostrarAviso() {
        System.out.println("El semáforo está en VERDE, avanzá tranqui");
    }

    @Override
    public void cambiarEstado() {
        s.setEstado(new Amarillo(s));
        System.out.println("Ojota que el semáforo cambió de VERDE a AMARILLO, andá bajando la velocidad");
    }
}
