package com.company;

public class PropiedadException extends Exception{
    public PropiedadException(){
        super();
    }

    public PropiedadException(String message){
        super(message);
    }

    @Override
    public String toString()
    {
        return "Se produjo la siguiente Excepción " + this.getClass().getName() +"\n" +
                "Mensaje: " + this.getMessage() + "\n" ;
    }

}


