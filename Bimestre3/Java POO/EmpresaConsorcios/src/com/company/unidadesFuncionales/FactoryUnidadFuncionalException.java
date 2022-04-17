package com.company.unidadesFuncionales;

public class FactoryUnidadFuncionalException extends Exception{

    public FactoryUnidadFuncionalException()
    {
        super();
    }

    public FactoryUnidadFuncionalException(String mensaje)
    {
        super(mensaje);
    }

    public String toString()
    {
        return "Se produjo la siguiente Excepción " + this.getClass().getName() +"\n" +
                "Mensaje: " + this.getMessage() + "\n" ;
    }
}
