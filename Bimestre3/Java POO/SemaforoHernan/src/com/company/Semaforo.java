package com.company;

public class Semaforo implements EstadoSemaforo {
    private EstadoSemaforo estado;
   // private estadoSemaforo estadoSemaforoInicial = new Verde();

    public void setEstado(EstadoSemaforo estado) {
        this.estado = estado;
    }

    public EstadoSemaforo getEstado() {
        return estado;
    }

    public Semaforo(){
        this.setEstado(new Verde(this));
    }
    public void mostrarAviso() {
        getEstado().mostrarAviso();
    }

    public void cambiarEstado(){
        getEstado().cambiarEstado();
    }
}
