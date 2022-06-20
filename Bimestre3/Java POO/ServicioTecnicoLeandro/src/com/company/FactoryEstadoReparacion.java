package com.company;

public class FactoryEstadoReparacion {

    private static FactoryEstadoReparacion instance;

    private FactoryEstadoReparacion(){

    }

    public static FactoryEstadoReparacion getInstance(){
        if(instance == null){
            return new FactoryEstadoReparacion();
        }
        else {
            return instance;
        }
    }

    public EstadoReparacion proximoEstado(EstadoReparacion estadoReparacion){
        if(estadoReparacion == null){
            return new EnPresupuesto();
//            qué hace este instaceof?
//            cómo lanzaríamos el error?
        } else if(estadoReparacion instanceof EnPresupuesto){
            return new EnReparacion();
        } else if(estadoReparacion instanceof EnReparacion){
            return new ParaEnvio();
        } else {
            return new Finalizado();
        }
    }
}
