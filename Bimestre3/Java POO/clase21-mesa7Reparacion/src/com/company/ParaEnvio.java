package com.company;

public class ParaEnvio implements EstadoReparacion{

    Reparacion reparacion;

    @Override
    public void valorPresupuesto(double presupuesto) throws Exception {
        throw new Exception("No se puede agregar presupuesto si ya está para envío");
    }

    @Override
    public void cambiarDireccion(String direccion) {
        reparacion.setDireccionDeEntrega(direccion);
    }

    @Override
    public void agregarRepuesto(double costo) {
        throw new Exception("No se puede agregar presupuesto si ya está para envío");
    }
}
