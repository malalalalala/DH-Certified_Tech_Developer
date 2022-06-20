package com.company;

public class Reparacion {
    private String nombreArticulo;
    private double presupuesto;
    private String direccionDeEntrega;
    private EstadoReparacion estado;

    public Reparacion(String nombreArticulo, EstadoReparacion estado) {
        this.nombreArticulo = nombreArticulo;
        this.estado = estado;
    }

    public void setDireccionDeEntrega(String direccionDeEntrega) {
        this.direccionDeEntrega = direccionDeEntrega;
    }

    public void cambiarDireccion(String direccion){
        //this.direccionDeEntrega=direccion;
        this.estado.cambiarDireccion(direccion);
    }

    public void agregarValorPresupuesto(double presupuesto){

    }

    public void agregarRepuesto(double costo){}

    public void pasarAlSiguientePaso(){}

    public String toString(){}
}
