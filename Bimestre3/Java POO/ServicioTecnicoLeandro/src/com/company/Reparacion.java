package com.company;

public class Reparacion {


    private String nombreArticulo;
    private double presupuesto;
    private String direccionDeEntrega;
    private EstadoReparacion estado;

    public Reparacion(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public void cambiarDireccion(String direccion){
        try {
            this.direccionDeEntrega = estado.cambiarDireccion(direccion);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void agregarValorPresupuesto(double presupuesto){
        try {
            this.presupuesto = estado.valorPresupuesto(presupuesto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void agregarRepuesto(double costo){
        try {
            this.presupuesto += estado.agregarRepuesto(costo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pasarAlSiguientePaso(){
        estado.pasarAlSiguientePaso(this);
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public String getDireccionDeEntrega() {
        return direccionDeEntrega;
    }
}
