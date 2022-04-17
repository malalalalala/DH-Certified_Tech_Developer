package com.company;

public class EnReparacion extends EstadoReparacion{

    @Override
    public double valorPresupuesto(double presupuesto) throws Exception{
        throw new Exception("No se puede utilizar este método en esta estado del proceso");
    }

    @Override
    public String cambiarDireccion(String direccion) throws Exception {
        throw new Exception("No se puede utilizar este método en esta estado del proceso");
    }

    @Override
    public double agregarRepuesto(double costo) {
        return costo;
    }


}
