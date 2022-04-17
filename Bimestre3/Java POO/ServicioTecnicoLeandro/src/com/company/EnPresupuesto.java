package com.company;

import java.rmi.server.ExportException;

public class EnPresupuesto extends EstadoReparacion{

    @Override
    public double valorPresupuesto(double presupuesto) { return presupuesto; }

    @Override
    public String cambiarDireccion(String direccion) throws Exception {
        throw new Exception("No se puede utilizar este método en esta estado del proceso");
    }

    @Override
    public double agregarRepuesto(double costo) throws Exception{
        throw new Exception("No se puede utilizar este método en esta estado del proceso");
    }
}
