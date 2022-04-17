package com.company;

public class Finalizado extends EstadoReparacion {

    @Override
    public double valorPresupuesto(double presupuesto) throws Exception {
        throw new Exception("No se puede utilizar este método en esta estado del proceso");
    }

    @Override
    public String cambiarDireccion(String direccion) throws Exception {
        throw new Exception("No se puede utilizar este método en esta estado del proceso");
    }

    @Override
    public double agregarRepuesto(double costo) throws Exception {
        throw new Exception("No se puede utilizar este método en esta estado del proceso");
    }

    @Override
    public EstadoReparacion pasarAlSiguientePaso(Reparacion reparacion){
        System.out.println("Nombre producto: " + reparacion.getNombreArticulo() + "\n" + "Estado: en presupuesto" + "\n" + "Dirección: " + reparacion.getDireccionDeEntrega());
        return FactoryEstadoReparacion.getInstance().proximoEstado(this);
    }
}
