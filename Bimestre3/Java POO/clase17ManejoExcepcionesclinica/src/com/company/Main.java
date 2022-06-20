package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            Paciente paciente=new Paciente("Juan","Perez","12345",new Date(2022-1900,10,01));

            paciente.darAlta(new Date(2020-1900,11,01));

        } catch (PacienteException exception) {
            System.out.println(exception.getMessage());

        }


    }
}
