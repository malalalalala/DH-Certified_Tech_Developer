package com.company;

public abstract class EstadoReparacion {

    public abstract double valorPresupuesto(double presupuesto) throws Exception;
    public abstract String cambiarDireccion(String direccion) throws Exception;
    public abstract double agregarRepuesto(double costo) throws Exception;

    public EstadoReparacion pasarAlSiguientePaso(Reparacion reparacion) {
        System.out.println("Nombre producto: " + reparacion.getNombreArticulo() + "\n" + "Estado: en presupuesto");
        return FactoryEstadoReparacion.getInstance().proximoEstado(this);
    }

}
